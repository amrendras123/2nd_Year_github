public class Stack {

    private int[] arr;
       private int tos;
       Stack(){
        arr=new int[5];
        tos=-1;
       };
       Stack(int size){
        this.arr=new int[size];
        this.tos=-1;
       }
    public boolean isEmpty(){
        return tos==-1;
    }
    public boolean isFull(){
        return tos==arr.length-1;
    }
    public void push(int val) throws Exception{
        if(isFull()){
            throw new Exception("Stack full hai");
        }
        tos++;
        arr[tos]=val;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack empty hai");
        }
        return arr[tos];
    }
    public int pop()throws Exception{
        if(isEmpty()){
         throw new Exception("Stakc empty hai");
        }
        return arr[tos--];
    }
    public int size(){
        return tos+1;
    }
    public void display(){
        for(int i=tos;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println("***************************");
    }

}
