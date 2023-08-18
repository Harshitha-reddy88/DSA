public class Main
 {
 	public static void main(String[] args)
 	{
 		int num=4;
 		System.out.println(naturalNumber(num));
 	} 
 	public static int naturalNumber(int num)
 	{
 		if(num<=0)
 		{
 			return 0;
 		}
 		else
 		{
 			return num+naturalNumber(num-1);
 		}
 	}
 }
