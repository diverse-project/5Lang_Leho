/**
 */
package fr.inria.diverse.melanger.leho.eho.util;

import fr.inria.diverse.melanger.leho.eho.Accept;
import fr.inria.diverse.melanger.leho.eho.Action;
import fr.inria.diverse.melanger.leho.eho.AuthentificationHeader;
import fr.inria.diverse.melanger.leho.eho.Bandwidth;
import fr.inria.diverse.melanger.leho.eho.BitUnit;
import fr.inria.diverse.melanger.leho.eho.Calipso;
import fr.inria.diverse.melanger.leho.eho.Configuration;
import fr.inria.diverse.melanger.leho.eho.DFF;
import fr.inria.diverse.melanger.leho.eho.Day;
import fr.inria.diverse.melanger.leho.eho.DestinationOpts;
import fr.inria.diverse.melanger.leho.eho.Discard;
import fr.inria.diverse.melanger.leho.eho.DiscardDrop;
import fr.inria.diverse.melanger.leho.eho.DiscardReject;
import fr.inria.diverse.melanger.leho.eho.Drop;
import fr.inria.diverse.melanger.leho.eho.EhoPackage;
import fr.inria.diverse.melanger.leho.eho.EncapsulingSecurityPayload;
import fr.inria.diverse.melanger.leho.eho.EndPointIdentification;
import fr.inria.diverse.melanger.leho.eho.ExperimentationAndTesting;
import fr.inria.diverse.melanger.leho.eho.ExtensionHeader;
import fr.inria.diverse.melanger.leho.eho.Fragment;
import fr.inria.diverse.melanger.leho.eho.HomeAdress;
import fr.inria.diverse.melanger.leho.eho.HopByHopOpts;
import fr.inria.diverse.melanger.leho.eho.HostIdentityProtocol;
import fr.inria.diverse.melanger.leho.eho.Hour;
import fr.inria.diverse.melanger.leho.eho.ILNPNonce;
import fr.inria.diverse.melanger.leho.eho.IPv6PerformanceDiagnostic;
import fr.inria.diverse.melanger.leho.eho.Inbound;
import fr.inria.diverse.melanger.leho.eho.Interface;
import fr.inria.diverse.melanger.leho.eho.IpAddSpec;
import fr.inria.diverse.melanger.leho.eho.JumboPayload;
import fr.inria.diverse.melanger.leho.eho.LineIdOption;
import fr.inria.diverse.melanger.leho.eho.MLD;
import fr.inria.diverse.melanger.leho.eho.MPLOption;
import fr.inria.diverse.melanger.leho.eho.Minute;
import fr.inria.diverse.melanger.leho.eho.MobilityHeader;
import fr.inria.diverse.melanger.leho.eho.Nimrod;
import fr.inria.diverse.melanger.leho.eho.OctetUnit;
import fr.inria.diverse.melanger.leho.eho.OptionDestination;
import fr.inria.diverse.melanger.leho.eho.OptionHopByHop;
import fr.inria.diverse.melanger.leho.eho.Options;
import fr.inria.diverse.melanger.leho.eho.Outbound;
import fr.inria.diverse.melanger.leho.eho.PacketSpec;
import fr.inria.diverse.melanger.leho.eho.PacketUnit;
import fr.inria.diverse.melanger.leho.eho.Pad1;
import fr.inria.diverse.melanger.leho.eho.PadN;
import fr.inria.diverse.melanger.leho.eho.Policy;
import fr.inria.diverse.melanger.leho.eho.Protocol;
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
import fr.inria.diverse.melanger.leho.eho.Time;
import fr.inria.diverse.melanger.leho.eho.TunnelEncapsulationLimit;
import fr.inria.diverse.melanger.leho.eho.Type2;
import fr.inria.diverse.melanger.leho.eho.TypeRouting;
import fr.inria.diverse.melanger.leho.eho.Unassigned;
import fr.inria.diverse.melanger.leho.eho.Unit;
import fr.inria.diverse.melanger.leho.eho.UnknownEH;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage
 * @generated
 */
public class EhoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EhoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EhoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EhoPackage.eINSTANCE;
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
	protected EhoSwitch<Adapter> modelSwitch =
		new EhoSwitch<Adapter>() {
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
			public Adapter casePacketSpec(PacketSpec object) {
				return createPacketSpecAdapter();
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
			public Adapter caseDeprecated(fr.inria.diverse.melanger.leho.eho.Deprecated object) {
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
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Reject <em>Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Reject
	 * @generated
	 */
	public Adapter createRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Accept <em>Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Accept
	 * @generated
	 */
	public Adapter createAcceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Discard <em>Discard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Discard
	 * @generated
	 */
	public Adapter createDiscardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.PacketSpec <em>Packet Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.PacketSpec
	 * @generated
	 */
	public Adapter createPacketSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Inbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Inbound
	 * @generated
	 */
	public Adapter createInboundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Outbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Outbound
	 * @generated
	 */
	public Adapter createOutboundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Bandwidth
	 * @generated
	 */
	public Adapter createBandwidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Unit
	 * @generated
	 */
	public Adapter createUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.BitUnit <em>Bit Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.BitUnit
	 * @generated
	 */
	public Adapter createBitUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.OctetUnit <em>Octet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.OctetUnit
	 * @generated
	 */
	public Adapter createOctetUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.PacketUnit <em>Packet Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.PacketUnit
	 * @generated
	 */
	public Adapter createPacketUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Second <em>Second</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Second
	 * @generated
	 */
	public Adapter createSecondAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Minute <em>Minute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Minute
	 * @generated
	 */
	public Adapter createMinuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Hour <em>Hour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Hour
	 * @generated
	 */
	public Adapter createHourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Day
	 * @generated
	 */
	public Adapter createDayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.ExtensionHeader <em>Extension Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.ExtensionHeader
	 * @generated
	 */
	public Adapter createExtensionHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.OptionHopByHop <em>Option Hop By Hop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.OptionHopByHop
	 * @generated
	 */
	public Adapter createOptionHopByHopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.HopByHopOpts <em>Hop By Hop Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.HopByHopOpts
	 * @generated
	 */
	public Adapter createHopByHopOptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Routing
	 * @generated
	 */
	public Adapter createRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Fragment
	 * @generated
	 */
	public Adapter createFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.EncapsulingSecurityPayload <em>Encapsuling Security Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.EncapsulingSecurityPayload
	 * @generated
	 */
	public Adapter createEncapsulingSecurityPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.AuthentificationHeader <em>Authentification Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.AuthentificationHeader
	 * @generated
	 */
	public Adapter createAuthentificationHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.DestinationOpts <em>Destination Opts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.DestinationOpts
	 * @generated
	 */
	public Adapter createDestinationOptsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.MobilityHeader <em>Mobility Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.MobilityHeader
	 * @generated
	 */
	public Adapter createMobilityHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.UnknownEH <em>Unknown EH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.UnknownEH
	 * @generated
	 */
	public Adapter createUnknownEHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.ExperimentationAndTesting <em>Experimentation And Testing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.ExperimentationAndTesting
	 * @generated
	 */
	public Adapter createExperimentationAndTestingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.HostIdentityProtocol <em>Host Identity Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.HostIdentityProtocol
	 * @generated
	 */
	public Adapter createHostIdentityProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Shim6Protocol <em>Shim6 Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Shim6Protocol
	 * @generated
	 */
	public Adapter createShim6ProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Pad1 <em>Pad1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Pad1
	 * @generated
	 */
	public Adapter createPad1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.PadN <em>Pad N</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.PadN
	 * @generated
	 */
	public Adapter createPadNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.JumboPayload <em>Jumbo Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.JumboPayload
	 * @generated
	 */
	public Adapter createJumboPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.RPLOption <em>RPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.RPLOption
	 * @generated
	 */
	public Adapter createRPLOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.TunnelEncapsulationLimit <em>Tunnel Encapsulation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.TunnelEncapsulationLimit
	 * @generated
	 */
	public Adapter createTunnelEncapsulationLimitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.RouterAlert <em>Router Alert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.RouterAlert
	 * @generated
	 */
	public Adapter createRouterAlertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.QuickStart <em>Quick Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.QuickStart
	 * @generated
	 */
	public Adapter createQuickStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Calipso <em>Calipso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Calipso
	 * @generated
	 */
	public Adapter createCalipsoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.SmfDpd <em>Smf Dpd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.SmfDpd
	 * @generated
	 */
	public Adapter createSmfDpdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.HomeAdress <em>Home Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.HomeAdress
	 * @generated
	 */
	public Adapter createHomeAdressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Deprecated <em>Deprecated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Deprecated
	 * @generated
	 */
	public Adapter createDeprecatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.EndPointIdentification <em>End Point Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.EndPointIdentification
	 * @generated
	 */
	public Adapter createEndPointIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.ILNPNonce <em>ILNP Nonce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.ILNPNonce
	 * @generated
	 */
	public Adapter createILNPNonceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.LineIdOption <em>Line Id Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.LineIdOption
	 * @generated
	 */
	public Adapter createLineIdOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.MPLOption <em>MPL Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.MPLOption
	 * @generated
	 */
	public Adapter createMPLOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.RFC3692Experiment <em>RFC3692 Experiment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.RFC3692Experiment
	 * @generated
	 */
	public Adapter createRFC3692ExperimentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.IpAddSpec <em>Ip Add Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.IpAddSpec
	 * @generated
	 */
	public Adapter createIpAddSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.RSVP <em>RSVP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.RSVP
	 * @generated
	 */
	public Adapter createRSVPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.MLD <em>MLD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.MLD
	 * @generated
	 */
	public Adapter createMLDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.OptionDestination <em>Option Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.OptionDestination
	 * @generated
	 */
	public Adapter createOptionDestinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.IPv6PerformanceDiagnostic <em>IPv6 Performance Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.IPv6PerformanceDiagnostic
	 * @generated
	 */
	public Adapter createIPv6PerformanceDiagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.TypeRouting <em>Type Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.TypeRouting
	 * @generated
	 */
	public Adapter createTypeRoutingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.SourceRoute <em>Source Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.SourceRoute
	 * @generated
	 */
	public Adapter createSourceRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Nimrod <em>Nimrod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Nimrod
	 * @generated
	 */
	public Adapter createNimrodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Type2 <em>Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Type2
	 * @generated
	 */
	public Adapter createType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.RPLSource <em>RPL Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.RPLSource
	 * @generated
	 */
	public Adapter createRPLSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Unassigned <em>Unassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Unassigned
	 * @generated
	 */
	public Adapter createUnassignedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.RFC3692Experiment1 <em>RFC3692 Experiment1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.RFC3692Experiment1
	 * @generated
	 */
	public Adapter createRFC3692Experiment1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.RFC3692Experiment2 <em>RFC3692 Experiment2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.RFC3692Experiment2
	 * @generated
	 */
	public Adapter createRFC3692Experiment2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Reserved <em>Reserved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Reserved
	 * @generated
	 */
	public Adapter createReservedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.DiscardDrop <em>Discard Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.DiscardDrop
	 * @generated
	 */
	public Adapter createDiscardDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.DiscardReject <em>Discard Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.DiscardReject
	 * @generated
	 */
	public Adapter createDiscardRejectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.DFF <em>DFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.DFF
	 * @generated
	 */
	public Adapter createDFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Options <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Options
	 * @generated
	 */
	public Adapter createOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.inria.diverse.melanger.leho.eho.Policy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.inria.diverse.melanger.leho.eho.Policy
	 * @generated
	 */
	public Adapter createPolicyAdapter() {
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

} //EhoAdapterFactory
