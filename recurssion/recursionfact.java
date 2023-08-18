// 4) calculate the factorial of a positive number  
 
public class Main{
    public static void main(String[] args){
        int num=5;
        int fact=1;
        System.out.println(factorial(num,fact));
    }
    public static int factorial(int num,int fact){
        if(num==0 || num==1){
            return fact;
        }
        fact=fact*num;
        return factorial(--num,fact);
    }
}


