import java.util.Scanner;

public class Fact{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a num ");
    int num=sc.nextInt();
    int fact=factorial(num);
    if(fact<=-1){
        System.out.println("didn't found factorial");
    }
    else{
        System.out.println("factorial is " + fact );
    }
    
}
   public static int factorial(int num){
    if(num<=-1){
        return -1;
    }
    if(num<=1){
        return 1;
    }
    else{
        return factorial(num-1)*num;
    }
   }
}