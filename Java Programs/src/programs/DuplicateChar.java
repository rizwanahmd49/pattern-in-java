package programs;

public class DuplicateChar {

    public static void findDuplicateChar(String str) {
        int size = str.length();
        System.out.printf("The Entered Word is : " + str + "\n");
        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
                if (str.charAt(i) == str.charAt(j) && j < i) {
                    break;
                }

            }
            if (counter > 1) {
                System.out.println(str.charAt(i) + " repeated: " + counter + " times");
            }
        }
    }

    private static void findDuplicateCharUsingLoop(String string) {
        int size = string.length();
        for (int i = 0; i < size; i++) {
            int counter = 0;
            for (int j = 0; j < size; j++) {
                if (string.charAt(i) == string.charAt(j))
                    counter++;
                if (string.charAt(i) == string.charAt(j) && j < i)
                    break;
            }
            if (counter > 1)
                System.out.println(string.charAt(i) + " => " + counter);
        }
    }

    public static void main(String[] args) {
        findDuplicateCharUsingLoop("rizwanahmadsalmaniII");
    }

}
