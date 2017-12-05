/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

/**
 *
 * @author piecar
 */
public class Day1_InverseCaptcha {
    public static void InverseCaptcha(String input, String matchOption){
        int[] captcha = Utils.stringToIntArray(input);
        int sum = 0;

        if(matchOption.equalsIgnoreCase("consecutive"))
            sum = consecutiveDigitMatch(captcha, sum);
        else
            sum = oppositeDigitMatch(captcha, sum);

        System.out.println("The sum of Inverse Captcha is: " + sum);
    }

    private static int oppositeDigitMatch(int[] captcha, int sum) {
        boolean isMatch;

        for(int i=0; i<captcha.length; i++){
            int digit = captcha[i];
            isMatch = doesOppositeDigitMatch(digit, i, captcha);
            sum = sumIfMatch(sum, digit, isMatch);
        }

        return sum;
    }

    private static boolean doesOppositeDigitMatch(int digit, int index, int[] captcha) {
        return digit == captcha[(index + captcha.length/2)  % captcha.length];
    }

    private static int consecutiveDigitMatch(int[] captcha, int sum) {
        boolean isEnd = false;
        boolean isMatch;
        int i = 0;

        while(!isEnd){
            int curr = captcha[i];
            if(i == captcha.length - 1){
                isMatch = doesNextDigitMatch(curr, captcha[0]);
                sum = sumIfMatch(sum, curr, isMatch);
                isEnd = true;
            }
            else{
                isMatch = doesNextDigitMatch(curr, captcha[i+1]);
                sum = sumIfMatch(sum, curr, isMatch);
            }
            i++;
        }
        return sum;
    }

    private static boolean doesNextDigitMatch(int curr, int next) {
        return curr == next;
    }

    private static int sumIfMatch(int sum, int curr, boolean isMatch) {
        if(isMatch){
            sum += curr;
        }
        return sum;
    }

}
