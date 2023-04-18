package WeekThirteen;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedListEx= new LinkedList<>();

        linkedListEx.add("Whee");
        linkedListEx.add("Test");
        linkedListEx.add("RHGHG");

        System.out.printf("Test List: %s\n",linkedListEx);

        linkedListEx.addFirst("Oh?");
        linkedListEx.addLast("AAAAA");

        System.out.printf("Test List: %s\n",linkedListEx);
        Object firstElement = linkedListEx.getFirst();
        Object firstItem= linkedListEx.get(0);
        System.out.printf("First element is %s \n",firstElement);
        System.out.printf("First Item is %s",firstItem);
    }

}
