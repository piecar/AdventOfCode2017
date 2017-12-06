/*
 * Created by Pierre Jimenez
 */
package adventofcode2017;

/**
 *
 * @author piecar
 */
public class AdventOfCode2017 {

    public static void main(String[] args) {
        int dayOfAdvent = Integer.parseInt(args[0]);

        String input ="0\n" +
                "3\n" +
                "0\n" +
                "1\n" +
                "-3";

        switch(dayOfAdvent){
            case 1: Day1_InverseCaptcha.InverseCaptcha(input, "consecutive");
                break;
            case 101: Day1_InverseCaptcha.InverseCaptcha(input, "opposite")   ;
                break;
            case 2: Day2_CorruptionChecksum.CorruptionChecksum(input);
                break;
            case 4: Day4_HighEntropyPassphrases.HighEnergyPassphrase(input);
                break;
            case 5: Day5_AMazeOfTwistyTrampolinesAllAlike.MazeCount(input);
                break;
            default: System.out.println("Error in Day Input");
                break;
        }        
        
    }
    
}
