package classwork;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CustomFIleWriterTest {
    @Test
    void testCanWriteToFile() throws IOException {
        String fileLocation = "/home/makaveli/Documents/Estore/classwork/FilesLocation";
        String fileName = "user.json";
        Path path = Path.of(fileLocation, fileName);
        String json = """
                {
                  "name": "MAKAVELI",
                   "age": "250000",
                   "country": "Ikka Nation"
                }""";

        CustomFIleWriter.writeJsonToFile(path, json);

        String dataFromFile = Files.readString(path);
        assertEquals(json, dataFromFile);
    }

    @Test
    void testCanWriteToYmlFile() throws IOException {
        String secondFileLocation = "/home/makaveli/Documents/Estore";
        String secondFileName = "classwork/FilesLocation/newFile.yml";
        Path SecondPath = Path.of(secondFileLocation, secondFileName);
        String yml = """
                  name: MAKAVELI
                  age: 250000
                  country: Ikka Nation
                """;

        CustomFIleWriter.writeYmlToFile(SecondPath, yml);

        String dataFromFile = Files.readString(SecondPath);
        assertEquals(yml, dataFromFile);
    }

    @Test
    void testCanReadFromJsonFile() throws IOException {
        String fileLocation = "//home/makaveli/Documents/Estore/classwork/FilesLocation/user.json";
        Path path = Path.of(fileLocation);
        String result = CustomFIleWriter.readFromJsonFile(path);

        String json = """
                {
                  "name": "MAKAVELI",
                   "age": "250000",
                   "country": "Ikka Nation"
                }""";
        assertEquals(result, json);


    }

    @Test
    void testCanReadFromXmlFile() throws IOException {
        String fileLocation = "/home/makaveli/Documents/Estore/newFile.yml";
        Path path = Path.of(fileLocation);
        String result = CustomFIleWriter.readFromXml(path);

        String yml = """
                  name: MAKAVELI
                  age: 250000
                  country: Ikka Nation
                """;
        assertEquals(result, yml);


    }

}