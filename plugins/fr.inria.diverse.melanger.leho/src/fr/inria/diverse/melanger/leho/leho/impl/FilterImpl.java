/**
 */
package fr.inria.diverse.melanger.leho.leho.impl;

import fr.inria.diverse.melanger.leho.leho.Filter;
import fr.inria.diverse.melanger.leho.leho.LehoPackage;
import fr.inria.diverse.melanger.leho.leho.Packet;
import fr.inria.diverse.melanger.leho.leho.Policy;
import fr.inria.diverse.melanger.leho.leho.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.FilterImpl#getCurrentPacket <em>Current Packet</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.FilterImpl#getCurrentTime <em>Current Time</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.FilterImpl#getFirstRule <em>First Rule</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.FilterImpl#getCurrentRule <em>Current Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends EObjectImpl implements Filter {
	/**
	 * The cached value of the '{@link #getCurrentPacket() <em>Current Packet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPacket()
	 * @generated
	 * @ordered
	 */
	protected Packet currentPacket;

	/**
	 * The default value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTime()
	 * @generated
	 * @ordered
	 */
	protected int currentTime = CURRENT_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstRule() <em>First Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRule()
	 * @generated
	 * @ordered
	 */
	protected Rule firstRule;

	/**
	 * The cached value of the '{@link #getCurrentRule() <em>Current Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentRule()
	 * @generated
	 * @ordered
	 */
	protected Rule currentRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LehoPackage.Literals.FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Packet getCurrentPacket() {
		if (currentPacket != null && currentPacket.eIsProxy()) {
			InternalEObject oldCurrentPacket = (InternalEObject)currentPacket;
			currentPacket = (Packet)eResolveProxy(oldCurrentPacket);
			if (currentPacket != oldCurrentPacket) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LehoPackage.FILTER__CURRENT_PACKET, oldCurrentPacket, currentPacket));
			}
		}
		return currentPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Packet basicGetCurrentPacket() {
		return currentPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPacket(Packet newCurrentPacket) {
		Packet oldCurrentPacket = currentPacket;
		currentPacket = newCurrentPacket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.FILTER__CURRENT_PACKET, oldCurrentPacket, currentPacket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentTime() {
		return currentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentTime(int newCurrentTime) {
		int oldCurrentTime = currentTime;
		currentTime = newCurrentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.FILTER__CURRENT_TIME, oldCurrentTime, currentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule getFirstRule() {
		return firstRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstRule(Rule newFirstRule, NotificationChain msgs) {
		Rule oldFirstRule = firstRule;
		firstRule = newFirstRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LehoPackage.FILTER__FIRST_RULE, oldFirstRule, newFirstRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstRule(Rule newFirstRule) {
		if (newFirstRule != firstRule) {
			NotificationChain msgs = null;
			if (firstRule != null)
				msgs = ((InternalEObject)firstRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LehoPackage.FILTER__FIRST_RULE, null, msgs);
			if (newFirstRule != null)
				msgs = ((InternalEObject)newFirstRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LehoPackage.FILTER__FIRST_RULE, null, msgs);
			msgs = basicSetFirstRule(newFirstRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.FILTER__FIRST_RULE, newFirstRule, newFirstRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule getCurrentRule() {
		return currentRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentRule(Rule newCurrentRule, NotificationChain msgs) {
		Rule oldCurrentRule = currentRule;
		currentRule = newCurrentRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LehoPackage.FILTER__CURRENT_RULE, oldCurrentRule, newCurrentRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentRule(Rule newCurrentRule) {
		if (newCurrentRule != currentRule) {
			NotificationChain msgs = null;
			if (currentRule != null)
				msgs = ((InternalEObject)currentRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LehoPackage.FILTER__CURRENT_RULE, null, msgs);
			if (newCurrentRule != null)
				msgs = ((InternalEObject)newCurrentRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LehoPackage.FILTER__CURRENT_RULE, null, msgs);
			msgs = basicSetCurrentRule(newCurrentRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.FILTER__CURRENT_RULE, newCurrentRule, newCurrentRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void run(Policy root) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LehoPackage.FILTER__FIRST_RULE:
				return basicSetFirstRule(null, msgs);
			case LehoPackage.FILTER__CURRENT_RULE:
				return basicSetCurrentRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LehoPackage.FILTER__CURRENT_PACKET:
				if (resolve) return getCurrentPacket();
				return basicGetCurrentPacket();
			case LehoPackage.FILTER__CURRENT_TIME:
				return getCurrentTime();
			case LehoPackage.FILTER__FIRST_RULE:
				return getFirstRule();
			case LehoPackage.FILTER__CURRENT_RULE:
				return getCurrentRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LehoPackage.FILTER__CURRENT_PACKET:
				setCurrentPacket((Packet)newValue);
				return;
			case LehoPackage.FILTER__CURRENT_TIME:
				setCurrentTime((Integer)newValue);
				return;
			case LehoPackage.FILTER__FIRST_RULE:
				setFirstRule((Rule)newValue);
				return;
			case LehoPackage.FILTER__CURRENT_RULE:
				setCurrentRule((Rule)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LehoPackage.FILTER__CURRENT_PACKET:
				setCurrentPacket((Packet)null);
				return;
			case LehoPackage.FILTER__CURRENT_TIME:
				setCurrentTime(CURRENT_TIME_EDEFAULT);
				return;
			case LehoPackage.FILTER__FIRST_RULE:
				setFirstRule((Rule)null);
				return;
			case LehoPackage.FILTER__CURRENT_RULE:
				setCurrentRule((Rule)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LehoPackage.FILTER__CURRENT_PACKET:
				return currentPacket != null;
			case LehoPackage.FILTER__CURRENT_TIME:
				return currentTime != CURRENT_TIME_EDEFAULT;
			case LehoPackage.FILTER__FIRST_RULE:
				return firstRule != null;
			case LehoPackage.FILTER__CURRENT_RULE:
				return currentRule != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (currentTime: ");
		result.append(currentTime);
		result.append(')');
		return result.toString();
	}

} //FilterImpl
