import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    double s = 0, a = 0, R = 0, r = 6440.0, d = 0, cd = 0;
    String st;
    while(sc.hasNext()) {
      s = sc.nextDouble();
      a = sc.nextDouble();
      st = sc.nextLine();
      if (st.equals(" min")) {
        a = a / 60;
      }
      if (a > 180) {
        a = 360 - a;
      }
      R = r + s;
      a = Math.PI / 180 * (a);
      d = R * a;
      cd = Math.sqrt(2*R*R*(1-Math.cos(a)));
      System.out.printf("%.6f %.6f\n", d, cd);
    }
  }
}