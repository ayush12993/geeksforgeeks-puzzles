package dayoftheweek;

import java.time.Month;
import java.util.Scanner;

public class dayoftheweek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week,v1,cen,date,month,year,x,v2;String v3;
        System.out.println("Enter your date of birth in ddmmyy - ");
        System.out.println("Enter your century - ");
        cen = sc.nextInt();
        System.out.println("Enter your date - ");
        date = sc.nextInt();
        System.out.println("Enter your month - ");
        month = sc.nextInt();
        System.out.println("Enter your year - ");
        year = sc.nextInt();
        x= ((year/4)+year)%7;
        switch (month){
            case 1: v1=0; break;
            case 2: v1=3; break;
            case 3: v1=3; break;
            case 4: v1=6; break;
            case 5: v1=1; break;
            case 6: v1=4; break;
            case 7: v1=6; break;
            case 8: v1=2; break;
            case 9: v1=5; break;
            case 10: v1=0; break;
            case 11: v1=3; break;
            case 12: v1=5; break;
            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        System.out.println(v1);
        switch (cen){
            case 17: v2=4; break;
            case 18: v2=2; break;
            case 19: v2=0; break;
            case 20: v2=6; break;
            case 21: v2=4; break;
            case 22: v2=2; break;
            case 23: v2=0; break;
            default:
                throw new IllegalStateException("Unexpected value: " + cen);
        };
        System.out.println(v2);
        week = (x+v1+v2+date)%7;

        switch (week){
            case 0: v3="Sunday"; break;
            case 1: v3="Monday"; break;
            case 2: v3="Tuesday"; break;
            case 3: v3="Wednesday"; break;
            case 4: v3="Thrusday"; break;
            case 5: v3="Friday"; break;
            case 6: v3="Saturday"; break;
            default:
                throw new IllegalStateException("Unexpected value: " + cen);
        };
        System.out.println(date+"/"+month+"/"+cen+year+" is "+v3);
    }
}
