public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < sb.length() / 2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(frontChar, backChar);
            sb.setCharAt(backChar, frontChar);
            System.out.println(sb);
        }
    }
}
