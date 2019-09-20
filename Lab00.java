public class Lab00
{
   public static void main(String[] args)
   {
      // declaring and initializing some variables
      int x = 5;
      String y = "hello";
      double z = 9.8;

      // printing the variables
      System.out.println("x:" + x + ", " + "y:" + y + ", " + "z:" + z);

      // array in Java
      int[] nums = {3, 6, -1, 2};
      for (int val : nums)
         System.out.println(val);

      // call a function
      int numFound = char_count(y, '1');
      System.out.println("Found: " + numFound);
   
   }
   // function here
   public static int char_count(String s, char c)
   {
      int count = 0;
      for (int i = 0; i < s.length(); i++)
         // work on this part
         if (ch == c) {
            count += 1;
         }
         return count;  

   }

}
