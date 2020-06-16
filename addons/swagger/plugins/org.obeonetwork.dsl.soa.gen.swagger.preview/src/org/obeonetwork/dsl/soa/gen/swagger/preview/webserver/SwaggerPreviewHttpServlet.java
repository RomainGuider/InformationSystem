/*******************************************************************************
 * Copyright (c) 2016-2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.soa.gen.swagger.preview.webserver;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SwaggerPreviewHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        try {
        	// Mime types handling
        	if(req.getPathInfo().endsWith(".html")) {
				resp.setContentType("text/html");
			} else if(req.getPathInfo().endsWith(".css")) {
				resp.setContentType("text/css");
			} else if(req.getPathInfo().endsWith(".js")) {
				resp.setContentType("application/javascript");
			} else if(req.getPathInfo().endsWith(".js.map")) {
				resp.setContentType("application/octet-stream");
			} else if(req.getPathInfo().endsWith(".yaml")) {
				resp.setContentType("application/yaml");
			} else if(req.getPathInfo().endsWith(".json")) {
				resp.setContentType("application/json");
			}
			
        	String resourceName = URLDecoder.decode(req.getPathInfo().substring(1), "UTF-8");
        	File resourceFile = SwaggerPreviewJettyServer.instance().getSwaggerUiDistFile(resourceName);
        	if(resourceFile == null) {
        		resourceFile = SwaggerPreviewJettyServer.instance().getSwaggerFile(resourceName);
        	}
			if(resourceFile != null) {
				Files.copy(resourceFile.toPath(), resp.getOutputStream());
			} else {
				resp.getWriter().write("404 not found");
			}
        	
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
