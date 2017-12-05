package adventofcode2017;

public class Day2_CorruptionChecksum {
    public static void CorruptionChecksum(String input) {
        int sum = 0;

        String[] splitInput = Utils.splitIntoRows(input);
        for(String stringRow : splitInput){
            sum = findLargestMinusSmallest(sum, stringRow);
        }
        System.out.println("The Corruption checksum is: " + sum);
    }

    private static int findLargestMinusSmallest(int sum, String stringRow) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        //int[] row = stringToIntArray(stringRow);
        int[] row = Utils.stringArrayToIntArray(stringRow);
        for(int curr : row){
            if(curr < smallest)
                smallest = curr;
            if(curr > largest)
                largest = curr;
        }

        sum += largest - smallest;
        return sum;
    }

}
