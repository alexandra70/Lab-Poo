package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void readAndPrintLine() throws IOException {

        BufferedReader reader = null;
        // TODO: Read a line from stdin and print it to stdout
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException ioException) {
            System.out.println("IOEXCEPTION");
        } finally {
            // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally)
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException re) {
                    System.out.println("CAN'T CLOSE THE READER RESOURCES");
                    re.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        readAndPrintLine();
    }
}
