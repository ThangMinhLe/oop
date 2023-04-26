package quanLySinhVien2;
import java.util.*;

public class phuHuynh {
    Scanner sc = new Scanner(System.in);

    private String ten;
    private String soDienThoai;

    public phuHuynh() {
    }

    public phuHuynh(String ten, String soDienThoai) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
 
    public void nhapTT() {
       
        System.out.print("Nhap ten PH: ");
        setTen(sc.nextLine());
        System.out.print("Nhap SDT: ");
        setSoDienThoai(sc.nextLine());

    }

    public String toString(){
        return this.toString() + String.format("%-20s %-20s", getTen(), getSoDienThoai() );
    }
     

   
}
