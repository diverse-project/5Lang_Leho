/**
 */
package fr.inria.diverse.melanger.leho.leho.impl;

import fr.inria.diverse.melanger.leho.leho.Configuration;
import fr.inria.diverse.melanger.leho.leho.Filter;
import fr.inria.diverse.melanger.leho.leho.Interface;
import fr.inria.diverse.melanger.leho.leho.LehoPackage;
import fr.inria.diverse.melanger.leho.leho.Packet;
import fr.inria.diverse.melanger.leho.leho.Policy;
import fr.inria.diverse.melanger.leho.leho.Port;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PolicyImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PolicyImpl#getPackets <em>Packets</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PolicyImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PolicyImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PolicyImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyImpl extends EObjectImpl implements Policy {
	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected Filter filter;

	/**
	 * The cached value of the '{@link #getPackets() <em>Packets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackets()
	 * @generated
	 * @ordered
	 */
	protected EList<Packet> packets;

	/**
	 * The cached value of the '{@link #getInPorts() <em>In Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> inPorts;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LehoPackage.Literals.POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(Filter newFilter, NotificationChain msgs) {
		Filter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LehoPackage.POLICY__FILTER, oldFilter, newFilter);
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
	public void setFilter(Filter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LehoPackage.POLICY__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LehoPackage.POLICY__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.POLICY__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Packet> getPackets() {
		if (packets == null) {
			packets = new EObjectContainmentEList<Packet>(Packet.class, this, LehoPackage.POLICY__PACKETS);
		}
		return packets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getInPorts() {
		if (inPorts == null) {
			inPorts = new EObjectContainmentEList<Port>(Port.class, this, LehoPackage.POLICY__IN_PORTS);
		}
		return inPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, LehoPackage.POLICY__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LehoPackage.POLICY__CONFIGURATION, oldConfiguration, newConfiguration);
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
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LehoPackage.POLICY__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LehoPackage.POLICY__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.POLICY__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void initializeModel(EList<String> args) {
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
	public void run() {
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
	public BigInteger read(int offset, int length) {
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
			case LehoPackage.POLICY__FILTER:
				return basicSetFilter(null, msgs);
			case LehoPackage.POLICY__PACKETS:
				return ((InternalEList<?>)getPackets()).basicRemove(otherEnd, msgs);
			case LehoPackage.POLICY__IN_PORTS:
				return ((InternalEList<?>)getInPorts()).basicRemove(otherEnd, msgs);
			case LehoPackage.POLICY__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case LehoPackage.POLICY__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case LehoPackage.POLICY__FILTER:
				return getFilter();
			case LehoPackage.POLICY__PACKETS:
				return getPackets();
			case LehoPackage.POLICY__IN_PORTS:
				return getInPorts();
			case LehoPackage.POLICY__INTERFACES:
				return getInterfaces();
			case LehoPackage.POLICY__CONFIGURATION:
				return getConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LehoPackage.POLICY__FILTER:
				setFilter((Filter)newValue);
				return;
			case LehoPackage.POLICY__PACKETS:
				getPackets().clear();
				getPackets().addAll((Collection<? extends Packet>)newValue);
				return;
			case LehoPackage.POLICY__IN_PORTS:
				getInPorts().clear();
				getInPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case LehoPackage.POLICY__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case LehoPackage.POLICY__CONFIGURATION:
				setConfiguration((Configuration)newValue);
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
			case LehoPackage.POLICY__FILTER:
				setFilter((Filter)null);
				return;
			case LehoPackage.POLICY__PACKETS:
				getPackets().clear();
				return;
			case LehoPackage.POLICY__IN_PORTS:
				getInPorts().clear();
				return;
			case LehoPackage.POLICY__INTERFACES:
				getInterfaces().clear();
				return;
			case LehoPackage.POLICY__CONFIGURATION:
				setConfiguration((Configuration)null);
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
			case LehoPackage.POLICY__FILTER:
				return filter != null;
			case LehoPackage.POLICY__PACKETS:
				return packets != null && !packets.isEmpty();
			case LehoPackage.POLICY__IN_PORTS:
				return inPorts != null && !inPorts.isEmpty();
			case LehoPackage.POLICY__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case LehoPackage.POLICY__CONFIGURATION:
				return configuration != null;
		}
		return super.eIsSet(featureID);
	}

} //PolicyImpl
