/**
 */
package fr.inria.diverse.melanger.leho.eho;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.PacketSpec#getPort <em>Port</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.PacketSpec#getExtensionheader <em>Extensionheader</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getPacketSpec()
 * @model
 * @generated
 */
public interface PacketSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(Interface)
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getPacketSpec_Port()
	 * @model containment="true"
	 * @generated
	 */
	Interface getPort();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.PacketSpec#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Interface value);

	/**
	 * Returns the value of the '<em><b>Extensionheader</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.eho.ExtensionHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensionheader</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getPacketSpec_Extensionheader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExtensionHeader> getExtensionheader();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	Boolean eval(Policy root);

} // PacketSpec
