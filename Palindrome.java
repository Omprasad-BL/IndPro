public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar123";
        System.out.println(palindrome(str));
    }

    public static String palindrome(String str) {
        String newStr = str.replaceAll("[0-9]+", "");
        String rev = new StringBuilder(newStr).reverse().toString();
        if (newStr.equals(rev)) {
            return newStr;
        } else {
            return new StringBuilder(newStr).reverse().toString();
        }
    }
}
