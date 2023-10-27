package shared;
import java.util.ArrayList;

// implments the functions in Calculatable
public class Calculator implements Calculatable {
    // history gets added to the list
    protected ArrayList<String> history;
    
    public Calculator() {
        this.history = new ArrayList<>();
    }

    public Integer add(Integer n1, Integer n2) {
        int sum = n1 + n2;
        String calcStatement = String.format("%d + %d = %d", n1, n2, sum);
        this.history.add(calcStatement);
        return sum;
    }

    public Integer subtract(Integer n1, Integer n2) {
        int diff = n1 - n2;
        String calcStatement = String.format("%d - %d = %d", n1, n2, diff);
        this.history.add(calcStatement);
        return diff;
    }

    public Integer divide(Integer n1, Integer n2) {
        int res = n1 / n2;
        String calcStatement = String.format("%d / %d = %d", n1, n2, res);
        this.history.add(calcStatement);
        return res;
    }

    public Integer multiply(Integer n1, Integer n2) {
        int product = n1 * n2;
        String calcStatement = String.format("%d * %d = %d", n1, n2, product);
        this.history.add(calcStatement);
        return n1 * n2;
    }

    public String getHistory() {
        return String.format("%s", this.history);
    }
}