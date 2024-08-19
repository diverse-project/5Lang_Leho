/**
 */
package fr.inria.diverse.melanger.leho.Leho;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.leho.Leho.LehoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface LehoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Leho";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/diverse/Leho";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Leho";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LehoPackage eINSTANCE = fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.ConfigurationImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getConfiguration()
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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.ActionImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getAction()
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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DropImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDrop()
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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RejectImpl <em>Reject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RejectImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getReject()
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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.AcceptImpl <em>Accept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.AcceptImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getAccept()
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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DiscardImpl <em>Discard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DiscardImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDiscard()
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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.InterfaceImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__PORTS = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.InboundImpl <em>Inbound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.InboundImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getInbound()
	 * @generated
	 */
	int INBOUND = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND__PORTS = INTERFACE__PORTS;

	/**
	 * The number of structural features of the '<em>Inbound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OutboundImpl <em>Outbound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.OutboundImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOutbound()
	 * @generated
	 */
	int OUTBOUND = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND__PORTS = INTERFACE__PORTS;

	/**
	 * The number of structural features of the '<em>Outbound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTBOUND_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.BandwidthImpl <em>Bandwidth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.BandwidthImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getBandwidth()
	 * @generated
	 */
	int BANDWIDTH = 8;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.UnitImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 9;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.TimeImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 10;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.BitUnitImpl <em>Bit Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.BitUnitImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getBitUnit()
	 * @generated
	 */
	int BIT_UNIT = 11;

	/**
	 * The number of structural features of the '<em>Bit Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OctetUnitImpl <em>Octet Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.OctetUnitImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOctetUnit()
	 * @generated
	 */
	int OCTET_UNIT = 12;

	/**
	 * The number of structural features of the '<em>Octet Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCTET_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PacketUnitImpl <em>Packet Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.PacketUnitImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPacketUnit()
	 * @generated
	 */
	int PACKET_UNIT = 13;

	/**
	 * The number of structural features of the '<em>Packet Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SecondImpl <em>Second</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.SecondImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSecond()
	 * @generated
	 */
	int SECOND = 14;

	/**
	 * The number of structural features of the '<em>Second</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MinuteImpl <em>Minute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.MinuteImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMinute()
	 * @generated
	 */
	int MINUTE = 15;

	/**
	 * The number of structural features of the '<em>Minute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUTE_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HourImpl <em>Hour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.HourImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHour()
	 * @generated
	 */
	int HOUR = 16;

	/**
	 * The number of structural features of the '<em>Hour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUR_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DayImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDay()
	 * @generated
	 */
	int DAY = 17;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ExtensionHeaderImpl <em>Extension Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.ExtensionHeaderImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getExtensionHeader()
	 * @generated
	 */
	int EXTENSION_HEADER = 18;

	/**
	 * The number of structural features of the '<em>Extension Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_HEADER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OptionHopByHopImpl <em>Option Hop By Hop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.OptionHopByHopImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOptionHopByHop()
	 * @generated
	 */
	int OPTION_HOP_BY_HOP = 19;

	/**
	 * The number of structural features of the '<em>Option Hop By Hop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_HOP_BY_HOP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HopByHopOptsImpl <em>Hop By Hop Opts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.HopByHopOptsImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHopByHopOpts()
	 * @generated
	 */
	int HOP_BY_HOP_OPTS = 20;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RoutingImpl <em>Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RoutingImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRouting()
	 * @generated
	 */
	int ROUTING = 21;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.FragmentImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 22;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.EncapsulingSecurityPayloadImpl <em>Encapsuling Security Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.EncapsulingSecurityPayloadImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getEncapsulingSecurityPayload()
	 * @generated
	 */
	int ENCAPSULING_SECURITY_PAYLOAD = 23;

	/**
	 * The number of structural features of the '<em>Encapsuling Security Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCAPSULING_SECURITY_PAYLOAD_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.AuthentificationHeaderImpl <em>Authentification Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.AuthentificationHeaderImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getAuthentificationHeader()
	 * @generated
	 */
	int AUTHENTIFICATION_HEADER = 24;

	/**
	 * The number of structural features of the '<em>Authentification Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTIFICATION_HEADER_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DestinationOptsImpl <em>Destination Opts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DestinationOptsImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDestinationOpts()
	 * @generated
	 */
	int DESTINATION_OPTS = 25;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MobilityHeaderImpl <em>Mobility Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.MobilityHeaderImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMobilityHeader()
	 * @generated
	 */
	int MOBILITY_HEADER = 26;

	/**
	 * The number of structural features of the '<em>Mobility Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILITY_HEADER_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.UnknownEHImpl <em>Unknown EH</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.UnknownEHImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getUnknownEH()
	 * @generated
	 */
	int UNKNOWN_EH = 27;

	/**
	 * The number of structural features of the '<em>Unknown EH</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EH_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ExperimentationAndTestingImpl <em>Experimentation And Testing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.ExperimentationAndTestingImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getExperimentationAndTesting()
	 * @generated
	 */
	int EXPERIMENTATION_AND_TESTING = 28;

	/**
	 * The number of structural features of the '<em>Experimentation And Testing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPERIMENTATION_AND_TESTING_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HostIdentityProtocolImpl <em>Host Identity Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.HostIdentityProtocolImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHostIdentityProtocol()
	 * @generated
	 */
	int HOST_IDENTITY_PROTOCOL = 29;

	/**
	 * The number of structural features of the '<em>Host Identity Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_IDENTITY_PROTOCOL_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.Shim6ProtocolImpl <em>Shim6 Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.Shim6ProtocolImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getShim6Protocol()
	 * @generated
	 */
	int SHIM6_PROTOCOL = 30;

	/**
	 * The number of structural features of the '<em>Shim6 Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM6_PROTOCOL_FEATURE_COUNT = EXTENSION_HEADER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OptionsImpl <em>Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.OptionsImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOptions()
	 * @generated
	 */
	int OPTIONS = 68;

	/**
	 * The number of structural features of the '<em>Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.Pad1Impl <em>Pad1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.Pad1Impl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPad1()
	 * @generated
	 */
	int PAD1 = 31;

	/**
	 * The number of structural features of the '<em>Pad1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD1_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PadNImpl <em>Pad N</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.PadNImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPadN()
	 * @generated
	 */
	int PAD_N = 32;

	/**
	 * The number of structural features of the '<em>Pad N</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_N_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.JumboPayloadImpl <em>Jumbo Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.JumboPayloadImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getJumboPayload()
	 * @generated
	 */
	int JUMBO_PAYLOAD = 33;

	/**
	 * The number of structural features of the '<em>Jumbo Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMBO_PAYLOAD_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RPLOptionImpl <em>RPL Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RPLOptionImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRPLOption()
	 * @generated
	 */
	int RPL_OPTION = 34;

	/**
	 * The number of structural features of the '<em>RPL Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPL_OPTION_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OptionDestinationImpl <em>Option Destination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.OptionDestinationImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOptionDestination()
	 * @generated
	 */
	int OPTION_DESTINATION = 53;

	/**
	 * The number of structural features of the '<em>Option Destination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_DESTINATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.TunnelEncapsulationLimitImpl <em>Tunnel Encapsulation Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.TunnelEncapsulationLimitImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getTunnelEncapsulationLimit()
	 * @generated
	 */
	int TUNNEL_ENCAPSULATION_LIMIT = 35;

	/**
	 * The number of structural features of the '<em>Tunnel Encapsulation Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNNEL_ENCAPSULATION_LIMIT_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RouterAlertImpl <em>Router Alert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RouterAlertImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRouterAlert()
	 * @generated
	 */
	int ROUTER_ALERT = 36;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.QuickStartImpl <em>Quick Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.QuickStartImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getQuickStart()
	 * @generated
	 */
	int QUICK_START = 37;

	/**
	 * The number of structural features of the '<em>Quick Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUICK_START_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.CalipsoImpl <em>Calipso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.CalipsoImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getCalipso()
	 * @generated
	 */
	int CALIPSO = 38;

	/**
	 * The number of structural features of the '<em>Calipso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALIPSO_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SmfDpdImpl <em>Smf Dpd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.SmfDpdImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSmfDpd()
	 * @generated
	 */
	int SMF_DPD = 39;

	/**
	 * The number of structural features of the '<em>Smf Dpd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMF_DPD_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HomeAdressImpl <em>Home Adress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.HomeAdressImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHomeAdress()
	 * @generated
	 */
	int HOME_ADRESS = 40;

	/**
	 * The number of structural features of the '<em>Home Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOME_ADRESS_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DeprecatedImpl <em>Deprecated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DeprecatedImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDeprecated()
	 * @generated
	 */
	int DEPRECATED = 41;

	/**
	 * The number of structural features of the '<em>Deprecated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPRECATED_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.EndPointIdentificationImpl <em>End Point Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.EndPointIdentificationImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getEndPointIdentification()
	 * @generated
	 */
	int END_POINT_IDENTIFICATION = 42;

	/**
	 * The number of structural features of the '<em>End Point Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_POINT_IDENTIFICATION_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ILNPNonceImpl <em>ILNP Nonce</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.ILNPNonceImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getILNPNonce()
	 * @generated
	 */
	int ILNP_NONCE = 43;

	/**
	 * The number of structural features of the '<em>ILNP Nonce</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ILNP_NONCE_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.LineIdOptionImpl <em>Line Id Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LineIdOptionImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getLineIdOption()
	 * @generated
	 */
	int LINE_ID_OPTION = 44;

	/**
	 * The number of structural features of the '<em>Line Id Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ID_OPTION_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MPLOptionImpl <em>MPL Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.MPLOptionImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMPLOption()
	 * @generated
	 */
	int MPL_OPTION = 45;

	/**
	 * The number of structural features of the '<em>MPL Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPL_OPTION_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RFC3692ExperimentImpl <em>RFC3692 Experiment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RFC3692ExperimentImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRFC3692Experiment()
	 * @generated
	 */
	int RFC3692_EXPERIMENT = 46;

	/**
	 * The number of structural features of the '<em>RFC3692 Experiment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT_FEATURE_COUNT = OPTIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.IpAddSpecImpl <em>Ip Add Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.IpAddSpecImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getIpAddSpec()
	 * @generated
	 */
	int IP_ADD_SPEC = 47;

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
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RuleImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 49;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TO = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NEXT = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FROM = 3;

	/**
	 * The feature id for the '<em><b>Extensionheader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXTENSIONHEADER = 4;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INTERFACE = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.ProtocolImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 50;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RSVPImpl <em>RSVP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RSVPImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRSVP()
	 * @generated
	 */
	int RSVP = 51;

	/**
	 * The number of structural features of the '<em>RSVP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSVP_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MLDImpl <em>MLD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.MLDImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMLD()
	 * @generated
	 */
	int MLD = 52;

	/**
	 * The number of structural features of the '<em>MLD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MLD_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.IPv6PerformanceDiagnosticImpl <em>IPv6 Performance Diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.IPv6PerformanceDiagnosticImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getIPv6PerformanceDiagnostic()
	 * @generated
	 */
	int IPV6_PERFORMANCE_DIAGNOSTIC = 54;

	/**
	 * The number of structural features of the '<em>IPv6 Performance Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPV6_PERFORMANCE_DIAGNOSTIC_FEATURE_COUNT = OPTION_DESTINATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.TypeRoutingImpl <em>Type Routing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.TypeRoutingImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getTypeRouting()
	 * @generated
	 */
	int TYPE_ROUTING = 55;

	/**
	 * The number of structural features of the '<em>Type Routing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ROUTING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SourceRouteImpl <em>Source Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.SourceRouteImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSourceRoute()
	 * @generated
	 */
	int SOURCE_ROUTE = 56;

	/**
	 * The number of structural features of the '<em>Source Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ROUTE_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.NimrodImpl <em>Nimrod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.NimrodImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getNimrod()
	 * @generated
	 */
	int NIMROD = 57;

	/**
	 * The number of structural features of the '<em>Nimrod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIMROD_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.Type2Impl <em>Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.Type2Impl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getType2()
	 * @generated
	 */
	int TYPE2 = 58;

	/**
	 * The number of structural features of the '<em>Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RPLSourceImpl <em>RPL Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RPLSourceImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRPLSource()
	 * @generated
	 */
	int RPL_SOURCE = 59;

	/**
	 * The number of structural features of the '<em>RPL Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPL_SOURCE_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.SegmentImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 60;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.UnassignedImpl <em>Unassigned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.UnassignedImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getUnassigned()
	 * @generated
	 */
	int UNASSIGNED = 61;

	/**
	 * The number of structural features of the '<em>Unassigned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNASSIGNED_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment1Impl <em>RFC3692 Experiment1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment1Impl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRFC3692Experiment1()
	 * @generated
	 */
	int RFC3692_EXPERIMENT1 = 62;

	/**
	 * The number of structural features of the '<em>RFC3692 Experiment1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT1_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment2Impl <em>RFC3692 Experiment2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment2Impl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRFC3692Experiment2()
	 * @generated
	 */
	int RFC3692_EXPERIMENT2 = 63;

	/**
	 * The number of structural features of the '<em>RFC3692 Experiment2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RFC3692_EXPERIMENT2_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ReservedImpl <em>Reserved</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.ReservedImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getReserved()
	 * @generated
	 */
	int RESERVED = 64;

	/**
	 * The number of structural features of the '<em>Reserved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVED_FEATURE_COUNT = TYPE_ROUTING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DiscardDropImpl <em>Discard Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DiscardDropImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDiscardDrop()
	 * @generated
	 */
	int DISCARD_DROP = 65;

	/**
	 * The number of structural features of the '<em>Discard Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_DROP_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DiscardRejectImpl <em>Discard Reject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DiscardRejectImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDiscardReject()
	 * @generated
	 */
	int DISCARD_REJECT = 66;

	/**
	 * The number of structural features of the '<em>Discard Reject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCARD_REJECT_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DFFImpl <em>DFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.DFFImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDFF()
	 * @generated
	 */
	int DFF = 67;

	/**
	 * The number of structural features of the '<em>DFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFF_FEATURE_COUNT = OPTION_HOP_BY_HOP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PolicyImpl <em>Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.PolicyImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPolicy()
	 * @generated
	 */
	int POLICY = 69;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Packets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__PACKETS = 1;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__IN_PORTS = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__INTERFACES = 3;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY__CONFIGURATION = 4;

	/**
	 * The number of structural features of the '<em>Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICY_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.FilterImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 70;

	/**
	 * The feature id for the '<em><b>Current Packet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CURRENT_PACKET = 0;

	/**
	 * The feature id for the '<em><b>Current Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CURRENT_TIME = 1;

	/**
	 * The feature id for the '<em><b>First Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FIRST_RULE = 2;

	/**
	 * The feature id for the '<em><b>Current Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__CURRENT_RULE = 3;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PacketImpl <em>Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.PacketImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPacket()
	 * @generated
	 */
	int PACKET = 71;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__TIME = 0;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__IN_PORT = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Source Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__SOURCE_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__DESTINATION_ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Extensionheaders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET__EXTENSIONHEADERS = 5;

	/**
	 * The number of structural features of the '<em>Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.PortImpl
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 72;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 73;


	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reject</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Reject
	 * @generated
	 */
	EClass getReject();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Accept <em>Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Accept
	 * @generated
	 */
	EClass getAccept();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Discard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Discard
	 * @generated
	 */
	EClass getDiscard();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Inbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Inbound
	 * @generated
	 */
	EClass getInbound();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Outbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outbound</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Outbound
	 * @generated
	 */
	EClass getOutbound();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Bandwidth
	 * @generated
	 */
	EClass getBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Bandwidth#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Bandwidth#getNumber()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Number();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Bandwidth#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Bandwidth#getUnit()
	 * @see #getBandwidth()
	 * @generated
	 */
	EReference getBandwidth_Unit();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Bandwidth#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Bandwidth#getTime()
	 * @see #getBandwidth()
	 * @generated
	 */
	EReference getBandwidth_Time();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.BitUnit <em>Bit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Unit</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.BitUnit
	 * @generated
	 */
	EClass getBitUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.OctetUnit <em>Octet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Octet Unit</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.OctetUnit
	 * @generated
	 */
	EClass getOctetUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.PacketUnit <em>Packet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet Unit</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.PacketUnit
	 * @generated
	 */
	EClass getPacketUnit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Second <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Second</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Second
	 * @generated
	 */
	EClass getSecond();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Minute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minute</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Minute
	 * @generated
	 */
	EClass getMinute();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Hour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hour</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Hour
	 * @generated
	 */
	EClass getHour();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.ExtensionHeader <em>Extension Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Header</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.ExtensionHeader
	 * @generated
	 */
	EClass getExtensionHeader();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.OptionHopByHop <em>Option Hop By Hop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Hop By Hop</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.OptionHopByHop
	 * @generated
	 */
	EClass getOptionHopByHop();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.HopByHopOpts <em>Hop By Hop Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hop By Hop Opts</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.HopByHopOpts
	 * @generated
	 */
	EClass getHopByHopOpts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.HopByHopOpts#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.HopByHopOpts#getOptions()
	 * @see #getHopByHopOpts()
	 * @generated
	 */
	EReference getHopByHopOpts_Options();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Routing
	 * @generated
	 */
	EClass getRouting();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.Routing#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Routing#getTypes()
	 * @see #getRouting()
	 * @generated
	 */
	EReference getRouting_Types();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.EncapsulingSecurityPayload <em>Encapsuling Security Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encapsuling Security Payload</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.EncapsulingSecurityPayload
	 * @generated
	 */
	EClass getEncapsulingSecurityPayload();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.AuthentificationHeader <em>Authentification Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentification Header</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.AuthentificationHeader
	 * @generated
	 */
	EClass getAuthentificationHeader();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.DestinationOpts <em>Destination Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destination Opts</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.DestinationOpts
	 * @generated
	 */
	EClass getDestinationOpts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.DestinationOpts#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.DestinationOpts#getOptions()
	 * @see #getDestinationOpts()
	 * @generated
	 */
	EReference getDestinationOpts_Options();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.MobilityHeader <em>Mobility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobility Header</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.MobilityHeader
	 * @generated
	 */
	EClass getMobilityHeader();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.UnknownEH <em>Unknown EH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown EH</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.UnknownEH
	 * @generated
	 */
	EClass getUnknownEH();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.ExperimentationAndTesting <em>Experimentation And Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Experimentation And Testing</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.ExperimentationAndTesting
	 * @generated
	 */
	EClass getExperimentationAndTesting();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.HostIdentityProtocol <em>Host Identity Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host Identity Protocol</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.HostIdentityProtocol
	 * @generated
	 */
	EClass getHostIdentityProtocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Shim6Protocol <em>Shim6 Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shim6 Protocol</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Shim6Protocol
	 * @generated
	 */
	EClass getShim6Protocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Pad1 <em>Pad1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad1</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Pad1
	 * @generated
	 */
	EClass getPad1();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.PadN <em>Pad N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad N</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.PadN
	 * @generated
	 */
	EClass getPadN();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.JumboPayload <em>Jumbo Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jumbo Payload</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.JumboPayload
	 * @generated
	 */
	EClass getJumboPayload();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.RPLOption <em>RPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPL Option</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RPLOption
	 * @generated
	 */
	EClass getRPLOption();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.TunnelEncapsulationLimit <em>Tunnel Encapsulation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tunnel Encapsulation Limit</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.TunnelEncapsulationLimit
	 * @generated
	 */
	EClass getTunnelEncapsulationLimit();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.RouterAlert <em>Router Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Alert</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RouterAlert
	 * @generated
	 */
	EClass getRouterAlert();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.RouterAlert#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RouterAlert#getProtocol()
	 * @see #getRouterAlert()
	 * @generated
	 */
	EReference getRouterAlert_Protocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.QuickStart <em>Quick Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quick Start</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.QuickStart
	 * @generated
	 */
	EClass getQuickStart();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Calipso <em>Calipso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calipso</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Calipso
	 * @generated
	 */
	EClass getCalipso();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.SmfDpd <em>Smf Dpd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smf Dpd</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.SmfDpd
	 * @generated
	 */
	EClass getSmfDpd();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.HomeAdress <em>Home Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Home Adress</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.HomeAdress
	 * @generated
	 */
	EClass getHomeAdress();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Deprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deprecated</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Deprecated
	 * @generated
	 */
	EClass getDeprecated();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.EndPointIdentification <em>End Point Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Point Identification</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.EndPointIdentification
	 * @generated
	 */
	EClass getEndPointIdentification();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.ILNPNonce <em>ILNP Nonce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ILNP Nonce</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.ILNPNonce
	 * @generated
	 */
	EClass getILNPNonce();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.LineIdOption <em>Line Id Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Id Option</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.LineIdOption
	 * @generated
	 */
	EClass getLineIdOption();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.MPLOption <em>MPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPL Option</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.MPLOption
	 * @generated
	 */
	EClass getMPLOption();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment <em>RFC3692 Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFC3692 Experiment</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment
	 * @generated
	 */
	EClass getRFC3692Experiment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.IpAddSpec <em>Ip Add Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ip Add Spec</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.IpAddSpec
	 * @generated
	 */
	EClass getIpAddSpec();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.IpAddSpec#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.IpAddSpec#getAdress()
	 * @see #getIpAddSpec()
	 * @generated
	 */
	EAttribute getIpAddSpec_Adress();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.IpAddSpec#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.IpAddSpec#getPort()
	 * @see #getIpAddSpec()
	 * @generated
	 */
	EAttribute getIpAddSpec_Port();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.IpAddSpec#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.IpAddSpec#getMask()
	 * @see #getIpAddSpec()
	 * @generated
	 */
	EAttribute getIpAddSpec_Mask();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the reference list '{@link fr.inria.diverse.melanger.leho.Leho.Interface#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Interface#getPorts()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Ports();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Action();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Rule#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule#getTo()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_To();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Rule#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule#getNext()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Next();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Rule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule#getFrom()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_From();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.Rule#getExtensionheader <em>Extensionheader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensionheader</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule#getExtensionheader()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Extensionheader();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.leho.Leho.Rule#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule#getInterface()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Interface();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.RSVP <em>RSVP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSVP</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RSVP
	 * @generated
	 */
	EClass getRSVP();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.MLD <em>MLD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MLD</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.MLD
	 * @generated
	 */
	EClass getMLD();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.OptionDestination <em>Option Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Destination</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.OptionDestination
	 * @generated
	 */
	EClass getOptionDestination();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.IPv6PerformanceDiagnostic <em>IPv6 Performance Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPv6 Performance Diagnostic</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.IPv6PerformanceDiagnostic
	 * @generated
	 */
	EClass getIPv6PerformanceDiagnostic();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.TypeRouting <em>Type Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Routing</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.TypeRouting
	 * @generated
	 */
	EClass getTypeRouting();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.SourceRoute <em>Source Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Route</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.SourceRoute
	 * @generated
	 */
	EClass getSourceRoute();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Nimrod <em>Nimrod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nimrod</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Nimrod
	 * @generated
	 */
	EClass getNimrod();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Type2 <em>Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type2</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Type2
	 * @generated
	 */
	EClass getType2();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.RPLSource <em>RPL Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPL Source</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RPLSource
	 * @generated
	 */
	EClass getRPLSource();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Unassigned <em>Unassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unassigned</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Unassigned
	 * @generated
	 */
	EClass getUnassigned();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment1 <em>RFC3692 Experiment1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFC3692 Experiment1</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment1
	 * @generated
	 */
	EClass getRFC3692Experiment1();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment2 <em>RFC3692 Experiment2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RFC3692 Experiment2</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment2
	 * @generated
	 */
	EClass getRFC3692Experiment2();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Reserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserved</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Reserved
	 * @generated
	 */
	EClass getReserved();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.DiscardDrop <em>Discard Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard Drop</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.DiscardDrop
	 * @generated
	 */
	EClass getDiscardDrop();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.DiscardReject <em>Discard Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discard Reject</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.DiscardReject
	 * @generated
	 */
	EClass getDiscardReject();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.DFF <em>DFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DFF</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.DFF
	 * @generated
	 */
	EClass getDFF();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Options
	 * @generated
	 */
	EClass getOptions();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policy</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Policy
	 * @generated
	 */
	EClass getPolicy();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Policy#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Policy#getFilter()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Filter();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.Policy#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packets</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Policy#getPackets()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Packets();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.Policy#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Ports</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Policy#getInPorts()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_InPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.Policy#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Policy#getInterfaces()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Policy#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Policy#getConfiguration()
	 * @see #getPolicy()
	 * @generated
	 */
	EReference getPolicy_Configuration();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.leho.Leho.Filter#getCurrentPacket <em>Current Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Packet</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Filter#getCurrentPacket()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_CurrentPacket();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Filter#getCurrentTime <em>Current Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Time</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Filter#getCurrentTime()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_CurrentTime();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Filter#getFirstRule <em>First Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Rule</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Filter#getFirstRule()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_FirstRule();

	/**
	 * Returns the meta object for the containment reference '{@link fr.inria.diverse.melanger.leho.Leho.Filter#getCurrentRule <em>Current Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Rule</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Filter#getCurrentRule()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_CurrentRule();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Packet <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet
	 * @generated
	 */
	EClass getPacket();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet#getTime()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Time();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Port</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet#getInPort()
	 * @see #getPacket()
	 * @generated
	 */
	EReference getPacket_InPort();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet#getContent()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_Content();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getSourceAddress <em>Source Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Address</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet#getSourceAddress()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_SourceAddress();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getDestinationAddress <em>Destination Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Address</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet#getDestinationAddress()
	 * @see #getPacket()
	 * @generated
	 */
	EAttribute getPacket_DestinationAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.diverse.melanger.leho.Leho.Packet#getExtensionheaders <em>Extensionheaders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensionheaders</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet#getExtensionheaders()
	 * @see #getPacket()
	 * @generated
	 */
	EReference getPacket_Extensionheaders();

	/**
	 * Returns the meta object for class '{@link fr.inria.diverse.melanger.leho.Leho.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.diverse.melanger.leho.Leho.Port#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Port#getNumber()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Number();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.diverse.melanger.leho.Leho.Port#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see fr.inria.diverse.melanger.leho.Leho.Port#getInterface()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Interface();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        annotation="aspect"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LehoFactory getLehoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.ConfigurationImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DropImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RejectImpl <em>Reject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RejectImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getReject()
		 * @generated
		 */
		EClass REJECT = eINSTANCE.getReject();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.ActionImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.AcceptImpl <em>Accept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.AcceptImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getAccept()
		 * @generated
		 */
		EClass ACCEPT = eINSTANCE.getAccept();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DiscardImpl <em>Discard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DiscardImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDiscard()
		 * @generated
		 */
		EClass DISCARD = eINSTANCE.getDiscard();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.InboundImpl <em>Inbound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.InboundImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getInbound()
		 * @generated
		 */
		EClass INBOUND = eINSTANCE.getInbound();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OutboundImpl <em>Outbound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.OutboundImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOutbound()
		 * @generated
		 */
		EClass OUTBOUND = eINSTANCE.getOutbound();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.BandwidthImpl <em>Bandwidth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.BandwidthImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getBandwidth()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.UnitImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.TimeImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.BitUnitImpl <em>Bit Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.BitUnitImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getBitUnit()
		 * @generated
		 */
		EClass BIT_UNIT = eINSTANCE.getBitUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OctetUnitImpl <em>Octet Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.OctetUnitImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOctetUnit()
		 * @generated
		 */
		EClass OCTET_UNIT = eINSTANCE.getOctetUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PacketUnitImpl <em>Packet Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.PacketUnitImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPacketUnit()
		 * @generated
		 */
		EClass PACKET_UNIT = eINSTANCE.getPacketUnit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SecondImpl <em>Second</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.SecondImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSecond()
		 * @generated
		 */
		EClass SECOND = eINSTANCE.getSecond();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MinuteImpl <em>Minute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.MinuteImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMinute()
		 * @generated
		 */
		EClass MINUTE = eINSTANCE.getMinute();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HourImpl <em>Hour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.HourImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHour()
		 * @generated
		 */
		EClass HOUR = eINSTANCE.getHour();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DayImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ExtensionHeaderImpl <em>Extension Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.ExtensionHeaderImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getExtensionHeader()
		 * @generated
		 */
		EClass EXTENSION_HEADER = eINSTANCE.getExtensionHeader();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OptionHopByHopImpl <em>Option Hop By Hop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.OptionHopByHopImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOptionHopByHop()
		 * @generated
		 */
		EClass OPTION_HOP_BY_HOP = eINSTANCE.getOptionHopByHop();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HopByHopOptsImpl <em>Hop By Hop Opts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.HopByHopOptsImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHopByHopOpts()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RoutingImpl <em>Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RoutingImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRouting()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.FragmentImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.EncapsulingSecurityPayloadImpl <em>Encapsuling Security Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.EncapsulingSecurityPayloadImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getEncapsulingSecurityPayload()
		 * @generated
		 */
		EClass ENCAPSULING_SECURITY_PAYLOAD = eINSTANCE.getEncapsulingSecurityPayload();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.AuthentificationHeaderImpl <em>Authentification Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.AuthentificationHeaderImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getAuthentificationHeader()
		 * @generated
		 */
		EClass AUTHENTIFICATION_HEADER = eINSTANCE.getAuthentificationHeader();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DestinationOptsImpl <em>Destination Opts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DestinationOptsImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDestinationOpts()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MobilityHeaderImpl <em>Mobility Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.MobilityHeaderImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMobilityHeader()
		 * @generated
		 */
		EClass MOBILITY_HEADER = eINSTANCE.getMobilityHeader();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.UnknownEHImpl <em>Unknown EH</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.UnknownEHImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getUnknownEH()
		 * @generated
		 */
		EClass UNKNOWN_EH = eINSTANCE.getUnknownEH();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ExperimentationAndTestingImpl <em>Experimentation And Testing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.ExperimentationAndTestingImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getExperimentationAndTesting()
		 * @generated
		 */
		EClass EXPERIMENTATION_AND_TESTING = eINSTANCE.getExperimentationAndTesting();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HostIdentityProtocolImpl <em>Host Identity Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.HostIdentityProtocolImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHostIdentityProtocol()
		 * @generated
		 */
		EClass HOST_IDENTITY_PROTOCOL = eINSTANCE.getHostIdentityProtocol();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.Shim6ProtocolImpl <em>Shim6 Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.Shim6ProtocolImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getShim6Protocol()
		 * @generated
		 */
		EClass SHIM6_PROTOCOL = eINSTANCE.getShim6Protocol();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.Pad1Impl <em>Pad1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.Pad1Impl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPad1()
		 * @generated
		 */
		EClass PAD1 = eINSTANCE.getPad1();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PadNImpl <em>Pad N</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.PadNImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPadN()
		 * @generated
		 */
		EClass PAD_N = eINSTANCE.getPadN();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.JumboPayloadImpl <em>Jumbo Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.JumboPayloadImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getJumboPayload()
		 * @generated
		 */
		EClass JUMBO_PAYLOAD = eINSTANCE.getJumboPayload();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RPLOptionImpl <em>RPL Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RPLOptionImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRPLOption()
		 * @generated
		 */
		EClass RPL_OPTION = eINSTANCE.getRPLOption();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.TunnelEncapsulationLimitImpl <em>Tunnel Encapsulation Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.TunnelEncapsulationLimitImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getTunnelEncapsulationLimit()
		 * @generated
		 */
		EClass TUNNEL_ENCAPSULATION_LIMIT = eINSTANCE.getTunnelEncapsulationLimit();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RouterAlertImpl <em>Router Alert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RouterAlertImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRouterAlert()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.QuickStartImpl <em>Quick Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.QuickStartImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getQuickStart()
		 * @generated
		 */
		EClass QUICK_START = eINSTANCE.getQuickStart();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.CalipsoImpl <em>Calipso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.CalipsoImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getCalipso()
		 * @generated
		 */
		EClass CALIPSO = eINSTANCE.getCalipso();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SmfDpdImpl <em>Smf Dpd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.SmfDpdImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSmfDpd()
		 * @generated
		 */
		EClass SMF_DPD = eINSTANCE.getSmfDpd();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.HomeAdressImpl <em>Home Adress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.HomeAdressImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getHomeAdress()
		 * @generated
		 */
		EClass HOME_ADRESS = eINSTANCE.getHomeAdress();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DeprecatedImpl <em>Deprecated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DeprecatedImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDeprecated()
		 * @generated
		 */
		EClass DEPRECATED = eINSTANCE.getDeprecated();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.EndPointIdentificationImpl <em>End Point Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.EndPointIdentificationImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getEndPointIdentification()
		 * @generated
		 */
		EClass END_POINT_IDENTIFICATION = eINSTANCE.getEndPointIdentification();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ILNPNonceImpl <em>ILNP Nonce</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.ILNPNonceImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getILNPNonce()
		 * @generated
		 */
		EClass ILNP_NONCE = eINSTANCE.getILNPNonce();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.LineIdOptionImpl <em>Line Id Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LineIdOptionImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getLineIdOption()
		 * @generated
		 */
		EClass LINE_ID_OPTION = eINSTANCE.getLineIdOption();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MPLOptionImpl <em>MPL Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.MPLOptionImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMPLOption()
		 * @generated
		 */
		EClass MPL_OPTION = eINSTANCE.getMPLOption();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RFC3692ExperimentImpl <em>RFC3692 Experiment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RFC3692ExperimentImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRFC3692Experiment()
		 * @generated
		 */
		EClass RFC3692_EXPERIMENT = eINSTANCE.getRFC3692Experiment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.IpAddSpecImpl <em>Ip Add Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.IpAddSpecImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getIpAddSpec()
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
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.InterfaceImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__PORTS = eINSTANCE.getInterface_Ports();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RuleImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRule()
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
		 * The meta object literal for the '<em><b>Extensionheader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EXTENSIONHEADER = eINSTANCE.getRule_Extensionheader();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__INTERFACE = eINSTANCE.getRule_Interface();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.ProtocolImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RSVPImpl <em>RSVP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RSVPImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRSVP()
		 * @generated
		 */
		EClass RSVP = eINSTANCE.getRSVP();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.MLDImpl <em>MLD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.MLDImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getMLD()
		 * @generated
		 */
		EClass MLD = eINSTANCE.getMLD();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OptionDestinationImpl <em>Option Destination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.OptionDestinationImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOptionDestination()
		 * @generated
		 */
		EClass OPTION_DESTINATION = eINSTANCE.getOptionDestination();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.IPv6PerformanceDiagnosticImpl <em>IPv6 Performance Diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.IPv6PerformanceDiagnosticImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getIPv6PerformanceDiagnostic()
		 * @generated
		 */
		EClass IPV6_PERFORMANCE_DIAGNOSTIC = eINSTANCE.getIPv6PerformanceDiagnostic();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.TypeRoutingImpl <em>Type Routing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.TypeRoutingImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getTypeRouting()
		 * @generated
		 */
		EClass TYPE_ROUTING = eINSTANCE.getTypeRouting();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SourceRouteImpl <em>Source Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.SourceRouteImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSourceRoute()
		 * @generated
		 */
		EClass SOURCE_ROUTE = eINSTANCE.getSourceRoute();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.NimrodImpl <em>Nimrod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.NimrodImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getNimrod()
		 * @generated
		 */
		EClass NIMROD = eINSTANCE.getNimrod();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.Type2Impl <em>Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.Type2Impl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getType2()
		 * @generated
		 */
		EClass TYPE2 = eINSTANCE.getType2();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RPLSourceImpl <em>RPL Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RPLSourceImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRPLSource()
		 * @generated
		 */
		EClass RPL_SOURCE = eINSTANCE.getRPLSource();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.SegmentImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.UnassignedImpl <em>Unassigned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.UnassignedImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getUnassigned()
		 * @generated
		 */
		EClass UNASSIGNED = eINSTANCE.getUnassigned();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment1Impl <em>RFC3692 Experiment1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment1Impl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRFC3692Experiment1()
		 * @generated
		 */
		EClass RFC3692_EXPERIMENT1 = eINSTANCE.getRFC3692Experiment1();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment2Impl <em>RFC3692 Experiment2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.RFC3692Experiment2Impl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getRFC3692Experiment2()
		 * @generated
		 */
		EClass RFC3692_EXPERIMENT2 = eINSTANCE.getRFC3692Experiment2();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.ReservedImpl <em>Reserved</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.ReservedImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getReserved()
		 * @generated
		 */
		EClass RESERVED = eINSTANCE.getReserved();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DiscardDropImpl <em>Discard Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DiscardDropImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDiscardDrop()
		 * @generated
		 */
		EClass DISCARD_DROP = eINSTANCE.getDiscardDrop();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DiscardRejectImpl <em>Discard Reject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DiscardRejectImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDiscardReject()
		 * @generated
		 */
		EClass DISCARD_REJECT = eINSTANCE.getDiscardReject();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.DFFImpl <em>DFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.DFFImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getDFF()
		 * @generated
		 */
		EClass DFF = eINSTANCE.getDFF();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.OptionsImpl <em>Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.OptionsImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getOptions()
		 * @generated
		 */
		EClass OPTIONS = eINSTANCE.getOptions();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PolicyImpl <em>Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.PolicyImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPolicy()
		 * @generated
		 */
		EClass POLICY = eINSTANCE.getPolicy();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__FILTER = eINSTANCE.getPolicy_Filter();

		/**
		 * The meta object literal for the '<em><b>Packets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__PACKETS = eINSTANCE.getPolicy_Packets();

		/**
		 * The meta object literal for the '<em><b>In Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__IN_PORTS = eINSTANCE.getPolicy_InPorts();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__INTERFACES = eINSTANCE.getPolicy_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICY__CONFIGURATION = eINSTANCE.getPolicy_Configuration();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.FilterImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Current Packet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__CURRENT_PACKET = eINSTANCE.getFilter_CurrentPacket();

		/**
		 * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__CURRENT_TIME = eINSTANCE.getFilter_CurrentTime();

		/**
		 * The meta object literal for the '<em><b>First Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FIRST_RULE = eINSTANCE.getFilter_FirstRule();

		/**
		 * The meta object literal for the '<em><b>Current Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__CURRENT_RULE = eINSTANCE.getFilter_CurrentRule();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PacketImpl <em>Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.PacketImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPacket()
		 * @generated
		 */
		EClass PACKET = eINSTANCE.getPacket();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__TIME = eINSTANCE.getPacket_Time();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET__IN_PORT = eINSTANCE.getPacket_InPort();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__CONTENT = eINSTANCE.getPacket_Content();

		/**
		 * The meta object literal for the '<em><b>Source Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__SOURCE_ADDRESS = eINSTANCE.getPacket_SourceAddress();

		/**
		 * The meta object literal for the '<em><b>Destination Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKET__DESTINATION_ADDRESS = eINSTANCE.getPacket_DestinationAddress();

		/**
		 * The meta object literal for the '<em><b>Extensionheaders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET__EXTENSIONHEADERS = eINSTANCE.getPacket_Extensionheaders();

		/**
		 * The meta object literal for the '{@link fr.inria.diverse.melanger.leho.Leho.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.PortImpl
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NUMBER = eINSTANCE.getPort_Number();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__INTERFACE = eINSTANCE.getPort_Interface();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see fr.inria.diverse.melanger.leho.Leho.impl.LehoPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //LehoPackage
