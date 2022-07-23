package programs;
import java.util.Scanner;
public class inch_meter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inch value");
       double  inch = sc.nextDouble();
        double meters = inch*0.0254;
        System.out.println(meters+" "+"Meters");

    }
    
}
