package adventofcode2017;

import java.util.HashMap;
import java.util.Map;

import static adventofcode2017.Utils.splitIntoRows;

public class Day4_HighEntropyPassphrases {
    public static void HighEnergyPassphrase(String input) {
        int validRows = 0;
        String[] splitInput = splitIntoRows(input);
        for(String rowString : splitInput){
            String[] words = Utils.splitRowIntoWords(rowString);
            if(isValidPassphrase(words)){
                validRows++;
            }
        }

        System.out.println("The Number of valid rows are: " + validRows);
    }

    private static boolean isValidPassphrase(String[] words) {
        Map<String, String> validatorMap = new HashMap<>();

        for(String word : words){
            if(!validatorMap.containsKey(word)){
                validatorMap.put(word, null);
            }
            else{
                return false;
            }
        }
        return true;
    }

}
