package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String text = "Hello World File class";
        writeFileUsingFile(text);
//        writeFileUsingOutputStream(text);
//        writeToFileUsingPrintWriter(text);
//        writeToFileUsingBuffer(text);

    }

    private static void writeFileUsingFile(String text) throws IOException {
        Path path = Paths.get("test3");
        byte[] bytes = text.getBytes();

        Files.write(path, bytes);
    }

    private static void writeFileUsingOutputStream(String text) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test2");
        byte[] bytes = text.getBytes();
        fileOutputStream.write(bytes);

        fileOutputStream.close();
    }

    private static void writeToFileUsingPrintWriter(String text) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("test"));
        printWriter.println(text);

        printWriter.close();
    }

    private static void writeToFileUsingBuffer(String text) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test", true))) {
            writer.write(text);
        }
    }
}
