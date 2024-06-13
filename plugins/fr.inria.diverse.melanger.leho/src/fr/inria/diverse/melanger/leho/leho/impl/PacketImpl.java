/**
 */
package fr.inria.diverse.melanger.leho.leho.impl;

import fr.inria.diverse.melanger.leho.leho.ExtensionHeader;
import fr.inria.diverse.melanger.leho.leho.LehoPackage;
import fr.inria.diverse.melanger.leho.leho.Packet;
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
 * An implementation of the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PacketImpl#getTime <em>Time</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PacketImpl#getInPort <em>In Port</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PacketImpl#getContent <em>Content</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PacketImpl#getSourceAddress <em>Source Address</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PacketImpl#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link fr.inria.diverse.melanger.leho.leho.impl.PacketImpl#getExtensionheaders <em>Extensionheaders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PacketImpl extends EObjectImpl implements Packet {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected Port inPort;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceAddress() <em>Source Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddress()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOURCE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAddress() <em>Source Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAddress()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sourceAddress = SOURCE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DESTINATION_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationAddress() <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationAddress()
	 * @generated
	 * @ordered
	 */
	protected BigInteger destinationAddress = DESTINATION_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtensionheaders() <em>Extensionheaders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionheaders()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionHeader> extensionheaders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LehoPackage.Literals.PACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.PACKET__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getInPort() {
		if (inPort != null && inPort.eIsProxy()) {
			InternalEObject oldInPort = (InternalEObject)inPort;
			inPort = (Port)eResolveProxy(oldInPort);
			if (inPort != oldInPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LehoPackage.PACKET__IN_PORT, oldInPort, inPort));
			}
		}
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetInPort() {
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInPort(Port newInPort) {
		Port oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.PACKET__IN_PORT, oldInPort, inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.PACKET__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSourceAddress() {
		return sourceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceAddress(BigInteger newSourceAddress) {
		BigInteger oldSourceAddress = sourceAddress;
		sourceAddress = newSourceAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.PACKET__SOURCE_ADDRESS, oldSourceAddress, sourceAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDestinationAddress() {
		return destinationAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationAddress(BigInteger newDestinationAddress) {
		BigInteger oldDestinationAddress = destinationAddress;
		destinationAddress = newDestinationAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LehoPackage.PACKET__DESTINATION_ADDRESS, oldDestinationAddress, destinationAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ExtensionHeader> getExtensionheaders() {
		if (extensionheaders == null) {
			extensionheaders = new EObjectContainmentEList<ExtensionHeader>(ExtensionHeader.class, this, LehoPackage.PACKET__EXTENSIONHEADERS);
		}
		return extensionheaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LehoPackage.PACKET__EXTENSIONHEADERS:
				return ((InternalEList<?>)getExtensionheaders()).basicRemove(otherEnd, msgs);
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
			case LehoPackage.PACKET__TIME:
				return getTime();
			case LehoPackage.PACKET__IN_PORT:
				if (resolve) return getInPort();
				return basicGetInPort();
			case LehoPackage.PACKET__CONTENT:
				return getContent();
			case LehoPackage.PACKET__SOURCE_ADDRESS:
				return getSourceAddress();
			case LehoPackage.PACKET__DESTINATION_ADDRESS:
				return getDestinationAddress();
			case LehoPackage.PACKET__EXTENSIONHEADERS:
				return getExtensionheaders();
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
			case LehoPackage.PACKET__TIME:
				setTime((Integer)newValue);
				return;
			case LehoPackage.PACKET__IN_PORT:
				setInPort((Port)newValue);
				return;
			case LehoPackage.PACKET__CONTENT:
				setContent((String)newValue);
				return;
			case LehoPackage.PACKET__SOURCE_ADDRESS:
				setSourceAddress((BigInteger)newValue);
				return;
			case LehoPackage.PACKET__DESTINATION_ADDRESS:
				setDestinationAddress((BigInteger)newValue);
				return;
			case LehoPackage.PACKET__EXTENSIONHEADERS:
				getExtensionheaders().clear();
				getExtensionheaders().addAll((Collection<? extends ExtensionHeader>)newValue);
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
			case LehoPackage.PACKET__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case LehoPackage.PACKET__IN_PORT:
				setInPort((Port)null);
				return;
			case LehoPackage.PACKET__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case LehoPackage.PACKET__SOURCE_ADDRESS:
				setSourceAddress(SOURCE_ADDRESS_EDEFAULT);
				return;
			case LehoPackage.PACKET__DESTINATION_ADDRESS:
				setDestinationAddress(DESTINATION_ADDRESS_EDEFAULT);
				return;
			case LehoPackage.PACKET__EXTENSIONHEADERS:
				getExtensionheaders().clear();
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
			case LehoPackage.PACKET__TIME:
				return time != TIME_EDEFAULT;
			case LehoPackage.PACKET__IN_PORT:
				return inPort != null;
			case LehoPackage.PACKET__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case LehoPackage.PACKET__SOURCE_ADDRESS:
				return SOURCE_ADDRESS_EDEFAULT == null ? sourceAddress != null : !SOURCE_ADDRESS_EDEFAULT.equals(sourceAddress);
			case LehoPackage.PACKET__DESTINATION_ADDRESS:
				return DESTINATION_ADDRESS_EDEFAULT == null ? destinationAddress != null : !DESTINATION_ADDRESS_EDEFAULT.equals(destinationAddress);
			case LehoPackage.PACKET__EXTENSIONHEADERS:
				return extensionheaders != null && !extensionheaders.isEmpty();
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
		result.append(" (time: ");
		result.append(time);
		result.append(", content: ");
		result.append(content);
		result.append(", sourceAddress: ");
		result.append(sourceAddress);
		result.append(", destinationAddress: ");
		result.append(destinationAddress);
		result.append(')');
		return result.toString();
	}

} //PacketImpl
