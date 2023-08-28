import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            String s = sc.next();
            System.out.println(rpn(s));
        } 
    }

    public static String rpn(String x){
        String result = "";
        char c = 'a';
        Stack<Character> s = new Stack<Character>();
    
        for(int i = 0; i < x.length(); i++){
            c = x.charAt(i);
            if(c >= 'a' && c <= 'z')
            result += c;
            else if(c == ')'){
                while((c = s.pop()) != '(')
                result += c;
            }
            else
                s.push(c);
        }
        return result;
    }

}
