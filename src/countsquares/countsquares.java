package countsquares;

import java.util.Scanner;

public class countsquares {
    public static void main(String[] args) {
        double z=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double q = 0;int A[];
          for (int i=1;i<n;i++){
            z =  Math.sqrt(i);
            int f = (int)z;
              q = z-f;
              if (q==0.0){
                  System.out.println(" perfect prime number "+(int)z);
              }}
        System.out.println("Number of elements are present in it - "+(int)(z));
    }}