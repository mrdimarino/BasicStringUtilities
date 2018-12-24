package StringUtil;

public class StringUtilities {

    public static String capitalizeFirstLetter(String str) {
        String [] words = str.split(" ");
        StringBuilder capitalLetters = new StringBuilder();

        for (int i = 0; i < words.length; i++){
            capitalLetters.append(Character.toUpperCase(words[i].charAt(0)));
            capitalLetters.append(words[i].substring(1).toLowerCase());
            capitalLetters.append(" ");
        }
        return capitalLetters.toString().trim();

    }


    public static String reverseWholeString(String str) {
        StringBuilder reverseString = new StringBuilder(str);
        return reverseString.reverse().toString();
    }



    public static String reverseWords(String str) {
        String [] allWords = str.split(" ");
        for (int i = 0; i < allWords.length; i++) {
            String word = allWords[i];
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            allWords[i] = reverseWord.toString();
        }



        StringBuilder reverseString = new StringBuilder();
        for (int i = 0; i < allWords.length; i++){
            reverseString.append(allWords[i] + " ");
        }

        return reverseString.toString().substring(0,reverseString.length()-1);
    }


    public static String reverseThenCapitalize(String str) {
        return capitalizeFirstLetter(reverseWholeString(str));
    }



    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }


    public static String invertCasing(String str) {
        StringBuilder invertCase = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            char ch1;
            if (Character.isLowerCase(ch)){
                ch1 = Character.toUpperCase(ch);
            }else{
                ch1 = Character.toLowerCase(ch);
            }
            invertCase.append(ch1);

        }

        return invertCase.toString();
    }


    public static Boolean isAlphaString(String string) {
        return string.matches("[a-zA-z ]+");
    }


    public static Boolean isNumericString(String string) {
        return string.matches("[0-9 ]+");
    }


    public static Boolean isSpecialCharacterString(String string) {
        return string.matches("[\\p{Punct}]+");
    }


}
