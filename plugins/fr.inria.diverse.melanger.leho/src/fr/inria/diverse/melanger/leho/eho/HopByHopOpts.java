/**
 */
package fr.inria.diverse.melanger.leho.eho;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hop By Hop Opts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.HopByHopOpts#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getHopByHopOpts()
 * @model
 * @generated
 */
public interface HopByHopOpts extends ExtensionHeader {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.eho.OptionHopByHop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getHopByHopOpts_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionHopByHop> getOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	Boolean eval(Policy root);

} // HopByHopOpts
