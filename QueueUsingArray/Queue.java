public class Queue{
    int [] arr;
    int size;
    int rear=-1;
    Queue(int size){
        arr=new int[size];
        this.size=size;
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public void add(int data){
        if(rear==size-1){
            System.out.println("Queue is Full");
            return;
        }
        rear+=1;
        arr[rear]=data;
    }
    public int remove(){
        if(isEmpty()){
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[0];
    }
}