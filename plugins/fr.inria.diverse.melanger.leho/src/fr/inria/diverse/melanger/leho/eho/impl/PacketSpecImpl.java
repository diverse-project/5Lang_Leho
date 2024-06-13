/**
 */
package fr.inria.diverse.melanger.leho.eho.impl;

import fr.inria.diverse.melanger.leho.eho.EhoPackage;
import fr.inria.diverse.melanger.leho.eho.ExtensionHeader;
import fr.inria.diverse.melanger.leho.eho.Interface;
import fr.inria.diverse.melanger.leho.eho.PacketSpec;
import fr.inria.diverse.melanger.leho.eho.Policy;

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
 * An implementation of the model object '<em><b>Packet Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.impl.PacketSpecImpl#getPort <em>Port</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.eho.impl.PacketSpecImpl#getExtensionheader <em>Extensionheader</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PacketSpecImpl extends EObjectImpl implements PacketSpec {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Interface port;

	/**
	 * The cached value of the '{@link #getExtensionheader() <em>Extensionheader</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionheader()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionHeader> extensionheader;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacketSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EhoPackage.Literals.PACKET_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Interface newPort, NotificationChain msgs) {
		Interface oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EhoPackage.PACKET_SPEC__PORT, oldPort, newPort);
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
	public void setPort(Interface newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EhoPackage.PACKET_SPEC__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EhoPackage.PACKET_SPEC__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EhoPackage.PACKET_SPEC__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtensionHeader> getExtensionheader() {
		if (extensionheader == null) {
			extensionheader = new EObjectContainmentEList<ExtensionHeader>(ExtensionHeader.class, this, EhoPackage.PACKET_SPEC__EXTENSIONHEADER);
		}
		return extensionheader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean eval(Policy root) {
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
			case EhoPackage.PACKET_SPEC__PORT:
				return basicSetPort(null, msgs);
			case EhoPackage.PACKET_SPEC__EXTENSIONHEADER:
				return ((InternalEList<?>)getExtensionheader()).basicRemove(otherEnd, msgs);
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
			case EhoPackage.PACKET_SPEC__PORT:
				return getPort();
			case EhoPackage.PACKET_SPEC__EXTENSIONHEADER:
				return getExtensionheader();
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
			case EhoPackage.PACKET_SPEC__PORT:
				setPort((Interface)newValue);
				return;
			case EhoPackage.PACKET_SPEC__EXTENSIONHEADER:
				getExtensionheader().clear();
				getExtensionheader().addAll((Collection<? extends ExtensionHeader>)newValue);
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
			case EhoPackage.PACKET_SPEC__PORT:
				setPort((Interface)null);
				return;
			case EhoPackage.PACKET_SPEC__EXTENSIONHEADER:
				getExtensionheader().clear();
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
			case EhoPackage.PACKET_SPEC__PORT:
				return port != null;
			case EhoPackage.PACKET_SPEC__EXTENSIONHEADER:
				return extensionheader != null && !extensionheader.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PacketSpecImpl
