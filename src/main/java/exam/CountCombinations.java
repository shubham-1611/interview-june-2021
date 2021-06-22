package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    
    static int count=0;
        public static void partition(int total, int k) {
            partition(total, k, "");
        }
        
        public static void partition(int n, int max, String prefix) {
            if (n == 0) {
                System.out.println(prefix);
                count++;
                return;
            }
            for (int i = Math.min(max, n); i >= 1; i--) {           
                partition(n - i, i, prefix + " " + i);
            }
        }
    System.out.println("Number of Ways are:" + count);
    
    
    return count;
  }

}
