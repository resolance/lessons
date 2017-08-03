package ru.ezhov.lessons.homework.ezhov.file;

import java.io.File;

public class FileReader {

    private File source;
    private File sourceForEquals;

    public FileReader(File source) {
        this.source = source;
    }

    public FileReader(File source, File sourceForEquals) {
        this.source = source;
        this.sourceForEquals = sourceForEquals;
    }

    public String read() {
        return source.getAbsolutePath();
    }

    public String readUppercase() {
        return source.getAbsolutePath();
    }

    public boolean equalFiles() {
        if (sourceForEquals == null) {
            throw new IllegalArgumentException("For use this method," +
                    " must be used constructor with two file parameters");
        }

        return source.getAbsolutePath().equals(
                sourceForEquals.getAbsolutePath());

    }


}
