package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
            try{
                if(n<0)
                  throw new ArithmeticException("NUmber invalid");
              }
              catch(Exception e)
              {
                System.out.println("Number not valid");
              }
    String s="";
            while(n!=0)
            {
                s = Integer.toString(n%2)+s;
                n=n/2;
            }
        
            return s;
  }
}
