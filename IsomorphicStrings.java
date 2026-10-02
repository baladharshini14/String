class Main {

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        boolean result = true;

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
