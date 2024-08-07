/**
 */
package fr.inria.diverse.melanger.leho.eho;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ip Add Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.IpAddSpec#getAdress <em>Adress</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.IpAddSpec#getPort <em>Port</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.IpAddSpec#getMask <em>Mask</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getIpAddSpec()
 * @model
 * @generated
 */
public interface IpAddSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getIpAddSpec_Adress()
	 * @model required="true"
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.IpAddSpec#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getIpAddSpec_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.IpAddSpec#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(int)
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getIpAddSpec_Mask()
	 * @model
	 * @generated
	 */
	int getMask();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.eho.IpAddSpec#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	Boolean eval(Policy root, Boolean type);

} // IpAddSpec
