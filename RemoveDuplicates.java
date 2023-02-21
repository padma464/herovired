import java.util.*;
class Node
{
  int data;
  Node next;
  public Node(int data)
  {
    this.data=data;
    next=null;
  }
}
class removeduplicates
{
  public static void displaylist(Node head)
  {
     Node temp=head;
     while(temp.next!=null)
     {
        System.out.print(temp.data+"-->");
        temp=temp.next;
     }
     System.out.println(temp.data);
  }
  
 public static Node removeduplicatesele(Node head)
 {
     HashSet<Integer> hs=new HashSet<>();
     Node temp=head,prev=null;
     if(head==null)
       return null;
     if(head.next==null)
       return head;
     while(temp!=null)
     {
         int value=temp.data;
         if(!hs.contains(value))
          {
            hs.add(value);
            prev=temp;
            temp=temp.next;
          }
          else
          {
            prev.next=temp.next;
            temp=temp.next;
          }
     }
    return head;
 }

  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     Node head=null;
     int n=sc.nextInt();
     int ele;
     
     while(n-->0)
     {
        ele=sc.nextInt();
        Node list=new Node(ele);
        if(head==null)
             head=list;
        else
         {
            Node curt=head;
	    while(curt.next!=null)
	       curt=curt.next;
	    curt.next=list;
   
    }
}
displaylist(head);
head=removeduplicatesele(head);
displaylist(head);
}
}
