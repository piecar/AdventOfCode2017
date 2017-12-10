package adventofcode2017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static adventofcode2017.Utils.splitIntoRows;
import static adventofcode2017.Utils.splitRowIntoWords;

public class Day7_RecursiveCircus {
    private final static int DEPENDENT_PROGRAMS_INDEX_START = 3;
    private final static int LOCAL_BASE_INDEX = 0;

    public static void towerBase(String input) {
        String[] rowInput = splitIntoRows(input);
        String baseProgram = findBaseProgram(rowInput);
        System.out.print("The Base Program is: " + baseProgram);
    }

    private static String findBaseProgram(String[] rowInput) {
        List<String> possibleBases = new ArrayList<>();
        Map<String, String> nonBases = new HashMap<>();

        for(String row : rowInput){
            nonBases = sievePossibleBasesAndNonBases(possibleBases, nonBases, row);
        }
        return sieveBaseProgram(possibleBases, nonBases);
    }

    private static Map<String, String> sievePossibleBasesAndNonBases(List<String> possibleBases, Map<String, String> nonBases, String row) {
        if(row.contains("->")){
            String[] words = splitRowIntoWords(row);
            words = eraseCommasFromStrings(words);
            String possibleBase = words[LOCAL_BASE_INDEX];
            possibleBases.add(possibleBase);
            nonBases = addDependentProgramsToMap(words, nonBases);
        }
        return nonBases;
    }

    private static String[] eraseCommasFromStrings(String[] words) {
        for(int i=0; i<words.length; i++){
            words[i] = words[i].replaceAll(",+", "");
        }
        return words;
    }

    private static String sieveBaseProgram(List<String> possibleBases, Map<String, String> nonBases) {
        for(String possibleBase : possibleBases){
            if(!nonBases.containsKey(possibleBase)){
                return possibleBase;
            }
        }
        return null;
    }

    private static Map<String, String> addDependentProgramsToMap(String[] words, Map<String, String> nonBases) {
        for(int i=DEPENDENT_PROGRAMS_INDEX_START; i<words.length; i++){
            nonBases.put(words[i], null);
        }
        return nonBases;
    }
}
