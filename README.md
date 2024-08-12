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
### Packets
Packets are read from a text input file and the accepted one are written in a text output file.
Each line of the file corresponds to a packet and has this form:
```
(time;port;packet_binary)
```
The input file while be first argument of run configurations.  
The output file while be second argument of run configurations.

### Ports
Ports are read from a text input file that play the role of the port oracle. It must be written this way:
```
inside_port -> output_file
```
one rule per line.  
The port oracle file will be the third argument of run configurations.

### Clock management 
The clock is set at 0 while the filtering policy hasn't begun. Then it is updated with the time of each arriving packet.

### Interruptions
At every arriving packet the time is updated. Before handling the packet the interruptions are executed if needed.

## Tooling

- interpretor
- debugger (TODO)
- syntax highlighting 
- auto completion
- validation (TODO)
- formatting (TODO)