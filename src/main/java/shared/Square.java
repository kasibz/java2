package shared;

public class Square extends Shape {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    public String draw() {
        StringBuilder sbLength = new StringBuilder();
        StringBuilder sbWidth = new StringBuilder();
        for (int i = 0; i < this.side; i++) {
            sbLength.append("*");
        }
        String length = sbLength.toString();

        sbWidth.append("*");
        for (int j = 0; j < this.side - 2; j++) {
            for (int k = 0; k < this.side - 2; k++) {
                sbWidth.append(" ");
            }
            sbWidth.append("*");
        }
        String width = sbWidth.toString();
        return String.format("%s\n%s\n%s\n", length, width, length);
    }
}