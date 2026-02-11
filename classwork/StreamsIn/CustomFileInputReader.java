package classwork.Streams;

import java.io.FileInputStream;
import java.io.IOException;

public class CustomFileInputReader {
    public static void main(String[] args){
        String fileLocation = "/home/makaveli/Documents/Estore/classwork/FilesLocation/user.json"; //source where the data is coming from
        try( FileInputStream fileInputStream = new FileInputStream(fileLocation)) {
            byte[] data = fileInputStream.readAllBytes();
            System.out.println(new String(data)); // location where the data is going to
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}