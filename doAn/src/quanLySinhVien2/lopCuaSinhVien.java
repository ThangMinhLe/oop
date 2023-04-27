package quanLySinhVien2;

import java.util.*;

public class lopCuaSinhVien {
    Scanner sc = new Scanner(System.in);
    private String maLop;
    private String tenLop;

    public lopCuaSinhVien() {
    }

    public lopCuaSinhVien(String maLop, String tenLop) {
        this.maLop = maLop;
        this.tenLop = tenLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void nhap(){
        System.out.print("Nhap ma lop: ");
        setMaLop(sc.nextLine());
        System.out.print("Nhap ten lop: ");
        setTenLop(sc.nextLine());
    }

    
}
