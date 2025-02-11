/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dllex2025;

/**
 *
 * @author muril
 */
public class MyDLL implements LinearListInterface {

    private Node head;
    private Node last;
    private Node curr;
    private int size; //we manually manage the size of our DLL

    public MyDLL() {
        //create the empty list
        head = null;
        last = null;
        size = 0;
        curr = head;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    private void setCurrent(int index) {
        //1 start at the head
        //2 move/loop along till you meet the index
        //set the one at that index to be curr
        curr = head; //setting up to start at the head and calling it curr
        for (int i = 1; i < index; i++) {
            curr = curr.getNext();
        }
    }

    @Override
    public Object get(int index) {
        setCurrent(index); //pass the index to the setCurrent() and it will set curr
        return curr;
    }
    
    @Override
    public void remove(int index){
        //head to be removed, last to be removed or curr/index
        
        if(index ){
            
        }
        
        size--;
    }
    
    @Override
    public void add(int index, Object element){
        //add at the head, end, insert into index somewhere
        if(index == 1){
            Node newNode = new Node(element, null, null);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }else if(index == (size + 1)){
            //insert at the end of DLL
            Node newNode = new Node(element, null, null);
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }else{
            setCurrent(index);
            Node newNode = new Node(element, null, null);
            newNode.setNext(curr);
            Node prev = curr.getPrev(); //set the prev ref
            newNode.setPrev(prev); //link to it
            prev.setNext(newNode); //adding in our node
            curr.setPrev(newNode); 
        }
        size++; //reminder!! to manually manage the size
    }
    


//    public void printList();

}
