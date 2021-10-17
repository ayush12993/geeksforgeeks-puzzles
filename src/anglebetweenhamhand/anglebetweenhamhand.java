package anglebetweenhamhand;

import java.util.Scanner;

public class anglebetweenhamhand {
    public static void main(String[] args) {
        int h,m;
        double ha,ma;
        Scanner sc = new Scanner(System.in);
        h= sc.nextInt();
        m= sc.nextInt();
        ha= (h*60+m)*0.5;
        ma= m*6;
        int t = (int) ((int) Math.abs(ha-ma));
        t=Math.min(360-t,t);
        System.out.println(ha+" "+ma+" "+t+" ");
    }
}
