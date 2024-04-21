import java.util.Stack;

public class Main {

    private static boolean isPalindrome(String textOriginal){
        String text = removeNonAlphanumeric(textOriginal);
        Stack<Character> stack = new Stack<>();
        int i;
        for(i = 0; i < text.length();i++){
            stack.push(text.charAt(i));
        }

        for(i = 0; i < text.length();i++){
            if(!stack.pop().equals(text.charAt(i)) ) {
                return false;
            }
        }
        return true;
    }

    private static String removeNonAlphanumeric(String text){
        return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}