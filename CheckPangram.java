class Main {

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = true;

        for (char c = 'a'; c <= 'z'; c++) {

            if (sentence.indexOf(c) == -1) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}