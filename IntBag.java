/**
 *
 * @author Ceyda Dereci
 * @date October 8st 2020
 */

import java.util.Arrays;

public class IntBag{
   
   //Properties
   private int[] bag;
   
   //Constructor
   public IntBag() {
    bag = new int[4];
    Arrays.fill(this.bag, -1);
  }
   
   
   //Methods
   
   /*
    * this method add the input value to the end of the array
    * @param int value 
    * @return int[]
    */
   public int[] add(int value){
      boolean hasSpace = false;
      for(int i = 0; i < bag.length && !hasSpace; i++){
         if(bag[i] == -1){
            bag[i] = value;
            hasSpace = true;
         }
      }
      if(hasSpace == false){
         bag = Arrays.copyOf(bag, bag.length + 1);
         bag[bag.length - 1] = value; 
      }
      return this.bag;
   }
   
   /*
    * this method add the input value at a particular index of the array
    * if the array do not have room its size is doubled
    * @param int value
    * @param int particular index i
    * @return 
    */
    public void addThisLoc(int value, int index){
       boolean hasSpace = false;
       int prevSize = this.bag.length;
       for(int i = 0; i < bag.length ; i++){
          if(bag[i] == -1)
             hasSpace = true;
       }
       if(hasSpace == false){
          bag = Arrays.copyOf(bag, bag.length * 2);
          for (int i = bag.length - 1; i >= prevSize; i--) {
             bag[i] = -1;
          }
       }
       this.bag[index] =  value;
   }
   
   /*
    * this method remove the value at given index
    * the last value of the array will be placed at the given index
    * @param int given index 
    */
   public void remove(int index){
      int count;
      count = 0;
      if(index < bag.length && index >= 0){
         for(int i = bag.length - 1; i >= 0; i--){
            if(bag[i] != - 1){
               count = i;
               break;
            }    
         }
         bag[index] = bag[count];
         bag[count] = -1;
         bag = Arrays.copyOf(bag, bag.length -1); 
      }
      else
         System.out.println("Index is out of boundries!");
     
   }
   
   
   /*
    * this method checks that if array has the input value x
    * @param int x 
    * @return boolean true or false
    */
   public boolean containsX(int x){
      boolean found;
      found = false;
      for(int i = 0; i < bag.length; i++){
         if(bag[i] == x)
            found = true; 
      }
      return found;
   }
   
   /*
    * @return string representation of the array
    */
   public String toString(){
      String text = "[ ";
      for(int i = 0; i < bag.length; i++)
         text += bag[i] + " ";
      text += "]";
      return text;
   }
   /*
    * @return size of the array
    */
    public int size(){
      return this.bag.length;
   }
    
   /*
    * @param int location desired
    * @return int the value for the specific location
    */
   public int getValue(int location){
      return this.bag[location];
   }
   
   /*
    * removeAll 
    * @param int value
    */
     public void removeAll(int value){
        for(int i = 0; i < bag.length ; i++){
           if(bag[i] == value){
              this.remove(i);
           }
        }
     }
   
}