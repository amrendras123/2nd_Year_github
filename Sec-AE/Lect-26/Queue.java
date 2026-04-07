class Queue1{

   private int[] arr;
   private int front;
   private int size;
    Queue1(){
        arr=new int[5];
        this.front=0;
        this.size=0;
    };
    Queue1(int size){
        arr=new int[size];
        this.front=0;
        this.size=0;
    };
    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==arr.length;
    }
    public int size(){
        return this.size;
    }
    public void enqueue(int val)throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=val;
        this.size++;
    }
    public int dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int rv=arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        this.size--;
        return  rv;
    }
    public void display(){
        for(int i=0;i<size;i++){
            int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+"->");
        }
        System.out.println("*************************");
    }
}