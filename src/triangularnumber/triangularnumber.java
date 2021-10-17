package triangularnumber;

import java.util.Scanner;

public class triangularnumber {
    public static void main(String[] args) {
     int n,i,p=0,t=0,q=1,r=0,d=0;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (i=1;i<n;i++){
            t=n-i;
            //System.out.println(t+"="+n+"-"+i);
            r=i;
            n=t;
                    }
       // System.out.println(t+""+r);
        if ((t-r)==1){
            System.out.println(1);
        }else {
            System.out.println(0);
        }


    }
}
