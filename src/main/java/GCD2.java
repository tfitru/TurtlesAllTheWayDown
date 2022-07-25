import java.time.temporal.Temporal;

public class GCD2 {

    Integer num;
    Integer num1;
    public GCD2(Integer n, Integer n2) {
        num1 = n;
        num = n2;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }


    public Integer GCD2(int num1, int num2){
        while (num2 != 0){
         int temp = num2;
         num2 = num1 % num2;
         num1 = temp;
        }
        return num1;
    }
}
