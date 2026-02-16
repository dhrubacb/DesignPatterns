package main.java.solid.lsp;

public class Square extends Rectangle {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(double height) {
        this.height = height;
        this.width = height;
    }
}
