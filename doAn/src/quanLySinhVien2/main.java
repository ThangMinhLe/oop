package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public class main {
    public static void menu1() {
        System.out.println("1: Nhap thong tin cho danh sach sinh vien.");
        System.out.println("2: Hien thi thong tin danh sach ");
        System.out.println("3: Them doi tuong.");
        System.out.println("4: Xoa doi tuong.");
        System.out.println("5: Cap nhat doi tuong():");
        System.out.println("6: Tim kiem theo ten:");
        System.out.println("7: Creat data from file.");
        System.out.println("8: Write Data to file.");
        System.out.println("9: Clean!!!");
        System.out.println("0: Exit!");
    
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quanly x = new quanly();
        int chon;
       for (;;){
         do {
                menu1();
                System.out.print("Nhap lua chon cua ban: ");
                chon = Integer.parseInt(sc.nextLine());
            }  while (chon < 0 || chon > 9);
       
            switch (chon) {
            case 1:
            //Khoi tao mang
            x.input();
            break;

            case 2:
            x.showTT(); 
            break;

            case 3: 
            x.addElement();
            break;
            
            case 4: 
            x.deleteElenment();
            break;

            case 5: 
            System.out.print("Nhap 'Ten' ban muon cap nhat: ");
            x.update(sc.nextLine());
            break;

            case 6: 
            System.out.print("Nhap ten ban muon tim kiem (Chi can nhap ten): ");
            x.findByName(sc.nextLine());
            break;

            case 7: 
            x.docFile2();
            break;
            
            case 8: 
            x.ghiFile();
            break;
            
            case 9: 
            //Xoa mang
            x.clean();
            break;

            default:
            System.out.println("!!!");
            break;

            
        }
        
        if (chon == 0) {
            break;
        }

        }

    }
}
