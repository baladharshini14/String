class Main {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        if (java.util.Arrays.equals(a, b)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
