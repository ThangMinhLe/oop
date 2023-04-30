package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public class diaChi {
    Scanner sc = new Scanner(System.in);
    public String quan;
    public String thanhPho;

    public diaChi (){
        
    }

    public diaChi(String quan, String thanhPho){
        this.quan = quan;
        this.thanhPho = thanhPho;
    }

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

