/**
 */
package org.obeonetwork.dsl.database.dbevolution;

import org.obeonetwork.dsl.database.View;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.database.dbevolution.ViewChange#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.database.dbevolution.DbevolutionPackage#getViewChange()
 * @model abstract="true"
 * @generated
 */
public interface ViewChange extends DBDiff {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' reference.
	 * @see #setView(View)
	 * @see org.obeonetwork.dsl.database.dbevolution.DbevolutionPackage#getViewChange_View()
	 * @model required="true"
	 * @generated
	 */
	View getView();

	/**
	 * Sets the value of the '{@link org.obeonetwork.dsl.database.dbevolution.ViewChange#getView <em>View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(View value);

} // ViewChange
