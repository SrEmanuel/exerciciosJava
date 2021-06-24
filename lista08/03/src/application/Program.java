package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Bith date (DD/MM/YYYY): ");
        String bithDate = sc.nextLine();
        Client client = new Client(name,email, sdf.parse(bithDate));


        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order order = new Order(OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int aux = sc.nextInt();
        sc.nextLine();
        for (int i=1; i <= aux; i++){
            System.out.println("Enter #"+ i + "item data: ");
            System.out.print("Product name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            Double pPrice = sc.nextDouble();
            sc.nextLine();
            Product product = new Product(pName, pPrice);
            System.out.print("Quantity: ");
            int pQuantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(pQuantity, pPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);
    }
}
