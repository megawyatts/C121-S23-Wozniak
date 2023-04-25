package CharacterCount;

public class CharacterCount {

    public char getCharacter(char[] array,int currentPos){
        return array[currentPos];
    }
    public char currentChar;

    // countCharacter returns the amount of times the "s" characters appears in an array. It sorts through every character
    // and then adds up a counter. The final else statement returns the counter, while the looping part is the countCharacter
    // method being called continiously as the Current position is tested. It takes a few seconds for the program to run through this, as it
    // goes through each character, tests if it's an s, then calls the method.
    public int countCharacter(char[] array, int counter,int currentPos){
        if(currentPos<array.length) {
            currentChar=getCharacter(array,currentPos);
            if (currentChar == 's') {
                counter++;
            }
            return countCharacter(array, counter, currentPos + 1);

        }else{
            return counter;
        }

    }
}
