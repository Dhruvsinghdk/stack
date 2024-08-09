
class Stack{
    int st[] = new int[5];
    int idx = 0;
    void push(int x){
       st[idx] = x;
       idx++;
    }
    void display(){
        for (int i = 0; i < st.length; i++) {
            System.out.print(st[i]+" ");
        }
    }
    void peek(){
        System.out.println(st[idx-1]);
    }
    void pop(){
        if(idx == -1){
            System.out.println("underflow");
        }
        else {
            System.out.println(st[idx-1]);
            idx--;
        }
    }
    void empty(){
        if(idx == 0){
            System.out.println("empty");
        }
    }
    void full(){
       if(st.length>=idx){
           System.out.println("full");
       }
    }
}

public class Array {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println();
s.pop();
s.pop();
s.pop();
s.pop();
s.pop();

s.empty();


    }
}
