public class Linkedlist
{
    static Node previous = null;
    static Node current = null;
    static Node first = null;
    public static void insert ( int data )
    {
   	 Node temp = new Node();
   	 temp.data = data;
   	 temp.next = null;
   	 
   	 if( first == null )
   	 {
   		 first = temp;
                 return;
   	 }
   	 else{
   		 current = first;
   		 while ( current != null && current.data < temp.data )
   		 {
   		      previous = current;
   		      current = current.next;
   		  }
   	 }
   	 
   	 //inserting first
	 if( current == null && previous == null && first != null )
   	 {
   		 temp.next = first;
   		 first = temp;
   		 return;
   	 }
   	 
   	 if( current != null && previous == null )
   	 {
   		 temp.next = current;
   		 first =temp;
   	 }
   	 
   	 //inserting at middle
   	 
   	 if( previous != null && current != null )
   	 {
   	      previous.next = temp;
   	      temp.next = current;
   	      return;
   	 }
   	 
   	 //inserting at end
   	 
   	 if( current == null && previous != null )
   	  {
   		 previous.next = temp;
   		 temp = current;
   		 return;
   	 }
   	 
    }
   public static void deleteFirst()
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
    public static void deleteLast(){
         if(current.next!=null)
         {
            return;
         }
   	 Node temp=previous;
   	 previous=previous.next;
   	 previous.next=null;
   	 temp=null;
    }
    
    public static void deleteMiddle(){
         if(previous.next==null)
         {
         	return;
         }
         Node temp=previous.next;
   	 previous.next = current.next;
         current.next = null;
         current = null;
         
    }
 	  
    public static void display()
     {
   	 Node traverse = first;
   	 while ( traverse != null )
   	 {
   		 System.out.println( traverse.data );
   		 traverse = traverse.next;
   	 }
   	 
     }
    
    public static void main ( String[] args)
    {
   	 Linkedlist.insert(1);
   	 Linkedlist.insert(0);
   	 Linkedlist.insert(6);
   	 Linkedlist.insert(2);
   	 Linkedlist.insert(4);
   	 
   	 Linkedlist.deleteMiddle();
   	 
   	 //Linkedlist.deleteLast();
   	 
   	 Linkedlist.display();
    }
}

class Node
{
    int data;
    Node next;
}




