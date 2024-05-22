/**
 */
package fr.inria.diverse.melanger.leho.leho;

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
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.HopByHopOpts#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getHopByHopOpts()
 * @model
 * @generated
 */
public interface HopByHopOpts extends ExtensionHeader {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.leho.OptionHopByHop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getHopByHopOpts_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionHopByHop> getOptions();

} // HopByHopOpts
