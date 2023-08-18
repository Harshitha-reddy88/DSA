public class Main
 {
 	public static void main(String[] args)
 	 {
 	 	int num=22;
 	 	int sum=0;
 	 	int num1=0;
 	 	System.out.println(sumofDigits(num,sum));
 	 }
 	 public static int sumofDigits(int num,int sum)
 	 {
 	 	if(num == 0)
 	 	{
 	 		return 0;
 	 	}
 	 	else
 	 	{
 	 		sum=sum+num % 10 + num /10;
 	 		return sum;
 	 	}
 	 	
 	 }
 }
