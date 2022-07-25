public class Factorial {

    Integer input;

    public Factorial(Integer input) {
        this.input = input;
    }

    public Integer getInput() {
        return input;
    }

    public void setInput(Integer input) {
        this.input = input;
    }

    public Integer factorialMethod(Integer input) {
        if(input >= 1){
            return input * factorialMethod(input - 1);
        } else
            return 1;
    }






}
