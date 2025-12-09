package main.java.structural.composite;

public class File implements FileComponent {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printStructure(String indent) {
        IO.println(indent + "-File: " + name);
    }
}
