package javamethod;
public class mulpara {
    static void mulMethod( String fname, int rollno ){ //we can use multiple parameters using coma 
        System.out.println(fname+" "+ rollno + " " +"KIST");
    }
    public static void main(String args[]){
        mulMethod( "niten", 15);
        mulMethod( "prajwol", 19);
        mulMethod( "ahsirwad", 1);
    }
    
}
