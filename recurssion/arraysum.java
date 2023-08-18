// 1) calculate the sum of all elements in an array using recursion
public class Main
 {
    public static void main(String[] args)
     {
        int[] arr={1,2,3,4};
        int sum=0;
        int i=0;
        int size=arr.length;
        System.out.println(arraySum(arr,sum,i,size));
     }
     public static int arraySum(int[] arr,int sum,int i,int size)
     {
        if(size==i)
        {
           return sum;
        }
        sum=sum+arr[i];
        return arraySum(arr,sum,++i,size);
     }
 }

