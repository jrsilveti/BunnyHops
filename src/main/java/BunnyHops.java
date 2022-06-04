public class BunnyHops {

    private int bunnyHopsRecursiveSolution(int numSteps) {

        //base case
        if(numSteps < 0) {
            return 0;
        }
        else if(numSteps == 0) {
            return 1;
        } else {

            return bunnyHopsRecursiveSolution(numSteps - 1) +
                    bunnyHopsRecursiveSolution(numSteps - 2) +
                    bunnyHopsRecursiveSolution(numSteps - 3);
        }
    }

    public static int bunnyHopsDP(int numSteps)
    {
        //Init base cases
        if(numSteps == 0)
            return 0;

        int[] solutions = new int[numSteps + 1];
        solutions[0] = 1;
        solutions[1] = 1;
        solutions[2] = 2;

        for (int i = 3; i <= numSteps; i++)
            solutions[i] = solutions[i - 1] + solutions[i - 2] + solutions[i - 3];

        return solutions[numSteps];
    }

    public int bunnyHops(int numSteps) {
        return bunnyHopsDP(numSteps);
    }
}
