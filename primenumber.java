public class primenumber {
  public static void main(String args[]) {
      int n = 1;
      int s;
      int t = 0;
      for (int i = 2; i <= n; i++) {
          s = n % i;
          if (s == 0) {
             t++;;
          }
      }
          if (t== 0) {
              System.out.println(n + "" + "is a prime number");
          } else {
              System.out.println(n + "" + "is a notprime number");
          }
      }
  }

