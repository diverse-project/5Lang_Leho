/**
 */
package fr.inria.diverse.melanger.leho.eho.impl;

import fr.inria.diverse.melanger.leho.eho.Action;
import fr.inria.diverse.melanger.leho.eho.EhoPackage;
import fr.inria.diverse.melanger.leho.eho.IpAddSpec;
import fr.inria.diverse.melanger.leho.eho.PacketSpec;
import fr.inria.diverse.melanger.leho.eho.Policy;
import fr.inria.diverse.melanger.leho.eho.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.impl.RuleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.impl.RuleImpl#getPacketspec <em>Packetspec</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.impl.RuleImpl#getTo <em>To</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.impl.RuleImpl#getNext <em>Next</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.impl.RuleImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getPacketspec() <em>Packetspec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketspec()
	 * @generated
	 * @ordered
	 */
	protected PacketSpec packetspec;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected IpAddSpec to;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Rule next;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected IpAddSpec from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EhoPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__ACTION, oldAction, newAction);
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
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PacketSpec getPacketspec() {
		return packetspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPacketspec(PacketSpec newPacketspec, NotificationChain msgs) {
		PacketSpec oldPacketspec = packetspec;
		packetspec = newPacketspec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__PACKETSPEC, oldPacketspec, newPacketspec);
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
	public void setPacketspec(PacketSpec newPacketspec) {
		if (newPacketspec != packetspec) {
			NotificationChain msgs = null;
			if (packetspec != null)
				msgs = ((InternalEObject)packetspec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__PACKETSPEC, null, msgs);
			if (newPacketspec != null)
				msgs = ((InternalEObject)newPacketspec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__PACKETSPEC, null, msgs);
			msgs = basicSetPacketspec(newPacketspec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__PACKETSPEC, newPacketspec, newPacketspec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IpAddSpec getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(IpAddSpec newTo, NotificationChain msgs) {
		IpAddSpec oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__TO, oldTo, newTo);
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
	public void setTo(IpAddSpec newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__TO, null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__TO, null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule getNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNext(Rule newNext, NotificationChain msgs) {
		Rule oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__NEXT, oldNext, newNext);
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
	public void setNext(Rule newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__NEXT, null, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__NEXT, null, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IpAddSpec getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(IpAddSpec newFrom, NotificationChain msgs) {
		IpAddSpec oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__FROM, oldFrom, newFrom);
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
	public void setFrom(IpAddSpec newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__FROM, null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EhoPackage.RULE__FROM, null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EhoPackage.RULE__FROM, newFrom, newFrom));
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
			case EhoPackage.RULE__ACTION:
				return basicSetAction(null, msgs);
			case EhoPackage.RULE__PACKETSPEC:
				return basicSetPacketspec(null, msgs);
			case EhoPackage.RULE__TO:
				return basicSetTo(null, msgs);
			case EhoPackage.RULE__NEXT:
				return basicSetNext(null, msgs);
			case EhoPackage.RULE__FROM:
				return basicSetFrom(null, msgs);
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
			case EhoPackage.RULE__ACTION:
				return getAction();
			case EhoPackage.RULE__PACKETSPEC:
				return getPacketspec();
			case EhoPackage.RULE__TO:
				return getTo();
			case EhoPackage.RULE__NEXT:
				return getNext();
			case EhoPackage.RULE__FROM:
				return getFrom();
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
			case EhoPackage.RULE__ACTION:
				setAction((Action)newValue);
				return;
			case EhoPackage.RULE__PACKETSPEC:
				setPacketspec((PacketSpec)newValue);
				return;
			case EhoPackage.RULE__TO:
				setTo((IpAddSpec)newValue);
				return;
			case EhoPackage.RULE__NEXT:
				setNext((Rule)newValue);
				return;
			case EhoPackage.RULE__FROM:
				setFrom((IpAddSpec)newValue);
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
			case EhoPackage.RULE__ACTION:
				setAction((Action)null);
				return;
			case EhoPackage.RULE__PACKETSPEC:
				setPacketspec((PacketSpec)null);
				return;
			case EhoPackage.RULE__TO:
				setTo((IpAddSpec)null);
				return;
			case EhoPackage.RULE__NEXT:
				setNext((Rule)null);
				return;
			case EhoPackage.RULE__FROM:
				setFrom((IpAddSpec)null);
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
			case EhoPackage.RULE__ACTION:
				return action != null;
			case EhoPackage.RULE__PACKETSPEC:
				return packetspec != null;
			case EhoPackage.RULE__TO:
				return to != null;
			case EhoPackage.RULE__NEXT:
				return next != null;
			case EhoPackage.RULE__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
