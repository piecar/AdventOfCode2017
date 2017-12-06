package adventofcode2017;

import static adventofcode2017.Utils.splitIntoRows;

public class Day5_AMazeOfTwistyTrampolinesAllAlike {

    public static void MazeCount(String input, String matchOption) {
        int steps = 0;

        String[] rows = splitIntoRows(input);
        int[] intArray = ConvertRowNumberToInt(rows);

        steps = traverseMaze(intArray, steps, matchOption);
        System.out.println("The number of steps to get out of the maze is: " + steps);
    }

    private static int traverseMaze(int[] maze, int steps, String matchOption) {
        int i =0;
        while(withinBounds(maze.length, i)){
            int curr = maze[i];
            maze[i] = currValueChange(i, curr, matchOption);
            i = curr + i;
            steps++;
        }
        return steps;
    }

    private static int currValueChange(int i, int curr, String matchOption) {
        if(matchOption.equalsIgnoreCase("incrementAlways"))
            return curr + 1;
        else {
            if (curr >= 3)
                return curr - 1;
            else
                return curr + 1;
        }
    }

    private static boolean withinBounds(int mazeLength, int index) {
        return index >= 0 && index < mazeLength;
    }

    private static int[] ConvertRowNumberToInt(String[] rows) {
        int[] intArray = new int[rows.length];
        for(int i=0; i<rows.length; i++){
            intArray[i] = Integer.parseInt(rows[i]);
        }
        return intArray;
    }
}
