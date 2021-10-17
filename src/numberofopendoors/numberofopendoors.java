package numberofopendoors;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class numberofopendoors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = (int) Math.sqrt(n);
        System.out.println(p);

    }
}
