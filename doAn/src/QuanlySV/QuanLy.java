package QuanlySV;

import javax.xml.transform.Source;

import javafx.scene.paint.Stop;



import java. util.*;
public class QuanLy {
    person ps[] = new person[0];
    Scanner sc = new Scanner(System.in);
    public void menu() {
        System.out.println("1: Sinh Vien.");
        System.out.println("2: Giang Vien.");
        System.out.println("3: Co Van Hoc Tap");
    } 

    public void input() {
        int choose, n;
        System.out.print("Nhap so luon doi tuong ban muon khoi tao: ");
        n = sc.nextInt();
        for (int i =0; i< n; i++){
            ps = Arrays.copyOf(ps,ps.length +1);
        do{
        System.out.print("Chon doi tuong ban muon nhap.\n");
        menu();
        choose = sc.nextInt();
        if (choose > 3) {
            System.out.println("Lua chon cua ban khong hop le!");
        }
        } while(choose > 3); 
        switch (choose) {
            case 1:
             ps[ps.length -1] = new sinhVien();
             break;
            case 2:
            ps[ps.length -1] = new giangVien();
            break;
            case 3:
            ps[ps.length -1] = new coVanHocTap();
            break;
        } 
            ps[ps.length-1].nhapTT();
    }
    }

    public void showTT () {
       int n = ps.length; 
       System.out.printf("%-7s|%-20s|%-11s|%-10s|%-20s|%-5s|%-5s|%-5s|%-10s|%-10s\n",
        "Ma So","Ten" , "Gioi Tinh" ,"Nam Sinh","Dia Chi",
       "Lop", "Khoa", "Diem","Lop Co Van","Mon Day" );
       for(person x: ps) {
       x.xuatTT();
    }
    }

    public static void menu1 () {
        System.out.println("1: Nhap thong tin cho danh sach sinh vien.");
        System.out.println("2: Hien thi thong tin danh sach ");
        System.out.println("3: Them doi tuong.");
        System.out.println("4: Xoa doi tuong.");
        System.out.println("5: Cap nhat.");
        System.out.println("6: Tim kiem theo ten.");
        System.out.println("0: Exit!");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy x = new QuanLy();
        int chon;
       for (;;){
         do {
                menu1();
                System.out.print("Nhap lua chon cua ban: ");
                chon = sc.nextInt();
            }while (chon < 0 || chon > 7);
        switch (chon) {
            case 1:
            x.input();
            break;
            case 2:
            x.showTT();            
            break;
        }
        
        if (chon == 0) {
            break;
        }

        }



    }


    
}
