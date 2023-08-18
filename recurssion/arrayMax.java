// 13) find the maximum element in an array 
public class Main
 {
     	public static void main(String[] args)
      	{
         	int[] arr={10};
         	int max=arr[0];
         	int i=0;
        	System.out.println(maxArray(arr,max,i));
      	}
      	public static int maxArray(int[] arr, int max,int i)
       	{
       		if(i == arr.length)
       		{
       			return max;
       		}
       		
       		else if(max < arr[i])
          	{
          	  	max=arr[i];
           
          	}
          	return maxArray(arr,max,++i);
       	}
 }
 
 
