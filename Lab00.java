public class Lab00
{
   public static void main(String[] args)
   {
      // declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      // printing the variables
      System.out.println("x: " + x + " " + "y: " + y + " " + "z: " + z);

      // array in Java
      int[] nums = {3, 6, -1, 2};
      for (int val : nums) {
         System.out.println(val);
      }

      // call a function
      int numFound = char_count(y, 'l');
      System.out.println("Found: " + numFound);
  
      // a counting for loop
      for (int i = 1; i < 11; i++) {
         System.out.print(i + " ");
      }
 
   }
   // function here
   public static int char_count(String s, char c) {
      int count = 0;
      char[] chars = s.toCharArray();
      for (int i = 0; i < chars.length; i++) {
         if (chars[i] == c) {
            count ++;
         }

      }
      return count;
   }

}
