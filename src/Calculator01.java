import java.util.ArrayList;
import java.util.List;

public class Calculator01 {

    private final List<Double> result = new ArrayList<>();

    public double calculate(int number1, int number2, char operator) {

        if(operator == '+') {
            result.add((double) number1 + number2);
            return number1 + number2;
        } else if(operator == '-') {
            result.add((double) number1 - number2);
            return number1 - number2;
        }else if(operator == '*') {
            result.add((double) number1 * number2);
            return number1 * number2;
        }else if(operator == '/') {
            if(number2 == 0) {
                System.out.println("0으로는 나눌 수 없습니다.");
            }else {
                result.add((double) number1 / number2);
                return number1 / number2;
            }
        }else {
            System.out.println("잘못된 기호를 입력했습니다.");
        }
        return 0.0;
    }
    public List<Double> getResult() {
        return result;
    }
    public void setResult(Double result) {
        this.result.add(result);
    }
    public void deleteList(){
        result.remove(0);
    }
}
