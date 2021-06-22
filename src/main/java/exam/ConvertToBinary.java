package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
             String s="";
            while(n!=0)
            {
                s = Integer.toString(n%2)+s;
                n=n/2;
            }
        
            return s;
  }
}
