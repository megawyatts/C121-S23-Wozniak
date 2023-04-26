import java.util.Stack;

public class BalancedAllBrackets {
    private Stack<Character> paraStack = new Stack<Character>();
    private Stack<Character> brackStack=new Stack<Character>();
    private Stack<Character> squigStack=new Stack<Character>();


    public String checkAllBalance(String input) {
        for (int i = 0; i < input.length(); i++) {
            char chara = input.charAt(i);
            if (chara=='('||chara==')'){
                if(chara==')'&& paraStack.isEmpty()){
                    return "Unbalanced";
                }else {
                    checkPara(chara);
                }
            }
            if(chara=='['||chara==']'){
                if(chara==']'&&brackStack.isEmpty()){
                    return"Unbalanced";
                }else{
                    checkBrack(chara);
                }
            }
            if(chara=='{'||chara=='}'){
                if(chara=='}'&&squigStack.isEmpty()){
                    return "Unbalanced";
                }else{
                    checkSquig(chara);
                }
            }

        }
        if (paraStack.isEmpty()&&brackStack.isEmpty()&&squigStack.isEmpty()){
            return "Balanced";
        } else {
            return "Unbalanced";
        }
    }

    public void checkPara(Character c) {
        if (c == '(') {
            paraStack.push('T');
        } else if (c == ')') {
            if (paraStack.isEmpty()) {
                //Enter Method that causes it to check
            } else {
                paraStack.pop();
            }
        }
    }

    public void checkBrack(Character c) {
        if (c == '[') {
            brackStack.push('T');
        } else if (c == ']') {
            if (brackStack.isEmpty()) {

            } else {
                brackStack.pop();
            }
        }
    }
    public void checkSquig(Character c) {
        if (c == '{') {
            squigStack.push('T');
        } else if (c == '}') {
            if (squigStack.isEmpty()) {
                //Enter Method that causes it to check
            } else {
                squigStack.pop();
            }
        }
    }

}
