/**
 */
package fr.inria.diverse.melanger.leho.leho;

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
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.PacketSpec#getPort <em>Port</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.PacketSpec#getExtensionheader <em>Extensionheader</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getPacketSpec()
 * @model
 * @generated
 */
public interface PacketSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(TypeInterface)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getPacketSpec_Port()
	 * @model containment="true"
	 * @generated
	 */
	TypeInterface getPort();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.PacketSpec#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(TypeInterface value);

	/**
	 * Returns the value of the '<em><b>Extensionheader</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.leho.ExtensionHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensionheader</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getPacketSpec_Extensionheader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ExtensionHeader> getExtensionheader();

} // PacketSpec
