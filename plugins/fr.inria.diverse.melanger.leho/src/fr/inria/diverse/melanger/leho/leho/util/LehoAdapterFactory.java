/**
 */
package fr.inria.diverse.melanger.leho.leho.util;

import fr.inria.diverse.melanger.leho.leho.Accept;
import fr.inria.diverse.melanger.leho.leho.Action;
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
import fr.inria.diverse.melanger.leho.leho.ExtensionHeader;
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
import fr.inria.diverse.melanger.leho.leho.LehoPackage;
import fr.inria.diverse.melanger.leho.leho.LineIdOption;
import fr.inria.diverse.melanger.leho.leho.MLD;
import fr.inria.diverse.melanger.leho.leho.MPLOption;
import fr.inria.diverse.melanger.leho.leho.Minute;
import fr.inria.diverse.melanger.leho.leho.MobilityHeader;
import fr.inria.diverse.melanger.leho.leho.Nimrod;
import fr.inria.diverse.melanger.leho.leho.OctetUnit;
import fr.inria.diverse.melanger.leho.leho.OptionDestination;
import fr.inria.diverse.melanger.leho.leho.OptionHopByHop;
import fr.inria.diverse.melanger.leho.leho.Options;
import fr.inria.diverse.melanger.leho.leho.Outbound;
import fr.inria.diverse.melanger.leho.leho.Packet;
import fr.inria.diverse.melanger.leho.leho.PacketUnit;
import fr.inria.diverse.melanger.leho.leho.Pad1;
import fr.inria.diverse.melanger.leho.leho.PadN;
import fr.inria.diverse.melanger.leho.leho.Policy;
import fr.inria.diverse.melanger.leho.leho.Port;
import fr.inria.diverse.melanger.leho.leho.Protocol;
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
import fr.inria.diverse.melanger.leho.leho.Time;
import fr.inria.diverse.melanger.leho.leho.TunnelEncapsulationLimit;
import fr.inria.diverse.melanger.leho.leho.Type2;
import fr.inria.diverse.melanger.leho.leho.TypeRouting;
import fr.inria.diverse.melanger.leho.leho.Unassigned;
import fr.inria.diverse.melanger.leho.leho.Unit;
import fr.inria.diverse.melanger.leho.leho.UnknownEH;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage
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
			public Adapter caseDeprecated(fr.inria.diverse.melanger.leho.leho.Deprecated object) {
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
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Reject
	 * @generated
	 */
	public Adapter createRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Accept <em>Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Accept
	 * @generated
	 */
	public Adapter createAcceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Discard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Discard
	 * @generated
	 */
	public Adapter createDiscardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Inbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Inbound
	 * @generated
	 */
	public Adapter createInboundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Outbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Outbound
	 * @generated
	 */
	public Adapter createOutboundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Bandwidth
	 * @generated
	 */
	public Adapter createBandwidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.BitUnit <em>Bit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.BitUnit
	 * @generated
	 */
	public Adapter createBitUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.OctetUnit <em>Octet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.OctetUnit
	 * @generated
	 */
	public Adapter createOctetUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.PacketUnit <em>Packet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.PacketUnit
	 * @generated
	 */
	public Adapter createPacketUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Second <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Second
	 * @generated
	 */
	public Adapter createSecondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Minute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Minute
	 * @generated
	 */
	public Adapter createMinuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Hour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Hour
	 * @generated
	 */
	public Adapter createHourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.ExtensionHeader <em>Extension Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.ExtensionHeader
	 * @generated
	 */
	public Adapter createExtensionHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.OptionHopByHop <em>Option Hop By Hop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.OptionHopByHop
	 * @generated
	 */
	public Adapter createOptionHopByHopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.HopByHopOpts <em>Hop By Hop Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.HopByHopOpts
	 * @generated
	 */
	public Adapter createHopByHopOptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Routing
	 * @generated
	 */
	public Adapter createRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Fragment
	 * @generated
	 */
	public Adapter createFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.EncapsulingSecurityPayload <em>Encapsuling Security Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.EncapsulingSecurityPayload
	 * @generated
	 */
	public Adapter createEncapsulingSecurityPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.AuthentificationHeader <em>Authentification Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.AuthentificationHeader
	 * @generated
	 */
	public Adapter createAuthentificationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.DestinationOpts <em>Destination Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.DestinationOpts
	 * @generated
	 */
	public Adapter createDestinationOptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.MobilityHeader <em>Mobility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.MobilityHeader
	 * @generated
	 */
	public Adapter createMobilityHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.UnknownEH <em>Unknown EH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.UnknownEH
	 * @generated
	 */
	public Adapter createUnknownEHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.ExperimentationAndTesting <em>Experimentation And Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.ExperimentationAndTesting
	 * @generated
	 */
	public Adapter createExperimentationAndTestingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.HostIdentityProtocol <em>Host Identity Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.HostIdentityProtocol
	 * @generated
	 */
	public Adapter createHostIdentityProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Shim6Protocol <em>Shim6 Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Shim6Protocol
	 * @generated
	 */
	public Adapter createShim6ProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Pad1 <em>Pad1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Pad1
	 * @generated
	 */
	public Adapter createPad1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.PadN <em>Pad N</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.PadN
	 * @generated
	 */
	public Adapter createPadNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.JumboPayload <em>Jumbo Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.JumboPayload
	 * @generated
	 */
	public Adapter createJumboPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.RPLOption <em>RPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.RPLOption
	 * @generated
	 */
	public Adapter createRPLOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.TunnelEncapsulationLimit <em>Tunnel Encapsulation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.TunnelEncapsulationLimit
	 * @generated
	 */
	public Adapter createTunnelEncapsulationLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.RouterAlert <em>Router Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.RouterAlert
	 * @generated
	 */
	public Adapter createRouterAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.QuickStart <em>Quick Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.QuickStart
	 * @generated
	 */
	public Adapter createQuickStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Calipso <em>Calipso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Calipso
	 * @generated
	 */
	public Adapter createCalipsoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.SmfDpd <em>Smf Dpd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.SmfDpd
	 * @generated
	 */
	public Adapter createSmfDpdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.HomeAdress <em>Home Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.HomeAdress
	 * @generated
	 */
	public Adapter createHomeAdressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Deprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Deprecated
	 * @generated
	 */
	public Adapter createDeprecatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.EndPointIdentification <em>End Point Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.EndPointIdentification
	 * @generated
	 */
	public Adapter createEndPointIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.ILNPNonce <em>ILNP Nonce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.ILNPNonce
	 * @generated
	 */
	public Adapter createILNPNonceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.LineIdOption <em>Line Id Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.LineIdOption
	 * @generated
	 */
	public Adapter createLineIdOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.MPLOption <em>MPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.MPLOption
	 * @generated
	 */
	public Adapter createMPLOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.RFC3692Experiment <em>RFC3692 Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.RFC3692Experiment
	 * @generated
	 */
	public Adapter createRFC3692ExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.IpAddSpec <em>Ip Add Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.IpAddSpec
	 * @generated
	 */
	public Adapter createIpAddSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.RSVP <em>RSVP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.RSVP
	 * @generated
	 */
	public Adapter createRSVPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.MLD <em>MLD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.MLD
	 * @generated
	 */
	public Adapter createMLDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.OptionDestination <em>Option Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.OptionDestination
	 * @generated
	 */
	public Adapter createOptionDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.IPv6PerformanceDiagnostic <em>IPv6 Performance Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.IPv6PerformanceDiagnostic
	 * @generated
	 */
	public Adapter createIPv6PerformanceDiagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.TypeRouting <em>Type Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.TypeRouting
	 * @generated
	 */
	public Adapter createTypeRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.SourceRoute <em>Source Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.SourceRoute
	 * @generated
	 */
	public Adapter createSourceRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Nimrod <em>Nimrod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Nimrod
	 * @generated
	 */
	public Adapter createNimrodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Type2 <em>Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Type2
	 * @generated
	 */
	public Adapter createType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.RPLSource <em>RPL Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.RPLSource
	 * @generated
	 */
	public Adapter createRPLSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Unassigned <em>Unassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Unassigned
	 * @generated
	 */
	public Adapter createUnassignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.RFC3692Experiment1 <em>RFC3692 Experiment1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.RFC3692Experiment1
	 * @generated
	 */
	public Adapter createRFC3692Experiment1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.RFC3692Experiment2 <em>RFC3692 Experiment2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.RFC3692Experiment2
	 * @generated
	 */
	public Adapter createRFC3692Experiment2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Reserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Reserved
	 * @generated
	 */
	public Adapter createReservedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.DiscardDrop <em>Discard Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.DiscardDrop
	 * @generated
	 */
	public Adapter createDiscardDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.DiscardReject <em>Discard Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.DiscardReject
	 * @generated
	 */
	public Adapter createDiscardRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.DFF <em>DFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.DFF
	 * @generated
	 */
	public Adapter createDFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Packet <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Packet
	 * @generated
	 */
	public Adapter createPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.leho.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.leho.Port
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
