class recpalindrome
{
public static String reverseStringRec(char[] varchar,int start,int end)
{
if(start >= end)
{
return new String(varchar);
}
char temp = varchar[start];
varchar[start] = varchar[end];
varchar[end] = temp;
return reverseStringRec(varchar,start+1,end-1);
}
public static void main(String[] args)
{
String str = "madam";
char[] varchar = str.toCharArray();
int start = 0;
int end = varchar.length-1;

String bag = reverseStringRec(varchar,start,end);
System.out.println(bag);
if(bag.equals(str))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}
