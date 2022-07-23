package programs;
import java.util.Scanner;

public class farenhit_celcius{
    public static void main (String args[]){
        System.out.println("enter the fahrenheit :" );
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsius = ((5*( fahrenheit-32.0))/9.0);
        Scanner ce =new Scanner(System.in);
        double celsi = ce.nextDouble();
        double farent = ((celsi*9)/5+(32) );
        System.out.println("the faharenhit " + fahrenheit + " " + "is"+" " +celsius +"celsius" );
        System.out.println("the celsius " + celsi + " " + "is" +" "+farent +" fahrenheit" );

    }
}