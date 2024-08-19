/**
 */
package fr.inria.diverse.melanger.leho.Leho.util;

import fr.inria.diverse.melanger.leho.Leho.Accept;
import fr.inria.diverse.melanger.leho.Leho.Action;
import fr.inria.diverse.melanger.leho.Leho.AuthentificationHeader;
import fr.inria.diverse.melanger.leho.Leho.Bandwidth;
import fr.inria.diverse.melanger.leho.Leho.BitUnit;
import fr.inria.diverse.melanger.leho.Leho.Calipso;
import fr.inria.diverse.melanger.leho.Leho.Configuration;
import fr.inria.diverse.melanger.leho.Leho.DFF;
import fr.inria.diverse.melanger.leho.Leho.Day;
import fr.inria.diverse.melanger.leho.Leho.DestinationOpts;
import fr.inria.diverse.melanger.leho.Leho.Discard;
import fr.inria.diverse.melanger.leho.Leho.DiscardDrop;
import fr.inria.diverse.melanger.leho.Leho.DiscardReject;
import fr.inria.diverse.melanger.leho.Leho.Drop;
import fr.inria.diverse.melanger.leho.Leho.EncapsulingSecurityPayload;
import fr.inria.diverse.melanger.leho.Leho.EndPointIdentification;
import fr.inria.diverse.melanger.leho.Leho.ExperimentationAndTesting;
import fr.inria.diverse.melanger.leho.Leho.ExtensionHeader;
import fr.inria.diverse.melanger.leho.Leho.Filter;
import fr.inria.diverse.melanger.leho.Leho.Fragment;
import fr.inria.diverse.melanger.leho.Leho.HomeAdress;
import fr.inria.diverse.melanger.leho.Leho.HopByHopOpts;
import fr.inria.diverse.melanger.leho.Leho.HostIdentityProtocol;
import fr.inria.diverse.melanger.leho.Leho.Hour;
import fr.inria.diverse.melanger.leho.Leho.ILNPNonce;
import fr.inria.diverse.melanger.leho.Leho.IPv6PerformanceDiagnostic;
import fr.inria.diverse.melanger.leho.Leho.Inbound;
import fr.inria.diverse.melanger.leho.Leho.Interface;
import fr.inria.diverse.melanger.leho.Leho.IpAddSpec;
import fr.inria.diverse.melanger.leho.Leho.JumboPayload;
import fr.inria.diverse.melanger.leho.Leho.LehoPackage;
import fr.inria.diverse.melanger.leho.Leho.LineIdOption;
import fr.inria.diverse.melanger.leho.Leho.MLD;
import fr.inria.diverse.melanger.leho.Leho.MPLOption;
import fr.inria.diverse.melanger.leho.Leho.Minute;
import fr.inria.diverse.melanger.leho.Leho.MobilityHeader;
import fr.inria.diverse.melanger.leho.Leho.Nimrod;
import fr.inria.diverse.melanger.leho.Leho.OctetUnit;
import fr.inria.diverse.melanger.leho.Leho.OptionDestination;
import fr.inria.diverse.melanger.leho.Leho.OptionHopByHop;
import fr.inria.diverse.melanger.leho.Leho.Options;
import fr.inria.diverse.melanger.leho.Leho.Outbound;
import fr.inria.diverse.melanger.leho.Leho.Packet;
import fr.inria.diverse.melanger.leho.Leho.PacketUnit;
import fr.inria.diverse.melanger.leho.Leho.Pad1;
import fr.inria.diverse.melanger.leho.Leho.PadN;
import fr.inria.diverse.melanger.leho.Leho.Policy;
import fr.inria.diverse.melanger.leho.Leho.Port;
import fr.inria.diverse.melanger.leho.Leho.Protocol;
import fr.inria.diverse.melanger.leho.Leho.QuickStart;
import fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment;
import fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment1;
import fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment2;
import fr.inria.diverse.melanger.leho.Leho.RPLOption;
import fr.inria.diverse.melanger.leho.Leho.RPLSource;
import fr.inria.diverse.melanger.leho.Leho.RSVP;
import fr.inria.diverse.melanger.leho.Leho.Reject;
import fr.inria.diverse.melanger.leho.Leho.Reserved;
import fr.inria.diverse.melanger.leho.Leho.RouterAlert;
import fr.inria.diverse.melanger.leho.Leho.Routing;
import fr.inria.diverse.melanger.leho.Leho.Rule;
import fr.inria.diverse.melanger.leho.Leho.Second;
import fr.inria.diverse.melanger.leho.Leho.Segment;
import fr.inria.diverse.melanger.leho.Leho.Shim6Protocol;
import fr.inria.diverse.melanger.leho.Leho.SmfDpd;
import fr.inria.diverse.melanger.leho.Leho.SourceRoute;
import fr.inria.diverse.melanger.leho.Leho.Time;
import fr.inria.diverse.melanger.leho.Leho.TunnelEncapsulationLimit;
import fr.inria.diverse.melanger.leho.Leho.Type2;
import fr.inria.diverse.melanger.leho.Leho.TypeRouting;
import fr.inria.diverse.melanger.leho.Leho.Unassigned;
import fr.inria.diverse.melanger.leho.Leho.Unit;
import fr.inria.diverse.melanger.leho.Leho.UnknownEH;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.leho.Leho.LehoPackage
 * @generated
 */
public class LehoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LehoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LehoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LehoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LehoSwitch<Adapter> modelSwitch =
		new LehoSwitch<Adapter>() {
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseDrop(Drop object) {
				return createDropAdapter();
			}
			@Override
			public Adapter caseReject(Reject object) {
				return createRejectAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseAccept(Accept object) {
				return createAcceptAdapter();
			}
			@Override
			public Adapter caseDiscard(Discard object) {
				return createDiscardAdapter();
			}
			@Override
			public Adapter caseInbound(Inbound object) {
				return createInboundAdapter();
			}
			@Override
			public Adapter caseOutbound(Outbound object) {
				return createOutboundAdapter();
			}
			@Override
			public Adapter caseBandwidth(Bandwidth object) {
				return createBandwidthAdapter();
			}
			@Override
			public Adapter caseUnit(Unit object) {
				return createUnitAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseBitUnit(BitUnit object) {
				return createBitUnitAdapter();
			}
			@Override
			public Adapter caseOctetUnit(OctetUnit object) {
				return createOctetUnitAdapter();
			}
			@Override
			public Adapter casePacketUnit(PacketUnit object) {
				return createPacketUnitAdapter();
			}
			@Override
			public Adapter caseSecond(Second object) {
				return createSecondAdapter();
			}
			@Override
			public Adapter caseMinute(Minute object) {
				return createMinuteAdapter();
			}
			@Override
			public Adapter caseHour(Hour object) {
				return createHourAdapter();
			}
			@Override
			public Adapter caseDay(Day object) {
				return createDayAdapter();
			}
			@Override
			public Adapter caseExtensionHeader(ExtensionHeader object) {
				return createExtensionHeaderAdapter();
			}
			@Override
			public Adapter caseOptionHopByHop(OptionHopByHop object) {
				return createOptionHopByHopAdapter();
			}
			@Override
			public Adapter caseHopByHopOpts(HopByHopOpts object) {
				return createHopByHopOptsAdapter();
			}
			@Override
			public Adapter caseRouting(Routing object) {
				return createRoutingAdapter();
			}
			@Override
			public Adapter caseFragment(Fragment object) {
				return createFragmentAdapter();
			}
			@Override
			public Adapter caseEncapsulingSecurityPayload(EncapsulingSecurityPayload object) {
				return createEncapsulingSecurityPayloadAdapter();
			}
			@Override
			public Adapter caseAuthentificationHeader(AuthentificationHeader object) {
				return createAuthentificationHeaderAdapter();
			}
			@Override
			public Adapter caseDestinationOpts(DestinationOpts object) {
				return createDestinationOptsAdapter();
			}
			@Override
			public Adapter caseMobilityHeader(MobilityHeader object) {
				return createMobilityHeaderAdapter();
			}
			@Override
			public Adapter caseUnknownEH(UnknownEH object) {
				return createUnknownEHAdapter();
			}
			@Override
			public Adapter caseExperimentationAndTesting(ExperimentationAndTesting object) {
				return createExperimentationAndTestingAdapter();
			}
			@Override
			public Adapter caseHostIdentityProtocol(HostIdentityProtocol object) {
				return createHostIdentityProtocolAdapter();
			}
			@Override
			public Adapter caseShim6Protocol(Shim6Protocol object) {
				return createShim6ProtocolAdapter();
			}
			@Override
			public Adapter casePad1(Pad1 object) {
				return createPad1Adapter();
			}
			@Override
			public Adapter casePadN(PadN object) {
				return createPadNAdapter();
			}
			@Override
			public Adapter caseJumboPayload(JumboPayload object) {
				return createJumboPayloadAdapter();
			}
			@Override
			public Adapter caseRPLOption(RPLOption object) {
				return createRPLOptionAdapter();
			}
			@Override
			public Adapter caseTunnelEncapsulationLimit(TunnelEncapsulationLimit object) {
				return createTunnelEncapsulationLimitAdapter();
			}
			@Override
			public Adapter caseRouterAlert(RouterAlert object) {
				return createRouterAlertAdapter();
			}
			@Override
			public Adapter caseQuickStart(QuickStart object) {
				return createQuickStartAdapter();
			}
			@Override
			public Adapter caseCalipso(Calipso object) {
				return createCalipsoAdapter();
			}
			@Override
			public Adapter caseSmfDpd(SmfDpd object) {
				return createSmfDpdAdapter();
			}
			@Override
			public Adapter caseHomeAdress(HomeAdress object) {
				return createHomeAdressAdapter();
			}
			@Override
			public Adapter caseDeprecated(fr.inria.diverse.melanger.leho.Leho.Deprecated object) {
				return createDeprecatedAdapter();
			}
			@Override
			public Adapter caseEndPointIdentification(EndPointIdentification object) {
				return createEndPointIdentificationAdapter();
			}
			@Override
			public Adapter caseILNPNonce(ILNPNonce object) {
				return createILNPNonceAdapter();
			}
			@Override
			public Adapter caseLineIdOption(LineIdOption object) {
				return createLineIdOptionAdapter();
			}
			@Override
			public Adapter caseMPLOption(MPLOption object) {
				return createMPLOptionAdapter();
			}
			@Override
			public Adapter caseRFC3692Experiment(RFC3692Experiment object) {
				return createRFC3692ExperimentAdapter();
			}
			@Override
			public Adapter caseIpAddSpec(IpAddSpec object) {
				return createIpAddSpecAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseRSVP(RSVP object) {
				return createRSVPAdapter();
			}
			@Override
			public Adapter caseMLD(MLD object) {
				return createMLDAdapter();
			}
			@Override
			public Adapter caseOptionDestination(OptionDestination object) {
				return createOptionDestinationAdapter();
			}
			@Override
			public Adapter caseIPv6PerformanceDiagnostic(IPv6PerformanceDiagnostic object) {
				return createIPv6PerformanceDiagnosticAdapter();
			}
			@Override
			public Adapter caseTypeRouting(TypeRouting object) {
				return createTypeRoutingAdapter();
			}
			@Override
			public Adapter caseSourceRoute(SourceRoute object) {
				return createSourceRouteAdapter();
			}
			@Override
			public Adapter caseNimrod(Nimrod object) {
				return createNimrodAdapter();
			}
			@Override
			public Adapter caseType2(Type2 object) {
				return createType2Adapter();
			}
			@Override
			public Adapter caseRPLSource(RPLSource object) {
				return createRPLSourceAdapter();
			}
			@Override
			public Adapter caseSegment(Segment object) {
				return createSegmentAdapter();
			}
			@Override
			public Adapter caseUnassigned(Unassigned object) {
				return createUnassignedAdapter();
			}
			@Override
			public Adapter caseRFC3692Experiment1(RFC3692Experiment1 object) {
				return createRFC3692Experiment1Adapter();
			}
			@Override
			public Adapter caseRFC3692Experiment2(RFC3692Experiment2 object) {
				return createRFC3692Experiment2Adapter();
			}
			@Override
			public Adapter caseReserved(Reserved object) {
				return createReservedAdapter();
			}
			@Override
			public Adapter caseDiscardDrop(DiscardDrop object) {
				return createDiscardDropAdapter();
			}
			@Override
			public Adapter caseDiscardReject(DiscardReject object) {
				return createDiscardRejectAdapter();
			}
			@Override
			public Adapter caseDFF(DFF object) {
				return createDFFAdapter();
			}
			@Override
			public Adapter caseOptions(Options object) {
				return createOptionsAdapter();
			}
			@Override
			public Adapter casePolicy(Policy object) {
				return createPolicyAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter casePacket(Packet object) {
				return createPacketAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Reject
	 * @generated
	 */
	public Adapter createRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Accept <em>Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Accept
	 * @generated
	 */
	public Adapter createAcceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Discard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Discard
	 * @generated
	 */
	public Adapter createDiscardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Inbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Inbound
	 * @generated
	 */
	public Adapter createInboundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Outbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Outbound
	 * @generated
	 */
	public Adapter createOutboundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Bandwidth
	 * @generated
	 */
	public Adapter createBandwidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.BitUnit <em>Bit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.BitUnit
	 * @generated
	 */
	public Adapter createBitUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.OctetUnit <em>Octet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.OctetUnit
	 * @generated
	 */
	public Adapter createOctetUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.PacketUnit <em>Packet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.PacketUnit
	 * @generated
	 */
	public Adapter createPacketUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Second <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Second
	 * @generated
	 */
	public Adapter createSecondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Minute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Minute
	 * @generated
	 */
	public Adapter createMinuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Hour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Hour
	 * @generated
	 */
	public Adapter createHourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.ExtensionHeader <em>Extension Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.ExtensionHeader
	 * @generated
	 */
	public Adapter createExtensionHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.OptionHopByHop <em>Option Hop By Hop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.OptionHopByHop
	 * @generated
	 */
	public Adapter createOptionHopByHopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.HopByHopOpts <em>Hop By Hop Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.HopByHopOpts
	 * @generated
	 */
	public Adapter createHopByHopOptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Routing
	 * @generated
	 */
	public Adapter createRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Fragment
	 * @generated
	 */
	public Adapter createFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.EncapsulingSecurityPayload <em>Encapsuling Security Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.EncapsulingSecurityPayload
	 * @generated
	 */
	public Adapter createEncapsulingSecurityPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.AuthentificationHeader <em>Authentification Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.AuthentificationHeader
	 * @generated
	 */
	public Adapter createAuthentificationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.DestinationOpts <em>Destination Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.DestinationOpts
	 * @generated
	 */
	public Adapter createDestinationOptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.MobilityHeader <em>Mobility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.MobilityHeader
	 * @generated
	 */
	public Adapter createMobilityHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.UnknownEH <em>Unknown EH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.UnknownEH
	 * @generated
	 */
	public Adapter createUnknownEHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.ExperimentationAndTesting <em>Experimentation And Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.ExperimentationAndTesting
	 * @generated
	 */
	public Adapter createExperimentationAndTestingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.HostIdentityProtocol <em>Host Identity Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.HostIdentityProtocol
	 * @generated
	 */
	public Adapter createHostIdentityProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Shim6Protocol <em>Shim6 Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Shim6Protocol
	 * @generated
	 */
	public Adapter createShim6ProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Pad1 <em>Pad1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Pad1
	 * @generated
	 */
	public Adapter createPad1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.PadN <em>Pad N</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.PadN
	 * @generated
	 */
	public Adapter createPadNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.JumboPayload <em>Jumbo Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.JumboPayload
	 * @generated
	 */
	public Adapter createJumboPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.RPLOption <em>RPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.RPLOption
	 * @generated
	 */
	public Adapter createRPLOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.TunnelEncapsulationLimit <em>Tunnel Encapsulation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.TunnelEncapsulationLimit
	 * @generated
	 */
	public Adapter createTunnelEncapsulationLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.RouterAlert <em>Router Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.RouterAlert
	 * @generated
	 */
	public Adapter createRouterAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.QuickStart <em>Quick Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.QuickStart
	 * @generated
	 */
	public Adapter createQuickStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Calipso <em>Calipso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Calipso
	 * @generated
	 */
	public Adapter createCalipsoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.SmfDpd <em>Smf Dpd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.SmfDpd
	 * @generated
	 */
	public Adapter createSmfDpdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.HomeAdress <em>Home Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.HomeAdress
	 * @generated
	 */
	public Adapter createHomeAdressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Deprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Deprecated
	 * @generated
	 */
	public Adapter createDeprecatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.EndPointIdentification <em>End Point Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.EndPointIdentification
	 * @generated
	 */
	public Adapter createEndPointIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.ILNPNonce <em>ILNP Nonce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.ILNPNonce
	 * @generated
	 */
	public Adapter createILNPNonceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.LineIdOption <em>Line Id Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.LineIdOption
	 * @generated
	 */
	public Adapter createLineIdOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.MPLOption <em>MPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.MPLOption
	 * @generated
	 */
	public Adapter createMPLOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment <em>RFC3692 Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment
	 * @generated
	 */
	public Adapter createRFC3692ExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.IpAddSpec <em>Ip Add Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.IpAddSpec
	 * @generated
	 */
	public Adapter createIpAddSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.RSVP <em>RSVP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.RSVP
	 * @generated
	 */
	public Adapter createRSVPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.MLD <em>MLD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.MLD
	 * @generated
	 */
	public Adapter createMLDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.OptionDestination <em>Option Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.OptionDestination
	 * @generated
	 */
	public Adapter createOptionDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.IPv6PerformanceDiagnostic <em>IPv6 Performance Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.IPv6PerformanceDiagnostic
	 * @generated
	 */
	public Adapter createIPv6PerformanceDiagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.TypeRouting <em>Type Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.TypeRouting
	 * @generated
	 */
	public Adapter createTypeRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.SourceRoute <em>Source Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.SourceRoute
	 * @generated
	 */
	public Adapter createSourceRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Nimrod <em>Nimrod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Nimrod
	 * @generated
	 */
	public Adapter createNimrodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Type2 <em>Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Type2
	 * @generated
	 */
	public Adapter createType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.RPLSource <em>RPL Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.RPLSource
	 * @generated
	 */
	public Adapter createRPLSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Unassigned <em>Unassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Unassigned
	 * @generated
	 */
	public Adapter createUnassignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment1 <em>RFC3692 Experiment1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment1
	 * @generated
	 */
	public Adapter createRFC3692Experiment1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment2 <em>RFC3692 Experiment2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.RFC3692Experiment2
	 * @generated
	 */
	public Adapter createRFC3692Experiment2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Reserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Reserved
	 * @generated
	 */
	public Adapter createReservedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.DiscardDrop <em>Discard Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.DiscardDrop
	 * @generated
	 */
	public Adapter createDiscardDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.DiscardReject <em>Discard Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.DiscardReject
	 * @generated
	 */
	public Adapter createDiscardRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.DFF <em>DFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.DFF
	 * @generated
	 */
	public Adapter createDFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Packet <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Packet
	 * @generated
	 */
	public Adapter createPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.Leho.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.Leho.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LehoAdapterFactory
