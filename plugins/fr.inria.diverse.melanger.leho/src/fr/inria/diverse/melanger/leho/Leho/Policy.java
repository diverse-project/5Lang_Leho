/**
 */
package fr.inria.diverse.melanger.leho.Leho;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Policy#getFilter <em>Filter</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Policy#getPackets <em>Packets</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Policy#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Policy#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Policy#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Filter)
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPolicy_Filter()
	 * @model containment="true"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.Leho.Policy#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Packets</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.Leho.Packet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packets</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPolicy_Packets()
	 * @model containment="true" transient="true"
	 *        annotation="aspect"
	 * @generated
	 */
	EList<Packet> getPackets();

	/**
	 * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.Leho.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ports</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPolicy_InPorts()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Port> getInPorts();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.Leho.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPolicy_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Configuration)
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getPolicy_Configuration()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.Leho.Policy#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 *        annotation="aspect"
	 * @generated
	 */
	void initializeModel(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	void run();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	BigInteger read(int offset, int length);

} // Policy
