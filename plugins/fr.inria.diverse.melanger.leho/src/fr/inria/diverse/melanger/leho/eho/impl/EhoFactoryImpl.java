/**
 */
package fr.inria.diverse.melanger.leho.eho.impl;

import fr.inria.diverse.melanger.leho.eho.Accept;
import fr.inria.diverse.melanger.leho.eho.AuthentificationHeader;
import fr.inria.diverse.melanger.leho.eho.Bandwidth;
import fr.inria.diverse.melanger.leho.eho.BitUnit;
import fr.inria.diverse.melanger.leho.eho.Calipso;
import fr.inria.diverse.melanger.leho.eho.DFF;
import fr.inria.diverse.melanger.leho.eho.Day;
import fr.inria.diverse.melanger.leho.eho.DestinationOpts;
import fr.inria.diverse.melanger.leho.eho.Discard;
import fr.inria.diverse.melanger.leho.eho.DiscardDrop;
import fr.inria.diverse.melanger.leho.eho.DiscardReject;
import fr.inria.diverse.melanger.leho.eho.Drop;
import fr.inria.diverse.melanger.leho.eho.EhoFactory;
import fr.inria.diverse.melanger.leho.eho.EhoPackage;
import fr.inria.diverse.melanger.leho.eho.EncapsulingSecurityPayload;
import fr.inria.diverse.melanger.leho.eho.EndPointIdentification;
import fr.inria.diverse.melanger.leho.eho.ExperimentationAndTesting;
import fr.inria.diverse.melanger.leho.eho.Fragment;
import fr.inria.diverse.melanger.leho.eho.HomeAdress;
import fr.inria.diverse.melanger.leho.eho.HopByHopOpts;
import fr.inria.diverse.melanger.leho.eho.HostIdentityProtocol;
import fr.inria.diverse.melanger.leho.eho.Hour;
import fr.inria.diverse.melanger.leho.eho.ILNPNonce;
import fr.inria.diverse.melanger.leho.eho.IPv6PerformanceDiagnostic;
import fr.inria.diverse.melanger.leho.eho.Inbound;
import fr.inria.diverse.melanger.leho.eho.IpAddSpec;
import fr.inria.diverse.melanger.leho.eho.JumboPayload;
import fr.inria.diverse.melanger.leho.eho.LineIdOption;
import fr.inria.diverse.melanger.leho.eho.MLD;
import fr.inria.diverse.melanger.leho.eho.MPLOption;
import fr.inria.diverse.melanger.leho.eho.Minute;
import fr.inria.diverse.melanger.leho.eho.MobilityHeader;
import fr.inria.diverse.melanger.leho.eho.Nimrod;
import fr.inria.diverse.melanger.leho.eho.OctetUnit;
import fr.inria.diverse.melanger.leho.eho.Outbound;
import fr.inria.diverse.melanger.leho.eho.PacketSpec;
import fr.inria.diverse.melanger.leho.eho.PacketUnit;
import fr.inria.diverse.melanger.leho.eho.Pad1;
import fr.inria.diverse.melanger.leho.eho.PadN;
import fr.inria.diverse.melanger.leho.eho.Policy;
import fr.inria.diverse.melanger.leho.eho.QuickStart;
import fr.inria.diverse.melanger.leho.eho.RFC3692Experiment;
import fr.inria.diverse.melanger.leho.eho.RFC3692Experiment1;
import fr.inria.diverse.melanger.leho.eho.RFC3692Experiment2;
import fr.inria.diverse.melanger.leho.eho.RPLOption;
import fr.inria.diverse.melanger.leho.eho.RPLSource;
import fr.inria.diverse.melanger.leho.eho.RSVP;
import fr.inria.diverse.melanger.leho.eho.Reject;
import fr.inria.diverse.melanger.leho.eho.Reserved;
import fr.inria.diverse.melanger.leho.eho.RouterAlert;
import fr.inria.diverse.melanger.leho.eho.Routing;
import fr.inria.diverse.melanger.leho.eho.Rule;
import fr.inria.diverse.melanger.leho.eho.Second;
import fr.inria.diverse.melanger.leho.eho.Segment;
import fr.inria.diverse.melanger.leho.eho.Shim6Protocol;
import fr.inria.diverse.melanger.leho.eho.SmfDpd;
import fr.inria.diverse.melanger.leho.eho.SourceRoute;
import fr.inria.diverse.melanger.leho.eho.TunnelEncapsulationLimit;
import fr.inria.diverse.melanger.leho.eho.Type2;
import fr.inria.diverse.melanger.leho.eho.Unassigned;
import fr.inria.diverse.melanger.leho.eho.UnknownEH;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
			EhoFactory theEhoFactory = (EhoFactory)EPackage.Registry.INSTANCE.getEFactory(EhoPackage.eNS_URI);
			if (theEhoFactory != null) {
				return theEhoFactory;
			}
		}
		catch (Exception exception) {
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
			case EhoPackage.DROP: return createDrop();
			case EhoPackage.REJECT: return createReject();
			case EhoPackage.ACCEPT: return createAccept();
			case EhoPackage.DISCARD: return createDiscard();
			case EhoPackage.PACKET_SPEC: return createPacketSpec();
			case EhoPackage.INBOUND: return createInbound();
			case EhoPackage.OUTBOUND: return createOutbound();
			case EhoPackage.BANDWIDTH: return createBandwidth();
			case EhoPackage.BIT_UNIT: return createBitUnit();
			case EhoPackage.OCTET_UNIT: return createOctetUnit();
			case EhoPackage.PACKET_UNIT: return createPacketUnit();
			case EhoPackage.SECOND: return createSecond();
			case EhoPackage.MINUTE: return createMinute();
			case EhoPackage.HOUR: return createHour();
			case EhoPackage.DAY: return createDay();
			case EhoPackage.HOP_BY_HOP_OPTS: return createHopByHopOpts();
			case EhoPackage.ROUTING: return createRouting();
			case EhoPackage.FRAGMENT: return createFragment();
			case EhoPackage.ENCAPSULING_SECURITY_PAYLOAD: return createEncapsulingSecurityPayload();
			case EhoPackage.AUTHENTIFICATION_HEADER: return createAuthentificationHeader();
			case EhoPackage.DESTINATION_OPTS: return createDestinationOpts();
			case EhoPackage.MOBILITY_HEADER: return createMobilityHeader();
			case EhoPackage.UNKNOWN_EH: return createUnknownEH();
			case EhoPackage.EXPERIMENTATION_AND_TESTING: return createExperimentationAndTesting();
			case EhoPackage.HOST_IDENTITY_PROTOCOL: return createHostIdentityProtocol();
			case EhoPackage.SHIM6_PROTOCOL: return createShim6Protocol();
			case EhoPackage.PAD1: return createPad1();
			case EhoPackage.PAD_N: return createPadN();
			case EhoPackage.JUMBO_PAYLOAD: return createJumboPayload();
			case EhoPackage.RPL_OPTION: return createRPLOption();
			case EhoPackage.TUNNEL_ENCAPSULATION_LIMIT: return createTunnelEncapsulationLimit();
			case EhoPackage.ROUTER_ALERT: return createRouterAlert();
			case EhoPackage.QUICK_START: return createQuickStart();
			case EhoPackage.CALIPSO: return createCalipso();
			case EhoPackage.SMF_DPD: return createSmfDpd();
			case EhoPackage.HOME_ADRESS: return createHomeAdress();
			case EhoPackage.DEPRECATED: return createDeprecated();
			case EhoPackage.END_POINT_IDENTIFICATION: return createEndPointIdentification();
			case EhoPackage.ILNP_NONCE: return createILNPNonce();
			case EhoPackage.LINE_ID_OPTION: return createLineIdOption();
			case EhoPackage.MPL_OPTION: return createMPLOption();
			case EhoPackage.RFC3692_EXPERIMENT: return createRFC3692Experiment();
			case EhoPackage.IP_ADD_SPEC: return createIpAddSpec();
			case EhoPackage.RULE: return createRule();
			case EhoPackage.RSVP: return createRSVP();
			case EhoPackage.MLD: return createMLD();
			case EhoPackage.IPV6_PERFORMANCE_DIAGNOSTIC: return createIPv6PerformanceDiagnostic();
			case EhoPackage.SOURCE_ROUTE: return createSourceRoute();
			case EhoPackage.NIMROD: return createNimrod();
			case EhoPackage.TYPE2: return createType2();
			case EhoPackage.RPL_SOURCE: return createRPLSource();
			case EhoPackage.SEGMENT: return createSegment();
			case EhoPackage.UNASSIGNED: return createUnassigned();
			case EhoPackage.RFC3692_EXPERIMENT1: return createRFC3692Experiment1();
			case EhoPackage.RFC3692_EXPERIMENT2: return createRFC3692Experiment2();
			case EhoPackage.RESERVED: return createReserved();
			case EhoPackage.DISCARD_DROP: return createDiscardDrop();
			case EhoPackage.DISCARD_REJECT: return createDiscardReject();
			case EhoPackage.DFF: return createDFF();
			case EhoPackage.POLICY: return createPolicy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reject createReject() {
		RejectImpl reject = new RejectImpl();
		return reject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Accept createAccept() {
		AcceptImpl accept = new AcceptImpl();
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discard createDiscard() {
		DiscardImpl discard = new DiscardImpl();
		return discard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PacketSpec createPacketSpec() {
		PacketSpecImpl packetSpec = new PacketSpecImpl();
		return packetSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inbound createInbound() {
		InboundImpl inbound = new InboundImpl();
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Outbound createOutbound() {
		OutboundImpl outbound = new OutboundImpl();
		return outbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bandwidth createBandwidth() {
		BandwidthImpl bandwidth = new BandwidthImpl();
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BitUnit createBitUnit() {
		BitUnitImpl bitUnit = new BitUnitImpl();
		return bitUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OctetUnit createOctetUnit() {
		OctetUnitImpl octetUnit = new OctetUnitImpl();
		return octetUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PacketUnit createPacketUnit() {
		PacketUnitImpl packetUnit = new PacketUnitImpl();
		return packetUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Second createSecond() {
		SecondImpl second = new SecondImpl();
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Minute createMinute() {
		MinuteImpl minute = new MinuteImpl();
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hour createHour() {
		HourImpl hour = new HourImpl();
		return hour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Day createDay() {
		DayImpl day = new DayImpl();
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HopByHopOpts createHopByHopOpts() {
		HopByHopOptsImpl hopByHopOpts = new HopByHopOptsImpl();
		return hopByHopOpts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Routing createRouting() {
		RoutingImpl routing = new RoutingImpl();
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fragment createFragment() {
		FragmentImpl fragment = new FragmentImpl();
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncapsulingSecurityPayload createEncapsulingSecurityPayload() {
		EncapsulingSecurityPayloadImpl encapsulingSecurityPayload = new EncapsulingSecurityPayloadImpl();
		return encapsulingSecurityPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthentificationHeader createAuthentificationHeader() {
		AuthentificationHeaderImpl authentificationHeader = new AuthentificationHeaderImpl();
		return authentificationHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestinationOpts createDestinationOpts() {
		DestinationOptsImpl destinationOpts = new DestinationOptsImpl();
		return destinationOpts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MobilityHeader createMobilityHeader() {
		MobilityHeaderImpl mobilityHeader = new MobilityHeaderImpl();
		return mobilityHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnknownEH createUnknownEH() {
		UnknownEHImpl unknownEH = new UnknownEHImpl();
		return unknownEH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentationAndTesting createExperimentationAndTesting() {
		ExperimentationAndTestingImpl experimentationAndTesting = new ExperimentationAndTestingImpl();
		return experimentationAndTesting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostIdentityProtocol createHostIdentityProtocol() {
		HostIdentityProtocolImpl hostIdentityProtocol = new HostIdentityProtocolImpl();
		return hostIdentityProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shim6Protocol createShim6Protocol() {
		Shim6ProtocolImpl shim6Protocol = new Shim6ProtocolImpl();
		return shim6Protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pad1 createPad1() {
		Pad1Impl pad1 = new Pad1Impl();
		return pad1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PadN createPadN() {
		PadNImpl padN = new PadNImpl();
		return padN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JumboPayload createJumboPayload() {
		JumboPayloadImpl jumboPayload = new JumboPayloadImpl();
		return jumboPayload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPLOption createRPLOption() {
		RPLOptionImpl rplOption = new RPLOptionImpl();
		return rplOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TunnelEncapsulationLimit createTunnelEncapsulationLimit() {
		TunnelEncapsulationLimitImpl tunnelEncapsulationLimit = new TunnelEncapsulationLimitImpl();
		return tunnelEncapsulationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouterAlert createRouterAlert() {
		RouterAlertImpl routerAlert = new RouterAlertImpl();
		return routerAlert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuickStart createQuickStart() {
		QuickStartImpl quickStart = new QuickStartImpl();
		return quickStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Calipso createCalipso() {
		CalipsoImpl calipso = new CalipsoImpl();
		return calipso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmfDpd createSmfDpd() {
		SmfDpdImpl smfDpd = new SmfDpdImpl();
		return smfDpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HomeAdress createHomeAdress() {
		HomeAdressImpl homeAdress = new HomeAdressImpl();
		return homeAdress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public fr.inria.diverse.melanger.leho.eho.Deprecated createDeprecated() {
		DeprecatedImpl deprecated = new DeprecatedImpl();
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndPointIdentification createEndPointIdentification() {
		EndPointIdentificationImpl endPointIdentification = new EndPointIdentificationImpl();
		return endPointIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ILNPNonce createILNPNonce() {
		ILNPNonceImpl ilnpNonce = new ILNPNonceImpl();
		return ilnpNonce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineIdOption createLineIdOption() {
		LineIdOptionImpl lineIdOption = new LineIdOptionImpl();
		return lineIdOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MPLOption createMPLOption() {
		MPLOptionImpl mplOption = new MPLOptionImpl();
		return mplOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RFC3692Experiment createRFC3692Experiment() {
		RFC3692ExperimentImpl rfc3692Experiment = new RFC3692ExperimentImpl();
		return rfc3692Experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IpAddSpec createIpAddSpec() {
		IpAddSpecImpl ipAddSpec = new IpAddSpecImpl();
		return ipAddSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSVP createRSVP() {
		RSVPImpl rsvp = new RSVPImpl();
		return rsvp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MLD createMLD() {
		MLDImpl mld = new MLDImpl();
		return mld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IPv6PerformanceDiagnostic createIPv6PerformanceDiagnostic() {
		IPv6PerformanceDiagnosticImpl iPv6PerformanceDiagnostic = new IPv6PerformanceDiagnosticImpl();
		return iPv6PerformanceDiagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceRoute createSourceRoute() {
		SourceRouteImpl sourceRoute = new SourceRouteImpl();
		return sourceRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nimrod createNimrod() {
		NimrodImpl nimrod = new NimrodImpl();
		return nimrod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type2 createType2() {
		Type2Impl type2 = new Type2Impl();
		return type2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RPLSource createRPLSource() {
		RPLSourceImpl rplSource = new RPLSourceImpl();
		return rplSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unassigned createUnassigned() {
		UnassignedImpl unassigned = new UnassignedImpl();
		return unassigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RFC3692Experiment1 createRFC3692Experiment1() {
		RFC3692Experiment1Impl rfc3692Experiment1 = new RFC3692Experiment1Impl();
		return rfc3692Experiment1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RFC3692Experiment2 createRFC3692Experiment2() {
		RFC3692Experiment2Impl rfc3692Experiment2 = new RFC3692Experiment2Impl();
		return rfc3692Experiment2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reserved createReserved() {
		ReservedImpl reserved = new ReservedImpl();
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscardDrop createDiscardDrop() {
		DiscardDropImpl discardDrop = new DiscardDropImpl();
		return discardDrop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscardReject createDiscardReject() {
		DiscardRejectImpl discardReject = new DiscardRejectImpl();
		return discardReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DFF createDFF() {
		DFFImpl dff = new DFFImpl();
		return dff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Policy createPolicy() {
		PolicyImpl policy = new PolicyImpl();
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EhoPackage getEhoPackage() {
		return (EhoPackage)getEPackage();
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
