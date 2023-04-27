package quanLySinhVien2;

import javax.xml.transform.Source;
import java.util.*;

public class monhoc {
    Scanner sc = new Scanner(System.in);
    private String maMonHoc;
    private String tenMonHoc;
    private double diem;

    public monhoc() {
    }

    public monhoc(String maMonHoc, String tenMonHoc, double diem) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.diem = diem;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void nhap(){
        System.out.print("Nhap ma mon hoc: ");
        setMaMonHoc(sc.nextLine());
        System.out.print("Nhap ten mon hoc: ");
        setTenMonHoc(sc.nextLine());
        System.out.print("Nhap diem cho sinh vien: ");
        setDiem(sc.nextDouble());
    }

    public String toString() {
        return String.format("%-10s %-10s %-10f",getMaMonHoc(), getTenMonHoc(), getDiem());
    }

    
    


}
