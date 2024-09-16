# Language Extension Header and Options

$LEHO$ is a language designed as a specialisation of [GPFL](https://github.com/diverse-project/5Lang_GPFL/tree/67140a90ba70a2b6b9d66454a4ccca9c28460c9f). It enables the definition of policies solely based on the values of particular IPv6 fields. It has been speciffcaly made to write filtering policies according to [RFC9288](https://www.rfc-editor.org/rfc/rfc9288) named "Recommendations on the Filtering of IPv6 Packets Containing IPv6 Extension Headers at Transit Routers".

The model is in [plugins/model](./plugins/fr.inria.diverse.melanger.leho/model/leho%20class%20diagram.jpg).  
For example of filtering policy go to [example](./example/).

## Language

Terminals are shown in bold font and nonterminals in italics. Literal characters are given in single quotes. Parentheses `(` and `)` indicate grouping when needed. Square brackets `[` and `]` enclose optional items. Vertical bars `|` separate alternatives.

||||
|-|-|-|
|policy|:|[*configuration*] [*filter*]|
|configuration|:|**'discard'** **'='** (**'reject'** \| **'drop'**)|
|filter|:|*rule* [*filter*]|
|rule|:|*action* *extension_header* [**'from'** *IP_ADDRESS* **'to'** *IP_ADDRESS*]|
|action|:|**'allow'**|
||\||**'drop'**|
||\||**'reject'**|
||\||**'discard'**|
||\||**'limit'** **'rate'** **'to'** *unit* **'/'** *time*|
|unit|:|**'b**\|**'o'**\|**'p'**|
|time|:|**'s'**\|**'m'**\|**'h'**\|**'d'**|
|extension_header|:|**'hop-by-hop'** [**'where'** **'option'** **'='** *option_hop_by_hop* [*option_hop_by_hop_list*]]|
||\||**'host-identity-protocol'**|
||\||**'experimentation-testing'**|
||\||**'encapsuling-security-payload'**|
||\||**'unkown'**|
||\||**'destination-option'** [**'where'** **'option'** **'='** *option_destination* [*option_destination_list*]]|
||\||**'shim6-protocol'**|
||\||**'authentification-header'**|
||\||**'fragment-header'**|
||\||**'mobility-header'**|
||\||**'routing-header'** [**'where'** **'type'** **'='** *type_routing* [*type_routing_list*]]|
|option_hop_by_hop_list|:| **'and'** **'option'** **'='** *option_hop_by_hop* [*option_hop_by_hop_list*]|
|option_hop_by_hop|:|**'calipso'** \| **'mpl-option'** \| **'jumbo-payload'** \| **'rpl-option'** \| **'smf-dpd'** \| **'dff'** \| **'quickstart'** \| *common_options*|
||\||**'router-alert'** [**'where'** **'protocol'** **'='** (**'mld'** \| **'rsvp'**)]|
|option_destination_list|:|**'and'** **'option'** **'='** *option_destination* [*option_destination_list*]|
|option_destination|:|**'home-address** \| **'ilnp-nonce'** \| **'line-id-option'** \| **'ipv6-performance-diagnostic'** \| **'tunnel-encapsulation-limit'** \| *common_options*|
|common_otptions|:|**'pad1'** \| **'padN'** \| **'deprecated'** \| **'endpoint-id'** \| **'rfc3692-experiment'**|
|type_routing_list|:|**'and'** **'type'** **'='** *type_routing* [*type_routing_list*]|
|type_routing|:|**'source-route'** \| **'unassigned'** \| **rfc3692-experiment_1** \| **'rfc3692-experiment-2** \|**'nimrod'** \| **'rpl-source'** \| **'reserved'** \| **'segment'** \| **'type2'**|

### Actions

Multiple actions can be done on a packet:
- `allow`, allow the packet to be judged by the other rules ;
- `drop`, drop the packet ;
- `reject`, drop the packet and send a message to the sender (*not implemented*) ;
- `discard`, apply the action as indicated in the configuration ;
- `limit rate to`, drop packets that exceed the rate, allow otherwise ;
  - the rate can be expressed thanks to different units:
    - `b`, bits,
    - `o`, octets,
    - `p`, packet,
  - and different time:
    - `s`, second,
    - `m`, minutes,
    - `h`, hours,
    - `d`, days.

If no actions are triggered before the end of the policy, the packet is allowed.

### Extension Headers and Options

This DSL is specialised to address the specific problem of filtering IPv6 packets based on the recommendations of [RFC9288](https://www.rfc-editor.org/rfc/rfc9288).
This RFC recommends to filter packets based on their extension header and associated options. $LEHO$ contains a key word for each extension headers, options and other specificities evoked in [RFC9288](https://www.rfc-editor.org/rfc/rfc9288).

## Simulator
The simulator use three configurations file to emulate the incoming packets, outgoing packets and the configuration of the port on the transit router.
It also simulate the clock of a transit router.

### Packets
The flow of packet is simulated thanks to a yaml file named `input-dataset.yaml` that described the properties of each packets arriving on the transit router. Each packet is described by three fields:
- `time` the time it arrived in the transit router
- `port` the port by which it arrived
- `content` it's content as a string of bits
It takes this format:
```
---
time: 2
port: 80
content: 00001010
```

### Ports
Ports are created from a yaml configuration file named `ports_config.yaml`. A transit router is composed of two sides, the inside of the local network and the outside. Each side is composed of ports that transmit packets to another specific port if the packet is accepted. In the configuration file a port is designated by:
- `number` its number 
- `port` the port where it will redirect packet if accepted
- `side` the side on which the port is physically on the transit router
It takes this format:
```
---
number: 80
out: 40
side: inside
```

### Clock management 
To simulate the clock, packets are defined with their arrival time. Before the start of the simulation the is set to 0, it is then updated with the arrival of each packets.

### Interruptions
At every arriving packet the time is updated. Before handling the packet the interruptions are executed if needed.


## Tooling

- interpretor
- debugger (TODO)
- syntax highlighting 
- auto completion
- validation (TODO)
- formatting (TODO)
