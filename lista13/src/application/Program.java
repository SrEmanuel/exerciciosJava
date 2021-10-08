package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the FILE path: ");
        String path = sc.nextLine();
        List<Product> compliedProducts = new ArrayList<>();

        //reading and transforming the file data into objects
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] splited = line.split(",");
                compliedProducts.add(new Product(splited[0], Double.parseDouble(splited[1]), Integer.parseInt(splited[2])));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }

        //Transforming Product objects into text int the new file
        String sourcePath = new File(path).getParent();
        new File(sourcePath + "\\out").mkdir();
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(sourcePath+"\\out\\out.csv"))){
            for(Product x : compliedProducts){
                bw.write(x.getName()+","+x.getUnitPrice()*x.getQuantity());
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}