public class BowlingGame {
    // TODO: In case we have a strike at the end
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Adds 1 to index each time
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: In java, indexes start with 0
        for(int currentVal:rolls)
            score += currentVal;
        return score;
    }

}
