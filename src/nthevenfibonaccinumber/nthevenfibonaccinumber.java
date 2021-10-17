package nthevenfibonaccinumber;

import java.util.Scanner;

public class nthevenfibonaccinumber {
    public static void main(String[] args) {
        int p,m=0,n=1,q = 0,j = 0;
        Scanner sn = new Scanner(System.in);
        p=sn.nextInt();
        System.out.println(evenFib(p));
    }
static long evenFib(int n){
        if (n<1)
            return n;
        if (n==1)
            return 2;
        return ((4*evenFib(n-1))+
                evenFib(n-2));
}
}
