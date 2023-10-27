package shared;

// recall that an interface just provides the methods that the children have to implement
public interface Calculatable {
    Integer add(Integer number1, Integer number2);

    Integer subtract(Integer number1, Integer number2);

    Integer multiply(Integer number1, Integer number2);

    Integer divide(Integer number1, Integer number2);

    String getHistory();
}