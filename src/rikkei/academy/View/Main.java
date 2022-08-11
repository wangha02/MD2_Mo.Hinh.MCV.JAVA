package rikkei.academy.View;

import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Show List Product ");
        System.out.println("1. SHOW Product ");
        System.out.println("2. CREAT Product "); //thêm
        System.out.println("3. SORT Product "); //sắp xếp
        System.out.println("4. REMOVE ");
        System.out.println("5. SEARCH ");
        System.out.println("6. EDIT ");
        System.out.println("0. EXIT ");

        int choiceMenu = scanner.nextInt();
        switch (choiceMenu) {
            case 1:
                new ProductView().viewProduct();
                break;
            case 2:
                new ProductView().creatProduct();
                break;
            case 3:
                new ProductView().sortProduct();
                break;
            case 4:
                new ProductView().removeProduct();
                break;
            case 5:
                new ProductView().searchProduct();
                break;
            case 6:
                new ProductView().editProduct();
                break;
            case 7:
                System.exit(0);
                break;
            default:
        }
    }

    public static void main(String[] args) {
        new Main();

    }
}