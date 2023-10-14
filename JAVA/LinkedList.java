// Create LinkedList ------- 
import java.util.List;

class LinkList{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    // Add element at first position.
    void addFirst(int e){
        Node temp = new Node(e);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }

    // Add element at last position.
    void addLast(int e){
        Node temp = new Node(e);
        if(head==null){
            head=temp;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }

    // Add element at any index.
    void add(int idx, int e){
        if(idx==0){
            addFirst(e);
        }
        else{
            Node temp = new Node(e);
            int count=0;
            Node curr = head;
            while(count<idx-1){
                curr=curr.next;
                count++;
            }
            temp.next=curr.next;
            curr.next=temp;
        }
    }


    // Delete first element.
    void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
        }
    }

    // Delete last element.
    void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    // Delete element of any index.
    void delete(int idx){
        if(idx==0){
            deleteFirst();
        }
        else{
            int count=0;
            Node curr = head;
            while(count<idx-1){
                curr=curr.next;
                count++;
            }
            curr.next=curr.next.next;
        }
    }


    // Print size of node.
    int size(){
        int count=0;
        Node curr = head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }


    // Print node.
    void print(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        Node curr = this.head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
         System.out.println();  
    }

}


public class LinkedList{
    public static void main(String args[]) {
        LinkList list = new LinkList();  
       
        list.addLast(15);
        list.addLast(30); 
        
        System.out.println(list.size());
        list.print();   
        
        list.add(2,20);
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);

        list.print();  
        list.delete(1);
        list.print();
        System.out.println(list.size());
    }
}   

/*Output---
2
15 30 
15 30 20 1 2 2 1 
15 20 1 2 2 1 
6                 */
