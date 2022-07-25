import java.time.temporal.Temporal;

public class GCD {

    Integer num;
    Integer num1;

    public GCD(Integer n, Integer n2) {
        num = n;
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

    public Integer GCD(int num1, int num2){
        if(num2 != 0){
            return GCD(num2, num1 % num2);
        } else
            return num1;
    }




}
