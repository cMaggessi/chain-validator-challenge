Chain Validator 

 
There are two kind of lists, each for a different type of values.  

First type: a list of one digit and two-digit numbers, 

second type: a list of words and single characters consist of a-z letters (only lower case).  

A list can either be of the first or second type, but not mixed with both. 

 

Multiple digits/letters objects have dependency on single digit/letters objects which are they consist of. For example, the number 24 is dependent on two objects: 2 and 4, the word “aba” is dependent on two objects: “a” and “b”.  

 

Write java code for the following: 

Implement a method boolean validate(List<Node> nodes) which will determine if a chain is valid, such that multi characters dependency is satisfied by other single characters numbers in the list. Same method should work for both kind of Node types. 

 

The class/interface Node is yours to implement. Class should represent the two types of data. Implement the class in a way that will help you implement the validate method.  

 

You can add additional classes as you wish.  

 

Examples: 

Valid chain: 36, 6, 24, 4, 47, 7, 2, 3, 27    

Valid chain: “p”, “aba”, ”a”, ”b”, “perso”, “o”, “r”, “e”, “s” 

Not valid chain: 35, 5, 65, 6, 24, 4, (number 2 is missing).  

You don’t have to take care of: “a”, 5, “asd” (or any mixed values list). 

 

Pointers: 

Give a correct answer. 

Write generic and easy to modify code. 

Consider time complexity. 

 


Complete the following: 

package com.personetics.test; 

//Node can be class or interface 
public interface/class Node { 

//TODO: implement class 

} 

 

package com.personetics.test; 
 
public class ChainValidator { 
 
    boolean validate(List<Node> nodes) { 
        //TODO: implement method 
    } 
} 

 

 
