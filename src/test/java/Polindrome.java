public class Polindrome {
    public static void main(String[] args) {
        String str = "Make me polindrome";
        String dummy= "";
        for (int i = str.length()-1; i >= 0; i--) {
            dummy = dummy + str.charAt(i);
        }
        System.out.println(dummy.trim());
    }
}
