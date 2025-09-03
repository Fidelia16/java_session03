import java.util.Scanner;

public class session03_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStaff=0;
        float sumSalary=0;
        float maxSalary=0;
        float minSalary=500000000;
        float avgSalary=0;
        float bonus=0;
        do {
            System.out.println("***********Menu nhap luong************");
            System.out.println("1. Nhap luong nhan vien");
            System.out.println("2. Hien thi thong ke");
            System.out.println("3. Tinh tong so tien thuong cho nhan vien");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban");
            int input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    while (true) {
                        System.out.println("------------Nhap -1 de ket thuc--------");
                        System.out.println("Nhap luong nhan vien");
                        float salary = Float.parseFloat(scanner.nextLine());
                        if (salary == -1) {
                            break;
                        } else if (salary > 500000000 || salary < 0) {
                            System.err.println("Luong khong hop le. Nhap lai");
                        } else {
                            countStaff++;
                            sumSalary += salary;
                            if (maxSalary < salary) {
                                maxSalary = salary;
                            }
                            if (minSalary > salary) {
                                minSalary = salary;
                            }
                            avgSalary = sumSalary / countStaff;
                        }
                    }
                case 2:
                    if (countStaff==0){
                        System.out.println("Chua co du lieu");
                    }else {
                        System.out.printf("So nhan vien da nhap: %d - Luong trung binh: %,.0fVND - Luong cao nhat: %,.0fVND - Luong thap nhat: %,.0fVND - Tong tien luong: %,.0fVND\n",
                                countStaff, avgSalary, maxSalary,minSalary,sumSalary);
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui long nhap tu 1-4");
            }
        } while (true);
    }
}
