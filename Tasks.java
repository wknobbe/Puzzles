import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tasks {
    public ArrayList<Object> sumArr(int[] arr){
        int sum = 0;
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (arr[i] > 10){
                list.add(arr[i]);
            }
        }
        System.out.println(sum);
        return list;
    }
    public ArrayList<String> namesList(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> longNames = new ArrayList<String>();
        for (int i = 0; i < names.size(); i++){
            if (((String) names.get(i)).length() > 5) {
                longNames.add(names.get(i));
            }
        }
        return longNames;
    }
    public void alphabetSoup(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Object> alphabetList = new ArrayList<Object>();
        for (int i = 0; i < alphabet.length(); i++){
            alphabetList.add(alphabet.charAt(i));
        }
        Collections.shuffle(alphabetList);
        System.out.println(alphabetList.get(alphabetList.size()-1));
        var x = alphabetList.get(0);
        System.out.println(x);
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++){
            Object z = vowels.charAt(i);
            if (z == x) {
                System.out.println("The vowels are the best part!");
            }
        }
    }
    public ArrayList<Integer> randomArrayCreator(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            arr.add(r.nextInt(100-55) + 55);
        }
        Collections.sort(arr);
        return arr;
    }
    public String randomFiveLetterString(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newString = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++){
            newString += Character.toString(alphabet.charAt(r.nextInt(25)));
        }
        return newString;
    }
    public ArrayList<String> randomStringArrayCreator(){
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            String x = randomFiveLetterString();
            arr.add(x);
        }
        return arr;
    }
}