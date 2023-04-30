package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public class baoVe extends nhanVien {
    Scanner sc = new Scanner(System.in);

    private double soNgayLamViec;
    private long Mucluong;

    public baoVe() {
    }

    public baoVe(String id, String name, String gioiTinh, ngaySinh ns, diaChi dc, double soNgayLamViec, long Mucluong) {
        super(id, name, gioiTinh, ns, dc);
        this.soNgayLamViec = soNgayLamViec;
        this.Mucluong = Mucluong;
        
    }

    public double getSoNgayLamViec() {
        while(true) {
            if(soNgayLamViec >= 0 && soNgayLamViec <= 31)  break;

            System.out.print("Nhap so ngay lam viec hop le: ");
            soNgayLamViec = Integer.parseInt(sc.nextLine());
        }
        
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(double soNgayLamViec) {
        
        
        this.soNgayLamViec = soNgayLamViec;
    }

    public long getMucLuong() {
        return Mucluong;
    }

    public void setMucLuong(long Mucluong) {
        this.Mucluong = Mucluong;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();

        System.out.print("Nhap so ngay lam viec: ");
        setSoNgayLamViec(sc.nextDouble());
        System.out.print("Nhap muc luong: ");
        setMucLuong(sc.nextLong());
    }

    public String toString() {
        return super.toString() + String.format("%-10.2f| %-10d",
        getSoNgayLamViec(), tinhLuong() );
    }

    @Override   
    public long tinhLuong() {
        return (long) soNgayLamViec*Mucluong;
    }


}
