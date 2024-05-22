/**
 */
package fr.inria.diverse.melanger.leho.leho;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.RouterAlert#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRouterAlert()
 * @model
 * @generated
 */
public interface RouterAlert extends OptionHopByHop {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.leho.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getRouterAlert_Protocol()
	 * @model containment="true"
	 * @generated
	 */
	EList<Protocol> getProtocol();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	Boolean eval(int optionType);

} // RouterAlert
