/**
 */
package org.obeonetwork.dsl.database.dbevolution;

import org.obeonetwork.dsl.database.View;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update View Comment Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.dbevolution.UpdateViewCommentChange#getNewView <em>New View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.database.dbevolution.DbevolutionPackage#getUpdateViewCommentChange()
 * @model
 * @generated
 */
public interface UpdateViewCommentChange extends ViewChange {
	/**
	 * Returns the value of the '<em><b>New View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New View</em>' reference.
	 * @see #setNewView(View)
	 * @see org.obeonetwork.dsl.database.dbevolution.DbevolutionPackage#getUpdateViewCommentChange_NewView()
	 * @model required="true"
	 * @generated
	 */
	View getNewView();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.database.dbevolution.UpdateViewCommentChange#getNewView <em>New View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New View</em>' reference.
	 * @see #getNewView()
	 * @generated
	 */
	void setNewView(View value);

} // UpdateViewCommentChange
