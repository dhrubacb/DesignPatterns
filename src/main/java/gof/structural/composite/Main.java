package main.java.gof.structural.composite;

public class Main {
    static void main() {
        Directory root = new Directory("root");
        root.addAndReturn(new Directory("D"));
        root.addAndReturn(new File("W.jpeg"));
        root.addAndReturn(new Directory("S").addAndReturn(new File("B.jpg")));
        root.printStructure("");
    }
}
