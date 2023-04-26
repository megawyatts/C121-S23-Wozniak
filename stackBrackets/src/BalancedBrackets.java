import java.util.Stack;
public class BalancedBrackets {
    public String checkBalance(String input){
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<input.length();i++){
            char chara= input.charAt(i);
            if (chara=='('){
                stack.push('T');
            }else if(chara==')'){
                if(stack.isEmpty()){
                    return"Unbalanced";
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            return "Balanced";
        }else{
            return "Unbalanced";
        }
    }
}
