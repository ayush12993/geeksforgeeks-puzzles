package squaresinamatrix;

import java.util.Scanner;

//one of the easiest puzzle

public class squaresinamatrix {
    public static void main(String[] args) {
        int z,t,q = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m - ");
        int m = sc.nextInt();
        System.out.println("Enter n - ");
        int n = sc.nextInt();
        if (m<=n){
            z= (m*(m+1)*(2*m+1))/6;
            System.out.println(z);
        }
        else if (n<=m){
            z= ((m*(m+1)*(2*m+1))/6)+((n-m)*m*(m+1)/2);
            System.out.println(z);
        }
    }
}
