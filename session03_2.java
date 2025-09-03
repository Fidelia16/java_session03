import java.util.Scanner;

public class session03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mark;
        int countStudent = 0;
        float sumMark = 0;
        float maxMark = 0;
        float minMark = 10;

        do {
            System.out.println("*************Menu Nhap diem****************");
            System.out.println("1.Nhap diem hoc vien");
            System.out.println("2.Hien thi thong ke");
            System.out.println("3.Thoat");
            System.out.println("*******************************************");
            System.out.println("Nhap lua chon cua ban:");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    while (true) {
                        System.out.println("Hay nhap diem hoc vien");
                        mark = Float.parseFloat(scanner.nextLine());
                        if (mark == -1) {
                            break;
                        }
                        if (mark < 0 || mark > 10) {
                            System.err.println("Vui long nhap diem tu 0-10");
                        } else {
                            countStudent++;
                            if (mark < 5) {
                                System.out.println("Hoc luc: Yeu");
                            } else if (mark < 7) {
                                System.out.println("Hoc luc: Trung binh");
                            } else if (mark < 8) {
                                System.out.println("Hoc luc: Kha");
                            } else if (mark < 9) {
                                System.out.println("Hoc luc: Gioi");
                            } else {
                                System.out.println("Hoc luc: Xuat sac");
                            }
                            sumMark += mark;
                            if (minMark > mark) {
                                minMark = mark;
                            }
                            if (maxMark < mark) {
                                maxMark = mark;
                            }
                        }

                    }
                    break;
                case 2:
                    if (countStudent == 0) {
                        System.out.println("Chua co du lieu");
                    } else {
                        System.out.printf("So hoc vien da nhap: %d - Diem trung binh: %.1f - Diem cao nhat : %.1f - Diem thap nhat: %.1f\n",
                                countStudent, sumMark / countStudent, maxMark, minMark);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhap tu so 1-3");
                    break;
            }
        } while (true);
    }

}

