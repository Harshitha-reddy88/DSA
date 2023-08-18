public class Queue 
 {
	static Node first = null;
	public static void queue(int data) 
         {
    		Node temp = new Node();
    		temp.data = data;
    		temp.next = null;
    		
    		// If there are no nodes in the queue 
    		if (first == null) 
    		
    		{
        		first = temp;
        		return;
        		
    		}
    		
    		// If there are nodes existing already
     		
     		Node traverse = first;
     
     		while(traverse.next != null)
    	        {
        		traverse = traverse.next;
    	        }

    	        traverse.next = temp;
     	}
     
	 public static void displayQueue() 
	 {
    		Node traverse = first;
    		while (traverse != null) 
    		{
        		System.out.println(traverse.data);
        		traverse = traverse.next;
    		}
	 }
	 
	 
	 public static void dequeue()
 	 {
    		if (first == null) 
    		
		{
        		return;
    		}
    		
    		Node temp = first;
    		first=first.next;
    		temp.next = null;
    		temp=null;
 	 }
 	 
   	public static void main(String[] args) 
   	{
    		for(int i=1; i<10; i++)
    		{
    		
    			Queue.queue(i);
    			
    		}
   
    	        Queue.dequeue();
    	        Queue.dequeue();
    	        Queue.dequeue();
    		Queue.displayQueue();
	}
 }
 
 class Node 
 {
	int data;
	Node next;
    
 }

