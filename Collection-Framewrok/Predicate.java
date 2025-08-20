public class Predicate{
  public static void main(String args[]){
  // Predicate --> functional interface (boolean valued function)
  Predicate<Integer> isEven = x -> x%2 == 0;
  System.out.println(isEven.test(4);  // true

  Predicate<String> isWordStartsWithA = x -> x.LowerCase() .startsWith("a");
  Predicate<String> isWordEndWithT =  x -> x.LowerCase() .endsWith("t");
 
  String word = "Ant";

 System.out.println("Starts with 'a'? " + startsWithA.test(word)); // true
 System.out.println("Ends with 't'? " + endsWithT.test(word));     // true

  // Combine predicates
  Predicate<String> startsWithAAndEndsWithT = startsWithA.and(endsWithT);
  System.out.println("Starts with 'a' AND ends with 't'? " + startsWithAAndEndsWithT.test(word)); // true

  Predicate<String> startsWithAOrEndsWithT = startsWithA.or(endsWithT);
  System.out.println("Starts with 'a' OR ends with 't'? " + startsWithAOrEndsWithT.test("Boat")); // true
  
  }
}
  
