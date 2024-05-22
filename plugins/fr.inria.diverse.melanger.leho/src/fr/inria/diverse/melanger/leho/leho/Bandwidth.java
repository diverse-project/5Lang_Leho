/**
 */
package fr.inria.diverse.melanger.leho.leho;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bandwidth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Bandwidth#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Bandwidth#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.Bandwidth#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getBandwidth()
 * @model
 * @generated
 */
public interface Bandwidth extends Action {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getBandwidth_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Bandwidth#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Unit)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getBandwidth_Unit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Unit getUnit();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Bandwidth#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage#getBandwidth_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.melanger.leho.leho.Bandwidth#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // Bandwidth
