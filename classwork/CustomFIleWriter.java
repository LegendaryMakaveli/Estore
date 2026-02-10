package classwork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomFIleWriter {

    public static void writeJsonToFile(Path path, String json) {
        try {
            Files.writeString(path, json);
        }catch (IOException er){
            er.printStackTrace();
        }
    }

    public static void writeYmlToFile(Path path, String yml){
        try{
            Files.writeString(path, yml);
        }catch (IOException er){
            er.printStackTrace();
        }
    }

    public static String readFromJsonFile(Path path){
        try{
            return Files.readString(path);
        }catch (IOException er){
            return "File not found";
        }
    }

    public static String readFromXml(Path path){
        try{
            return Files.readString(path);
        }catch (IOException er){
            return "File not found";
        }
    }
}
