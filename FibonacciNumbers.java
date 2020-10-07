/**
 *
 * @author Ceyda Dereci
 * @date October 8st 2020
 */
public class FibonacciNumbers{
   public static void main(String[] args){
      //instance
      IntBag intBag = new IntBag();
      
      intBag.add(0);
      intBag.add(1);
     
      //add first 40 Fibonacci numbers 
      for(int i = 0; i < 39; i++)
         intBag.add(intBag.getValue(i) + intBag.getValue(i + 1));
      
      System.out.println(intBag.toString());
      
   }
}