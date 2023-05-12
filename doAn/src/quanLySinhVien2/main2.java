package quanLySinhVien2;
import java.nio.ShortBuffer;
import java.util.*;


public class main2 {
    public static void menu1() {
        System.out.println("                                                                       ");
        System.out.println("                                                                       ");
        System.out.println("                               THPT LE HONG PHONG                      ");
        System.out.println("                                 TP.HO CHI MINH                        ");
        System.out.println("                             DC: 235, Nguyen Van Cu.                   ");
        System.out.println("                             Tel: (+84-28) 38398506.                   ");
        System.out.println("                                                                       ");
        System.out.println("                                                                       ");
        System.out.println("                ===================================================    ");
        System.out.println("               ||      =========================================  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||    |     | 1 | Quan Ly Sinh Vien.            |  ||   ");
        System.out.println("               ||    |     | 2 | Quan Ly Nhan Vien.            |  ||   ");
        System.out.println("               ||    |     | 3 | Quan Ly Khoa.                 |  ||   ");
        System.out.println("               ||    |     | 4 | Quan Ly Lop.                  |  ||   ");
        System.out.println("               ||    |     | 5 | In Danh Sach                  |  ||   ");
        System.out.println("               ||    |     | 6 | Doc file.                     |  ||   ");
        System.out.println("               ||    |     | 7 | Ghi file.                     |  ||   ");
        System.out.println("               ||    |     | 8 | Clean!!!                      |  ||   ");
        System.out.println("               ||    |     | 0 | Exit!                         |  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||     ========================================    ||   ");
        System.out.println("                ===================================================    ");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public static void featureSV(){
        System.out.println("                ===================================================    ");
        System.out.println("               ||                   QUAN LY SINH VIEN             ||   ");
        System.out.println("               ||      =========================================  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||    |     | 1 | Them                          |  ||   ");
        System.out.println("               ||    |     | 2 | Sua                           |  ||   ");
        System.out.println("               ||    |     | 3 | Xoa                           |  ||   ");
        System.out.println("               ||    |     | 4 | Tim kiem theo ten             |  ||   ");
        System.out.println("               ||    |     | 5 | In Danh Sach                  |  ||   ");
        System.out.println("               ||    |     | 6 | Clean!!!                      |  ||   ");
        System.out.println("               ||    |     | 0 | Exit!                         |  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||     ========================================    ||   ");
        System.out.println("                ===================================================    ");   
    }

    public static void featureNV(){
        System.out.println("                ===================================================    ");
        System.out.println("               ||                   QUAN LY NHAN VIEN             ||   ");
        System.out.println("               ||      =========================================  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||    |     | 1 | Them                          |  ||   ");
        System.out.println("               ||    |     | 2 | Sua                           |  ||   ");
        System.out.println("               ||    |     | 3 | Xoa                           |  ||   ");
        System.out.println("               ||    |     | 4 | Tim kiem theo ten             |  ||   ");
        System.out.println("               ||    |     | 5 | In Danh Sach                  |  ||   ");
        System.out.println("               ||    |     | 6 | Clean!!!                      |  ||   ");
        System.out.println("               ||    |     | 0 | Exit!                         |  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||     ========================================    ||   ");
        System.out.println("                ===================================================    ");   
    }

    public static void featureKhoa(){
        System.out.println("                ===================================================    ");
        System.out.println("               ||               QUAN LY KHOA SINH VIEN            ||   ");
        System.out.println("               ||      =========================================  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||    |     | 1 | Them                          |  ||   ");
        System.out.println("               ||    |     | 2 | Xoa                           |  ||   ");
        System.out.println("               ||    |     | 3 | In Danh Sach                  |  ||   ");
        System.out.println("               ||    |     | 0 | Exit!                         |  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||     ========================================    ||   ");
        System.out.println("                ===================================================    ");   
    }

    public static void featureLop(){
        System.out.println("                ===================================================    ");
        System.out.println("               ||             QUAN LY LOP CUA NHAN VIEN           ||   ");
        System.out.println("               ||      =========================================  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||    |     | 1 | Them                          |  ||   ");
        System.out.println("               ||    |     | 2 | Xoa                           |  ||   ");
        System.out.println("               ||    |     | 3 | In Danh Sach                  |  ||   ");
        System.out.println("               ||    |     | 0 | Exit!                         |  ||   ");
        System.out.println("               ||    |                                         |  ||   ");
        System.out.println("               ||     ========================================    ||   ");
        System.out.println("                ===================================================    ");   
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
                System.out.println("");
                System.out.println("");
            }  while (chon < 0 || chon > 8);
       
            switch (chon) {
            case 1:
                int choose1;
                for(;;) {
                    do {
                        featureSV();
                        System.out.println("Nhap lua chon: ");
                        choose1 = Integer.parseInt(sc.nextLine());

                    }while(choose1 < 0 || choose1 > 6);

                    switch (choose1) {
                        case 1: 
                            x.addElementSV();
                        break;

                        case 2: 
                        System.out.print("Nhap ID ban muon Update!!!");
                            x.updateSV(sc.nextLine());
                        break;

                        case 3: 
                            x.deleteElenmentSV();
                        break;

                        case 4: 
                        System.out.print("Nhap Ten ban muon Update!!!");
                        x.findByNameSV(sc.nextLine());
                        break;

                        case 5: 
                            x.showTTSV();
                        break;

                        case 6: 
                            x.clean();
                        break;

                    }
                        if (choose1 == 0) break;
                }
            
            break;

            case 2:
                    int choose2;
                    for(;;) {
                        do {
                            featureNV();
                            System.out.println("Nhap lua chon: ");
                            choose2 = Integer.parseInt(sc.nextLine());

                        }while(choose2 < 0 || choose2 > 6);

                        switch (choose2) {
                            case 1: 
                                x.addElementNV();
                            break;

                            case 2: 
                                System.out.print("Nhap ID ban muon Update!!!");
                                x.updateSV(sc.nextLine());
                            break;

                            case 3: 
                                x.deleteElenmentNV();
                            break;

                                case 4: 
                                System.out.print("Nhap Ten ban muon Update!!!");
                                x.findByNameNV(sc.nextLine());
                            break;

                            case 5: 
                                x.showTTSV();
                            break;

                            case 6: 
                                x.clean();
                            break;

                        }
                            if (choose2 == 0) break;
                    }
                
                    break;

            case 3: 
                        int choose3;
                        for(;;) {
                            do {
                                featureKhoa();
                                System.out.println("Nhap lua chon: ");
                                choose3 = Integer.parseInt(sc.nextLine());

                            }while(choose3 < 0 || choose3 > 3);

                            switch (choose3) {
                                case 1: 
                                    x.showKhoaSV();;
                                break;

                                case 2: 
                                    x.deleteElenmentSV();;
                                break;

                                case 3: 
                                    x.showKhoaSV();
                                break;

                                

                            }
                                if (choose3 == 0) break;
                        }
                    
                        break;
            
            case 4: 
                        int choose4;
                        for(;;) {
                            do {
                                featureLop();
                                System.out.println("Nhap lua chon: ");
                                choose4 = Integer.parseInt(sc.nextLine());

                            }while(choose4 < 0 || choose4 > 3);

                            switch (choose4) {
                                case 1: 
                                    x.showLopSV();
                                break;

                                case 2: 
                                    x.deleteElenmentNV();
                                break;

                                case 3: 
                                    x.showLopSV();
                                break;

                                

                            }
                                if (choose4 == 0) break;
                        }
                        break;

                case 5: 
                            int choose5;
                        for(;;) {
                            do {
                                System.out.println("                ===================================================    ");
                                System.out.println("               ||      =========================================  ||   ");
                                System.out.println("               ||    |                                         |  ||   ");
                                System.out.println("               ||    |     | 1 | In bang SV                    |  ||   ");
                                System.out.println("               ||    |     | 2 | In bang NV                    |  ||   ");
                                System.out.println("               ||    |     | 3 | In Tat Ca Danh Sach           |  ||   ");
                                System.out.println("               ||    |     | 0 | Exit!                         |  ||   ");
                                System.out.println("               ||    |                                         |  ||   ");
                                System.out.println("               ||     ========================================    ||   ");
                                System.out.println("                ===================================================    ");   
                                System.out.print("Nhap lua chon cua ban: ");
                                choose5 = Integer.parseInt(sc.nextLine());
                            } while(choose5 < 0 || choose5 > 3);

                            if(choose5 == 0) break;

                            switch(choose5) {
                                case 1: 
                                        for(;;) {

                                            int subChoose5;
                                            do{
                                            System.out.println("                ===================================================    ");
                                            System.out.println("               ||      =========================================  ||   ");
                                            System.out.println("               ||    |                                         |  ||   ");
                                            System.out.println("               ||    |     | 1 | In bang theo khoa             |  ||   ");
                                            System.out.println("               ||    |     | 2 | In bang theo lop              |  ||   ");
                                            System.out.println("               ||    |     | 3 | In Tat Ca Danh Sach Sinh Vien |  ||   ");
                                            System.out.println("               ||    |     | 0 | Exit!                         |  ||   ");
                                            System.out.println("               ||    |                                         |  ||   ");
                                            System.out.println("               ||     ========================================    ||   ");
                                            System.out.println("                ===================================================    ");   
                                            System.out.print("Nhap lua chon cua ban: ");
                                            subChoose5 = Integer.parseInt(sc.nextLine()); 
                                        }
                                            while(subChoose5 < 0 && subChoose5 > 3);

                                            if (subChoose5 == 0) break;
                                        
                                            
                                            switch(subChoose5) {
                                                case 1:
                                                System.out.print("Nhap Ma Khoa!");
                                                    x.showTTSVByKhoa(sc.nextLine());
                                                break;

                                                case 2: 
                                                    System.out.println("Nhap Ma Lop!");
                                                    x.showTTSVByLop(sc.nextLine());
                                                break;
                                                

                                                case 3:
                                                    x.showTTSV();
                                                    x.showTTNV();
                                                break;
                                            }    
                                            }    

                                    
                                break;

                                case 2: 
                                    x.showTTNV();
                                break;

                                case 3: 
                                    x.showTTSV();
                                    x.showTTNV();
                                break;
                            }
                        }
                         
                        
            break;
                    
            case 6: 
            x.docFile2();
            break;
            
            case 7: 
            x.ghiFile();
            break;
            
            case 8: 
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
