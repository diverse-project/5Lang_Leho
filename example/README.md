Examples develloped below are written in $L^{EHO}$ that is made to describe policies according to the reccomendations of the [RFC9288](https://www.rfc-editor.org/info/rfc9288). This reccomendations are summarised in the table.

Three policies has been developed as example:
- [Default_RFC9288](./Default_RFC9288/) follow strictly the default recommendations of the RFC9288. It is an equivalent of [ipv6.gpfl](../5Lang_GPFL/example/IPv6-RFC9288/ipv6.gpfl);
- [Jumbograms_Flow_RFC9288](./Jumbograms_Flow_RFC9288/) allow the packets with subsequent payload to travel between two subnetworks following the recommendations of RFC 9288;
- [Lab_Network_RFC_9288](./Lab_Network_RFC9288/) follow the recommendations of RFC9288 when working on a laboratory network, accepting "Experimentation and testing packets.


| EH and associated Options                       | Default |               Deployments                |                 Network                  |
| ----------------------------------------------- | :-----: | :--------------------------------------: | :--------------------------------------: |
| Hop-by-Hop Options Header                       |    /    |                    /                     |                    /                     |
| - Pad1                                          |   Any   |                   Any                    |                   Any                    |
| - PadN                                          |   Any   |                   Any                    |                   Any                    |
| - Router Alert                                  |  None   |       Only RSVP, MLD, MRD and GIST       |                   None                   |
| - CALIPSO                                       |   Any   |                   Any                    |                 Only MLS                 |
| - SMF_DPD                                       |  None   |                   None                   |                   None                   |
| - RPL Option                                    |   Any   |                   Any                    |             Only RPL Router              |
| - Quick-Start                                   |   Any   |            Have to allow TCP             |                   Any                    |
| - (Deprecated)                                  |  None   |                   None                   |                   None                   |
| - RPL Option                                    |  None   |                   None                   |                   None                   |
| - MPL Option                                    |   Any   |                   Any                    |        Have to allow MPL networks        |
| - Endpoint Identification (Deprecated)          |  None   |                   None                   |                   None                   |
| - Jumbo Payload                                 |  None   |       Only if jumbograms required        |                   None                   |
| - IPv6 DFF Header                               |         |                                          |                                          |
| - RFC3692-style Experiment                      |  None   |             Allow if needed              |                   None                   |
| Routing Header                                  |    /    |                    /                     |                    /                     |
| - Source Route (DEPRECATED)                     |  None   |                   None                   |                   None                   |
| - Nimrod (DEPRECATED)                           |  None   |                   None                   |                   None                   |
| - Type 2 Routing Header                         |   Any   |                   Any                    |                   Any                    |
| - RPL Source Route Header                       |  None   |                   None                   |                   None                   |
| - Segment Routing Header (SRH)                  |   Any   |                   Any                    |                   Any                    |
| - Unassigned                                    |   Any   |                   Any                    |                   Any                    |
| - RFC3692-style Experiment 1                    |  None   |             Allow if needed              |                   None                   |
| - RFC3692-style Experiment 2                    |  None   |             Allow if needed              |                   None                   |
| - Reserved                                      |   Any   |                   Any                    |                   Any                    |
| Fragment Header                                 |   Any   |            Have to accept DNS            |                   Any                    |
| Encapsulating Security Payload                  |   Any   |           Have to accept IPsec           |                   Any                    |
| Authentication Header                           |   Any   |           Have to accept IPsec           |                   Any                    |
| Destination Options Header                      |    /    |                    /                     |                    /                     |
| - Pad1                                          |   Any   |                   Any                    |                   Any                    |
| - PadN                                          |   Any   |                   Any                    |                   Any                    |
| - Tunnel Encapsulation Limit                    |   Any   |          Have to accept tunnel           |                   Any                    |
| - IPv6 Performance and Diagnostic Metrics (PDM) |         |                                          |                                          |
| - (Deprecated)                                  |  None   |                   None                   |                   None                   |
| - Home Adress                                   |   Any   |        Have to accept Mobile IPv6        |                   Any                    |
| - Endpoint Identification (Deprecated)          |  None   |                   None                   |                   None                   |
| - ILNP Nonce                                    |   Any   |           Have to allow ILNPv6           |                   Any                    |
| - Line Identification Option                    |  None   |                   None                   |                   None                   |
| - RFC3692-style Experiment                      |  None   |             Allow if needed              |                   None                   |
| Mobility Header                                 |   Any   |        Have to accept Mobile IPv6        |                   Any                    |
| Host Identity Protocol                          |   Any   |            Have to accept HIP            |                   Any                    |
| Shim6 Protocol                                  |   Any   |           Have to accept Shim6           |                   Any                    |
| Use for experimentation and testing             |  None   |              Only if needed              |            Only lab networks             |
| Unkown IPv6 Extension Headers                   |   Any   | Discard will slow down other deployments | Discard will slow down other deployments |


001;60;
 

```
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|Version| Traffic Class | Flow Label                            | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
| Payload Length                | Next Header   | Hop Limit     | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|                                                               | 
+                                                               + 
|                                                               | 
+                     Source Address                            + 
|                                                               | 
+                                                               + 
|                                                               | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|                                                               | 
+                                                               + 
|                                                               | 
+                     Destination Address                       + 
|                                                               | 
+                                                               + 
|                                                               | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
| Next Header   | Hdr Ext Len   |   Option Type | Opt Data Len  | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
|Quick start    |        1      | Opt Data Len  |    PadN       |
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
```

```
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|   6   | Traffic Class | Flow Label                            | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
| Payload Length                |      0        | Hop Limit     | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|                                                               |
|                    2001:db8:abcd:0012::                       |
|                                                               | 
|                                                               | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|                                                               |
|                   2001:db8:abcd:0013::                        | 
|                                                               | 
|                                                               | 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
| 44            |    8          |       38       |       3      |
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
|Quick start    |        1      |        3       |    PadN      |
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
| 59            |    Reserved   | Fragment Offeset        |Res|M|
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
|Identification                                                 |
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+

```

```
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|0 1 1 0|0 0 0 0 0 0 0 0|0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0| 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0|0 0 0 0 0 0 0 0|0 0 0 0 0 0 0 0| 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 1 0 1 1 0 1 1 1 0 0 0|
|1 0 1 0 1 0 1 1 1 1 0 0 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0|
|0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0|
|0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0|
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|0 0 1 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 1 1 0 1 1 0 1 1 1 0 0 0|
|1 0 1 0 1 0 1 1 1 1 0 0 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 1|
|0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0|
|0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0|
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|0 0 1 0 1 1 0 0|0 0 0 0 1 0 0 0|0 0 1 0 0 1 1 0|0 0 0 0 0 0 1 1| 
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|0 0 0 0 0 0 0 0|0 0 0 0 0 0 0 1|0 0 0 0 0 0 1 1|0 0 0 0 0 0 0 0|
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+ 
|0 0 1 1 1 0 1 1|0 0 0 0 0 0 0 0|0 0 0 0 0 0 0 0 0 0 0 0 0|0 0|0|
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
|0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0|
+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
```