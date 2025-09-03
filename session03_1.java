import java.util.Scanner;

public class session03_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap ten san pham");
        String productName = scanner.nextLine();
        System.out.println("Nhap gia tien");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so luong");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Ban co the thanh vien khong");
        String pointCard = scanner.nextLine();
        boolean point = true;
        if (pointCard.equals("khong")) {
            point = false;
        }
        double payment = price * quantity;
        double discount = 0;
        double vat = 0.08 * (payment - discount);
        double totalPayment = 0;
        if (point) {
            discount = 0.1 * payment;
            totalPayment = (payment - discount) + vat;
        } else {
            totalPayment = payment;
        }
        System.out.printf("Khach hang: %s%n", name);
        System.out.printf("San pham: %s%n", productName);
        System.out.printf("Gia: %d", price);
        System.out.printf("So luong: %d", quantity);
        System.out.printf("Thanh tien: %.0f%n", payment);
        System.out.printf("Giam gia: %.0f%n", discount);
        System.out.printf("Tien VAT: %.0f%n", vat);
        System.out.printf("Tong thanh toan: %.0f%n", totalPayment);
    }
}
