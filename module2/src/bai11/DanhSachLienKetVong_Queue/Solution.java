package bai11.DanhSachLienKetVong_Queue;

public class Solution {
    Queue queue= new Queue();
    void enQueue(int data){
        Node temp= new Node();
        temp.data=data;
        if (queue.front ==null){
            queue.front =queue.rear=temp;
        }else {
            queue.rear=temp;
        }
        queue.rear.link=queue.front;
        // và node rear luôn chứa địa chỉ của node front
    }
    void deQueue(){
        if (queue.front ==null){
            System.out.println("Null");
        }else {
            if (queue.front==queue.rear){
                queue.rear= queue.front=null;
            }else {
                //nếu không gán Front vào node liền sau, trỏ địa chỉ Front trong node Rear tới node Front mới trỏ.
                queue.front=queue.front.link;
                queue.rear.link=queue.front;

            }
        }
    }
     void displayQueue() {
        Node temp = queue.front;
        while (temp != queue.rear) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(queue.rear.data);
    }
}
