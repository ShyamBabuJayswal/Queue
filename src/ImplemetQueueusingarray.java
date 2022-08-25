//Queue uoeration
//enqueue ------ o(1)-----add
//dequeue-------o(n)-----remove
//pekk--------o(n)--------top element
// front  and rear be -1 if queue is empty
public class ImplemetQueueusingarray {
   static class queue{
  static     int arr[];
    static   int size;
       static int rear=1;
        queue( int n){
            arr=new int[size];
            this.size=n;

        }
        // for check queue is empty
        public static boolean isempty(){

            return rear==-1;
        }
        //Enqueue
       public static void add(int data){
            if(rear==size-1){
                System.out.println("full");
            return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeue
       public static int remove(){
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
       }

    //peek
    public static int peek(){
       if(isempty()){
           return -1;
       }
       return arr[0];

       }
    }

}
