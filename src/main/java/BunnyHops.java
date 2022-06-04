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

    public int bunnyHops(int numSteps) {
        return bunnyHopsRecursiveSolution(numSteps);
    }
}
