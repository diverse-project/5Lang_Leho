/**
 */
package fr.inria.diverse.melanger.leho.leho;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Rule#getTo <em>To</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Rule#getNext <em>Next</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Rule#getFrom <em>From</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Rule#getExtensionheader <em>Extensionheader</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Rule#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRule_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Rule#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(IpAddSpec)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRule_To()
	 * @model containment="true"
	 * @generated
	 */
	IpAddSpec getTo();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Rule#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(IpAddSpec value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(Rule)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRule_Next()
	 * @model containment="true"
	 * @generated
	 */
	Rule getNext();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Rule#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Rule value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(IpAddSpec)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRule_From()
	 * @model containment="true"
	 * @generated
	 */
	IpAddSpec getFrom();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Rule#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(IpAddSpec value);

	/**
	 * Returns the value of the '<em><b>Extensionheader</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.leho.ExtensionHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensionheader</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRule_Extensionheader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExtensionHeader> getExtensionheader();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(Interface)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRule_Interface()
	 * @model
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Rule#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

} // Rule
