public class BalancedBracketsTester {
    public static void main(String[] args) {
        BalancedBrackets balance= new BalancedBrackets();
        BalancedAllBrackets allBalance=new BalancedAllBrackets();

        System.out.println(balance.checkBalance("(WHEE"));
        System.out.println(balance.checkBalance("((()))"));
        System.out.println(balance.checkBalance(")()"));
        System.out.println(balance.checkBalance("())"));

        // Extra Credit
        System.out.println("extra credit test:");
        System.out.println(allBalance.checkAllBalance("(([{}]))"));
        System.out.println(allBalance.checkAllBalance("})[][{}]"));
        System.out.println(allBalance.checkAllBalance("}()"));
        System.out.println(allBalance.checkAllBalance("(({]))"));


    }
}
