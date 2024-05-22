/**
 */
package fr.inria.diverse.melanger.leho.leho.impl;

import fr.inria.diverse.melanger.leho.leho.Accept;
import fr.inria.diverse.melanger.leho.leho.AuthentificationHeader;
import fr.inria.diverse.melanger.leho.leho.Bandwidth;
import fr.inria.diverse.melanger.leho.leho.BitUnit;
import fr.inria.diverse.melanger.leho.leho.Calipso;
import fr.inria.diverse.melanger.leho.leho.Configuration;
import fr.inria.diverse.melanger.leho.leho.DFF;
import fr.inria.diverse.melanger.leho.leho.Day;
import fr.inria.diverse.melanger.leho.leho.DestinationOpts;
import fr.inria.diverse.melanger.leho.leho.Discard;
import fr.inria.diverse.melanger.leho.leho.DiscardDrop;
import fr.inria.diverse.melanger.leho.leho.DiscardReject;
import fr.inria.diverse.melanger.leho.leho.Drop;
import fr.inria.diverse.melanger.leho.leho.EncapsulingSecurityPayload;
import fr.inria.diverse.melanger.leho.leho.EndPointIdentification;
import fr.inria.diverse.melanger.leho.leho.ExperimentationAndTesting;
import fr.inria.diverse.melanger.leho.leho.Filter;
import fr.inria.diverse.melanger.leho.leho.Fragment;
import fr.inria.diverse.melanger.leho.leho.HomeAdress;
import fr.inria.diverse.melanger.leho.leho.HopByHopOpts;
import fr.inria.diverse.melanger.leho.leho.HostIdentityProtocol;
import fr.inria.diverse.melanger.leho.leho.Hour;
import fr.inria.diverse.melanger.leho.leho.ILNPNonce;
import fr.inria.diverse.melanger.leho.leho.IPv6PerformanceDiagnostic;
import fr.inria.diverse.melanger.leho.leho.Inbound;
import fr.inria.diverse.melanger.leho.leho.Interface;
import fr.inria.diverse.melanger.leho.leho.IpAddSpec;
import fr.inria.diverse.melanger.leho.leho.JumboPayload;
import fr.inria.diverse.melanger.leho.leho.LehoFactory;
import fr.inria.diverse.melanger.leho.leho.LehoPackage;
import fr.inria.diverse.melanger.leho.leho.LineIdOption;
import fr.inria.diverse.melanger.leho.leho.MLD;
import fr.inria.diverse.melanger.leho.leho.MPLOption;
import fr.inria.diverse.melanger.leho.leho.Minute;
import fr.inria.diverse.melanger.leho.leho.MobilityHeader;
import fr.inria.diverse.melanger.leho.leho.Nimrod;
import fr.inria.diverse.melanger.leho.leho.OctetUnit;
import fr.inria.diverse.melanger.leho.leho.Outbound;
import fr.inria.diverse.melanger.leho.leho.Packet;
import fr.inria.diverse.melanger.leho.leho.PacketSpec;
import fr.inria.diverse.melanger.leho.leho.PacketUnit;
import fr.inria.diverse.melanger.leho.leho.Pad1;
import fr.inria.diverse.melanger.leho.leho.PadN;
import fr.inria.diverse.melanger.leho.leho.Policy;
import fr.inria.diverse.melanger.leho.leho.Port;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class LehoFactoryImpl extends EFactoryImpl implements LehoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LehoFactory init() {
		try {
			LehoFactory theLehoFactory = (LehoFactory)EPackage.Registry.INSTANCE.getEFactory(LehoPackage.eNS_URI);
			if (theLehoFactory != null) {
				return theLehoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LehoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LehoFactoryImpl() {
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
			case LehoPackage.CONFIGURATION: return createConfiguration();
			case LehoPackage.DROP: return createDrop();
			case LehoPackage.REJECT: return createReject();
			case LehoPackage.ACCEPT: return createAccept();
			case LehoPackage.DISCARD: return createDiscard();
			case LehoPackage.PACKET_SPEC: return createPacketSpec();
			case LehoPackage.INBOUND: return createInbound();
			case LehoPackage.OUTBOUND: return createOutbound();
			case LehoPackage.BANDWIDTH: return createBandwidth();
			case LehoPackage.BIT_UNIT: return createBitUnit();
			case LehoPackage.OCTET_UNIT: return createOctetUnit();
			case LehoPackage.PACKET_UNIT: return createPacketUnit();
			case LehoPackage.SECOND: return createSecond();
			case LehoPackage.MINUTE: return createMinute();
			case LehoPackage.HOUR: return createHour();
			case LehoPackage.DAY: return createDay();
			case LehoPackage.HOP_BY_HOP_OPTS: return createHopByHopOpts();
			case LehoPackage.ROUTING: return createRouting();
			case LehoPackage.FRAGMENT: return createFragment();
			case LehoPackage.ENCAPSULING_SECURITY_PAYLOAD: return createEncapsulingSecurityPayload();
			case LehoPackage.AUTHENTIFICATION_HEADER: return createAuthentificationHeader();
			case LehoPackage.DESTINATION_OPTS: return createDestinationOpts();
			case LehoPackage.MOBILITY_HEADER: return createMobilityHeader();
			case LehoPackage.UNKNOWN_EH: return createUnknownEH();
			case LehoPackage.EXPERIMENTATION_AND_TESTING: return createExperimentationAndTesting();
			case LehoPackage.HOST_IDENTITY_PROTOCOL: return createHostIdentityProtocol();
			case LehoPackage.SHIM6_PROTOCOL: return createShim6Protocol();
			case LehoPackage.PAD1: return createPad1();
			case LehoPackage.PAD_N: return createPadN();
			case LehoPackage.JUMBO_PAYLOAD: return createJumboPayload();
			case LehoPackage.RPL_OPTION: return createRPLOption();
			case LehoPackage.TUNNEL_ENCAPSULATION_LIMIT: return createTunnelEncapsulationLimit();
			case LehoPackage.ROUTER_ALERT: return createRouterAlert();
			case LehoPackage.QUICK_START: return createQuickStart();
			case LehoPackage.CALIPSO: return createCalipso();
			case LehoPackage.SMF_DPD: return createSmfDpd();
			case LehoPackage.HOME_ADRESS: return createHomeAdress();
			case LehoPackage.DEPRECATED: return createDeprecated();
			case LehoPackage.END_POINT_IDENTIFICATION: return createEndPointIdentification();
			case LehoPackage.ILNP_NONCE: return createILNPNonce();
			case LehoPackage.LINE_ID_OPTION: return createLineIdOption();
			case LehoPackage.MPL_OPTION: return createMPLOption();
			case LehoPackage.RFC3692_EXPERIMENT: return createRFC3692Experiment();
			case LehoPackage.IP_ADD_SPEC: return createIpAddSpec();
			case LehoPackage.RULE: return createRule();
			case LehoPackage.RSVP: return createRSVP();
			case LehoPackage.MLD: return createMLD();
			case LehoPackage.IPV6_PERFORMANCE_DIAGNOSTIC: return createIPv6PerformanceDiagnostic();
			case LehoPackage.SOURCE_ROUTE: return createSourceRoute();
			case LehoPackage.NIMROD: return createNimrod();
			case LehoPackage.TYPE2: return createType2();
			case LehoPackage.RPL_SOURCE: return createRPLSource();
			case LehoPackage.SEGMENT: return createSegment();
			case LehoPackage.UNASSIGNED: return createUnassigned();
			case LehoPackage.RFC3692_EXPERIMENT1: return createRFC3692Experiment1();
			case LehoPackage.RFC3692_EXPERIMENT2: return createRFC3692Experiment2();
			case LehoPackage.RESERVED: return createReserved();
			case LehoPackage.DISCARD_DROP: return createDiscardDrop();
			case LehoPackage.DISCARD_REJECT: return createDiscardReject();
			case LehoPackage.DFF: return createDFF();
			case LehoPackage.POLICY: return createPolicy();
			case LehoPackage.FILTER: return createFilter();
			case LehoPackage.PACKET: return createPacket();
			case LehoPackage.PORT: return createPort();
			case LehoPackage.INTERFACE: return createInterface();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LehoPackage.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LehoPackage.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
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
	public fr.inria.diverse.melanger.leho.leho.Deprecated createDeprecated() {
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
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Packet createPacket() {
		PacketImpl packet = new PacketImpl();
		return packet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LehoPackage getLehoPackage() {
		return (LehoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LehoPackage getPackage() {
		return LehoPackage.eINSTANCE;
	}

} //LehoFactoryImpl
