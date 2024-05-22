/**
 */
package fr.inria.diverse.melanger.leho.leho;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.eho.model.eho.EhoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface EhoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eho";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/diverse/eho";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eho";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EhoPackage eINSTANCE = fr.inria.diverse.melanger.leho.leho.impl.EhoPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.ConfigurationImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.ActionImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DropImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 1;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RejectImpl <em>Reject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RejectImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getReject()
	 * @generated
	 */
	int REJECT = 2;

	/**
	 * The number of structural features of the '<em>Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REJECT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.AcceptImpl <em>Accept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.AcceptImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getAccept()
	 * @generated
	 */
	int ACCEPT = 4;

	/**
	 * The number of structural features of the '<em>Accept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DiscardImpl <em>Discard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DiscardImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDiscard()
	 * @generated
	 */
	int DISCARD = 5;

	/**
	 * The number of structural features of the '<em>Discard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.PacketSpecImpl <em>Packet Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.PacketSpecImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPacketSpec()
	 * @generated
	 */
	int PACKET_SPEC = 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_SPEC__PORT = 0;

	/**
	 * The feature id for the '<em><b>Extensionheader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_SPEC__EXTENSIONHEADER = 1;

	/**
	 * The number of structural features of the '<em>Packet Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_SPEC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Packet Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.TypeInterfaceImpl <em>Type Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.TypeInterfaceImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTypeInterface()
	 * @generated
	 */
	int TYPE_INTERFACE = 49;

	/**
	 * The number of structural features of the '<em>Type Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.InboundImpl <em>Inbound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.InboundImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getInbound()
	 * @generated
	 */
	int INBOUND = 7;

	/**
	 * The number of structural features of the '<em>Inbound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_FEATURE_COUNT = TYPE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inbound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_OPERATION_COUNT = TYPE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.OutboundImpl <em>Outbound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.OutboundImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOutbound()
	 * @generated
	 */
	int OUTBOUND = 8;

	/**
	 * The number of structural features of the '<em>Outbound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_FEATURE_COUNT = TYPE_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Outbound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_OPERATION_COUNT = TYPE_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.BandwidthImpl <em>Bandwidth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.BandwidthImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getBandwidth()
	 * @generated
	 */
	int BANDWIDTH = 9;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__NUMBER = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__UNIT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__TIME = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.UnitImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 10;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.TimeImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 11;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.BitUnitImpl <em>Bit Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.BitUnitImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getBitUnit()
	 * @generated
	 */
	int BIT_UNIT = 12;

	/**
	 * The number of structural features of the '<em>Bit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.OctetUnitImpl <em>Octet Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.OctetUnitImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOctetUnit()
	 * @generated
	 */
	int OCTET_UNIT = 13;

	/**
	 * The number of structural features of the '<em>Octet Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Octet Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.PacketUnitImpl <em>Packet Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.PacketUnitImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPacketUnit()
	 * @generated
	 */
	int PACKET_UNIT = 14;

	/**
	 * The number of structural features of the '<em>Packet Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Packet Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.SecondImpl <em>Second</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.SecondImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSecond()
	 * @generated
	 */
	int SECOND = 15;

	/**
	 * The number of structural features of the '<em>Second</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Second</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_OPERATION_COUNT = TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.MinuteImpl <em>Minute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.MinuteImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMinute()
	 * @generated
	 */
	int MINUTE = 16;

	/**
	 * The number of structural features of the '<em>Minute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUTE_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUTE_OPERATION_COUNT = TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.HourImpl <em>Hour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.HourImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHour()
	 * @generated
	 */
	int HOUR = 17;

	/**
	 * The number of structural features of the '<em>Hour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_OPERATION_COUNT = TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DayImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDay()
	 * @generated
	 */
	int DAY = 18;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.ExtensionHeaderImpl <em>Extension Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.ExtensionHeaderImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getExtensionHeader()
	 * @generated
	 */
	int EXTENSION_HEADER = 19;

	/**
	 * The number of structural features of the '<em>Extension Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_HEADER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Extension Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.OptionHopByHopImpl <em>Option Hop By Hop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.OptionHopByHopImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOptionHopByHop()
	 * @generated
	 */
	int OPTION_HOP_BY_HOP = 20;

	/**
	 * The number of structural features of the '<em>Option Hop By Hop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_HOP_BY_HOP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option Hop By Hop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_HOP_BY_HOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.HopByHopOptsImpl <em>Hop By Hop Opts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.HopByHopOptsImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHopByHopOpts()
	 * @generated
	 */
	int HOP_BY_HOP_OPTS = 21;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOP_BY_HOP_OPTS__OPTIONS = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hop By Hop Opts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOP_BY_HOP_OPTS_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hop By Hop Opts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOP_BY_HOP_OPTS_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RoutingImpl <em>Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RoutingImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRouting()
	 * @generated
	 */
	int ROUTING = 22;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING__TYPES = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.FragmentImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 23;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.EncapsulingSecurityPayloadImpl <em>Encapsuling Security Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.EncapsulingSecurityPayloadImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getEncapsulingSecurityPayload()
	 * @generated
	 */
	int ENCAPSULING_SECURITY_PAYLOAD = 24;

	/**
	 * The number of structural features of the '<em>Encapsuling Security Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULING_SECURITY_PAYLOAD_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Encapsuling Security Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULING_SECURITY_PAYLOAD_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.AuthentificationHeaderImpl <em>Authentification Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.AuthentificationHeaderImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getAuthentificationHeader()
	 * @generated
	 */
	int AUTHENTIFICATION_HEADER = 25;

	/**
	 * The number of structural features of the '<em>Authentification Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTIFICATION_HEADER_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authentification Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTIFICATION_HEADER_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DestinationOptsImpl <em>Destination Opts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DestinationOptsImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDestinationOpts()
	 * @generated
	 */
	int DESTINATION_OPTS = 26;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_OPTS__OPTIONS = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Destination Opts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_OPTS_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Destination Opts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTINATION_OPTS_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.MobilityHeaderImpl <em>Mobility Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.MobilityHeaderImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMobilityHeader()
	 * @generated
	 */
	int MOBILITY_HEADER = 27;

	/**
	 * The number of structural features of the '<em>Mobility Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_HEADER_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mobility Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_HEADER_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.UnknownEHImpl <em>Unknown EH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.UnknownEHImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getUnknownEH()
	 * @generated
	 */
	int UNKNOWN_EH = 28;

	/**
	 * The number of structural features of the '<em>Unknown EH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EH_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unknown EH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EH_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.ExperimentationAndTestingImpl <em>Experimentation And Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.ExperimentationAndTestingImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getExperimentationAndTesting()
	 * @generated
	 */
	int EXPERIMENTATION_AND_TESTING = 29;

	/**
	 * The number of structural features of the '<em>Experimentation And Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_AND_TESTING_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Experimentation And Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_AND_TESTING_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.HostIdentityProtocolImpl <em>Host Identity Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.HostIdentityProtocolImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHostIdentityProtocol()
	 * @generated
	 */
	int HOST_IDENTITY_PROTOCOL = 30;

	/**
	 * The number of structural features of the '<em>Host Identity Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_IDENTITY_PROTOCOL_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Host Identity Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_IDENTITY_PROTOCOL_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.Shim6ProtocolImpl <em>Shim6 Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.Shim6ProtocolImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getShim6Protocol()
	 * @generated
	 */
	int SHIM6_PROTOCOL = 31;

	/**
	 * The number of structural features of the '<em>Shim6 Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM6_PROTOCOL_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shim6 Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM6_PROTOCOL_OPERATION_COUNT = EXTENSION_HEADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.OptionsImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 69;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.Pad1Impl <em>Pad1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.Pad1Impl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPad1()
	 * @generated
	 */
	int PAD1 = 32;

	/**
	 * The number of structural features of the '<em>Pad1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD1_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pad1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD1_OPERATION_COUNT = OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.PadNImpl <em>Pad N</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.PadNImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPadN()
	 * @generated
	 */
	int PAD_N = 33;

	/**
	 * The number of structural features of the '<em>Pad N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_N_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pad N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_N_OPERATION_COUNT = OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.JumboPayloadImpl <em>Jumbo Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.JumboPayloadImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getJumboPayload()
	 * @generated
	 */
	int JUMBO_PAYLOAD = 34;

	/**
	 * The number of structural features of the '<em>Jumbo Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMBO_PAYLOAD_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Jumbo Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMBO_PAYLOAD_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RPLOptionImpl <em>RPL Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RPLOptionImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRPLOption()
	 * @generated
	 */
	int RPL_OPTION = 35;

	/**
	 * The number of structural features of the '<em>RPL Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPL_OPTION_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RPL Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPL_OPTION_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.OptionDestinationImpl <em>Option Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.OptionDestinationImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOptionDestination()
	 * @generated
	 */
	int OPTION_DESTINATION = 54;

	/**
	 * The number of structural features of the '<em>Option Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_DESTINATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Option Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_DESTINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.TunnelEncapsulationLimitImpl <em>Tunnel Encapsulation Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.TunnelEncapsulationLimitImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTunnelEncapsulationLimit()
	 * @generated
	 */
	int TUNNEL_ENCAPSULATION_LIMIT = 36;

	/**
	 * The number of structural features of the '<em>Tunnel Encapsulation Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNNEL_ENCAPSULATION_LIMIT_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tunnel Encapsulation Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNNEL_ENCAPSULATION_LIMIT_OPERATION_COUNT = OPTION_DESTINATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RouterAlertImpl <em>Router Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RouterAlertImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRouterAlert()
	 * @generated
	 */
	int ROUTER_ALERT = 37;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ALERT__PROTOCOL = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Router Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ALERT_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Router Alert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_ALERT_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.QuickStartImpl <em>Quick Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.QuickStartImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getQuickStart()
	 * @generated
	 */
	int QUICK_START = 38;

	/**
	 * The number of structural features of the '<em>Quick Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_START_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quick Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_START_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.CalipsoImpl <em>Calipso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.CalipsoImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getCalipso()
	 * @generated
	 */
	int CALIPSO = 39;

	/**
	 * The number of structural features of the '<em>Calipso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIPSO_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Calipso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIPSO_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.SmfDpdImpl <em>Smf Dpd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.SmfDpdImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSmfDpd()
	 * @generated
	 */
	int SMF_DPD = 40;

	/**
	 * The number of structural features of the '<em>Smf Dpd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMF_DPD_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Smf Dpd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMF_DPD_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.HomeAdressImpl <em>Home Adress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.HomeAdressImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHomeAdress()
	 * @generated
	 */
	int HOME_ADRESS = 41;

	/**
	 * The number of structural features of the '<em>Home Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_ADRESS_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Home Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_ADRESS_OPERATION_COUNT = OPTION_DESTINATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DeprecatedImpl <em>Deprecated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DeprecatedImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDeprecated()
	 * @generated
	 */
	int DEPRECATED = 42;

	/**
	 * The number of structural features of the '<em>Deprecated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Deprecated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_OPERATION_COUNT = OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.EndPointIdentificationImpl <em>End Point Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.EndPointIdentificationImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getEndPointIdentification()
	 * @generated
	 */
	int END_POINT_IDENTIFICATION = 43;

	/**
	 * The number of structural features of the '<em>End Point Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_IDENTIFICATION_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Point Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_IDENTIFICATION_OPERATION_COUNT = OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.ILNPNonceImpl <em>ILNP Nonce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.ILNPNonceImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getILNPNonce()
	 * @generated
	 */
	int ILNP_NONCE = 44;

	/**
	 * The number of structural features of the '<em>ILNP Nonce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILNP_NONCE_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ILNP Nonce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILNP_NONCE_OPERATION_COUNT = OPTION_DESTINATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.LineIdOptionImpl <em>Line Id Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.LineIdOptionImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getLineIdOption()
	 * @generated
	 */
	int LINE_ID_OPTION = 45;

	/**
	 * The number of structural features of the '<em>Line Id Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ID_OPTION_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Id Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ID_OPTION_OPERATION_COUNT = OPTION_DESTINATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.MPLOptionImpl <em>MPL Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.MPLOptionImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMPLOption()
	 * @generated
	 */
	int MPL_OPTION = 46;

	/**
	 * The number of structural features of the '<em>MPL Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPL_OPTION_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MPL Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPL_OPTION_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RFC3692ExperimentImpl <em>RFC3692 Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RFC3692ExperimentImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRFC3692Experiment()
	 * @generated
	 */
	int RFC3692_EXPERIMENT = 47;

	/**
	 * The number of structural features of the '<em>RFC3692 Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RFC3692 Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT_OPERATION_COUNT = OPTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.IpAddSpecImpl <em>Ip Add Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.IpAddSpecImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getIpAddSpec()
	 * @generated
	 */
	int IP_ADD_SPEC = 48;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADD_SPEC__ADRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADD_SPEC__PORT = 1;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADD_SPEC__MASK = 2;

	/**
	 * The number of structural features of the '<em>Ip Add Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADD_SPEC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ip Add Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_ADD_SPEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RuleImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 50;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Packetspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PACKETSPEC = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TO = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NEXT = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FROM = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.ProtocolImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 51;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RSVPImpl <em>RSVP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RSVPImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRSVP()
	 * @generated
	 */
	int RSVP = 52;

	/**
	 * The number of structural features of the '<em>RSVP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSVP_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RSVP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSVP_OPERATION_COUNT = PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.MLDImpl <em>MLD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.MLDImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMLD()
	 * @generated
	 */
	int MLD = 53;

	/**
	 * The number of structural features of the '<em>MLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLD_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLD_OPERATION_COUNT = PROTOCOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.IPv6PerformanceDiagnosticImpl <em>IPv6 Performance Diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.IPv6PerformanceDiagnosticImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getIPv6PerformanceDiagnostic()
	 * @generated
	 */
	int IPV6_PERFORMANCE_DIAGNOSTIC = 55;

	/**
	 * The number of structural features of the '<em>IPv6 Performance Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6_PERFORMANCE_DIAGNOSTIC_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>IPv6 Performance Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6_PERFORMANCE_DIAGNOSTIC_OPERATION_COUNT = OPTION_DESTINATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.TypeRoutingImpl <em>Type Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.TypeRoutingImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTypeRouting()
	 * @generated
	 */
	int TYPE_ROUTING = 56;

	/**
	 * The number of structural features of the '<em>Type Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ROUTING_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ROUTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.SourceRouteImpl <em>Source Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.SourceRouteImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSourceRoute()
	 * @generated
	 */
	int SOURCE_ROUTE = 57;

	/**
	 * The number of structural features of the '<em>Source Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROUTE_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROUTE_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.NimrodImpl <em>Nimrod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.NimrodImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getNimrod()
	 * @generated
	 */
	int NIMROD = 58;

	/**
	 * The number of structural features of the '<em>Nimrod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIMROD_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nimrod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIMROD_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.Type2Impl <em>Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.Type2Impl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getType2()
	 * @generated
	 */
	int TYPE2 = 59;

	/**
	 * The number of structural features of the '<em>Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RPLSourceImpl <em>RPL Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RPLSourceImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRPLSource()
	 * @generated
	 */
	int RPL_SOURCE = 60;

	/**
	 * The number of structural features of the '<em>RPL Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPL_SOURCE_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RPL Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPL_SOURCE_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.SegmentImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 61;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.UnassignedImpl <em>Unassigned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.UnassignedImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getUnassigned()
	 * @generated
	 */
	int UNASSIGNED = 62;

	/**
	 * The number of structural features of the '<em>Unassigned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNASSIGNED_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unassigned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNASSIGNED_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment1Impl <em>RFC3692 Experiment1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment1Impl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRFC3692Experiment1()
	 * @generated
	 */
	int RFC3692_EXPERIMENT1 = 63;

	/**
	 * The number of structural features of the '<em>RFC3692 Experiment1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT1_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RFC3692 Experiment1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT1_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment2Impl <em>RFC3692 Experiment2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment2Impl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRFC3692Experiment2()
	 * @generated
	 */
	int RFC3692_EXPERIMENT2 = 64;

	/**
	 * The number of structural features of the '<em>RFC3692 Experiment2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT2_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>RFC3692 Experiment2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT2_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.ReservedImpl <em>Reserved</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.ReservedImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getReserved()
	 * @generated
	 */
	int RESERVED = 65;

	/**
	 * The number of structural features of the '<em>Reserved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reserved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_OPERATION_COUNT = TYPE_ROUTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DiscardDropImpl <em>Discard Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DiscardDropImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDiscardDrop()
	 * @generated
	 */
	int DISCARD_DROP = 66;

	/**
	 * The number of structural features of the '<em>Discard Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_DROP_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discard Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_DROP_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DiscardRejectImpl <em>Discard Reject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DiscardRejectImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDiscardReject()
	 * @generated
	 */
	int DISCARD_REJECT = 67;

	/**
	 * The number of structural features of the '<em>Discard Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_REJECT_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discard Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_REJECT_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.eho.model.eho.impl.DFFImpl <em>DFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.eho.model.eho.impl.DFFImpl
	 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDFF()
	 * @generated
	 */
	int DFF = 68;

	/**
	 * The number of structural features of the '<em>DFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFF_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFF_OPERATION_COUNT = OPTION_HOP_BY_HOP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reject</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Reject
	 * @generated
	 */
	EClass getReject();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Accept <em>Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Accept
	 * @generated
	 */
	EClass getAccept();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Discard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Discard
	 * @generated
	 */
	EClass getDiscard();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.PacketSpec <em>Packet Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet Spec</em>'.
	 * @see fr.inria.diverse.eho.model.eho.PacketSpec
	 * @generated
	 */
	EClass getPacketSpec();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.PacketSpec#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port</em>'.
	 * @see fr.inria.diverse.eho.model.eho.PacketSpec#getPort()
	 * @see #getPacketSpec()
	 * @generated
	 */
	EReference getPacketSpec_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.eho.model.eho.PacketSpec#getExtensionheader <em>Extensionheader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensionheader</em>'.
	 * @see fr.inria.diverse.eho.model.eho.PacketSpec#getExtensionheader()
	 * @see #getPacketSpec()
	 * @generated
	 */
	EReference getPacketSpec_Extensionheader();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Inbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Inbound
	 * @generated
	 */
	EClass getInbound();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Outbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Outbound
	 * @generated
	 */
	EClass getOutbound();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Bandwidth
	 * @generated
	 */
	EClass getBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.eho.model.eho.Bandwidth#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Bandwidth#getNumber()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Number();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.Bandwidth#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Bandwidth#getUnit()
	 * @see #getBandwidth()
	 * @generated
	 */
	EReference getBandwidth_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.Bandwidth#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Bandwidth#getTime()
	 * @see #getBandwidth()
	 * @generated
	 */
	EReference getBandwidth_Time();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.BitUnit <em>Bit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Unit</em>'.
	 * @see fr.inria.diverse.eho.model.eho.BitUnit
	 * @generated
	 */
	EClass getBitUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.OctetUnit <em>Octet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet Unit</em>'.
	 * @see fr.inria.diverse.eho.model.eho.OctetUnit
	 * @generated
	 */
	EClass getOctetUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.PacketUnit <em>Packet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet Unit</em>'.
	 * @see fr.inria.diverse.eho.model.eho.PacketUnit
	 * @generated
	 */
	EClass getPacketUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Second <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Second</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Second
	 * @generated
	 */
	EClass getSecond();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Minute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minute</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Minute
	 * @generated
	 */
	EClass getMinute();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Hour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hour</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Hour
	 * @generated
	 */
	EClass getHour();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.ExtensionHeader <em>Extension Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Header</em>'.
	 * @see fr.inria.diverse.eho.model.eho.ExtensionHeader
	 * @generated
	 */
	EClass getExtensionHeader();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.OptionHopByHop <em>Option Hop By Hop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Hop By Hop</em>'.
	 * @see fr.inria.diverse.eho.model.eho.OptionHopByHop
	 * @generated
	 */
	EClass getOptionHopByHop();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.HopByHopOpts <em>Hop By Hop Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hop By Hop Opts</em>'.
	 * @see fr.inria.diverse.eho.model.eho.HopByHopOpts
	 * @generated
	 */
	EClass getHopByHopOpts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.eho.model.eho.HopByHopOpts#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see fr.inria.diverse.eho.model.eho.HopByHopOpts#getOptions()
	 * @see #getHopByHopOpts()
	 * @generated
	 */
	EReference getHopByHopOpts_Options();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Routing
	 * @generated
	 */
	EClass getRouting();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.eho.model.eho.Routing#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Routing#getTypes()
	 * @see #getRouting()
	 * @generated
	 */
	EReference getRouting_Types();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.EncapsulingSecurityPayload <em>Encapsuling Security Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsuling Security Payload</em>'.
	 * @see fr.inria.diverse.eho.model.eho.EncapsulingSecurityPayload
	 * @generated
	 */
	EClass getEncapsulingSecurityPayload();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.AuthentificationHeader <em>Authentification Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentification Header</em>'.
	 * @see fr.inria.diverse.eho.model.eho.AuthentificationHeader
	 * @generated
	 */
	EClass getAuthentificationHeader();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.DestinationOpts <em>Destination Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination Opts</em>'.
	 * @see fr.inria.diverse.eho.model.eho.DestinationOpts
	 * @generated
	 */
	EClass getDestinationOpts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.eho.model.eho.DestinationOpts#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see fr.inria.diverse.eho.model.eho.DestinationOpts#getOptions()
	 * @see #getDestinationOpts()
	 * @generated
	 */
	EReference getDestinationOpts_Options();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.MobilityHeader <em>Mobility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobility Header</em>'.
	 * @see fr.inria.diverse.eho.model.eho.MobilityHeader
	 * @generated
	 */
	EClass getMobilityHeader();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.UnknownEH <em>Unknown EH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown EH</em>'.
	 * @see fr.inria.diverse.eho.model.eho.UnknownEH
	 * @generated
	 */
	EClass getUnknownEH();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.ExperimentationAndTesting <em>Experimentation And Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimentation And Testing</em>'.
	 * @see fr.inria.diverse.eho.model.eho.ExperimentationAndTesting
	 * @generated
	 */
	EClass getExperimentationAndTesting();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.HostIdentityProtocol <em>Host Identity Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Identity Protocol</em>'.
	 * @see fr.inria.diverse.eho.model.eho.HostIdentityProtocol
	 * @generated
	 */
	EClass getHostIdentityProtocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Shim6Protocol <em>Shim6 Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shim6 Protocol</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Shim6Protocol
	 * @generated
	 */
	EClass getShim6Protocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Pad1 <em>Pad1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad1</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Pad1
	 * @generated
	 */
	EClass getPad1();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.PadN <em>Pad N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad N</em>'.
	 * @see fr.inria.diverse.eho.model.eho.PadN
	 * @generated
	 */
	EClass getPadN();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.JumboPayload <em>Jumbo Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jumbo Payload</em>'.
	 * @see fr.inria.diverse.eho.model.eho.JumboPayload
	 * @generated
	 */
	EClass getJumboPayload();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.RPLOption <em>RPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPL Option</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RPLOption
	 * @generated
	 */
	EClass getRPLOption();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.TunnelEncapsulationLimit <em>Tunnel Encapsulation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tunnel Encapsulation Limit</em>'.
	 * @see fr.inria.diverse.eho.model.eho.TunnelEncapsulationLimit
	 * @generated
	 */
	EClass getTunnelEncapsulationLimit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.RouterAlert <em>Router Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Alert</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RouterAlert
	 * @generated
	 */
	EClass getRouterAlert();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.eho.model.eho.RouterAlert#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RouterAlert#getProtocol()
	 * @see #getRouterAlert()
	 * @generated
	 */
	EReference getRouterAlert_Protocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.QuickStart <em>Quick Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quick Start</em>'.
	 * @see fr.inria.diverse.eho.model.eho.QuickStart
	 * @generated
	 */
	EClass getQuickStart();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Calipso <em>Calipso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calipso</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Calipso
	 * @generated
	 */
	EClass getCalipso();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.SmfDpd <em>Smf Dpd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smf Dpd</em>'.
	 * @see fr.inria.diverse.eho.model.eho.SmfDpd
	 * @generated
	 */
	EClass getSmfDpd();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.HomeAdress <em>Home Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Adress</em>'.
	 * @see fr.inria.diverse.eho.model.eho.HomeAdress
	 * @generated
	 */
	EClass getHomeAdress();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Deprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecated</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Deprecated
	 * @generated
	 */
	EClass getDeprecated();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.EndPointIdentification <em>End Point Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Identification</em>'.
	 * @see fr.inria.diverse.eho.model.eho.EndPointIdentification
	 * @generated
	 */
	EClass getEndPointIdentification();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.ILNPNonce <em>ILNP Nonce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILNP Nonce</em>'.
	 * @see fr.inria.diverse.eho.model.eho.ILNPNonce
	 * @generated
	 */
	EClass getILNPNonce();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.LineIdOption <em>Line Id Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Id Option</em>'.
	 * @see fr.inria.diverse.eho.model.eho.LineIdOption
	 * @generated
	 */
	EClass getLineIdOption();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.MPLOption <em>MPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPL Option</em>'.
	 * @see fr.inria.diverse.eho.model.eho.MPLOption
	 * @generated
	 */
	EClass getMPLOption();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.RFC3692Experiment <em>RFC3692 Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFC3692 Experiment</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RFC3692Experiment
	 * @generated
	 */
	EClass getRFC3692Experiment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.IpAddSpec <em>Ip Add Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip Add Spec</em>'.
	 * @see fr.inria.diverse.eho.model.eho.IpAddSpec
	 * @generated
	 */
	EClass getIpAddSpec();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.eho.model.eho.IpAddSpec#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see fr.inria.diverse.eho.model.eho.IpAddSpec#getAdress()
	 * @see #getIpAddSpec()
	 * @generated
	 */
	EAttribute getIpAddSpec_Adress();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.eho.model.eho.IpAddSpec#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see fr.inria.diverse.eho.model.eho.IpAddSpec#getPort()
	 * @see #getIpAddSpec()
	 * @generated
	 */
	EAttribute getIpAddSpec_Port();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.eho.model.eho.IpAddSpec#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see fr.inria.diverse.eho.model.eho.IpAddSpec#getMask()
	 * @see #getIpAddSpec()
	 * @generated
	 */
	EAttribute getIpAddSpec_Mask();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.TypeInterface <em>Type Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Interface</em>'.
	 * @see fr.inria.diverse.eho.model.eho.TypeInterface
	 * @generated
	 */
	EClass getTypeInterface();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Action();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.Rule#getPacketspec <em>Packetspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packetspec</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Rule#getPacketspec()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Packetspec();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.Rule#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Rule#getTo()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_To();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.Rule#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Rule#getNext()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Next();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.eho.model.eho.Rule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Rule#getFrom()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_From();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.RSVP <em>RSVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSVP</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RSVP
	 * @generated
	 */
	EClass getRSVP();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.MLD <em>MLD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MLD</em>'.
	 * @see fr.inria.diverse.eho.model.eho.MLD
	 * @generated
	 */
	EClass getMLD();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.OptionDestination <em>Option Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Destination</em>'.
	 * @see fr.inria.diverse.eho.model.eho.OptionDestination
	 * @generated
	 */
	EClass getOptionDestination();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.IPv6PerformanceDiagnostic <em>IPv6 Performance Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPv6 Performance Diagnostic</em>'.
	 * @see fr.inria.diverse.eho.model.eho.IPv6PerformanceDiagnostic
	 * @generated
	 */
	EClass getIPv6PerformanceDiagnostic();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.TypeRouting <em>Type Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Routing</em>'.
	 * @see fr.inria.diverse.eho.model.eho.TypeRouting
	 * @generated
	 */
	EClass getTypeRouting();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.SourceRoute <em>Source Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Route</em>'.
	 * @see fr.inria.diverse.eho.model.eho.SourceRoute
	 * @generated
	 */
	EClass getSourceRoute();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Nimrod <em>Nimrod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nimrod</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Nimrod
	 * @generated
	 */
	EClass getNimrod();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Type2 <em>Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type2</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Type2
	 * @generated
	 */
	EClass getType2();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.RPLSource <em>RPL Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPL Source</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RPLSource
	 * @generated
	 */
	EClass getRPLSource();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Unassigned <em>Unassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unassigned</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Unassigned
	 * @generated
	 */
	EClass getUnassigned();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.RFC3692Experiment1 <em>RFC3692 Experiment1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFC3692 Experiment1</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RFC3692Experiment1
	 * @generated
	 */
	EClass getRFC3692Experiment1();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.RFC3692Experiment2 <em>RFC3692 Experiment2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFC3692 Experiment2</em>'.
	 * @see fr.inria.diverse.eho.model.eho.RFC3692Experiment2
	 * @generated
	 */
	EClass getRFC3692Experiment2();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Reserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserved</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Reserved
	 * @generated
	 */
	EClass getReserved();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.DiscardDrop <em>Discard Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard Drop</em>'.
	 * @see fr.inria.diverse.eho.model.eho.DiscardDrop
	 * @generated
	 */
	EClass getDiscardDrop();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.DiscardReject <em>Discard Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard Reject</em>'.
	 * @see fr.inria.diverse.eho.model.eho.DiscardReject
	 * @generated
	 */
	EClass getDiscardReject();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.DFF <em>DFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFF</em>'.
	 * @see fr.inria.diverse.eho.model.eho.DFF
	 * @generated
	 */
	EClass getDFF();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.eho.model.eho.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see fr.inria.diverse.eho.model.eho.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EhoFactory getEhoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.ConfigurationImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DropImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RejectImpl <em>Reject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RejectImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getReject()
		 * @generated
		 */
		EClass REJECT = eINSTANCE.getReject();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.ActionImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.AcceptImpl <em>Accept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.AcceptImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getAccept()
		 * @generated
		 */
		EClass ACCEPT = eINSTANCE.getAccept();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DiscardImpl <em>Discard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DiscardImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDiscard()
		 * @generated
		 */
		EClass DISCARD = eINSTANCE.getDiscard();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.PacketSpecImpl <em>Packet Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.PacketSpecImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPacketSpec()
		 * @generated
		 */
		EClass PACKET_SPEC = eINSTANCE.getPacketSpec();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET_SPEC__PORT = eINSTANCE.getPacketSpec_Port();

		/**
		 * The meta object literal for the '<em><b>Extensionheader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET_SPEC__EXTENSIONHEADER = eINSTANCE.getPacketSpec_Extensionheader();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.InboundImpl <em>Inbound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.InboundImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getInbound()
		 * @generated
		 */
		EClass INBOUND = eINSTANCE.getInbound();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.OutboundImpl <em>Outbound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.OutboundImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOutbound()
		 * @generated
		 */
		EClass OUTBOUND = eINSTANCE.getOutbound();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.BandwidthImpl <em>Bandwidth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.BandwidthImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getBandwidth()
		 * @generated
		 */
		EClass BANDWIDTH = eINSTANCE.getBandwidth();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__NUMBER = eINSTANCE.getBandwidth_Number();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH__UNIT = eINSTANCE.getBandwidth_Unit();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH__TIME = eINSTANCE.getBandwidth_Time();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.UnitImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.TimeImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.BitUnitImpl <em>Bit Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.BitUnitImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getBitUnit()
		 * @generated
		 */
		EClass BIT_UNIT = eINSTANCE.getBitUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.OctetUnitImpl <em>Octet Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.OctetUnitImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOctetUnit()
		 * @generated
		 */
		EClass OCTET_UNIT = eINSTANCE.getOctetUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.PacketUnitImpl <em>Packet Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.PacketUnitImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPacketUnit()
		 * @generated
		 */
		EClass PACKET_UNIT = eINSTANCE.getPacketUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.SecondImpl <em>Second</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.SecondImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSecond()
		 * @generated
		 */
		EClass SECOND = eINSTANCE.getSecond();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.MinuteImpl <em>Minute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.MinuteImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMinute()
		 * @generated
		 */
		EClass MINUTE = eINSTANCE.getMinute();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.HourImpl <em>Hour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.HourImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHour()
		 * @generated
		 */
		EClass HOUR = eINSTANCE.getHour();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DayImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.ExtensionHeaderImpl <em>Extension Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.ExtensionHeaderImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getExtensionHeader()
		 * @generated
		 */
		EClass EXTENSION_HEADER = eINSTANCE.getExtensionHeader();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.OptionHopByHopImpl <em>Option Hop By Hop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.OptionHopByHopImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOptionHopByHop()
		 * @generated
		 */
		EClass OPTION_HOP_BY_HOP = eINSTANCE.getOptionHopByHop();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.HopByHopOptsImpl <em>Hop By Hop Opts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.HopByHopOptsImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHopByHopOpts()
		 * @generated
		 */
		EClass HOP_BY_HOP_OPTS = eINSTANCE.getHopByHopOpts();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOP_BY_HOP_OPTS__OPTIONS = eINSTANCE.getHopByHopOpts_Options();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RoutingImpl <em>Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RoutingImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRouting()
		 * @generated
		 */
		EClass ROUTING = eINSTANCE.getRouting();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING__TYPES = eINSTANCE.getRouting_Types();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.FragmentImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.EncapsulingSecurityPayloadImpl <em>Encapsuling Security Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.EncapsulingSecurityPayloadImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getEncapsulingSecurityPayload()
		 * @generated
		 */
		EClass ENCAPSULING_SECURITY_PAYLOAD = eINSTANCE.getEncapsulingSecurityPayload();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.AuthentificationHeaderImpl <em>Authentification Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.AuthentificationHeaderImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getAuthentificationHeader()
		 * @generated
		 */
		EClass AUTHENTIFICATION_HEADER = eINSTANCE.getAuthentificationHeader();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DestinationOptsImpl <em>Destination Opts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DestinationOptsImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDestinationOpts()
		 * @generated
		 */
		EClass DESTINATION_OPTS = eINSTANCE.getDestinationOpts();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESTINATION_OPTS__OPTIONS = eINSTANCE.getDestinationOpts_Options();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.MobilityHeaderImpl <em>Mobility Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.MobilityHeaderImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMobilityHeader()
		 * @generated
		 */
		EClass MOBILITY_HEADER = eINSTANCE.getMobilityHeader();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.UnknownEHImpl <em>Unknown EH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.UnknownEHImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getUnknownEH()
		 * @generated
		 */
		EClass UNKNOWN_EH = eINSTANCE.getUnknownEH();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.ExperimentationAndTestingImpl <em>Experimentation And Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.ExperimentationAndTestingImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getExperimentationAndTesting()
		 * @generated
		 */
		EClass EXPERIMENTATION_AND_TESTING = eINSTANCE.getExperimentationAndTesting();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.HostIdentityProtocolImpl <em>Host Identity Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.HostIdentityProtocolImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHostIdentityProtocol()
		 * @generated
		 */
		EClass HOST_IDENTITY_PROTOCOL = eINSTANCE.getHostIdentityProtocol();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.Shim6ProtocolImpl <em>Shim6 Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.Shim6ProtocolImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getShim6Protocol()
		 * @generated
		 */
		EClass SHIM6_PROTOCOL = eINSTANCE.getShim6Protocol();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.Pad1Impl <em>Pad1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.Pad1Impl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPad1()
		 * @generated
		 */
		EClass PAD1 = eINSTANCE.getPad1();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.PadNImpl <em>Pad N</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.PadNImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getPadN()
		 * @generated
		 */
		EClass PAD_N = eINSTANCE.getPadN();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.JumboPayloadImpl <em>Jumbo Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.JumboPayloadImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getJumboPayload()
		 * @generated
		 */
		EClass JUMBO_PAYLOAD = eINSTANCE.getJumboPayload();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RPLOptionImpl <em>RPL Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RPLOptionImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRPLOption()
		 * @generated
		 */
		EClass RPL_OPTION = eINSTANCE.getRPLOption();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.TunnelEncapsulationLimitImpl <em>Tunnel Encapsulation Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.TunnelEncapsulationLimitImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTunnelEncapsulationLimit()
		 * @generated
		 */
		EClass TUNNEL_ENCAPSULATION_LIMIT = eINSTANCE.getTunnelEncapsulationLimit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RouterAlertImpl <em>Router Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RouterAlertImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRouterAlert()
		 * @generated
		 */
		EClass ROUTER_ALERT = eINSTANCE.getRouterAlert();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_ALERT__PROTOCOL = eINSTANCE.getRouterAlert_Protocol();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.QuickStartImpl <em>Quick Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.QuickStartImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getQuickStart()
		 * @generated
		 */
		EClass QUICK_START = eINSTANCE.getQuickStart();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.CalipsoImpl <em>Calipso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.CalipsoImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getCalipso()
		 * @generated
		 */
		EClass CALIPSO = eINSTANCE.getCalipso();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.SmfDpdImpl <em>Smf Dpd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.SmfDpdImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSmfDpd()
		 * @generated
		 */
		EClass SMF_DPD = eINSTANCE.getSmfDpd();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.HomeAdressImpl <em>Home Adress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.HomeAdressImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getHomeAdress()
		 * @generated
		 */
		EClass HOME_ADRESS = eINSTANCE.getHomeAdress();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DeprecatedImpl <em>Deprecated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DeprecatedImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDeprecated()
		 * @generated
		 */
		EClass DEPRECATED = eINSTANCE.getDeprecated();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.EndPointIdentificationImpl <em>End Point Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.EndPointIdentificationImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getEndPointIdentification()
		 * @generated
		 */
		EClass END_POINT_IDENTIFICATION = eINSTANCE.getEndPointIdentification();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.ILNPNonceImpl <em>ILNP Nonce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.ILNPNonceImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getILNPNonce()
		 * @generated
		 */
		EClass ILNP_NONCE = eINSTANCE.getILNPNonce();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.LineIdOptionImpl <em>Line Id Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.LineIdOptionImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getLineIdOption()
		 * @generated
		 */
		EClass LINE_ID_OPTION = eINSTANCE.getLineIdOption();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.MPLOptionImpl <em>MPL Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.MPLOptionImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMPLOption()
		 * @generated
		 */
		EClass MPL_OPTION = eINSTANCE.getMPLOption();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RFC3692ExperimentImpl <em>RFC3692 Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RFC3692ExperimentImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRFC3692Experiment()
		 * @generated
		 */
		EClass RFC3692_EXPERIMENT = eINSTANCE.getRFC3692Experiment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.IpAddSpecImpl <em>Ip Add Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.IpAddSpecImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getIpAddSpec()
		 * @generated
		 */
		EClass IP_ADD_SPEC = eINSTANCE.getIpAddSpec();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADD_SPEC__ADRESS = eINSTANCE.getIpAddSpec_Adress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADD_SPEC__PORT = eINSTANCE.getIpAddSpec_Port();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_ADD_SPEC__MASK = eINSTANCE.getIpAddSpec_Mask();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.TypeInterfaceImpl <em>Type Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.TypeInterfaceImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTypeInterface()
		 * @generated
		 */
		EClass TYPE_INTERFACE = eINSTANCE.getTypeInterface();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RuleImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTION = eINSTANCE.getRule_Action();

		/**
		 * The meta object literal for the '<em><b>Packetspec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PACKETSPEC = eINSTANCE.getRule_Packetspec();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TO = eINSTANCE.getRule_To();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__NEXT = eINSTANCE.getRule_Next();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FROM = eINSTANCE.getRule_From();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.ProtocolImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RSVPImpl <em>RSVP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RSVPImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRSVP()
		 * @generated
		 */
		EClass RSVP = eINSTANCE.getRSVP();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.MLDImpl <em>MLD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.MLDImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getMLD()
		 * @generated
		 */
		EClass MLD = eINSTANCE.getMLD();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.OptionDestinationImpl <em>Option Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.OptionDestinationImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOptionDestination()
		 * @generated
		 */
		EClass OPTION_DESTINATION = eINSTANCE.getOptionDestination();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.IPv6PerformanceDiagnosticImpl <em>IPv6 Performance Diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.IPv6PerformanceDiagnosticImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getIPv6PerformanceDiagnostic()
		 * @generated
		 */
		EClass IPV6_PERFORMANCE_DIAGNOSTIC = eINSTANCE.getIPv6PerformanceDiagnostic();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.TypeRoutingImpl <em>Type Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.TypeRoutingImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getTypeRouting()
		 * @generated
		 */
		EClass TYPE_ROUTING = eINSTANCE.getTypeRouting();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.SourceRouteImpl <em>Source Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.SourceRouteImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSourceRoute()
		 * @generated
		 */
		EClass SOURCE_ROUTE = eINSTANCE.getSourceRoute();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.NimrodImpl <em>Nimrod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.NimrodImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getNimrod()
		 * @generated
		 */
		EClass NIMROD = eINSTANCE.getNimrod();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.Type2Impl <em>Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.Type2Impl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getType2()
		 * @generated
		 */
		EClass TYPE2 = eINSTANCE.getType2();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RPLSourceImpl <em>RPL Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RPLSourceImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRPLSource()
		 * @generated
		 */
		EClass RPL_SOURCE = eINSTANCE.getRPLSource();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.SegmentImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.UnassignedImpl <em>Unassigned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.UnassignedImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getUnassigned()
		 * @generated
		 */
		EClass UNASSIGNED = eINSTANCE.getUnassigned();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment1Impl <em>RFC3692 Experiment1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment1Impl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRFC3692Experiment1()
		 * @generated
		 */
		EClass RFC3692_EXPERIMENT1 = eINSTANCE.getRFC3692Experiment1();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment2Impl <em>RFC3692 Experiment2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.RFC3692Experiment2Impl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getRFC3692Experiment2()
		 * @generated
		 */
		EClass RFC3692_EXPERIMENT2 = eINSTANCE.getRFC3692Experiment2();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.ReservedImpl <em>Reserved</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.ReservedImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getReserved()
		 * @generated
		 */
		EClass RESERVED = eINSTANCE.getReserved();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DiscardDropImpl <em>Discard Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DiscardDropImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDiscardDrop()
		 * @generated
		 */
		EClass DISCARD_DROP = eINSTANCE.getDiscardDrop();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DiscardRejectImpl <em>Discard Reject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DiscardRejectImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDiscardReject()
		 * @generated
		 */
		EClass DISCARD_REJECT = eINSTANCE.getDiscardReject();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.DFFImpl <em>DFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.DFFImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getDFF()
		 * @generated
		 */
		EClass DFF = eINSTANCE.getDFF();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.eho.model.eho.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.eho.model.eho.impl.OptionsImpl
		 * @see fr.inria.diverse.eho.model.eho.impl.EhoPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

	}

} //EhoPackage
