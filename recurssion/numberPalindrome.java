public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = 121;
		if (numberPalindrome(num)) 
		{
			System.out.println("is a palindrom");
		} 
		else 
		{
			System.out.println("not a palindrom");
		}
	}
	public static boolean numberPalindrome(int num) 
	{
		String str="";
		str=str+num;
		return palindrome(str, 0, str.length() - 1);
	}
	public static boolean palindrome(String str, int start, int end) 
	{
		if (start >= end) 
		{		
			return true;
		} 
		else 
		{
			return (str.charAt(start) == str.charAt(end)) && palindrome(str, start + 1, end - 1);
		}
	}
}
