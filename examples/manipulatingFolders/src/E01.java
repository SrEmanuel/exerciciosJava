import java.io.File;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path =  new File(strPath);


        //Listing folders
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("FOLDERS: ");
        for(File folder : folders){
            System.out.println(folder);
        }


        //Listing files
        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES:");
        for(File file : files){
            System.out.println(file);
        }

        //Creating a subdir by the path informed
        boolean success = new File(strPath + "\\testeeesubdir").mkdir();

        System.out.println("DIRECTORY CREATED SUCESSFULLY: "+  success);

        sc.close();
    }
}
