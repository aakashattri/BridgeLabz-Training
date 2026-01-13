public class StringUtils {
    public String reverse(String str) {
        StringBuilder sb=new StringBuilder(str);
        return sb.reverse().toString();
    }
    public boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        if(sb.reverse().toString().equals(str)) {
            return true;
        }else {
            return false;
        }
    }
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}