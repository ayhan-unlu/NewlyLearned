import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class _2025_09_05_FileWriter {
    String source = _2025_09_05__Sources.broCode;

    public static void main(String[] args) {
//        FileWriter fileWriter = new FileWriter("Test.txt");
        String filePath = "/Users/ayhanunlu/Desktop/Test.txt";
//        String textContent = "I like Pizza\nIt is really good\nBuy me Pizza";
        String textContent = """
                I like Pizza
                It is really good
                Buy me Pizza 35.
                """;
        try (FileWriter fileWriter = new FileWriter(filePath)) {
//        try (FileWriter fileWriter = new FileWriter("/Users/ayhanunlu/Desktop/Test.txt")) {
//            fileWriter.write("I like Pizza\nIt is really good");
            fileWriter.write(textContent);
            fileWriter.write("new line of data");
            System.out.println("File has been written successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file at specified location");
        } catch (IOException e) {
            System.out.println("Could not write to file");
        }
    }
}
