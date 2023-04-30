package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public class ngaySinh {
    Scanner sc = new Scanner(System.in);

    private int ngay;
    private int thang;
    private int nam;

    public ngaySinh(){
        
    }

    public ngaySinh(int nam, int thang, int ngay){
        this.nam = nam;
        this.thang = thang;
        this.ngay = ngay;
    }

    //getter/setter
    public int setNgay(int ngay) {
        for (;;) {
            if( thang >= 1 && thang <= 7 && thang != 2 && thang % 2 != 0) {
                if(ngay <= 31 && ngay >= 1){
                    break;
                }
            }

            if( thang >= 1 && thang <= 7 && thang != 2 && thang % 2 == 0) {
                if(ngay <= 30 && ngay >= 1){
                    break;
                }
            }

            if(thang <= 12 && thang >= 8 && thang % 2 == 0) {
                if(ngay <= 31 && ngay >= 1){
                    break;
                }
            }

            if(thang <= 12 && thang >= 8 && thang % 2 != 0) {
                if(ngay <= 30 && ngay >= 1){
                    break;
                }
            }

            if(nam % 4 == 0 && thang == 2 && ngay > 0 && ngay < 29) break;
            if(nam % 4 != 0 && thang == 2 && ngay > 0 && ngay < 28) break;

            System.out.print("Nhap ngay hop le: ");
            ngay = Integer.parseInt(sc.nextLine());
        }

        return this.ngay = ngay;    
    }

    public int getNgay() {
        return ngay;
    }

    public int setThang(int thang) {

        while (true){
            if(thang >=1 && thang <=12)  break;
            System.out.print("Nhap thang hop le: ");
            thang = Integer.parseInt(sc.nextLine());
        
        }



        return this.thang = thang;
    }

    public int getThang() {
        return thang;
    }

    public int setNam(int nam) {

        while (nam < 1990 && nam > 2023 ){
                System.out.print("Nhap nam hop le: ");
                nam = Integer.parseInt(sc.nextLine());
        }

        return this.nam = nam;
    }

    public int getNam() {
        return nam;
    }

    public void nhap() {
        
        System.out.print("Nhap nam: ");
        setNam(sc.nextInt());
        System.out.print("Nhap thang: ");
        setThang(sc.nextInt());
        System.out.print("Nhap ngay: ");
        setNgay(sc.nextInt());

    }

    public String toString(){
        return String.format("%-5d %-5d %-5d",getNgay(), getThang(), getNam());
    }



}
