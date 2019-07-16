package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        int midchar = string.length()/2;
        char c = string.charAt(midchar);


        return c;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(index + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + Character.toLowerCase(getMiddleCharacter(str)) + str.substring(index +1);
    }

    public static Boolean isIsogram(String str) {
        for(int i=0; i<str.length(); i++) {
            for(int j = i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i =1; i<str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i= 1; i< str.length(); i++) {
            if(str.charAt(i) ==str.charAt(i-1)) {
                sb.replace(i-1, i+1, " ");
            }
        }
        return sb.toString().replaceAll(" ", "");
    }

    public static String invertCasing(String str) {
        String[] strings = str.split("");
        for(int i = 0; i<strings.length; i++) {
            String current = strings[i];
            if(current.equals(current.toLowerCase())) {
                strings[i] =current.toUpperCase();
            }
            else {
                strings[i] = current.toLowerCase();
            }
        }

        return String.join("", strings);
    }
}