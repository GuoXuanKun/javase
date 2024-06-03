package day240530.practice.project.memorizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextMeorizer implements Memorizer{
    @Override
    public void memorizer(String content) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("src/day240530/practice/project/content.txt"));
            fileOutputStream.write(content.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
