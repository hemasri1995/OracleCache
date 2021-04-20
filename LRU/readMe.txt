Cache Implementation by Hema sri Kambhampati
----------------------------------------------------------

Project Structure:

1: src folder contains 2 java files
		|
		|--> LRUCache.java (Cache  Implementation source code)
		|  
		|--> Tests.java (Tests using Junit)
	
LRUCache.java:
-------------
LRUCache class is to implement Cache to store key value pairs where keys are Integer type and values are Strings.
I have written this module in Java using LinkedHashMap imported from collections framework and LRU (Least recently used) cache technique. 

The reason behind using LRU cache technique is to implement a cache which deletes the oldest item when the cache size is full ensuring new data is available.

LRUCache.java has a main method to test with an example.
To execute the sample example, Run the LRUCache.java 
or to execute in command prompt

	> javac LRUCache.java
	> java LRUCache

Tests.java:
-----------
Basic functional level testing using JUnit
----------------------------------------------------------
Requirements:

Java version 1.8
Junit
----------------------------------------------------------

Sample example:

Incoming data: (key, value pairs)	        
	        1, "Oracle"
	        2, "Siebel"
	        3, "Netsuite"
	        1, "Oracle"
	        4, "Hyperion"
	        5, "People Soft"
	        
Cache size: 4

Expected Output based on LRU cache:
			3   Netsuite 
			1   Oracle 
			4   Hyperion 
			5   People Soft  
---------------------------------------------------------

Algorithm Analysis:
-------------------
Complexity of the algorithm for inserting an element - O(1) with LinkedHashMap 
Complexity of the algorithm for fetching an element - O(1) i.e constant time to fetch an algorithm with hashing technique.

 
 
