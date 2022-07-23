package basicjava;

public class forloop {
    public static void main(String args []){
int i;
        for(i=0; i<5; i++){
    System.out.println(i);
}

for(i=0;i<10; i=i+2){
    System.out.print(i);
}
for(i=-1; i<=10; i=i+2){
    System.out.println(i);
}

   

// break loop 

for(i=0;i<10;i++){
    if(i==4){
        continue; //break stops the loop  // continue skips i.e 4 (number)
    }
    System.out.print(i);
}
}
    
}
