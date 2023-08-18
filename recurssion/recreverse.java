// 2) Reverse a string using recursion

/* public class Main {
    public static void main(String[] args)
    {
        String str = "harshi";
        int start = 0;
        int end = str.length() - 1;
        int i = 0;
        String str1 = "";
        System.out.println(reverse(str,start,end,i,str1));
    }

    public static String reverse(String str, int start, int end, int i, String str1) {
        if (end<start)
         {
            return str1;
         }
       
        str1 = str1 + str.charAt(end);
       
        return reverse(str, start, end-1,i, str1);
    }
} */



public class Main {
	public static String reverse( String str , int i , int j, String bag ){
		 if(i > j){
		 	return bag;
	 	 }
	 	 bag=bag+str.charAt(j);
	 	 
	 	return reverse(str,i,j-1,bag);
	}
	public static void main(String[] args){
		 String str="harshitha";
		 int i=0;
		 int j = str.length()-1;
		 String bag = reverse(str,i,j,"");
		 System.out.println(bag);
       }
 }
	 
u
