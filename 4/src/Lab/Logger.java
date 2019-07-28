package Lab;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;


public class Logger {

    public static void Log(String text) {

        List<String> newText = new ArrayList<>() ;
        newText.add(text);
        Path file = Paths.get("Log.txt");

        try {
            Files.write(file, newText, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Creat(){
        try {
            if (!Files.exists(Paths.get("Log.txt")))
            Files.createFile( Paths.get("Log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
