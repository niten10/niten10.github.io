package programs;

public class factorial_ricu {
    public static  int fact(int n){
        if(n==0 || n==1)
            return 1;
        else
           return(n*fact(n-1));
        }
    
    
    public static void main(String args[]){
        int factorial=1;

    int number = 5;
    factorial =fact(number);
    System.out.println(factorial);
    
    }
}    

