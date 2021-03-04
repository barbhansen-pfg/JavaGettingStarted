import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Implement each of the tests below in order within the src/main/java/FizzBuzz class
 * Make a Git commit after implementing each test. Add only the minimum amount of code required
 * for each test case to make that test pass. This may innclude just putting in a literal value...
 * do not add any additional code.
 *
 * Hint:  If you complete implementing a test and the next test passes w/o any changes to FizzBuzz.java,
 *        you did too much and should start over from the previous test.
*/

public class WeekTwoExercisePartTwo {
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test?

    @Test
    public void sendingOneShouldReturnStringOne(){
        // needed to convert integer to string
        FizzBuzz fb = new FizzBuzz();
        String expected = "1";

        String actual = fb.execute(1);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingTwoShouldReturnStringTwo(){
        // Test 1 change made this one work

        FizzBuzz fb = new FizzBuzz();
        String expected = "2";

        String actual = fb.execute(2);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingThreeShouldReturnStringFizz() {
        // added check for number of 3 to give back Fizz

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(3);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfThreeShouldReturnStringFizz() {
        // Added remainder calculation to ensure it works for all numbers divided by 3

        FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.execute(9);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfFiveOfThreeShouldReturnStringBuzz() {
        // Added remainder of 5 check

        FizzBuzz fb = new FizzBuzz();
        String expected = "Buzz";

        String actual = fb.execute(25);

        assertEquals(expected, actual);
    }

    @Test
    public void sendingAnyMultipleOfThreeAndFiveOfThreeShouldReturnStringFizzBuzz() {
        // added check of both remainders - if both true pass this new value

        FizzBuzz fb = new FizzBuzz();
        String expected = "FizzBuzz";

        String actual = fb.execute(45);

        assertEquals(expected, actual);
    }
}
