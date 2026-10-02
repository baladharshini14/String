class Main {

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        int numRows = 3;

        String result = "";

        for (int row = 0; row < numRows; row++) {

            for (int i = row; i < s.length(); i = i + 4) {

                result = result + s.charAt(i);
            }
        }

        System.out.println(result);
    }
}
