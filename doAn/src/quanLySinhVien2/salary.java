package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public class salary {
    Scanner sc = new Scanner(System.in);
    private int heSoLuong;
    private long mucLuong;

    public salary() {
    }

    public salary(int heSoLuong, long mucLuong) {
        this.heSoLuong = heSoLuong;
        this.mucLuong = mucLuong;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        if(heSoLuong <= 1 || heSoLuong >=8) {
            System.out.println("He so luong ban nhap chua hop le!!!");
            System.out.print("Moi ban nhap lai he so luong: ");
            heSoLuong = sc.nextInt();
        }
        this.heSoLuong = heSoLuong;
    }

    public long getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(long mucLuong) {
        this.mucLuong = mucLuong;
    }

    public void nhap(){
        
        System.out.print("Nhap he so luong: ");
        setHeSoLuong(sc.nextInt());
        System.out.print("Nhap muc luong: ");
        setMucLuong(sc.nextLong());

    }
    
    public String toSring(){
        return String.format("%10d %10d",getHeSoLuong(), getMucLuong());
    }

    public long tinhLuongGV() {
        return (long) heSoLuong*mucLuong;
    }
}
