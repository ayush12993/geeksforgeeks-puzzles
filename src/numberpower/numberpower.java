package numberpower;

import java.util.Scanner;

public class numberpower {
    public static void main(String[] args) {
        double x,y;
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        y= sc.nextInt();
        if (numbpow(x,y)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
    public static boolean numbpow(double x,double y){
        int res1 = (int)Math.log(y)/(int)Math.log(x);
        double res2 = Math.log(y)/(int)Math.log(x);

        return res1==res2;
    }
}
