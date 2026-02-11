package classwork.FileLearning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteFile {
    static void main() {
        try {
            String fileLocation = "/home/makaveli/Documents/Estore/classwork/FilesLocation/posts.json";
            Path path = Path.of(fileLocation);

            Files.deleteIfExists(path);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}