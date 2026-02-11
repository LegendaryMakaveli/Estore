package classwork.StreamOut;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputWriter {
    static void main(String[] args){
        String json = """
                {
                    "name": "Ikka Makaveli",
                    "phoneNumber": "0902593035",
                    "age": "20348005",
                    "country": "Ikka Nation"
                }
                """;
        String fileLocation = "/home/makaveli/Documents/Estore/classwork/FilesLocation/user.json"; //Destination  where the data is going to
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation,true)){ // the boolean(true) mean do not truncate/delete the existing data in the file
            fileOutputStream.write(json.getBytes()); //source where the data is coming from
        }catch (IOException er){
            er.printStackTrace();
        }
    }
}
