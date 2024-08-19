/**
 */
package fr.inria.diverse.melanger.leho.Leho;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.Leho.Routing#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getRouting()
 * @model
 * @generated
 */
public interface Routing extends ExtensionHeader {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.melanger.leho.Leho.TypeRouting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage#getRouting_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeRouting> getTypes();

} // Routing
