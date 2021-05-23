import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println("uniqueValues"+ whatever("Ab3b33"));
     }
     /*
* Write a function that returns an array or list of the duplicate characters in a given string. 
*
* For example:
* input: "AbA"     output: ["A"]
* input: "Ab3"     output: []
* input: "Ab3b33"  output: ["b", "3"]
*/


    public static Set<Object> whatever(String input) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        char[] ch = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            
           map.put(i, input.charAt(i));
        }
        
        Set<Object> uniqueValues = new HashSet<Object>(map.values());
    
        return uniqueValues;
    }
}
