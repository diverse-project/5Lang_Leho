/**
 */
package fr.inria.diverse.melanger.leho.eho.impl;

import fr.inria.diverse.melanger.leho.eho.Accept;
import fr.inria.diverse.melanger.leho.eho.Action;
import fr.inria.diverse.melanger.leho.eho.AuthentificationHeader;
import fr.inria.diverse.melanger.leho.eho.Bandwidth;
import fr.inria.diverse.melanger.leho.eho.BitUnit;
import fr.inria.diverse.melanger.leho.eho.Calipso;
import fr.inria.diverse.melanger.leho.eho.Configuration;
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

import fr.inria.diverse.melanger.leho.leho.LehoPackage;

import fr.inria.diverse.melanger.leho.leho.impl.LehoPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EhoPackageImpl extends EPackageImpl implements EhoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rejectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packetSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inboundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandwidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass octetUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packetUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionHopByHopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hopByHopOptsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulingSecurityPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authentificationHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationOptsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilityHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownEHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass experimentationAndTestingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostIdentityProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shim6ProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pad1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass padNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumboPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rplOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tunnelEncapsulationLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerAlertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quickStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calipsoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smfDpdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass homeAdressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deprecatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ilnpNonceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineIdOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mplOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rfc3692ExperimentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ipAddSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsvpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionDestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPv6PerformanceDiagnosticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRoutingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRouteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nimrodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass type2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rplSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unassignedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rfc3692Experiment1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rfc3692Experiment2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardDropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discardRejectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass policyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EhoPackageImpl() {
		super(eNS_URI, EhoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EhoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EhoPackage init() {
		if (isInited) return (EhoPackage)EPackage.Registry.INSTANCE.getEPackage(EhoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEhoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EhoPackageImpl theEhoPackage = registeredEhoPackage instanceof EhoPackageImpl ? (EhoPackageImpl)registeredEhoPackage : new EhoPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LehoPackage.eNS_URI);
		LehoPackageImpl theLehoPackage = (LehoPackageImpl)(registeredPackage instanceof LehoPackageImpl ? registeredPackage : LehoPackage.eINSTANCE);

		// Create package meta-data objects
		theEhoPackage.createPackageContents();
		theLehoPackage.createPackageContents();

		// Initialize created meta-data
		theEhoPackage.initializePackageContents();
		theLehoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEhoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EhoPackage.eNS_URI, theEhoPackage);
		return theEhoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDrop() {
		return dropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReject() {
		return rejectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccept() {
		return acceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscard() {
		return discardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPacketSpec() {
		return packetSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPacketSpec_Port() {
		return (EReference)packetSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPacketSpec_Extensionheader() {
		return (EReference)packetSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInbound() {
		return inboundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutbound() {
		return outboundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBandwidth() {
		return bandwidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidth_Number() {
		return (EAttribute)bandwidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidth_Unit() {
		return (EReference)bandwidthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidth_Time() {
		return (EReference)bandwidthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnit() {
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBitUnit() {
		return bitUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOctetUnit() {
		return octetUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPacketUnit() {
		return packetUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecond() {
		return secondEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMinute() {
		return minuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHour() {
		return hourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDay() {
		return dayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionHeader() {
		return extensionHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptionHopByHop() {
		return optionHopByHopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHopByHopOpts() {
		return hopByHopOptsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHopByHopOpts_Options() {
		return (EReference)hopByHopOptsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouting() {
		return routingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouting_Types() {
		return (EReference)routingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFragment() {
		return fragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEncapsulingSecurityPayload() {
		return encapsulingSecurityPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthentificationHeader() {
		return authentificationHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDestinationOpts() {
		return destinationOptsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDestinationOpts_Options() {
		return (EReference)destinationOptsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMobilityHeader() {
		return mobilityHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnknownEH() {
		return unknownEHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExperimentationAndTesting() {
		return experimentationAndTestingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHostIdentityProtocol() {
		return hostIdentityProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShim6Protocol() {
		return shim6ProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPad1() {
		return pad1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPadN() {
		return padNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJumboPayload() {
		return jumboPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPLOption() {
		return rplOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTunnelEncapsulationLimit() {
		return tunnelEncapsulationLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouterAlert() {
		return routerAlertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouterAlert_Protocol() {
		return (EReference)routerAlertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuickStart() {
		return quickStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCalipso() {
		return calipsoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmfDpd() {
		return smfDpdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHomeAdress() {
		return homeAdressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeprecated() {
		return deprecatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndPointIdentification() {
		return endPointIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getILNPNonce() {
		return ilnpNonceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineIdOption() {
		return lineIdOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMPLOption() {
		return mplOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRFC3692Experiment() {
		return rfc3692ExperimentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIpAddSpec() {
		return ipAddSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIpAddSpec_Adress() {
		return (EAttribute)ipAddSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIpAddSpec_Port() {
		return (EAttribute)ipAddSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIpAddSpec_Mask() {
		return (EAttribute)ipAddSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Action() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Packetspec() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_To() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_Next() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRule_From() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProtocol() {
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRSVP() {
		return rsvpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMLD() {
		return mldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptionDestination() {
		return optionDestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIPv6PerformanceDiagnostic() {
		return iPv6PerformanceDiagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeRouting() {
		return typeRoutingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceRoute() {
		return sourceRouteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNimrod() {
		return nimrodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType2() {
		return type2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPLSource() {
		return rplSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSegment() {
		return segmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnassigned() {
		return unassignedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRFC3692Experiment1() {
		return rfc3692Experiment1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRFC3692Experiment2() {
		return rfc3692Experiment2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReserved() {
		return reservedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscardDrop() {
		return discardDropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscardReject() {
		return discardRejectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDFF() {
		return dffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptions() {
		return optionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolicy() {
		return policyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EhoFactory getEhoFactory() {
		return (EhoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configurationEClass = createEClass(CONFIGURATION);

		dropEClass = createEClass(DROP);

		rejectEClass = createEClass(REJECT);

		actionEClass = createEClass(ACTION);

		acceptEClass = createEClass(ACCEPT);

		discardEClass = createEClass(DISCARD);

		packetSpecEClass = createEClass(PACKET_SPEC);
		createEReference(packetSpecEClass, PACKET_SPEC__PORT);
		createEReference(packetSpecEClass, PACKET_SPEC__EXTENSIONHEADER);

		inboundEClass = createEClass(INBOUND);

		outboundEClass = createEClass(OUTBOUND);

		bandwidthEClass = createEClass(BANDWIDTH);
		createEAttribute(bandwidthEClass, BANDWIDTH__NUMBER);
		createEReference(bandwidthEClass, BANDWIDTH__UNIT);
		createEReference(bandwidthEClass, BANDWIDTH__TIME);

		unitEClass = createEClass(UNIT);

		timeEClass = createEClass(TIME);

		bitUnitEClass = createEClass(BIT_UNIT);

		octetUnitEClass = createEClass(OCTET_UNIT);

		packetUnitEClass = createEClass(PACKET_UNIT);

		secondEClass = createEClass(SECOND);

		minuteEClass = createEClass(MINUTE);

		hourEClass = createEClass(HOUR);

		dayEClass = createEClass(DAY);

		extensionHeaderEClass = createEClass(EXTENSION_HEADER);

		optionHopByHopEClass = createEClass(OPTION_HOP_BY_HOP);

		hopByHopOptsEClass = createEClass(HOP_BY_HOP_OPTS);
		createEReference(hopByHopOptsEClass, HOP_BY_HOP_OPTS__OPTIONS);

		routingEClass = createEClass(ROUTING);
		createEReference(routingEClass, ROUTING__TYPES);

		fragmentEClass = createEClass(FRAGMENT);

		encapsulingSecurityPayloadEClass = createEClass(ENCAPSULING_SECURITY_PAYLOAD);

		authentificationHeaderEClass = createEClass(AUTHENTIFICATION_HEADER);

		destinationOptsEClass = createEClass(DESTINATION_OPTS);
		createEReference(destinationOptsEClass, DESTINATION_OPTS__OPTIONS);

		mobilityHeaderEClass = createEClass(MOBILITY_HEADER);

		unknownEHEClass = createEClass(UNKNOWN_EH);

		experimentationAndTestingEClass = createEClass(EXPERIMENTATION_AND_TESTING);

		hostIdentityProtocolEClass = createEClass(HOST_IDENTITY_PROTOCOL);

		shim6ProtocolEClass = createEClass(SHIM6_PROTOCOL);

		pad1EClass = createEClass(PAD1);

		padNEClass = createEClass(PAD_N);

		jumboPayloadEClass = createEClass(JUMBO_PAYLOAD);

		rplOptionEClass = createEClass(RPL_OPTION);

		tunnelEncapsulationLimitEClass = createEClass(TUNNEL_ENCAPSULATION_LIMIT);

		routerAlertEClass = createEClass(ROUTER_ALERT);
		createEReference(routerAlertEClass, ROUTER_ALERT__PROTOCOL);

		quickStartEClass = createEClass(QUICK_START);

		calipsoEClass = createEClass(CALIPSO);

		smfDpdEClass = createEClass(SMF_DPD);

		homeAdressEClass = createEClass(HOME_ADRESS);

		deprecatedEClass = createEClass(DEPRECATED);

		endPointIdentificationEClass = createEClass(END_POINT_IDENTIFICATION);

		ilnpNonceEClass = createEClass(ILNP_NONCE);

		lineIdOptionEClass = createEClass(LINE_ID_OPTION);

		mplOptionEClass = createEClass(MPL_OPTION);

		rfc3692ExperimentEClass = createEClass(RFC3692_EXPERIMENT);

		ipAddSpecEClass = createEClass(IP_ADD_SPEC);
		createEAttribute(ipAddSpecEClass, IP_ADD_SPEC__ADRESS);
		createEAttribute(ipAddSpecEClass, IP_ADD_SPEC__PORT);
		createEAttribute(ipAddSpecEClass, IP_ADD_SPEC__MASK);

		interfaceEClass = createEClass(INTERFACE);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__ACTION);
		createEReference(ruleEClass, RULE__PACKETSPEC);
		createEReference(ruleEClass, RULE__TO);
		createEReference(ruleEClass, RULE__NEXT);
		createEReference(ruleEClass, RULE__FROM);

		protocolEClass = createEClass(PROTOCOL);

		rsvpEClass = createEClass(RSVP);

		mldEClass = createEClass(MLD);

		optionDestinationEClass = createEClass(OPTION_DESTINATION);

		iPv6PerformanceDiagnosticEClass = createEClass(IPV6_PERFORMANCE_DIAGNOSTIC);

		typeRoutingEClass = createEClass(TYPE_ROUTING);

		sourceRouteEClass = createEClass(SOURCE_ROUTE);

		nimrodEClass = createEClass(NIMROD);

		type2EClass = createEClass(TYPE2);

		rplSourceEClass = createEClass(RPL_SOURCE);

		segmentEClass = createEClass(SEGMENT);

		unassignedEClass = createEClass(UNASSIGNED);

		rfc3692Experiment1EClass = createEClass(RFC3692_EXPERIMENT1);

		rfc3692Experiment2EClass = createEClass(RFC3692_EXPERIMENT2);

		reservedEClass = createEClass(RESERVED);

		discardDropEClass = createEClass(DISCARD_DROP);

		discardRejectEClass = createEClass(DISCARD_REJECT);

		dffEClass = createEClass(DFF);

		optionsEClass = createEClass(OPTIONS);

		policyEClass = createEClass(POLICY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dropEClass.getESuperTypes().add(this.getAction());
		rejectEClass.getESuperTypes().add(this.getAction());
		acceptEClass.getESuperTypes().add(this.getAction());
		discardEClass.getESuperTypes().add(this.getAction());
		inboundEClass.getESuperTypes().add(this.getInterface());
		outboundEClass.getESuperTypes().add(this.getInterface());
		bandwidthEClass.getESuperTypes().add(this.getAction());
		bitUnitEClass.getESuperTypes().add(this.getUnit());
		octetUnitEClass.getESuperTypes().add(this.getUnit());
		packetUnitEClass.getESuperTypes().add(this.getUnit());
		secondEClass.getESuperTypes().add(this.getTime());
		minuteEClass.getESuperTypes().add(this.getTime());
		hourEClass.getESuperTypes().add(this.getTime());
		dayEClass.getESuperTypes().add(this.getTime());
		hopByHopOptsEClass.getESuperTypes().add(this.getExtensionHeader());
		routingEClass.getESuperTypes().add(this.getExtensionHeader());
		fragmentEClass.getESuperTypes().add(this.getExtensionHeader());
		encapsulingSecurityPayloadEClass.getESuperTypes().add(this.getExtensionHeader());
		authentificationHeaderEClass.getESuperTypes().add(this.getExtensionHeader());
		destinationOptsEClass.getESuperTypes().add(this.getExtensionHeader());
		mobilityHeaderEClass.getESuperTypes().add(this.getExtensionHeader());
		unknownEHEClass.getESuperTypes().add(this.getExtensionHeader());
		experimentationAndTestingEClass.getESuperTypes().add(this.getExtensionHeader());
		hostIdentityProtocolEClass.getESuperTypes().add(this.getExtensionHeader());
		shim6ProtocolEClass.getESuperTypes().add(this.getExtensionHeader());
		pad1EClass.getESuperTypes().add(this.getOptions());
		padNEClass.getESuperTypes().add(this.getOptions());
		jumboPayloadEClass.getESuperTypes().add(this.getOptionHopByHop());
		rplOptionEClass.getESuperTypes().add(this.getOptionHopByHop());
		tunnelEncapsulationLimitEClass.getESuperTypes().add(this.getOptionDestination());
		routerAlertEClass.getESuperTypes().add(this.getOptionHopByHop());
		quickStartEClass.getESuperTypes().add(this.getOptionHopByHop());
		calipsoEClass.getESuperTypes().add(this.getOptionHopByHop());
		smfDpdEClass.getESuperTypes().add(this.getOptionHopByHop());
		homeAdressEClass.getESuperTypes().add(this.getOptionDestination());
		deprecatedEClass.getESuperTypes().add(this.getOptions());
		endPointIdentificationEClass.getESuperTypes().add(this.getOptions());
		ilnpNonceEClass.getESuperTypes().add(this.getOptionDestination());
		lineIdOptionEClass.getESuperTypes().add(this.getOptionDestination());
		mplOptionEClass.getESuperTypes().add(this.getOptionHopByHop());
		rfc3692ExperimentEClass.getESuperTypes().add(this.getOptions());
		rsvpEClass.getESuperTypes().add(this.getProtocol());
		mldEClass.getESuperTypes().add(this.getProtocol());
		iPv6PerformanceDiagnosticEClass.getESuperTypes().add(this.getOptionDestination());
		sourceRouteEClass.getESuperTypes().add(this.getTypeRouting());
		nimrodEClass.getESuperTypes().add(this.getTypeRouting());
		type2EClass.getESuperTypes().add(this.getTypeRouting());
		rplSourceEClass.getESuperTypes().add(this.getTypeRouting());
		segmentEClass.getESuperTypes().add(this.getTypeRouting());
		unassignedEClass.getESuperTypes().add(this.getTypeRouting());
		rfc3692Experiment1EClass.getESuperTypes().add(this.getTypeRouting());
		rfc3692Experiment2EClass.getESuperTypes().add(this.getTypeRouting());
		reservedEClass.getESuperTypes().add(this.getTypeRouting());
		discardDropEClass.getESuperTypes().add(this.getConfiguration());
		discardRejectEClass.getESuperTypes().add(this.getConfiguration());
		dffEClass.getESuperTypes().add(this.getOptionHopByHop());
		optionsEClass.getESuperTypes().add(this.getOptionHopByHop());
		optionsEClass.getESuperTypes().add(this.getOptionDestination());

		// Initialize classes and features; add operations and parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(configurationEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dropEClass, Drop.class, "Drop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(dropEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rejectEClass, Reject.class, "Reject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(rejectEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(actionEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(acceptEClass, Accept.class, "Accept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(acceptEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discardEClass, Discard.class, "Discard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(discardEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packetSpecEClass, PacketSpec.class, "PacketSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPacketSpec_Port(), this.getInterface(), null, "port", null, 0, 1, PacketSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPacketSpec_Extensionheader(), this.getExtensionHeader(), null, "extensionheader", null, 1, -1, PacketSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(packetSpecEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inboundEClass, Inbound.class, "Inbound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(inboundEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outboundEClass, Outbound.class, "Outbound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(outboundEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bandwidthEClass, Bandwidth.class, "Bandwidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBandwidth_Number(), ecorePackage.getEInt(), "number", null, 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBandwidth_Unit(), this.getUnit(), null, "unit", null, 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBandwidth_Time(), this.getTime(), null, "time", null, 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(bandwidthEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeEClass, Time.class, "Time", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bitUnitEClass, BitUnit.class, "BitUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(octetUnitEClass, OctetUnit.class, "OctetUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packetUnitEClass, PacketUnit.class, "PacketUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(secondEClass, Second.class, "Second", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minuteEClass, Minute.class, "Minute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hourEClass, Hour.class, "Hour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dayEClass, Day.class, "Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extensionHeaderEClass, ExtensionHeader.class, "ExtensionHeader", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(extensionHeaderEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionHopByHopEClass, OptionHopByHop.class, "OptionHopByHop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(optionHopByHopEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hopByHopOptsEClass, HopByHopOpts.class, "HopByHopOpts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHopByHopOpts_Options(), this.getOptionHopByHop(), null, "options", null, 0, -1, HopByHopOpts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(hopByHopOptsEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(routingEClass, Routing.class, "Routing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouting_Types(), this.getTypeRouting(), null, "types", null, 0, -1, Routing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(routingEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fragmentEClass, Fragment.class, "Fragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(fragmentEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(encapsulingSecurityPayloadEClass, EncapsulingSecurityPayload.class, "EncapsulingSecurityPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(encapsulingSecurityPayloadEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(authentificationHeaderEClass, AuthentificationHeader.class, "AuthentificationHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(authentificationHeaderEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(destinationOptsEClass, DestinationOpts.class, "DestinationOpts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDestinationOpts_Options(), this.getOptionDestination(), null, "options", null, 0, -1, DestinationOpts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(destinationOptsEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mobilityHeaderEClass, MobilityHeader.class, "MobilityHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(mobilityHeaderEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unknownEHEClass, UnknownEH.class, "UnknownEH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(unknownEHEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(experimentationAndTestingEClass, ExperimentationAndTesting.class, "ExperimentationAndTesting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(experimentationAndTestingEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hostIdentityProtocolEClass, HostIdentityProtocol.class, "HostIdentityProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(hostIdentityProtocolEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(shim6ProtocolEClass, Shim6Protocol.class, "Shim6Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pad1EClass, Pad1.class, "Pad1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(pad1EClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(padNEClass, PadN.class, "PadN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(padNEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(jumboPayloadEClass, JumboPayload.class, "JumboPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(jumboPayloadEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rplOptionEClass, RPLOption.class, "RPLOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(rplOptionEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tunnelEncapsulationLimitEClass, TunnelEncapsulationLimit.class, "TunnelEncapsulationLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(tunnelEncapsulationLimitEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(routerAlertEClass, RouterAlert.class, "RouterAlert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouterAlert_Protocol(), this.getProtocol(), null, "protocol", null, 0, -1, RouterAlert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(routerAlertEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(quickStartEClass, QuickStart.class, "QuickStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(quickStartEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(calipsoEClass, Calipso.class, "Calipso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(calipsoEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smfDpdEClass, SmfDpd.class, "SmfDpd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(smfDpdEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(homeAdressEClass, HomeAdress.class, "HomeAdress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(homeAdressEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deprecatedEClass, fr.inria.diverse.melanger.leho.eho.Deprecated.class, "Deprecated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(deprecatedEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(endPointIdentificationEClass, EndPointIdentification.class, "EndPointIdentification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(endPointIdentificationEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ilnpNonceEClass, ILNPNonce.class, "ILNPNonce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(ilnpNonceEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineIdOptionEClass, LineIdOption.class, "LineIdOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(lineIdOptionEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mplOptionEClass, MPLOption.class, "MPLOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(mplOptionEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rfc3692ExperimentEClass, RFC3692Experiment.class, "RFC3692Experiment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(rfc3692ExperimentEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ipAddSpecEClass, IpAddSpec.class, "IpAddSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIpAddSpec_Adress(), ecorePackage.getEString(), "adress", null, 1, 1, IpAddSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpAddSpec_Port(), ecorePackage.getEString(), "port", null, 0, 1, IpAddSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIpAddSpec_Mask(), ecorePackage.getEInt(), "mask", null, 0, 1, IpAddSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ipAddSpecEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(interfaceEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Action(), this.getAction(), null, "action", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Packetspec(), this.getPacketSpec(), null, "packetspec", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_To(), this.getIpAddSpec(), null, "to", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Next(), this.getRule(), null, "next", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_From(), this.getIpAddSpec(), null, "from", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ruleEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPolicy(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(protocolEClass, Protocol.class, "Protocol", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(protocolEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "protocol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rsvpEClass, fr.inria.diverse.melanger.leho.eho.RSVP.class, "RSVP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(rsvpEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "protocol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mldEClass, fr.inria.diverse.melanger.leho.eho.MLD.class, "MLD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(mldEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "protocol", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionDestinationEClass, OptionDestination.class, "OptionDestination", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(optionDestinationEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iPv6PerformanceDiagnosticEClass, IPv6PerformanceDiagnostic.class, "IPv6PerformanceDiagnostic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iPv6PerformanceDiagnosticEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeRoutingEClass, TypeRouting.class, "TypeRouting", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(typeRoutingEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceRouteEClass, SourceRoute.class, "SourceRoute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(sourceRouteEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nimrodEClass, Nimrod.class, "Nimrod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(nimrodEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(type2EClass, Type2.class, "Type2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(type2EClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rplSourceEClass, RPLSource.class, "RPLSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(rplSourceEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(segmentEClass, Segment.class, "Segment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(segmentEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unassignedEClass, Unassigned.class, "Unassigned", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(unassignedEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rfc3692Experiment1EClass, RFC3692Experiment1.class, "RFC3692Experiment1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(rfc3692Experiment1EClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rfc3692Experiment2EClass, RFC3692Experiment2.class, "RFC3692Experiment2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(rfc3692Experiment2EClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reservedEClass, Reserved.class, "Reserved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(reservedEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "routingType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discardDropEClass, DiscardDrop.class, "DiscardDrop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(discardDropEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(discardRejectEClass, DiscardReject.class, "DiscardReject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(discardRejectEClass, null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dffEClass, fr.inria.diverse.melanger.leho.eho.DFF.class, "DFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(dffEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionsEClass, Options.class, "Options", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(optionsEClass, ecorePackage.getEBooleanObject(), "eval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "optionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(policyEClass, Policy.class, "Policy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation
		  (configurationEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (dropEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rejectEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (actionEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (acceptEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (discardEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (packetSpecEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (inboundEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (outboundEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (bandwidthEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (extensionHeaderEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (optionHopByHopEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (hopByHopOptsEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (routingEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (fragmentEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (encapsulingSecurityPayloadEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (authentificationHeaderEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (destinationOptsEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (mobilityHeaderEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (unknownEHEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (experimentationAndTestingEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (hostIdentityProtocolEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (pad1EClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (padNEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (jumboPayloadEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rplOptionEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (tunnelEncapsulationLimitEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (routerAlertEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (quickStartEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (calipsoEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (smfDpdEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (homeAdressEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (deprecatedEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (endPointIdentificationEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (ilnpNonceEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (lineIdOptionEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (mplOptionEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rfc3692ExperimentEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (ipAddSpecEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (interfaceEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (ruleEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (protocolEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rsvpEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (mldEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (optionDestinationEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (iPv6PerformanceDiagnosticEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (typeRoutingEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (sourceRouteEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (nimrodEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (type2EClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rplSourceEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (segmentEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (unassignedEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rfc3692Experiment1EClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (rfc3692Experiment2EClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (reservedEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (discardDropEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (discardRejectEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (dffEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (optionsEClass.getEOperations().get(0),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (policyEClass,
		   source,
		   new String[] {
		   });
	}

} //EhoPackageImpl
