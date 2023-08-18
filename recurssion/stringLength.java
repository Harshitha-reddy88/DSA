// 10) find the length of a string using recursion
public class lengthString
 {
     public static int LengthStr(String str,int i,int count)
      {
    	if(i == str.length())
    	{
           return count;
        }
   	return LengthStr(str,++i,++count);
   	 
      }
      public static void main(String[] args)
       {
    	String str="harshithaaaa";
    	int i=0;
    	int count=0;
    	System.out.println(LengthStr(str,i,count));
       }
 }
   	
