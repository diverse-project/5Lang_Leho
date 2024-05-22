/**
 */
package fr.inria.diverse.melanger.leho.leho;

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
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Packet#getTime <em>Time</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Packet#getInPort <em>In Port</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Packet#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getPacket()
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
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getPacket_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Packet#getTime <em>Time</em>}' attribute.
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
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getPacket_InPort()
	 * @model
	 * @generated
	 */
	Port getInPort();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Packet#getInPort <em>In Port</em>}' reference.
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
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getPacket_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Packet#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Packet
