class QueueImplementation{
    int size=10;
    int[]q=new int[size];
    int currsize=0;
    int start,end=-1;


    public void push(int x){
        if(currsize==size){
            System.out.println("quque full");
            return;
        }
        if(currsize==0){
            start=0;
            end=0;
            
        }

        else{
            end=(end+1)%size;
        }
        q[end]=x;
        currsize++;
    }
    public int pop(){
        if(currsize==0){
            System.out.println("no element in queue to pop");
            return -1;
        }
        int el=q[start];
        if(start==1 && end==1){
            start=-1;
            end=-1;
        }
        else{
            start=(start+1)%size;
            
        }
        currsize-=1;
        return el;
    }
    public int top(){
        if(currsize==0){
            System.out.println("no elements inside queue");
            return -1;
        }
        return q[start];
    }
    public int size(){
        return currsize;
    }
}




public class queue {
    public static void main(String[] args) {
        QueueImplementation q =new QueueImplementation();
        q.push(10);
        q.push(20);
        q.push(30);
       System.out.println( q.size());
       System.out.println(q.top());
       System.out.println(q.pop());
       System.out.println(q.pop());
        q.push(10);
        q.push(20);
        q.push(30);
       System.out.println( q.size());
       System.out.println(q.top());
       System.out.println(q.pop());
       System.out.println(q.pop());
    q.push(20);
        
    }
}
