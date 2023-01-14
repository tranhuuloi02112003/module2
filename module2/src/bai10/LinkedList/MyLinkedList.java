package bai10.LinkedList;

import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    private Node head;
    private int numNodes = 0;


    public MyLinkedList() {
    }

    public int size() {
        return numNodes;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)) {
            return true;
        }
        return false;
    }

    public int inDexOff(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }
    public void addFirst(E e){
        Node temp=head;
        head=new Node(e);
        head.next=temp;
        numNodes++;

    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        //cho con trỏ chạy đến vt index-1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //holder tham chiếu đến index
        holder = temp.next;
        //node tại vt index-1 tham chiếu đến node mới
        temp.next = new Node(data);
        //node mới trỏ tới holder
        temp.next.next = holder;
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Object data;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        //nếu index=0 thì trả về data hiện tại và head mới là node kế típ
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            //nếu index>0 trỏ chạy đến index-1  
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                    temp=temp.next;
            }
            //data trỏ đến node index
            data=temp.next.data;
            //node index trỏ đến index+2
            temp.next=temp.next.next;
        }
        numNodes--;
        return (E) data;
    }
    public boolean remove(E e){
        if (head.data.equals(e)){
            remove(0);
            return true;
        }else {
            Node temp=head;
            //lặp đến hết ds
            while (temp.next!=null){
                //nếu tồn tại 1 pt có date = vs date truyền vào thì node đó sẽ trỏ đến node thứ 2 típ theo
                if (temp.next.data.equals(e)){
                    temp.next=temp.next.next;
                    numNodes--;
                    return true;
                }
                temp=temp.next;
            }
            return false;
        }
    }
    public MyLinkedList<E> clone(){
        if (numNodes==0){
            throw new NullPointerException();
        }
        //khai báo ds trả về
        MyLinkedList<E> temp= new MyLinkedList<>();
        //khai báo node trỏ đến heal
        Node tempNode=head;
        //add head vào ds trả về
        temp.addFirst((E)tempNode.data);
        tempNode= tempNode.next;
        while (tempNode!=null){
            temp.addLast((E)tempNode.data);
            tempNode=tempNode.next;
        }
        return temp;
    }





}
