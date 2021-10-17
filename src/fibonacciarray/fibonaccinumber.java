package fibonacciarray;

import java.util.Scanner;

public class fibonaccinumber {
    public static void main(String[] args) {
        int p;
        Scanner sn = new Scanner(System.in);
        p=sn.nextInt();
        System.out.println(fibanocci(p));
    }
    static String fibanocci(int r){
        long m=0,n=1,q = 0;
        for (long i=2;i<=r;i++){
            q=m+n;
            m=n;
            n=q;
        }
        //System.out.println(q);
        long secondLast = (q%100)/10;
        long last =q%10;
        return secondLast+""+last;
    }
}
