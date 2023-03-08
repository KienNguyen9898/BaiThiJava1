package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new KyThuat("NV001", "Nguyen Trong Kien", "18/01/1998", "Thanh Hoa", "An toan thong tin" );
        System.out.println(nv1);
        System.out.println(nv1.moTaCongViec());

        // nhap tu ban phim
        Scanner in= new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        String id = in.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        String hoten = in.nextLine();
        System.out.print("Nhap nam sinh nhan vien: ");
        String namSinh = in.nextLine();
        System.out.print("Nhap dia chi nhan vien: ");
        String diaChi = in.nextLine();
        System.out.print("Nhap chuyen nganh nhan vien: ");
        String chuyenNganh = in.nextLine();
        in.close();
        NhanVien nv2 = new KyThuat(id, hoten, namSinh, diaChi, chuyenNganh);
        System.out.println(nv2);
        System.out.println(nv2.moTaCongViec());
    }
}
