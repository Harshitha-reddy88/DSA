public class Main
 {
    public static void main(String[] args)
     {
        int[] arr={1,2,3,4};
        int length=4;
        int i=0;
        int j=i+1;
        System.out.println(arraySorting(arr,length,i,j));
     }
     public static String arraySorting(int[] arr, int length, int i, int j)
     {
         if(j==length)
         {
            return "sorted";
         }
         if(arr[i] >arr[j])
         {
            return "not sorted";
         }
         return arraySorting(arr,length,++i,++j);
     } 
 }
