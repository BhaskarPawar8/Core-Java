package GeeksForGeeks;

class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue()
    {
        front=0;
        rear=0;
    }

    //Function to push an element x in a queue.
    void push(int x)
    {
        if(rear >= arr.length){
            System.out.println("queue full");
        }
        else{
            arr[rear] = x;
        }
        rear = rear +1;
    }

    //Function to pop an element from queue and return that element.
    int pop()
    {

        return arr[front];

    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.pop();
        myQueue.pop();
        myQueue.pop();
    }
}
