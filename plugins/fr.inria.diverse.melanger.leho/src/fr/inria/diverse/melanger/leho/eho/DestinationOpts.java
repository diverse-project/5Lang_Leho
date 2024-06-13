/**
 */
package fr.inria.diverse.melanger.leho.eho;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destination Opts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.DestinationOpts#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getDestinationOpts()
 * @model
 * @generated
 */
public interface DestinationOpts extends ExtensionHeader {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.eho.OptionDestination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#getDestinationOpts_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionDestination> getOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="aspect"
	 * @generated
	 */
	Boolean eval(Policy root);

} // DestinationOpts
