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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + "data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char resp = sc.next().charAt(0);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            if (resp == 'c') {
                list.add(new Product(productName, productPrice));
            } else if (resp == 'i') {
                System.out.print("Product customs fee: ");
                double productCustomFeeImported = sc.nextDouble();
                list.add(new ImportedProduct(productName, productPrice, productCustomFeeImported));
            } else if (resp == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date productManufactureDate = simpleDateFormat.parse(sc.next());
                list.add(new UsedProduct(productName, productPrice, productManufactureDate));
            } else {
                System.out.println("Invalid value to input");
            }
        }

        System.out.println();
        System.out.println("Price Tags");
        for (Product product : list)
            System.out.println(product.priceTag());
        sc.close();
    }
}

