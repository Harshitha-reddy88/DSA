// 15) check if the given number is power of 2 or not
public class Main
{
  public static void main(String[] args)
  {
     int num=6;
     int product=1;
     System.out.println(powerTwo(num,product));
  }
  public static boolean powerTwo(int num,int product)
  {
     if(num==product)
     {
        return true;
     }
     if(product>num)
     {
        return false;
     }
     product=product*2;
     return powerTwo(num,product);
  }
}
