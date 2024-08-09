
class Stack{
    int st[] = new int[5];
    int idx = 0;
    void push(int x){
        st[idx] = x;
        idx++;
    }
    void pop(){
        System.out.println(st[idx-1]);
        idx--;
    }
    void display(){
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }
    }
    void peek(){
        if(idx >= 0) {
            System.out.println(st[idx - 1]);
        }
        else{
            System.out.println(st[0]);
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
        s.pop();
        s.pop();

    }
}
