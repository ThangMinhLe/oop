package quanLySinhVien2;

import java.util.*;
import java.io.ObjectInputStream.GetField;
import java.lang.NullPointerException;

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

    public  String setMaLop(String maLop) {
        return this.maLop = maLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public String getTenLop() {
        return tenLop;
    }
    
    public String setTenLop(String tenLop) {
       return this.tenLop = tenLop;
    }

    public void nhap(){
        System.out.print("Nhap ma lop: ");
        setMaLop(sc.nextLine());
        System.out.print("Nhap ten lop: ");
        setTenLop(sc.nextLine());
    }

    public String toString() {
        return String.format("%-10s| %-10s",getMaLop(), getTenLop());
    }

    public void showLop() {
        System.out.println(toString());
    }

    
}
