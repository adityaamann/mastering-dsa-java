
public class Check_Palindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        if(fun(0,s)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
    static Boolean fun(int i,String name) {
        if(i>=name.length()/2) return true;
        if(name.charAt(i) != name.charAt(name.length() - 1 - i)) return false;
        return fun(i + 1, name);
        }
    }
