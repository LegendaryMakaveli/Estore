package classwork.StreamsIn;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

public class CloudDataReader {
    static void main() {
            final String file = "/home/makaveli/Documents/Estore/classwork/FilesLocation/posts.json";
            String url = "https://jsonplaceholder.typicode.com/posts";
            String data = readDataFrom(url);
            try(FileWriter fileWriter = new FileWriter(file)){
                fileWriter.write(data);
            }catch (IOException error){
                error.printStackTrace();
            }
    }

    public static String readDataFrom(String cloudLocation){
        URI uri = URI.create(cloudLocation);
        try(InputStream inputStream =  uri.toURL().openStream()){
            byte[] data = inputStream.readAllBytes();
            return new String(data);
        }catch (IOException error){
            error.printStackTrace();
            throw new RuntimeException(error);
        }
    }
}
