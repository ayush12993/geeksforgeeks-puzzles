package trailingzeroinafact;

import java.util.Scanner;

public class trailingzeroinafact {
    public static void main(String[] args) {
        int n=1, i, t = 0,p;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        for (i = 1; i <= p; i++) {
            t = n * i;
        //    System.out.println(t);
            n = t;
        }
      //  System.out.println(t+" ffd");
        long last =t%10;
        if (last ==0){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}