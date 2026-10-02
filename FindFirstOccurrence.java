class Main {

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
