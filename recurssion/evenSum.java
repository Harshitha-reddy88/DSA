// 12) find the sum of even numbers in an array using recursion.
class main
 {
   public static void main(String[]args)
   {
       int[]arr = {3,4,6,7,8};
       int num = 1;
       System.out.println(sumEven( arr,0,1));
   }
   public static int sumEven(int[] arr,int index, int num)
   {
      if(index == arr.length)
       {
         return num;
       }
      if(arr[index]%2==0)
       {
         num*=arr[index];
       }
       return sumEven(arr,index+1,num);
   }
}
