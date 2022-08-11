package rikkei.academy.View;

import rikkei.academy.controller.ProductController;
import rikkei.academy.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);

    ProductController productController = new ProductController();

    public void viewProduct() {
        List<Product> productList = productController.showProduct();
        System.out.println("===STT=====NAME=====PRICE=====");

        for (int i = 0; i < productList.size(); i++) {

            System.out.println(
                    "=====" + productList.get(i).getId()
                            + "=====" + productList.get(i).getName()
                            + "=====" + productList.get(i).getPrice() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void sortProduct() {
        List<Product> productList = productController.sortProduct();
        System.out.println("=====STT=====NAME=====PRICE=====");
        for (int i = 0; i < productList.size(); i++) {

            System.out.println("=====" + productList.get(i).getId()
                    + "=====" + productList.get(i).getName()
                    + "=====" + productList.get(i).getPrice() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU !");
        String back = scanner.nextLine();
        if (back.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void removeProduct() {
        System.out.println("Nhap id muon xoa ");
        int id = scanner.nextInt();
        List<Product> productList = productController.removeProduct(id);
        System.out.println("=====STT=====NAME=====PRICE=====");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("=====" + productList.get(i).getId()
                    + "=====" + productList.get(i).getName()
                    + "=====" + productList.get(i).getPrice() + "=====");
        }

        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void creatProduct() {
        System.out.println("NHAP NAME MUON THEM VAO");
        String name = scanner.nextLine();
        System.out.println("Nhap Price");
        int price = Integer.parseInt(scanner.nextLine());
        List<Product> productList = productController.creatProduct(price, name);
        System.out.println("=====STT=====NAME=====PRICE=====");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println("=====" + productList.get(i).getId()
                    + "=====" + productList.get(i).getName()
                    + "=====" + productList.get(i).getPrice() + "=====");
        }

        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void searchProduct() {
        System.out.println("Nhap NAME MUON TIM? ");
        String name = scanner.nextLine();
        List<Product> productSearch = productController.searchProduct(name);
        System.out.println("=====STT=====NAME=====PRICE=====");
        for (int i = 0; i < productSearch.size(); i++) {
            System.out.println("=====" + productSearch.get(i).getId()
                    + "=====" + productSearch.get(i).getName()
                    + "=====" + productSearch.get(i).getPrice() + "=====");
        }

        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }

    public void editProduct() {
        System.out.println("NHAP STT MUON SUA");
        int edit = Integer.parseInt(scanner.nextLine());
        System.out.println("NHAP NAME MUON SUA");
        String name = scanner.nextLine();
        System.out.println("NHAP PRICE MUON SUA");
        int price = Integer.parseInt(scanner.nextLine());
        List<Product> productList1 = productController.editProduct(edit, name, price);

        for (int i = 0; i < productList1.size(); i++) {
            System.out.println("=====" + productList1.get(i).getId()
                    + "=====" + productList1.get(i).getName()
                    + "=====" + productList1.get(i).getPrice() + "=====");
        }
        System.out.println("NHAP BACK DE QUAY LAI MENU");
        String backMenu = scanner.nextLine();
        if (backMenu.equalsIgnoreCase("back")) {
            new Main();
        }
    }
}




