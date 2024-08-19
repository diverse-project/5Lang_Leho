/**
 */
package fr.inria.diverse.melanger.leho.Leho;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Packet#getTime <em>Time</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Packet#getInPort <em>In Port</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Packet#getContent <em>Content</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Packet#getSourceAddress <em>Source Address</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Packet#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Packet#getExtensionheaders <em>Extensionheaders</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPacket()
 * @model
 * @generated
 */
public interface Packet extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPacket_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' reference.
	 * @see #setInPort(Port)
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPacket_InPort()
	 * @model
	 * @generated
	 */
	Port getInPort();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getInPort <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(Port value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPacket_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Source Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Address</em>' attribute.
	 * @see #setSourceAddress(BigInteger)
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPacket_SourceAddress()
	 * @model annotation="aspect"
	 *        annotation="containment"
	 * @generated
	 */
	BigInteger getSourceAddress();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getSourceAddress <em>Source Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Address</em>' attribute.
	 * @see #getSourceAddress()
	 * @generated
	 */
	void setSourceAddress(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Address</em>' attribute.
	 * @see #setDestinationAddress(BigInteger)
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPacket_DestinationAddress()
	 * @model annotation="aspect"
	 *        annotation="containment"
	 * @generated
	 */
	BigInteger getDestinationAddress();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getDestinationAddress <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address</em>' attribute.
	 * @see #getDestinationAddress()
	 * @generated
	 */
	void setDestinationAddress(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Extensionheaders</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.Leho.ExtensionHeader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensionheaders</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPacket_Extensionheaders()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<ExtensionHeader> getExtensionheaders();

} // Packet
