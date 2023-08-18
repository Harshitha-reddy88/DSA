// 9) find the power of a number using recursion 
public class Main
 {
    public static void main(String[] args)
    {
       int num=8;
       int power=0;
       System.out.println(powerRec(num,power));
    }
    public static int powerRec(int num,int power)
    {
       if(num==0)
       {
          return power;
       }
       power=num*num;
       return power;
    }
 }
