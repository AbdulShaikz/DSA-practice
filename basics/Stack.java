package basics;

public class Stack{
    int top;
    int arr[];
    int size;

    public Stack(int size){
        this.size = size;
        this.arr = new int[size];
        top = -1;
    }

    public void push(int ele){
        if(top == size-1){
            System.out.println("Stack Overflow!");
        }else{
            top++;
            arr[top] = ele;
            System.out.println("Pushed: "+arr[top]);
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("Underflow!");
        }else{
            System.out.println("Popping Out: "+ arr[top]);
            top--;
        }
    }

    public int peek(){
        if(top==-1){
            System.out.println("Underflow!");
            return -1;
        }else{
            System.out.println("Top element: "+arr[top]);
            return arr[top];
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(8);
        stack.pop();
        stack.peek();
        stack.push(9);   
    }
}