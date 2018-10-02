public class SortedList {
	private DLNode Head, Tail;

   public void insert(double n){
      DLNode current = Head;
      DLNode previous = null;
      while(current!=null && current.data < n){
         previous = current;
         current = current.Next;         
      }
      DLNode node = new DLNode();
      node.data = n;
      node.Next = current;
      node.Prev = previous;
      
      if(previous == null){
         Head = node;
      } else{
            previous.Next = node;
            node.Prev = previous;
      }
      
      if(current != null){
         current.Prev = node;
         node.Next = current;
      }
      
	}

	public void listAscending() {
      DLNode current = Head;
      DLNode tmp = null;
      while(current != null){
         System.out.println(tmp.data);
         
         tmp = current.Next;
         current = Tail;
         
         
      }
	}

	public void listDescending() {
      DLNode tmp = Tail;
      
      while(tmp != null){
         System.out.println(tmp.data);
         tmp = tmp.Next;
      }
	}
}
