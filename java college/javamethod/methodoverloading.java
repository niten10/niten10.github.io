package javamethod;
public class methodoverloading {
    // we can use same method nament uil and unless  the number and/or type of parameters are different. 
  static int samemethod(int x , int y){
    return x+y;
  }
    static double samemethod(double x , double y){
        return x+y;

    }
    public static void main(String args[]){
        int num1 = samemethod(3,3);
        double num2 = samemethod(1.5,1.5);
        System.out.println(num1);
        System.out.println(num2);
        
    }
}