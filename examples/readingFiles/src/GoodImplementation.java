import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GoodImplementation {
    public static void main(String[] args) {
        String path = "H:\\wp-intellij\\Estudos\\exerciciosJava\\examples\\readingFiles\\ina.txt";

        //https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        try (BufferedReader br = new BufferedReader(new FileReader(path))){ //
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}
