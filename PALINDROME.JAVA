public class PALINDROME {
    public static void main(string[]args) {
        if(args.length==0) {
            System.out.println("please provide a word to check!");
            return;
        }
        String word=args[0];
        if(isPalindrome(word)) {
            System.out.println(word +"is a palindrome!");
        }else{
            System.out.println(word +"is not a palindrome!");        }
        }
     }
     public static boolean isPalindrome(String str) {
        String reversed=new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
     }
}