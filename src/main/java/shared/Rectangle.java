package shared;

public class Rectangle extends Shape {

    public int length;
    public int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String draw() {
        StringBuilder sbLength = new StringBuilder();
        StringBuilder sbWidth = new StringBuilder();
        for (int i = 0; i < this.length; i++) {
            sbLength.append("*");
        }
        String length = sbLength.toString();

        sbWidth.append("*");
        for (int j = 0; j < this.width - 2; j++) {
            for (int k = 0; k < this.length - 2; k++) {
                sbWidth.append(" ");
            }
            sbWidth.append("*");
        }
        String width = sbWidth.toString();
        return String.format("%s\n%s\n%s", length, width, length);
    }
}