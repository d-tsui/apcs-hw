- What is the difference between the HashMap and HashSet (or the TreeMap and TreeSet)
Maps store key-value pairs, Sets only store keys.

- Internally, how is a HashMap implemented
Key-value pairs are not necessarily in order.

- Internally, how is a TreeMap implemented
Key-value pairs are sorted.

- Write code to try to do a speed comparison between HashMaps and TreeMaps.
Test Size: 1,000,000

HashMap
Add - 363
Get - 69
Remove - 73

TreeMap
Add - 503
Get - 136
Remove - 206

- Java has a built in Heap data structure but it's not named Heap
What is it
PriorityQueue