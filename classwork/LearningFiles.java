package classwork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LearningFiles {
public static void main(String[] args){
    String fileLocation = "/home/makaveli/Documents/Estore/classwork/FilesLocation";
    String fileName = "user.json";
    Path path = Path.of(fileLocation, fileName);//don't put the file name before the file location...file location is the first parameter

//    System.out.println("");
//    System.out.println("");
//    System.out.println(path.getFileSystem());

    try {
        Files.createFile(path);
    }catch(IOException ex){
        ex.printStackTrace();
    }


    String secondFileLocation = "/home/makaveli/Documents/Estore";
    String secondFileName = "classwork/FilesLocation/newFile.yml";
    Path SecondPath = Path.of(secondFileLocation, secondFileName);

    try{
        Files.createFile(SecondPath);
    }catch(IOException ex){
        ex.printStackTrace();
    }
}
}
