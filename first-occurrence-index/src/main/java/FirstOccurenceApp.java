public class FirstOccurenceApp {

    public static void main(String[] args) {

        String haystack = "sad";
        String needle = "sadbutsad";

        int index = firstOccurenceIndex(haystack, needle);

    }

    private static int firstOccurenceIndex(String haystack, String needle) {

        if (needle.length()>haystack.length()) return -1;
        for (int i =0; i <= haystack.length() - needle.length() +1; i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                if (haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
