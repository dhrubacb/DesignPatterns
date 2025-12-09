package main.java.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
    private final String name;
    private final List<FileComponent> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public Directory addAndReturn(FileComponent fileComponent) {
        children.add(fileComponent);
        return this;
    }

    @Override
    public void printStructure(String indent) {
        IO.println(indent + " +Directory: " + name);
        String childIndent = indent + "\t" + "|--";
        for (FileComponent child : this.children) {
            child.printStructure(childIndent);
        }
    }
}
