package QuanlySV;

import java.util.*;

public class main {

    public static void menu1() {
        System.out.println("1: Nhap thong tin cho danh sach sinh vien.");
        System.out.println("2: Hien thi thong tin danh sach ");
        System.out.println("3: Them doi tuong.");
        System.out.println("4: Xoa doi tuong.");
        System.out.println("5: Cap nhat.");
        System.out.println("6: Tim kiem theo ID.");
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
                chon = Integer.parseInt(sc.nextLine());
            }while (chon < 0 || chon > 7);
       
            switch (chon) {
            case 1:
            x.input();
            break;

            case 2:
            x.showTT(); 
            break;

            case 3: 
            x.add();
            break;
            
            case 4: 
            x.delete();
            break;

            case 5: 
            x.update();
            break;

            case 6: 
            x.findByID();
            break;

        }
        
        if (chon == 0) {
            break;
        }

        }



    }
}
