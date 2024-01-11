import java.util.Arrays;

public class StringOps {

    public static void main(String[] args) {
        System.out.println(camelCase(" tWo   wordS"));
        
    }

    public static String capVowelsLowRest (String string) {
        String NewWord = "";
        for (int i =0; i< string.length(); i ++){
            if (string.charAt(i) == ' '){
                NewWord += string.charAt(i);
            } else if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U'){
                NewWord += string.charAt(i);
            } else if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u'){
                NewWord += (char)(string.charAt(i) - 32);
            } else if (65 <= string.charAt(i) && string.charAt(i) <= 90){
                NewWord += (char)(string.charAt(i) + 32);
            } else if (97 <= string.charAt(i) && string.charAt(i) <= 122){
                NewWord += string.charAt(i);
            }
        }
        return NewWord;

    }


    public static String camelCase (String string) {
        String NewWord="";
        String camelCase="";
        int NumOfBeginSpace = 0;
        int i = 0, j =1;
        while (string.charAt(i) == ' '){
            NumOfBeginSpace++;
            i++;
        }
        NewWord = string.substring(i);
        if (NewWord.charAt(0) >= 65 && NewWord.charAt(0) <=90){
            camelCase += (char)(NewWord.charAt(0) + 32);
        } else if (NewWord.charAt(0) >= 97 && NewWord.charAt(0) <=122){
            camelCase += NewWord.charAt(0);
        }
        boolean FirstLetter = false;
        while (j < NewWord.length()) {
            char ch = NewWord.charAt(j);
            if (ch == ' ') {
                FirstLetter = true;
            }
            else {
                if ((NewWord.charAt(j) >= 'a' && NewWord.charAt(j) <= 'z') && FirstLetter == false){
                    camelCase = camelCase + (char) (NewWord.charAt(j));
                } else if ((NewWord.charAt(j) >= 'A' && NewWord.charAt(j) <= 'Z') && FirstLetter == true){
                    camelCase = camelCase + (char) (NewWord.charAt(j));
                
                } else if ((NewWord.charAt(j) >= 'A' && NewWord.charAt(j) <= 'Z') && FirstLetter == false){
                    camelCase = camelCase + (char) (NewWord.charAt(j) + 32);
                } else if ((NewWord.charAt(j) >= 'a' && NewWord.charAt(j) <= 'z') && FirstLetter == true){
                    camelCase = camelCase + (char) (NewWord.charAt(j) - 32);
                }
                FirstLetter = false;
        }
        j++;
        /*while (j < NewWord.length()) {
            char ch = NewWord.charAt(j);
            if ((ch == ' ') && (j != NewWord.length() - 1)) {
                if (NewWord.charAt(j + 1) >= 97 && NewWord.charAt(j + 1) <= 122){
                    camelCase = camelCase + (char) (NewWord.charAt(j + 1) - 32);
                } else{
                    camelCase = camelCase + NewWord.charAt(j + 1);
     
                }
                j++;
            } else {
                if (NewWord.charAt(j) >= 65 && NewWord.charAt(j) <= 90){
                    camelCase = camelCase + (char) (NewWord.charAt(j) + 32);
                } else{
                    camelCase = camelCase + NewWord.charAt(j);
                }
            }*/          
        }
        return camelCase;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        int[] allIndexOf = new int[counter];
        int j = 0;
        for (int i=0; i<string.length(); i++){
            if (string.charAt(i) == chr) {
                allIndexOf[j] = i;
                j++;
            }
        }
        return allIndexOf;
    }
}
