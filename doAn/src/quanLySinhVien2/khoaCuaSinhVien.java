package quanLySinhVien2;

import java.util.*;

public class khoaCuaSinhVien {
    Scanner sc = new Scanner(System.in);
    private String maKhoa;
    private String tenKhoa;

    public khoaCuaSinhVien() {
    }

    public khoaCuaSinhVien(String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }

    public String getMaKoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    //Nhap TT
    public void nhap() {
        System.out.print("Nhap ma khoa: ");
        setMaKhoa(sc.nextLine());
        System.out.print("Nhap ten cho khoa: ");
        setTenKhoa(sc.nextLine());
    }


    public String toString(){
        return String.format("%-10s %-10s", maKhoa, tenKhoa);
    }

    public void showKhoa(){
        System.out.println(toString());
    }
    


}
