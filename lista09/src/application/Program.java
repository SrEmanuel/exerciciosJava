package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat model = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int num = sc.nextInt();
        List<Product> list = new ArrayList<>();


        for(int i=0; i < num; i++){
            System.out.print("Common, used or imported? (c/u/i)? ");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String pName = sc.nextLine();
            System.out.print("Price: ");
            Double pPrice = sc.nextDouble();
            sc.nextLine();
            if(op == 'i'){
                System.out.println("Customns fee: ");
                Double pFee = sc.nextDouble();
                list.add(new ImportedProduct(pName, pPrice, pFee));
            }else if (op == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date pDate = model.parse(sc.nextLine());
                list.add(new UsedProduct(pName, pPrice, pDate));
            }else{
                list.add(new Product(pName, pPrice));
            }
        }

        for(Product x : list){
            System.out.println(x.priceTag());
        }

    }
}
