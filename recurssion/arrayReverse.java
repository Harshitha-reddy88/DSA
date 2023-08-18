// print the elements of an array in reverse order by using recursion
public class Main
 {
   public static void main(String[] args)
    {
       int[] arr = {1,3,1,2};
       int start = 0;
       int end = arr.length - 1;
       reverElement(arr, start, end);
    }
   public static void reverElement(int[] arr, int start, int end)
    {
      if (start <= end)
       {
          System.out.println(arr[end] + " ");
          reverElement(arr, start, end - 1);
       }
    }
}

