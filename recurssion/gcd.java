public class Main
{
   public static void main(String[] args)
   {
      int num1=10;
      int num2=20;
      int i=1;
      int gcd=0;
      System.out.println(gcdOfNumber(num1,num2,gcd,i));
   }
   public static int gcdOfNumber(int num1,int num2,int gcd,int i)
   {
      if(i>num1 || i>num2)
      {
         return gcd;
      }
      if(num1%i==0 && num2%i==0)
      {
         return i;
      }
      return gcdOfNumber(num1,num2,gcd,++i);
   }
}
