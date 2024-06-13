/**
 */
package fr.inria.diverse.melanger.leho.eho;

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
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.Rule#getAction <em>Action</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.Rule#getPacketspec <em>Packetspec</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.Rule#getTo <em>To</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.Rule#getNext <em>Next</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.Rule#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getRule()
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
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getRule_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.Rule#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Packetspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packetspec</em>' containment reference.
	 * @see #setPacketspec(PacketSpec)
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getRule_Packetspec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PacketSpec getPacketspec();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.Rule#getPacketspec <em>Packetspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packetspec</em>' containment reference.
	 * @see #getPacketspec()
	 * @generated
	 */
	void setPacketspec(PacketSpec value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(IpAddSpec)
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getRule_To()
	 * @model containment="true"
	 * @generated
	 */
	IpAddSpec getTo();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.Rule#getTo <em>To</em>}' containment reference.
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
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getRule_Next()
	 * @model containment="true"
	 * @generated
	 */
	Rule getNext();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.Rule#getNext <em>Next</em>}' containment reference.
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
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getRule_From()
	 * @model containment="true"
	 * @generated
	 */
	IpAddSpec getFrom();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.Rule#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(IpAddSpec value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void run(Policy root);

} // Rule
