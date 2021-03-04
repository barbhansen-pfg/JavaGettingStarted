
public class FizzBuzz {
    public String execute(Integer number) {
        String convertedValue = null;
        int remainderByThree = number % 3;
        int remainderByFive = number % 5;
        if (remainderByFive == 0 && remainderByThree == 0) {
            convertedValue = "FizzBuzz";
        }
        else if (remainderByThree == 0) {
            convertedValue = "Fizz";
        }
        else if (remainderByFive == 0){
            convertedValue = "Buzz";
        }
        else {
            convertedValue = String.valueOf(number);
        }
        return convertedValue;
    }
}
