package adventofcode2017;

public class Utils {
    static int[] stringToIntArray(String input) {
        int[] intArray = new int[input.length()];
        for(int i=0; i<input.length(); i++){
            intArray[i] = input.charAt(i) - '0';
        }
        return intArray;
    }

    static int[] stringArrayToIntArray(String stringRow) {
        String[] rowElements =  stringRow.split("\\s+");
        int[] intArray = new int[rowElements.length];

        for(int i=0; i<rowElements.length; i++){
            intArray[i] = Integer.parseInt(rowElements[i]);
        }
        return intArray;
    }

    static String[] splitIntoRows(String input) {
        return input.split("\\n+");
    }

    static String[] splitRowIntoWords(String rowString) {
        return rowString.split("\\s+");
    }
}
