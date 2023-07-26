import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PalindromeApp {
    public static void main(String[] args) {
        int input = 12121;
        log.info("Is Palindrome : " +isPalindrome(input));
    }

    private static Boolean isPalindrome(int input) {
        if (input < 0) return false;
        String string = Integer.toString(input);
        String revString = "";
        for (int i =string.length() -1; i >=0; i--){
            revString += string.charAt(i);
        }
        return revString.equals(string);
    }
}
