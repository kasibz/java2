package shared;

// take in num with constr and have add and sub methods
// methods take in AN obj

public class AwesomeNumber {
    public int num;

    public AwesomeNumber(int num) {
        this.num = num;
    }

    public static int add(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.num + n2.num;
    }

    public static int subtract(AwesomeNumber n1, AwesomeNumber n2) {
        return n1.num - n2.num;
    }
}