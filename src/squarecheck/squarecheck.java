package squarecheck;

import java.util.Scanner;

public class squarecheck {
    public static void main(String[] args) {
        int x1,x2,y1,y2,x3,y3,x4,y4,x,y;
        Scanner sc =new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        x = (x1-x3)+(x2-x4);
        y = (y1-y3)+(y2-y4);
        System.out.println(x+"x"+y);
        if (x==0 && y==0){
            System.out.println("Yes it,s a square");
        }else {
            System.out.println("No! it,s not a square");
        }
    }
}
