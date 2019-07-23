import java.util.Scanner;
public class DienTichHinhChuNhat {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        width = scanner.nextFloat();
        System.out.println("nhap chieu rong: ");
        height = scanner.nextFloat();
        System.out.println("Dien Tich La: "+ width*height+" met vuong");
    }
}
