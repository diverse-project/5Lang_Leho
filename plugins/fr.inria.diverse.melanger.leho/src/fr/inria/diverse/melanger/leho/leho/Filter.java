/**
 */
package fr.inria.diverse.melanger.leho.leho;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Filter#getFirstRule <em>First Rule</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Filter#getCurrentRule <em>Current Rule</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>First Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Rule</em>' containment reference.
	 * @see #setFirstRule(Rule)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getFilter_FirstRule()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	Rule getFirstRule();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Filter#getFirstRule <em>First Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Rule</em>' containment reference.
	 * @see #getFirstRule()
	 * @generated
	 */
	void setFirstRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Current Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Rule</em>' containment reference.
	 * @see #setCurrentRule(Rule)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getFilter_CurrentRule()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	Rule getCurrentRule();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Filter#getCurrentRule <em>Current Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Rule</em>' containment reference.
	 * @see #getCurrentRule()
	 * @generated
	 */
	void setCurrentRule(Rule value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void run(Policy root);

} // Filter
