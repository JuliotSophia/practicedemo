public class primenumber {
  public static void main(String args[]) {
      int n =5 ;
      int s;
      int t = 0;
      for (int i = 2; i <= n/2; i++) {
          s = n % i;
          if (s == 0) {
             t=1;
          }
      }
          if (t== 0) {
              System.out.println(n + " " + "is a prime number");
          } else {
              System.out.println(n + " " + "is  not a prime number");
          }
      }
  }

