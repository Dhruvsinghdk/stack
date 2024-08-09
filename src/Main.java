
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(23);
        st.push(24);
        st.push(25);
        st.push(26);
        st.push(27);
        Stack <Integer> s = new Stack<>();
       while(st.size()>0){
           s.push(st.pop());
       }
        st.push(12);
       while(s.size()>0){
           st.push(s.pop());
       }
        System.out.println(st);

    }
}