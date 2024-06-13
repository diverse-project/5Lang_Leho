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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.leho.eho.EhoPackage
 * @generated
 */
public class EhoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EhoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EhoSwitch() {
		if (modelPackage == null) {
			modelPackage = EhoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EhoPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DROP: {
				Drop drop = (Drop)theEObject;
				T result = caseDrop(drop);
				if (result == null) result = caseAction(drop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.REJECT: {
				Reject reject = (Reject)theEObject;
				T result = caseReject(reject);
				if (result == null) result = caseAction(reject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.ACCEPT: {
				Accept accept = (Accept)theEObject;
				T result = caseAccept(accept);
				if (result == null) result = caseAction(accept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DISCARD: {
				Discard discard = (Discard)theEObject;
				T result = caseDiscard(discard);
				if (result == null) result = caseAction(discard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.PACKET_SPEC: {
				PacketSpec packetSpec = (PacketSpec)theEObject;
				T result = casePacketSpec(packetSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.INBOUND: {
				Inbound inbound = (Inbound)theEObject;
				T result = caseInbound(inbound);
				if (result == null) result = caseInterface(inbound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.OUTBOUND: {
				Outbound outbound = (Outbound)theEObject;
				T result = caseOutbound(outbound);
				if (result == null) result = caseInterface(outbound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.BANDWIDTH: {
				Bandwidth bandwidth = (Bandwidth)theEObject;
				T result = caseBandwidth(bandwidth);
				if (result == null) result = caseAction(bandwidth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.UNIT: {
				Unit unit = (Unit)theEObject;
				T result = caseUnit(unit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.BIT_UNIT: {
				BitUnit bitUnit = (BitUnit)theEObject;
				T result = caseBitUnit(bitUnit);
				if (result == null) result = caseUnit(bitUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.OCTET_UNIT: {
				OctetUnit octetUnit = (OctetUnit)theEObject;
				T result = caseOctetUnit(octetUnit);
				if (result == null) result = caseUnit(octetUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.PACKET_UNIT: {
				PacketUnit packetUnit = (PacketUnit)theEObject;
				T result = casePacketUnit(packetUnit);
				if (result == null) result = caseUnit(packetUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.SECOND: {
				Second second = (Second)theEObject;
				T result = caseSecond(second);
				if (result == null) result = caseTime(second);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.MINUTE: {
				Minute minute = (Minute)theEObject;
				T result = caseMinute(minute);
				if (result == null) result = caseTime(minute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.HOUR: {
				Hour hour = (Hour)theEObject;
				T result = caseHour(hour);
				if (result == null) result = caseTime(hour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DAY: {
				Day day = (Day)theEObject;
				T result = caseDay(day);
				if (result == null) result = caseTime(day);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.EXTENSION_HEADER: {
				ExtensionHeader extensionHeader = (ExtensionHeader)theEObject;
				T result = caseExtensionHeader(extensionHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.OPTION_HOP_BY_HOP: {
				OptionHopByHop optionHopByHop = (OptionHopByHop)theEObject;
				T result = caseOptionHopByHop(optionHopByHop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.HOP_BY_HOP_OPTS: {
				HopByHopOpts hopByHopOpts = (HopByHopOpts)theEObject;
				T result = caseHopByHopOpts(hopByHopOpts);
				if (result == null) result = caseExtensionHeader(hopByHopOpts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.ROUTING: {
				Routing routing = (Routing)theEObject;
				T result = caseRouting(routing);
				if (result == null) result = caseExtensionHeader(routing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.FRAGMENT: {
				Fragment fragment = (Fragment)theEObject;
				T result = caseFragment(fragment);
				if (result == null) result = caseExtensionHeader(fragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.ENCAPSULING_SECURITY_PAYLOAD: {
				EncapsulingSecurityPayload encapsulingSecurityPayload = (EncapsulingSecurityPayload)theEObject;
				T result = caseEncapsulingSecurityPayload(encapsulingSecurityPayload);
				if (result == null) result = caseExtensionHeader(encapsulingSecurityPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.AUTHENTIFICATION_HEADER: {
				AuthentificationHeader authentificationHeader = (AuthentificationHeader)theEObject;
				T result = caseAuthentificationHeader(authentificationHeader);
				if (result == null) result = caseExtensionHeader(authentificationHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DESTINATION_OPTS: {
				DestinationOpts destinationOpts = (DestinationOpts)theEObject;
				T result = caseDestinationOpts(destinationOpts);
				if (result == null) result = caseExtensionHeader(destinationOpts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.MOBILITY_HEADER: {
				MobilityHeader mobilityHeader = (MobilityHeader)theEObject;
				T result = caseMobilityHeader(mobilityHeader);
				if (result == null) result = caseExtensionHeader(mobilityHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.UNKNOWN_EH: {
				UnknownEH unknownEH = (UnknownEH)theEObject;
				T result = caseUnknownEH(unknownEH);
				if (result == null) result = caseExtensionHeader(unknownEH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.EXPERIMENTATION_AND_TESTING: {
				ExperimentationAndTesting experimentationAndTesting = (ExperimentationAndTesting)theEObject;
				T result = caseExperimentationAndTesting(experimentationAndTesting);
				if (result == null) result = caseExtensionHeader(experimentationAndTesting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.HOST_IDENTITY_PROTOCOL: {
				HostIdentityProtocol hostIdentityProtocol = (HostIdentityProtocol)theEObject;
				T result = caseHostIdentityProtocol(hostIdentityProtocol);
				if (result == null) result = caseExtensionHeader(hostIdentityProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.SHIM6_PROTOCOL: {
				Shim6Protocol shim6Protocol = (Shim6Protocol)theEObject;
				T result = caseShim6Protocol(shim6Protocol);
				if (result == null) result = caseExtensionHeader(shim6Protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.PAD1: {
				Pad1 pad1 = (Pad1)theEObject;
				T result = casePad1(pad1);
				if (result == null) result = caseOptions(pad1);
				if (result == null) result = caseOptionHopByHop(pad1);
				if (result == null) result = caseOptionDestination(pad1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.PAD_N: {
				PadN padN = (PadN)theEObject;
				T result = casePadN(padN);
				if (result == null) result = caseOptions(padN);
				if (result == null) result = caseOptionHopByHop(padN);
				if (result == null) result = caseOptionDestination(padN);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.JUMBO_PAYLOAD: {
				JumboPayload jumboPayload = (JumboPayload)theEObject;
				T result = caseJumboPayload(jumboPayload);
				if (result == null) result = caseOptionHopByHop(jumboPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RPL_OPTION: {
				RPLOption rplOption = (RPLOption)theEObject;
				T result = caseRPLOption(rplOption);
				if (result == null) result = caseOptionHopByHop(rplOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.TUNNEL_ENCAPSULATION_LIMIT: {
				TunnelEncapsulationLimit tunnelEncapsulationLimit = (TunnelEncapsulationLimit)theEObject;
				T result = caseTunnelEncapsulationLimit(tunnelEncapsulationLimit);
				if (result == null) result = caseOptionDestination(tunnelEncapsulationLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.ROUTER_ALERT: {
				RouterAlert routerAlert = (RouterAlert)theEObject;
				T result = caseRouterAlert(routerAlert);
				if (result == null) result = caseOptionHopByHop(routerAlert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.QUICK_START: {
				QuickStart quickStart = (QuickStart)theEObject;
				T result = caseQuickStart(quickStart);
				if (result == null) result = caseOptionHopByHop(quickStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.CALIPSO: {
				Calipso calipso = (Calipso)theEObject;
				T result = caseCalipso(calipso);
				if (result == null) result = caseOptionHopByHop(calipso);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.SMF_DPD: {
				SmfDpd smfDpd = (SmfDpd)theEObject;
				T result = caseSmfDpd(smfDpd);
				if (result == null) result = caseOptionHopByHop(smfDpd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.HOME_ADRESS: {
				HomeAdress homeAdress = (HomeAdress)theEObject;
				T result = caseHomeAdress(homeAdress);
				if (result == null) result = caseOptionDestination(homeAdress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DEPRECATED: {
				fr.inria.diverse.melanger.leho.eho.Deprecated deprecated = (fr.inria.diverse.melanger.leho.eho.Deprecated)theEObject;
				T result = caseDeprecated(deprecated);
				if (result == null) result = caseOptions(deprecated);
				if (result == null) result = caseOptionHopByHop(deprecated);
				if (result == null) result = caseOptionDestination(deprecated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.END_POINT_IDENTIFICATION: {
				EndPointIdentification endPointIdentification = (EndPointIdentification)theEObject;
				T result = caseEndPointIdentification(endPointIdentification);
				if (result == null) result = caseOptions(endPointIdentification);
				if (result == null) result = caseOptionHopByHop(endPointIdentification);
				if (result == null) result = caseOptionDestination(endPointIdentification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.ILNP_NONCE: {
				ILNPNonce ilnpNonce = (ILNPNonce)theEObject;
				T result = caseILNPNonce(ilnpNonce);
				if (result == null) result = caseOptionDestination(ilnpNonce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.LINE_ID_OPTION: {
				LineIdOption lineIdOption = (LineIdOption)theEObject;
				T result = caseLineIdOption(lineIdOption);
				if (result == null) result = caseOptionDestination(lineIdOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.MPL_OPTION: {
				MPLOption mplOption = (MPLOption)theEObject;
				T result = caseMPLOption(mplOption);
				if (result == null) result = caseOptionHopByHop(mplOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RFC3692_EXPERIMENT: {
				RFC3692Experiment rfc3692Experiment = (RFC3692Experiment)theEObject;
				T result = caseRFC3692Experiment(rfc3692Experiment);
				if (result == null) result = caseOptions(rfc3692Experiment);
				if (result == null) result = caseOptionHopByHop(rfc3692Experiment);
				if (result == null) result = caseOptionDestination(rfc3692Experiment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.IP_ADD_SPEC: {
				IpAddSpec ipAddSpec = (IpAddSpec)theEObject;
				T result = caseIpAddSpec(ipAddSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.PROTOCOL: {
				Protocol protocol = (Protocol)theEObject;
				T result = caseProtocol(protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RSVP: {
				RSVP rsvp = (RSVP)theEObject;
				T result = caseRSVP(rsvp);
				if (result == null) result = caseProtocol(rsvp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.MLD: {
				MLD mld = (MLD)theEObject;
				T result = caseMLD(mld);
				if (result == null) result = caseProtocol(mld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.OPTION_DESTINATION: {
				OptionDestination optionDestination = (OptionDestination)theEObject;
				T result = caseOptionDestination(optionDestination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.IPV6_PERFORMANCE_DIAGNOSTIC: {
				IPv6PerformanceDiagnostic iPv6PerformanceDiagnostic = (IPv6PerformanceDiagnostic)theEObject;
				T result = caseIPv6PerformanceDiagnostic(iPv6PerformanceDiagnostic);
				if (result == null) result = caseOptionDestination(iPv6PerformanceDiagnostic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.TYPE_ROUTING: {
				TypeRouting typeRouting = (TypeRouting)theEObject;
				T result = caseTypeRouting(typeRouting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.SOURCE_ROUTE: {
				SourceRoute sourceRoute = (SourceRoute)theEObject;
				T result = caseSourceRoute(sourceRoute);
				if (result == null) result = caseTypeRouting(sourceRoute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.NIMROD: {
				Nimrod nimrod = (Nimrod)theEObject;
				T result = caseNimrod(nimrod);
				if (result == null) result = caseTypeRouting(nimrod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.TYPE2: {
				Type2 type2 = (Type2)theEObject;
				T result = caseType2(type2);
				if (result == null) result = caseTypeRouting(type2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RPL_SOURCE: {
				RPLSource rplSource = (RPLSource)theEObject;
				T result = caseRPLSource(rplSource);
				if (result == null) result = caseTypeRouting(rplSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.SEGMENT: {
				Segment segment = (Segment)theEObject;
				T result = caseSegment(segment);
				if (result == null) result = caseTypeRouting(segment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.UNASSIGNED: {
				Unassigned unassigned = (Unassigned)theEObject;
				T result = caseUnassigned(unassigned);
				if (result == null) result = caseTypeRouting(unassigned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RFC3692_EXPERIMENT1: {
				RFC3692Experiment1 rfc3692Experiment1 = (RFC3692Experiment1)theEObject;
				T result = caseRFC3692Experiment1(rfc3692Experiment1);
				if (result == null) result = caseTypeRouting(rfc3692Experiment1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RFC3692_EXPERIMENT2: {
				RFC3692Experiment2 rfc3692Experiment2 = (RFC3692Experiment2)theEObject;
				T result = caseRFC3692Experiment2(rfc3692Experiment2);
				if (result == null) result = caseTypeRouting(rfc3692Experiment2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.RESERVED: {
				Reserved reserved = (Reserved)theEObject;
				T result = caseReserved(reserved);
				if (result == null) result = caseTypeRouting(reserved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DISCARD_DROP: {
				DiscardDrop discardDrop = (DiscardDrop)theEObject;
				T result = caseDiscardDrop(discardDrop);
				if (result == null) result = caseConfiguration(discardDrop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DISCARD_REJECT: {
				DiscardReject discardReject = (DiscardReject)theEObject;
				T result = caseDiscardReject(discardReject);
				if (result == null) result = caseConfiguration(discardReject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.DFF: {
				DFF dff = (DFF)theEObject;
				T result = caseDFF(dff);
				if (result == null) result = caseOptionHopByHop(dff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.OPTIONS: {
				Options options = (Options)theEObject;
				T result = caseOptions(options);
				if (result == null) result = caseOptionHopByHop(options);
				if (result == null) result = caseOptionDestination(options);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EhoPackage.POLICY: {
				Policy policy = (Policy)theEObject;
				T result = casePolicy(policy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReject(Reject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccept(Accept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscard(Discard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packet Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packet Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacketSpec(PacketSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInbound(Inbound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outbound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outbound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutbound(Outbound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bandwidth</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bandwidth</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBandwidth(Bandwidth object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnit(Unit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitUnit(BitUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octet Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octet Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOctetUnit(OctetUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packet Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packet Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePacketUnit(PacketUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Second</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Second</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecond(Second object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinute(Minute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHour(Hour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDay(Day object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionHeader(ExtensionHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Hop By Hop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Hop By Hop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionHopByHop(OptionHopByHop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hop By Hop Opts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hop By Hop Opts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHopByHopOpts(HopByHopOpts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouting(Routing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFragment(Fragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsuling Security Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsuling Security Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulingSecurityPayload(EncapsulingSecurityPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentification Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentification Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthentificationHeader(AuthentificationHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination Opts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination Opts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestinationOpts(DestinationOpts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobility Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobility Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobilityHeader(MobilityHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown EH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown EH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownEH(UnknownEH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimentation And Testing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimentation And Testing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentationAndTesting(ExperimentationAndTesting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Identity Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Identity Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostIdentityProtocol(HostIdentityProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shim6 Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shim6 Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShim6Protocol(Shim6Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePad1(Pad1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pad N</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pad N</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadN(PadN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jumbo Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jumbo Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumboPayload(JumboPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPL Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPL Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPLOption(RPLOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tunnel Encapsulation Limit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tunnel Encapsulation Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTunnelEncapsulationLimit(TunnelEncapsulationLimit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router Alert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router Alert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouterAlert(RouterAlert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quick Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quick Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuickStart(QuickStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calipso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calipso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalipso(Calipso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smf Dpd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smf Dpd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmfDpd(SmfDpd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Home Adress</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Home Adress</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHomeAdress(HomeAdress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deprecated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deprecated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeprecated(fr.inria.diverse.melanger.leho.eho.Deprecated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPointIdentification(EndPointIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ILNP Nonce</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ILNP Nonce</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseILNPNonce(ILNPNonce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Id Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Id Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineIdOption(LineIdOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPL Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPL Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPLOption(MPLOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RFC3692 Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RFC3692 Experiment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRFC3692Experiment(RFC3692Experiment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ip Add Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ip Add Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpAddSpec(IpAddSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RSVP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RSVP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRSVP(RSVP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MLD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MLD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMLD(MLD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Destination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Destination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionDestination(OptionDestination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPv6 Performance Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPv6 Performance Diagnostic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPv6PerformanceDiagnostic(IPv6PerformanceDiagnostic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Routing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Routing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRouting(TypeRouting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceRoute(SourceRoute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nimrod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nimrod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNimrod(Nimrod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType2(Type2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPL Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPL Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPLSource(RPLSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegment(Segment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unassigned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unassigned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnassigned(Unassigned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RFC3692 Experiment1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RFC3692 Experiment1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRFC3692Experiment1(RFC3692Experiment1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RFC3692 Experiment2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RFC3692 Experiment2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRFC3692Experiment2(RFC3692Experiment2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reserved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reserved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReserved(Reserved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscardDrop(DiscardDrop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discard Reject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discard Reject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscardReject(DiscardReject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDFF(DFF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptions(Options object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicy(Policy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EhoSwitch
