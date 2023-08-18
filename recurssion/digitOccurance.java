/*public class Main{
    public static void main(String[] args){
        int num=179;
        System.out.println(digitsCount(num));
    }
    static int count=0;
    public static int digitsCount(int num){
        if(num>0){
            count++;
            digitsCount(num/10);
        }
        return count;
    }
    
}*/

public class Main
{
	public static void main(String[] args)
	{
		int num=114;
		int digit=4;
		System.out.println(digitCount(num,digit));
	}
	public static int digitCount(int num,int digit)
	{
		if(num==0)
		{
		   return 0;
		}
		else
		{
			int last=num % 10;
			if(last==digit)
			{
				return 1+digitCount(num /10 ,digit);
			}
			else
			{
				return digitCount(num / 10 ,digit);
			}
		}
	}
}

