import java.util.ArrayList;

/**
 * PuzzleJava
 */
public class PuzzleJava {
    public static void main(String[] args) {
        int[] arr1 = {3,5,1,2,7,9,8,13,25,32};
        Tasks first = new Tasks();
        var x = first.sumArr(arr1);
        System.out.println(x);
        Tasks second = new Tasks();
        var x1 = second.namesList();
        System.out.println(x1);;
        String string = "abcdefg";
        System.out.println(string.charAt(2));
        Tasks prep = new Tasks();
        prep.alphabetSoup();
        Tasks make = new Tasks();
        System.out.println(make.randomArrayCreator());
        ArrayList<Integer> take = make.randomArrayCreator();
        System.out.println(take);
        System.out.println("Min: " + take.get(0));
        System.out.println("Max: " + take.get(take.size()-1));
        Tasks words = new Tasks();
        System.out.println(words.randomFiveLetterString());
        Tasks wordList = new Tasks();
        System.out.println(wordList.randomStringArrayCreator());
    }
}