package quanLySinhVien2;

import java.util.*;

public class baoVe extends nhanVien {
    Scanner sc = new Scanner(System.in);

    private double soNgayLamViec;
    private long luong;

    public baoVe() {
    }

    public baoVe(double soNgayLamViec, long luong) {
        this.soNgayLamViec = soNgayLamViec;
        this.luong = luong;
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

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }



    @Override   
    public long tinhLuong() {
        return (long) soNgayLamViec*200000;
    }


}
