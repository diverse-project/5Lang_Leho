/**
 */
package fr.inria.diverse.melanger.leho.leho.impl;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.inria.diverse.melanger.leho.leho.Accept;
import fr.inria.diverse.melanger.leho.leho.AuthentificationHeader;
import fr.inria.diverse.melanger.leho.leho.Bandwidth;
import fr.inria.diverse.melanger.leho.leho.BitUnit;
import fr.inria.diverse.melanger.leho.leho.Calipso;
import fr.inria.diverse.melanger.leho.leho.DFF;
import fr.inria.diverse.melanger.leho.leho.Day;
import fr.inria.diverse.melanger.leho.leho.DestinationOpts;
import fr.inria.diverse.melanger.leho.leho.Discard;
import fr.inria.diverse.melanger.leho.leho.DiscardDrop;
import fr.inria.diverse.melanger.leho.leho.DiscardReject;
import fr.inria.diverse.melanger.leho.leho.Drop;
import fr.inria.diverse.melanger.leho.leho.EhoFactory;
import fr.inria.diverse.melanger.leho.leho.EhoPackage;
import fr.inria.diverse.melanger.leho.leho.EncapsulingSecurityPayload;
import fr.inria.diverse.melanger.leho.leho.EndPointIdentification;
import fr.inria.diverse.melanger.leho.leho.ExperimentationAndTesting;
import fr.inria.diverse.melanger.leho.leho.Fragment;
import fr.inria.diverse.melanger.leho.leho.HomeAdress;
import fr.inria.diverse.melanger.leho.leho.HopByHopOpts;
import fr.inria.diverse.melanger.leho.leho.HostIdentityProtocol;
import fr.inria.diverse.melanger.leho.leho.Hour;
import fr.inria.diverse.melanger.leho.leho.ILNPNonce;
import fr.inria.diverse.melanger.leho.leho.IPv6PerformanceDiagnostic;
import fr.inria.diverse.melanger.leho.leho.Inbound;
import fr.inria.diverse.melanger.leho.leho.IpAddSpec;
import fr.inria.diverse.melanger.leho.leho.JumboPayload;
import fr.inria.diverse.melanger.leho.leho.LineIdOption;
import fr.inria.diverse.melanger.leho.leho.MLD;
import fr.inria.diverse.melanger.leho.leho.MPLOption;
import fr.inria.diverse.melanger.leho.leho.Minute;
import fr.inria.diverse.melanger.leho.leho.MobilityHeader;
import fr.inria.diverse.melanger.leho.leho.Nimrod;
import fr.inria.diverse.melanger.leho.leho.OctetUnit;
import fr.inria.diverse.melanger.leho.leho.Outbound;
import fr.inria.diverse.melanger.leho.leho.PacketSpec;
import fr.inria.diverse.melanger.leho.leho.PacketUnit;
import fr.inria.diverse.melanger.leho.leho.Pad1;
import fr.inria.diverse.melanger.leho.leho.PadN;
import fr.inria.diverse.melanger.leho.leho.QuickStart;
import fr.inria.diverse.melanger.leho.leho.RFC3692Experiment;
import fr.inria.diverse.melanger.leho.leho.RFC3692Experiment1;
import fr.inria.diverse.melanger.leho.leho.RFC3692Experiment2;
import fr.inria.diverse.melanger.leho.leho.RPLOption;
import fr.inria.diverse.melanger.leho.leho.RPLSource;
import fr.inria.diverse.melanger.leho.leho.RSVP;
import fr.inria.diverse.melanger.leho.leho.Reject;
import fr.inria.diverse.melanger.leho.leho.Reserved;
import fr.inria.diverse.melanger.leho.leho.RouterAlert;
import fr.inria.diverse.melanger.leho.leho.Routing;
import fr.inria.diverse.melanger.leho.leho.Rule;
import fr.inria.diverse.melanger.leho.leho.Second;
import fr.inria.diverse.melanger.leho.leho.Segment;
import fr.inria.diverse.melanger.leho.leho.Shim6Protocol;
import fr.inria.diverse.melanger.leho.leho.SmfDpd;
import fr.inria.diverse.melanger.leho.leho.SourceRoute;
import fr.inria.diverse.melanger.leho.leho.TunnelEncapsulationLimit;
import fr.inria.diverse.melanger.leho.leho.Type2;
import fr.inria.diverse.melanger.leho.leho.Unassigned;
import fr.inria.diverse.melanger.leho.leho.UnknownEH;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EhoFactoryImpl extends EFactoryImpl implements EhoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EhoFactory init() {
		try {
			EhoFactory theEhoFactory = (EhoFactory) EPackage.Registry.INSTANCE.getEFactory(EhoPackage.eNS_URI);
			if (theEhoFactory != null) {
				return theEhoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EhoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EhoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EhoPackage.DROP:
			return createDrop();
		case EhoPackage.REJECT:
			return createReject();
		case EhoPackage.ACCEPT:
			return createAccept();
		case EhoPackage.DISCARD:
			return createDiscard();
		case EhoPackage.PACKET_SPEC:
			return createPacketSpec();
		case EhoPackage.INBOUND:
			return createInbound();
		case EhoPackage.OUTBOUND:
			return createOutbound();
		case EhoPackage.BANDWIDTH:
			return createBandwidth();
		case EhoPackage.BIT_UNIT:
			return createBitUnit();
		case EhoPackage.OCTET_UNIT:
			return createOctetUnit();
		case EhoPackage.PACKET_UNIT:
			return createPacketUnit();
		case EhoPackage.SECOND:
			return createSecond();
		case EhoPackage.MINUTE:
			return createMinute();
		case EhoPackage.HOUR:
			return createHour();
		case EhoPackage.DAY:
			return createDay();
		case EhoPackage.HOP_BY_HOP_OPTS:
			return createHopByHopOpts();
		case EhoPackage.ROUTING:
			return createRouting();
		case EhoPackage.FRAGMENT:
			return createFragment();
		case EhoPackage.ENCAPSULING_SECURITY_PAYLOAD:
			return createEncapsulingSecurityPayload();
		case EhoPackage.AUTHENTIFICATION_HEADER:
			return createAuthentificationHeader();
		case EhoPackage.DESTINATION_OPTS:
			return createDestinationOpts();
		case EhoPackage.MOBILITY_HEADER:
			return createMobilityHeader();
		case EhoPackage.UNKNOWN_EH:
			return createUnknownEH();
		case EhoPackage.EXPERIMENTATION_AND_TESTING:
			return createExperimentationAndTesting();
		case EhoPackage.HOST_IDENTITY_PROTOCOL:
			return createHostIdentityProtocol();
		case EhoPackage.SHIM6_PROTOCOL:
			return createShim6Protocol();
		case EhoPackage.PAD1:
			return createPad1();
		case EhoPackage.PAD_N:
			return createPadN();
		case EhoPackage.JUMBO_PAYLOAD:
			return createJumboPayload();
		case EhoPackage.RPL_OPTION:
			return createRPLOption();
		case EhoPackage.TUNNEL_ENCAPSULATION_LIMIT:
			return createTunnelEncapsulationLimit();
		case EhoPackage.ROUTER_ALERT:
			return createRouterAlert();
		case EhoPackage.QUICK_START:
			return createQuickStart();
		case EhoPackage.CALIPSO:
			return createCalipso();
		case EhoPackage.SMF_DPD:
			return createSmfDpd();
		case EhoPackage.HOME_ADRESS:
			return createHomeAdress();
		case EhoPackage.DEPRECATED:
			return createDeprecated();
		case EhoPackage.END_POINT_IDENTIFICATION:
			return createEndPointIdentification();
		case EhoPackage.ILNP_NONCE:
			return createILNPNonce();
		case EhoPackage.LINE_ID_OPTION:
			return createLineIdOption();
		case EhoPackage.MPL_OPTION:
			return createMPLOption();
		case EhoPackage.RFC3692_EXPERIMENT:
			return createRFC3692Experiment();
		case EhoPackage.IP_ADD_SPEC:
			return createIpAddSpec();
		case EhoPackage.RULE:
			return createRule();
		case EhoPackage.RSVP:
			return createRSVP();
		case EhoPackage.MLD:
			return createMLD();
		case EhoPackage.IPV6_PERFORMANCE_DIAGNOSTIC:
			return createIPv6PerformanceDiagnostic();
		case EhoPackage.SOURCE_ROUTE:
			return createSourceRoute();
		case EhoPackage.NIMROD:
			return createNimrod();
		case EhoPackage.TYPE2:
			return createType2();
		case EhoPackage.RPL_SOURCE:
			return createRPLSource();
		case EhoPackage.SEGMENT:
			return createSegment();
		case EhoPackage.UNASSIGNED:
			return createUnassigned();
		case EhoPackage.RFC3692_EXPERIMENT1:
			return createRFC3692Experiment1();
		case EhoPackage.RFC3692_EXPERIMENT2:
			return createRFC3692Experiment2();
		case EhoPackage.RESERVED:
			return createReserved();
		case EhoPackage.DISCARD_DROP:
			return createDiscardDrop();
		case EhoPackage.DISCARD_REJECT:
			return createDiscardReject();
		case EhoPackage.DFF:
			return createDFF();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reject createReject() {
		RejectImpl reject = new RejectImpl();
		return reject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accept createAccept() {
		AcceptImpl accept = new AcceptImpl();
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Discard createDiscard() {
		DiscardImpl discard = new DiscardImpl();
		return discard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketSpec createPacketSpec() {
		PacketSpecImpl packetSpec = new PacketSpecImpl();
		return packetSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inbound createInbound() {
		InboundImpl inbound = new InboundImpl();
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outbound createOutbound() {
		OutboundImpl outbound = new OutboundImpl();
		return outbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bandwidth createBandwidth() {
		BandwidthImpl bandwidth = new BandwidthImpl();
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitUnit createBitUnit() {
		BitUnitImpl bitUnit = new BitUnitImpl();
		return bitUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OctetUnit createOctetUnit() {
		OctetUnitImpl octetUnit = new OctetUnitImpl();
		return octetUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacketUnit createPacketUnit() {
		PacketUnitImpl packetUnit = new PacketUnitImpl();
		return packetUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Second createSecond() {
		SecondImpl second = new SecondImpl();
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minute createMinute() {
		MinuteImpl minute = new MinuteImpl();
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hour createHour() {
		HourImpl hour = new HourImpl();
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day createDay() {
		DayImpl day = new DayImpl();
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HopByHopOpts createHopByHopOpts() {
		HopByHopOptsImpl hopByHopOpts = new HopByHopOptsImpl();
		return hopByHopOpts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing createRouting() {
		RoutingImpl routing = new RoutingImpl();
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fragment createFragment() {
		FragmentImpl fragment = new FragmentImpl();
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncapsulingSecurityPayload createEncapsulingSecurityPayload() {
		EncapsulingSecurityPayloadImpl encapsulingSecurityPayload = new EncapsulingSecurityPayloadImpl();
		return encapsulingSecurityPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthentificationHeader createAuthentificationHeader() {
		AuthentificationHeaderImpl authentificationHeader = new AuthentificationHeaderImpl();
		return authentificationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationOpts createDestinationOpts() {
		DestinationOptsImpl destinationOpts = new DestinationOptsImpl();
		return destinationOpts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilityHeader createMobilityHeader() {
		MobilityHeaderImpl mobilityHeader = new MobilityHeaderImpl();
		return mobilityHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnknownEH createUnknownEH() {
		UnknownEHImpl unknownEH = new UnknownEHImpl();
		return unknownEH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentationAndTesting createExperimentationAndTesting() {
		ExperimentationAndTestingImpl experimentationAndTesting = new ExperimentationAndTestingImpl();
		return experimentationAndTesting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostIdentityProtocol createHostIdentityProtocol() {
		HostIdentityProtocolImpl hostIdentityProtocol = new HostIdentityProtocolImpl();
		return hostIdentityProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shim6Protocol createShim6Protocol() {
		Shim6ProtocolImpl shim6Protocol = new Shim6ProtocolImpl();
		return shim6Protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pad1 createPad1() {
		Pad1Impl pad1 = new Pad1Impl();
		return pad1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadN createPadN() {
		PadNImpl padN = new PadNImpl();
		return padN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumboPayload createJumboPayload() {
		JumboPayloadImpl jumboPayload = new JumboPayloadImpl();
		return jumboPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPLOption createRPLOption() {
		RPLOptionImpl rplOption = new RPLOptionImpl();
		return rplOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TunnelEncapsulationLimit createTunnelEncapsulationLimit() {
		TunnelEncapsulationLimitImpl tunnelEncapsulationLimit = new TunnelEncapsulationLimitImpl();
		return tunnelEncapsulationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouterAlert createRouterAlert() {
		RouterAlertImpl routerAlert = new RouterAlertImpl();
		return routerAlert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuickStart createQuickStart() {
		QuickStartImpl quickStart = new QuickStartImpl();
		return quickStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calipso createCalipso() {
		CalipsoImpl calipso = new CalipsoImpl();
		return calipso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmfDpd createSmfDpd() {
		SmfDpdImpl smfDpd = new SmfDpdImpl();
		return smfDpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HomeAdress createHomeAdress() {
		HomeAdressImpl homeAdress = new HomeAdressImpl();
		return homeAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fr.inria.diverse.melanger.leho.leho.Deprecated createDeprecated() {
		DeprecatedImpl deprecated = new DeprecatedImpl();
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndPointIdentification createEndPointIdentification() {
		EndPointIdentificationImpl endPointIdentification = new EndPointIdentificationImpl();
		return endPointIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILNPNonce createILNPNonce() {
		ILNPNonceImpl ilnpNonce = new ILNPNonceImpl();
		return ilnpNonce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineIdOption createLineIdOption() {
		LineIdOptionImpl lineIdOption = new LineIdOptionImpl();
		return lineIdOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPLOption createMPLOption() {
		MPLOptionImpl mplOption = new MPLOptionImpl();
		return mplOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFC3692Experiment createRFC3692Experiment() {
		RFC3692ExperimentImpl rfc3692Experiment = new RFC3692ExperimentImpl();
		return rfc3692Experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpAddSpec createIpAddSpec() {
		IpAddSpecImpl ipAddSpec = new IpAddSpecImpl();
		return ipAddSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSVP createRSVP() {
		RSVPImpl rsvp = new RSVPImpl();
		return rsvp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MLD createMLD() {
		MLDImpl mld = new MLDImpl();
		return mld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPv6PerformanceDiagnostic createIPv6PerformanceDiagnostic() {
		IPv6PerformanceDiagnosticImpl iPv6PerformanceDiagnostic = new IPv6PerformanceDiagnosticImpl();
		return iPv6PerformanceDiagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceRoute createSourceRoute() {
		SourceRouteImpl sourceRoute = new SourceRouteImpl();
		return sourceRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nimrod createNimrod() {
		NimrodImpl nimrod = new NimrodImpl();
		return nimrod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2 createType2() {
		Type2Impl type2 = new Type2Impl();
		return type2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPLSource createRPLSource() {
		RPLSourceImpl rplSource = new RPLSourceImpl();
		return rplSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unassigned createUnassigned() {
		UnassignedImpl unassigned = new UnassignedImpl();
		return unassigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFC3692Experiment1 createRFC3692Experiment1() {
		RFC3692Experiment1Impl rfc3692Experiment1 = new RFC3692Experiment1Impl();
		return rfc3692Experiment1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFC3692Experiment2 createRFC3692Experiment2() {
		RFC3692Experiment2Impl rfc3692Experiment2 = new RFC3692Experiment2Impl();
		return rfc3692Experiment2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserved createReserved() {
		ReservedImpl reserved = new ReservedImpl();
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscardDrop createDiscardDrop() {
		DiscardDropImpl discardDrop = new DiscardDropImpl();
		return discardDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscardReject createDiscardReject() {
		DiscardRejectImpl discardReject = new DiscardRejectImpl();
		return discardReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFF createDFF() {
		DFFImpl dff = new DFFImpl();
		return dff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EhoPackage getEhoPackage() {
		return (EhoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EhoPackage getPackage() {
		return EhoPackage.eINSTANCE;
	}

} //EhoFactoryImpl
