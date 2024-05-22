/**
 */
package fr.inria.diverse.melanger.leho.leho;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.melanger.leho.leho.LehoPackage
 * @generated
 */
public interface LehoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LehoFactory eINSTANCE = fr.inria.diverse.melanger.leho.leho.impl.LehoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Drop</em>'.
	 * @generated
	 */
	Drop createDrop();

	/**
	 * Returns a new object of class '<em>Reject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reject</em>'.
	 * @generated
	 */
	Reject createReject();

	/**
	 * Returns a new object of class '<em>Accept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept</em>'.
	 * @generated
	 */
	Accept createAccept();

	/**
	 * Returns a new object of class '<em>Discard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discard</em>'.
	 * @generated
	 */
	Discard createDiscard();

	/**
	 * Returns a new object of class '<em>Packet Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet Spec</em>'.
	 * @generated
	 */
	PacketSpec createPacketSpec();

	/**
	 * Returns a new object of class '<em>Inbound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inbound</em>'.
	 * @generated
	 */
	Inbound createInbound();

	/**
	 * Returns a new object of class '<em>Outbound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outbound</em>'.
	 * @generated
	 */
	Outbound createOutbound();

	/**
	 * Returns a new object of class '<em>Bandwidth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bandwidth</em>'.
	 * @generated
	 */
	Bandwidth createBandwidth();

	/**
	 * Returns a new object of class '<em>Bit Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bit Unit</em>'.
	 * @generated
	 */
	BitUnit createBitUnit();

	/**
	 * Returns a new object of class '<em>Octet Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Octet Unit</em>'.
	 * @generated
	 */
	OctetUnit createOctetUnit();

	/**
	 * Returns a new object of class '<em>Packet Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet Unit</em>'.
	 * @generated
	 */
	PacketUnit createPacketUnit();

	/**
	 * Returns a new object of class '<em>Second</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Second</em>'.
	 * @generated
	 */
	Second createSecond();

	/**
	 * Returns a new object of class '<em>Minute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minute</em>'.
	 * @generated
	 */
	Minute createMinute();

	/**
	 * Returns a new object of class '<em>Hour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hour</em>'.
	 * @generated
	 */
	Hour createHour();

	/**
	 * Returns a new object of class '<em>Day</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day</em>'.
	 * @generated
	 */
	Day createDay();

	/**
	 * Returns a new object of class '<em>Hop By Hop Opts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hop By Hop Opts</em>'.
	 * @generated
	 */
	HopByHopOpts createHopByHopOpts();

	/**
	 * Returns a new object of class '<em>Routing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routing</em>'.
	 * @generated
	 */
	Routing createRouting();

	/**
	 * Returns a new object of class '<em>Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment</em>'.
	 * @generated
	 */
	Fragment createFragment();

	/**
	 * Returns a new object of class '<em>Encapsuling Security Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encapsuling Security Payload</em>'.
	 * @generated
	 */
	EncapsulingSecurityPayload createEncapsulingSecurityPayload();

	/**
	 * Returns a new object of class '<em>Authentification Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentification Header</em>'.
	 * @generated
	 */
	AuthentificationHeader createAuthentificationHeader();

	/**
	 * Returns a new object of class '<em>Destination Opts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destination Opts</em>'.
	 * @generated
	 */
	DestinationOpts createDestinationOpts();

	/**
	 * Returns a new object of class '<em>Mobility Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobility Header</em>'.
	 * @generated
	 */
	MobilityHeader createMobilityHeader();

	/**
	 * Returns a new object of class '<em>Unknown EH</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown EH</em>'.
	 * @generated
	 */
	UnknownEH createUnknownEH();

	/**
	 * Returns a new object of class '<em>Experimentation And Testing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Experimentation And Testing</em>'.
	 * @generated
	 */
	ExperimentationAndTesting createExperimentationAndTesting();

	/**
	 * Returns a new object of class '<em>Host Identity Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host Identity Protocol</em>'.
	 * @generated
	 */
	HostIdentityProtocol createHostIdentityProtocol();

	/**
	 * Returns a new object of class '<em>Shim6 Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shim6 Protocol</em>'.
	 * @generated
	 */
	Shim6Protocol createShim6Protocol();

	/**
	 * Returns a new object of class '<em>Pad1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad1</em>'.
	 * @generated
	 */
	Pad1 createPad1();

	/**
	 * Returns a new object of class '<em>Pad N</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pad N</em>'.
	 * @generated
	 */
	PadN createPadN();

	/**
	 * Returns a new object of class '<em>Jumbo Payload</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jumbo Payload</em>'.
	 * @generated
	 */
	JumboPayload createJumboPayload();

	/**
	 * Returns a new object of class '<em>RPL Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPL Option</em>'.
	 * @generated
	 */
	RPLOption createRPLOption();

	/**
	 * Returns a new object of class '<em>Tunnel Encapsulation Limit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tunnel Encapsulation Limit</em>'.
	 * @generated
	 */
	TunnelEncapsulationLimit createTunnelEncapsulationLimit();

	/**
	 * Returns a new object of class '<em>Router Alert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Router Alert</em>'.
	 * @generated
	 */
	RouterAlert createRouterAlert();

	/**
	 * Returns a new object of class '<em>Quick Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quick Start</em>'.
	 * @generated
	 */
	QuickStart createQuickStart();

	/**
	 * Returns a new object of class '<em>Calipso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calipso</em>'.
	 * @generated
	 */
	Calipso createCalipso();

	/**
	 * Returns a new object of class '<em>Smf Dpd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smf Dpd</em>'.
	 * @generated
	 */
	SmfDpd createSmfDpd();

	/**
	 * Returns a new object of class '<em>Home Adress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Home Adress</em>'.
	 * @generated
	 */
	HomeAdress createHomeAdress();

	/**
	 * Returns a new object of class '<em>Deprecated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deprecated</em>'.
	 * @generated
	 */
	Deprecated createDeprecated();

	/**
	 * Returns a new object of class '<em>End Point Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point Identification</em>'.
	 * @generated
	 */
	EndPointIdentification createEndPointIdentification();

	/**
	 * Returns a new object of class '<em>ILNP Nonce</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ILNP Nonce</em>'.
	 * @generated
	 */
	ILNPNonce createILNPNonce();

	/**
	 * Returns a new object of class '<em>Line Id Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Id Option</em>'.
	 * @generated
	 */
	LineIdOption createLineIdOption();

	/**
	 * Returns a new object of class '<em>MPL Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MPL Option</em>'.
	 * @generated
	 */
	MPLOption createMPLOption();

	/**
	 * Returns a new object of class '<em>RFC3692 Experiment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RFC3692 Experiment</em>'.
	 * @generated
	 */
	RFC3692Experiment createRFC3692Experiment();

	/**
	 * Returns a new object of class '<em>Ip Add Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ip Add Spec</em>'.
	 * @generated
	 */
	IpAddSpec createIpAddSpec();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>RSVP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RSVP</em>'.
	 * @generated
	 */
	RSVP createRSVP();

	/**
	 * Returns a new object of class '<em>MLD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MLD</em>'.
	 * @generated
	 */
	MLD createMLD();

	/**
	 * Returns a new object of class '<em>IPv6 Performance Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IPv6 Performance Diagnostic</em>'.
	 * @generated
	 */
	IPv6PerformanceDiagnostic createIPv6PerformanceDiagnostic();

	/**
	 * Returns a new object of class '<em>Source Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Route</em>'.
	 * @generated
	 */
	SourceRoute createSourceRoute();

	/**
	 * Returns a new object of class '<em>Nimrod</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nimrod</em>'.
	 * @generated
	 */
	Nimrod createNimrod();

	/**
	 * Returns a new object of class '<em>Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type2</em>'.
	 * @generated
	 */
	Type2 createType2();

	/**
	 * Returns a new object of class '<em>RPL Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPL Source</em>'.
	 * @generated
	 */
	RPLSource createRPLSource();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	Segment createSegment();

	/**
	 * Returns a new object of class '<em>Unassigned</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unassigned</em>'.
	 * @generated
	 */
	Unassigned createUnassigned();

	/**
	 * Returns a new object of class '<em>RFC3692 Experiment1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RFC3692 Experiment1</em>'.
	 * @generated
	 */
	RFC3692Experiment1 createRFC3692Experiment1();

	/**
	 * Returns a new object of class '<em>RFC3692 Experiment2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RFC3692 Experiment2</em>'.
	 * @generated
	 */
	RFC3692Experiment2 createRFC3692Experiment2();

	/**
	 * Returns a new object of class '<em>Reserved</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reserved</em>'.
	 * @generated
	 */
	Reserved createReserved();

	/**
	 * Returns a new object of class '<em>Discard Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discard Drop</em>'.
	 * @generated
	 */
	DiscardDrop createDiscardDrop();

	/**
	 * Returns a new object of class '<em>Discard Reject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discard Reject</em>'.
	 * @generated
	 */
	DiscardReject createDiscardReject();

	/**
	 * Returns a new object of class '<em>DFF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFF</em>'.
	 * @generated
	 */
	DFF createDFF();

	/**
	 * Returns a new object of class '<em>Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Policy</em>'.
	 * @generated
	 */
	Policy createPolicy();

	/**
	 * Returns a new object of class '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Filter</em>'.
	 * @generated
	 */
	Filter createFilter();

	/**
	 * Returns a new object of class '<em>Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet</em>'.
	 * @generated
	 */
	Packet createPacket();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LehoPackage getLehoPackage();

} //LehoFactory
