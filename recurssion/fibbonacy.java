// 4) calculate the nth fibbonacci number using recursion
public class Main
 {
   public static void main(String[] args)
    {
       int range=20;
       int a=0;
       int b=1;
       System.out.println(a);
       System.out.println(b);
       fibonacySeries(range,a,b);
    }
   public static void fibonacySeries(int range,int a,int b)
    {
       if(a+b > range)
        {
          return;
        }
        System.out.println(a+b);
        fibonacySeries(range,b,a+b);
    }
 }
