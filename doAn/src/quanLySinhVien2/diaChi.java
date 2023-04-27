package quanLySinhVien2;

import java.util.*;

public class diaChi {
    Scanner sc = new Scanner(System.in);
    private String quan;
    private String thanhPho;

    //getter/ setter

    public String setQuan(String Quan){
        return this.quan = quan;
    }

    public String getQuan () {
        return quan;
    }

    public String setThanhPho(String thanhPho){
        return this.thanhPho = thanhPho;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void nhap(){
        System.out.print("Nhap thong tin cho thanh pho: ");
        setThanhPho(sc.nextLine());
        System.out.print("Nhap thong tin quan: ");
        setQuan(sc.nextLine());

    }

    public String toString() {
        return String.format("%-10s %-10s",getQuan(), getThanhPho());
    }
}

