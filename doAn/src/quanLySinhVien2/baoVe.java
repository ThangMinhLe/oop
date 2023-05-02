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
        return super.toString() + String.format("%-10s| %-10.2f| %-10d| %-10s| %-5s"," ",
        getSoNgayLamViec(), tinhLuong() , " ", xepLoai());
    }

    public String toStringToFile(){
        return String.format("%s", "bv;") + super.toStringToFile() + String.format("%.1f;%d",getSoNgayLamViec(),getMucLuong());
    }
    public char xepLoai() {
        if(soNgayLamViec > 25) return 'A';
        if( soNgayLamViec >=15 && soNgayLamViec <= 25) return 'B';
        if( soNgayLamViec >=10 && soNgayLamViec <= 15) return 'C';
        return ' ';
    }

    //Neu xep loai cua bao ve la 'A', se duoc thuong them 1.000.000VND
    //Neu xep loai cua bao ve la 'B', se duoc thuong them 800.000VND
    //Neu xep loai cua bao ve la 'C', se duoc thuong them 600.000VND
    @Override   
    public long tinhLuong() {
        if(xepLoai() == 'A') return (long) soNgayLamViec*Mucluong + 1000000;
        if(xepLoai() == 'B') return (long) soNgayLamViec*Mucluong + 800000;
        if(xepLoai() == 'C') return (long) soNgayLamViec*Mucluong + 600000;
        return (long) soNgayLamViec*Mucluong;
    }


}
