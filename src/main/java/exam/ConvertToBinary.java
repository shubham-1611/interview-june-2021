package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    String s="";
            while(n!=0)
            {
                s = Integer.toString(n%2)+s;
                n=n/2;
            }
        
            return s;
  }
}
