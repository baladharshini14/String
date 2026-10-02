class Main {

    public static void main(String[] args) {

        String s = "madam";

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }

        if (s.equals(reverse)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
