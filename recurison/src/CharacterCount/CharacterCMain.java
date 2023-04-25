package CharacterCount;

public class CharacterCMain {
    public static void main(String[] args) {
        CharacterCount charCounter=new CharacterCount();
        char[] array ={'s','u','j','n','o','s','u','w','e','s','o','m','e','s','z'};
        System.out.printf("How many S's are in my array? Answer: %d", charCounter.countCharacter(array,0,0));
    }
}
