package quanLySinhVien2;

import java.util.*;
import java.util.Scanner;
import java.lang.NullPointerException;
import java.sql.Blob;
import java.io.*;
import java.util.Arrays;

public class quanly {
    Scanner sc = new Scanner(System.in);

    hocSinh sv[] = new hocSinh[0];
    nhanVien nv[] = new nhanVien[0];
    monhoc mh[] = new monhoc[0];
    khoaCuaSinhVien khoa[] = new khoaCuaSinhVien[0];
    lopCuaSinhVien lop[] = new lopCuaSinhVien[0];
    static int countsv = 0;
    static int countnv = 0;

      //Menu
      public void menu() {
        System.out.println("============================================");
        System.out.println("||   =================================    ||");
        System.out.println("|| ||         1: Hoc sinh .           ||  ||");
        System.out.println("|| ||         2: Giao vien .          ||  ||");
        System.out.println("|| ||         3: Nhan vien van phong  ||  ||");
        System.out.println("|| ||         4: Bao ve               ||  ||");
        System.out.println("||   =================================    ||");
        System.out.println("============================================");
    } 

        //menu1
        public void menu1 () {
        System.out.println("1: Giang Vien.");
        System.out.println("2: Nhan vien van phong.");
        System.out.println("3: Bao ve.");
    }

    //Create data!!!
    public void input() {
        int choose, choose1, n;
        
        while (true) {
                while (true) {
                    System.out.println("1: Mang SV");
                    System.out.println("2: Mang NV");
                    System.out.println("0: Hoan tat nhap mang/Exits");
                    System.out.print("Nhap lua chon: ");
                    choose1 = sc.nextInt();
                    System.out.println(choose1);
                    if (choose1 >= 0 && choose1 <= 3) {
                        break;
                    }
                }
        

            //Thoat nhap creat bang
            if(choose1 == 0) break;
            
            switch (choose1) {
                case 1:
                    if (checkNullsv()) {
                        System.out.print("Nhap so luon doi tuong ban muon khoi tao: ");
                        n = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            sv = Arrays.copyOf(sv, sv.length + 1);
                            sv[sv.length - 1] = new hocSinh();
                            
                            //Logic xu ly nhap ID cho class Sinh Vien.
                            boolean check = false;
                            String ID;
                            {
                                sc.nextLine();
                            System.out.print("Moi ban nhap ID");
                            ID = sc.nextLine();
                            for (hocSinh h : sv){
                                if (h.getId() == ID) {
                                    System.out.print("Id da ton tai! Moi nhao lai ID moi!");
                                    check = true;
                                } else {
                                    check = false;
                                }
                            }
                            } while (check); 

                            sv[sv.length - 1].setId(ID);
                            sv[sv.length - 1].nhapTT();
                            countsv += 1;
                        }
                    }
                    else {
                        System.out.println("Da co Array Sinh Vien !!");
                    }
                    break;
                case 2:
                    if (checkNullnv()) {
                        System.out.print("Nhap so luong doi tuong ban muon khoi tao: ");
                        n = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            nv = Arrays.copyOf(nv, nv.length + 1);
                            countnv += 1;
                            do {
                                System.out.print("Chon doi tuong ban muon nhap.\n");
                                menu1();
                                choose = sc.nextInt();
                                if (choose < 1 || choose > 3) {
                                    System.out.println("Lua chon cua ban khong hop le!");
                                }
                            } while (choose < 1 || choose > 3);
    
                            // Switch khoi tao nhan vien.
                            switch (choose) {
                                case 1:
                                    nv[nv.length - 1] = new giangVien();
                                    nv[nv.length - 1].nhapTT();
                                    break;
                                case 2:
                                    nv[nv.length - 1] = new nhanVienVanPhong();
                                    nv[nv.length - 1].nhapTT();
                                    break;
                                case 3:
                                    nv[nv.length - 1] = new baoVe();
                                    nv[nv.length - 1].nhapTT();
                                    break;
    
                            }
                        }
                    } 
                    else {
                        System.out.println("Da co Array NV!!!");
                    }
                    break;
            }
        }
    }
    

    public boolean checkNullsv () {
        if(sv.length == 0) {
            return true;
        }

        return false;
    }

    public boolean checkNullnv () {
        if(nv.length == 0) {
            return true;
        }

        return false;
    }

    public void showTTSV () {
    
        System.out.println("Day la bang sinh vien");
        System.out.printf("%-5s| %-16s| %-5s| %-5s| %-10s| %-10s| %-10s| %-10s| %-10s| %-5s \n",
        "ID", "Ten", "Phai", "NSinh", "DChi", "Lop", "Khoa", "P.Huynh", " Diem", "Loai"  );

        for(hocSinh x: sv){
            x.xuatTT();
        }
        System.out.println("Bang hoc sinh co: " + countsv + " hoc sinh");
        
        }

        public void showTTSVByKhoa (String khoa) {
            boolean check = true;
            System.out.println("Day la bang sinh vien");
            System.out.printf("%-5s| %-16s| %-5s| %-5s| %-10s| %-10s| %-10s| %-10s| %-10s| %-5s \n",
            "ID", "Ten", "Phai", "NSinh", "DChi", "Lop", "Khoa", "P.Huynh", " Diem", "Loai"  );
    
            for(int i = 0; i <= sv.length - 1; i++) {
                if(sv[i].getKhoa().getMaKhoa().equalsIgnoreCase(khoa))
                sv[i].xuatTT();
                check = false;
            }

            if(check) {
                System.out.println("Khoa khong co sinh vien!");
            }
          
            
            }
        
            public void showTTSVByLop (String lop) {
                boolean check = true;
                System.out.println("Day la bang sinh vien");
                System.out.printf("%-5s| %-16s| %-5s| %-5s| %-10s| %-10s| %-10s| %-10s| %-10s| %-5s \n",
                "ID", "Ten", "Phai", "NSinh", "DChi", "Lop", "Khoa", "P.Huynh", " Diem", "Loai"  );
        
                for(int i = 0; i <= sv.length - 1; i++) {
                    if(sv[i].getLop().getTenLop().equalsIgnoreCase(lop)){
                    sv[i].xuatTT();
                    check = false;
                    }
                }
    
    
                if(check) {
                    System.out.println("Khoa khong co sinh vien!");
                }
              
                
                }

        public void showTTNV (){
            System.out.println("Day la bang nhan vien.");
            System.out.printf("%-5s| %-5s| %-16s| %-5s| %-5s| %-10s| %-10s| %-10s| %-10s| %-10s| %-5s \n",
            "...","ID", "Ten", "Phai", "NSinh", "DChi","So gio", "NLuong", "Luong", "Mon Day",  "Loai" );
            for(nhanVien x: nv) {
            x.xuatTT();
            }
            System.out.println("Bang nhan vien co: " + countnv + " nhan vien.");
        }

        public static void menuarrays(){
            System.out.println(" ========================================================");
            System.out.println("||                                                       ||");
            System.out.println("||     Lua chon bang du lieu ban muon thao tac!!         ||");
            System.out.println("||              1: Bang sinh vien.                       ||");
            System.out.println("||              2: Bang nhan vien.                       ||");
            System.out.println("||              0: Exit.                                 ||");
            System.out.println("||                                                       ||");
            System.out.println(" ========================================================  ");
        } 

    public void addElementSV(){
    
            int index;
            System.out.println("Do dai cua mang SV: " + sv.length);
            System.out.print("Nhap vi tri ban muon them: ");
            sv = Arrays.copyOf(sv, sv.length + 1);
            sv[sv.length - 1] = new hocSinh();
            countsv += 1;
            index = sc.nextInt();
            if (index <= 0 ) {index = 1;}
            if(index >= sv.length) {index = sv.length;}

            // Xu ly logic chen mang
            for (int i = sv.length - 1; i > index - 1; i-- ){
                sv[i] = sv[i-1];
            }
            

            hocSinh svnew = new hocSinh();


            boolean check = false;
            String ID;

            // Xoa bo nho dem ban phim
            sc.nextLine();
            do {
                System.out.print("Moi ban nhap ID: ");
                ID = sc.nextLine();
            
                // Loop through all the students in the arraylist to check if the entered ID already exists
                // int i = 0;
                for (int i = 0; i < sv.length; i++){
                       if(sv[i].getId().equals(ID)){
                        System.out.println("ID da ton tai! Moi nhap lai ID moi!");
                        check = true; 
                        break;
                       } else {
                        check = false;
                       }
                   
                }
            } while (check); // Keep asking for ID until a unique ID is entered
            
            

            svnew.setId(ID);
            svnew.nhapTT();

                // Logic nhap khoa va lop cho sinh vien.
                lopCuaSinhVien lopMoi = new lopCuaSinhVien();
                System.out.println("Nhap lop cho sv!!!");

                // Logic xu ly de lay ma lop
                int indexLop;
                int i;
                String codeLop;
                boolean checkLop = true;
                do{
                System.out.print("Nhap ma lop cho sinh vien: ");
                codeLop = sc.nextLine();
                // System.out.println(codeLop);
                for( i = 0; i < lop.length ; i++) {
                    if(lop[i].getMaLop().equalsIgnoreCase(codeLop)) {
                        checkLop = false;
                        break;
                    }
                }

                if(checkLop) {
                    System.out.println("Ma lop ban nhap la khong co!!");
                }

                }while (checkLop);

                lopMoi.setMaLop(codeLop);
                lopMoi.setTenLop(lop[i].getTenLop());
                svnew.setLop(lopMoi);
            

                // Khoa Logic Add database
                khoaCuaSinhVien khoaMoi = new khoaCuaSinhVien();
                System.out.println("Nhap khoa cho sinh vien!!!");
                
                // Logic xu ly de lay ma khoa
                int inde = 0;
                int i1;
                String codeKhoa;
                boolean checkKhoa = true;
                
                do{
                System.out.print("Nhap ma khoa cho sinh vien: ");
                codeKhoa = sc.nextLine();
                System.out.println(codeKhoa);
                for( i1 = 0; i1 < khoa.length ; i1++) {
                    // System.out.println(khoa[i1].getMaKhoa().equalsIgnoreCase(codeKhoa));
                    if(khoa[i1].getMaKhoa().equalsIgnoreCase(codeKhoa)) {
                        inde = i1;
                        checkKhoa = false;
                        break;
                    }
                }
                if(checkKhoa){
                    System.out.println("Ma khoa ban nhap khong co!!!");
                }

                }while (checkKhoa);

                // System.out.print("Nhap ten khoa cho sinh vien: ");
                khoaMoi.setMaKhoa(codeKhoa);
                khoaMoi.setTenKhoa(khoa[inde].getTenKhoa());
                svnew.setKhoa(khoaMoi);

                sv[index - 1] = svnew;
            
    }

    public void addElementNV() {
        int index1, choose2;
                    nv = Arrays.copyOf(nv,nv.length + 1);
                    countnv += 1;
                    while(true){
                        menu1();
                        System.out.print("Chon doi tuong ban muon them: ");
                        choose2 = sc.nextInt();
                        if(choose2 >=1 && choose2 <= 3) break;
                        else {
                            System.out.println("Lua chon cua ban chua hop le!");
                        }

                    }

                    switch(choose2){
                            case 1:
                            nv[nv.length - 1] = new giangVien();
                            break;
                            case 2:
                            nv[nv.length - 1] = new nhanVienVanPhong();
                            break;
                            case 3: 
                            nv[nv.length] = new baoVe();    
                    }

                    // Xu ly Logic de add phan tu nhan vien vao mang!
                    
            boolean check = false;
            String ID;

            // Xoa bo nho dem ban phim
            sc.nextLine();
            do {
                System.out.print("Moi ban nhap ID: ");
                ID = sc.nextLine();
            
                // Loop through all the students in the arraylist to check if the entered ID already exists
                for (int i =0; i <= nv.length - 2; i++) {
                       if(nv[i].getId().equals(ID)){
                        System.out.println("ID da ton tai! Moi nhap lai ID moi!");
                        check = true; 
                        break;
                       } else {
                        check = false;
                       }

                   
                }
            } while (check);
                    // The rest of the code to create a new student object with the entered ID can be added here
                    
        
                    nv[nv.length - 1].setId(ID);
                    nv[nv.length - 1].nhapTT();

    }


    public void deleteElenmentSV(){
        int choose;

        
               if(!checkNullsv()) {
                int index;    
                System.out.print("Nhap vi tri ban muon xoa: ");
                index = sc.nextInt();
                if(index <= 0) index = 1;
                if(index >= nv.length) index = sv.length;

                for(int i = index - 1; i < sv.length - 1; i++) {
                    sv[i] = sv[i + 1];
                }

                sv = Arrays.copyOf(sv, sv.length - 1);
                System.out.println("Delete Success!!!");
                countsv -= 1;
            } else {
                System.out.println("No data");
            }
       
    }

    public void deleteElenmentNV () {
        if(!checkNullnv()){
            nv = Arrays.copyOf(nv,nv.length - 1 );
            System.out.println("Delete Success!!!");
            countnv -= 1;
            }
            else {
                System.out.println("No data!!!");
            }
    }

    public void findByNameSV(String st) {
        st = st.toLowerCase();
        System.out.println("");
        boolean check = true;
        for (hocSinh x : sv) {
            if (x.getName().toLowerCase().endsWith(st)) {
                x.toStringToDetail();;
                check = false;
                System.out.println("");
            }
        }
        
        if (check) {
            System.out.println("No matching record found.");
        }
    }

    public void findByNameNV (String st) {
        Boolean check = true;
        st = st.toLowerCase();
        System.out.println("");
              if (check) {
            for (nhanVien x : nv) {
                if (x.getName().toLowerCase().endsWith(st)) {
                    x.toStringToDetail();
                    check = false;
                    System.out.println("");
                }
            }
        }

        if(check) {
            System.out.println("Khong co ten ban muon tim!!!");
        }
    }
    
    public void updateSV(String ID){
        ID = ID.toLowerCase();
        boolean check = true;
        
        for (int i = 0; i < sv.length; i++) {
           if(sv[i].getId().equalsIgnoreCase(ID) ){
            sv[i].nhapTT();

            //Update khoa va lop 
            
                // Logic nhap khoa va lop cho sinh vien.
                lopCuaSinhVien lopMoi = new lopCuaSinhVien();
                System.out.println("Nhap lop cho sv!!!");

                // Logic xu ly de lay ma lop
                int indexLop;
                int i1 = 0;
                String codeLop;
                boolean checkLop = true;
                do{
                System.out.print("Nhap ma lop cho sinh vien: ");
                codeLop = sc.nextLine();
                // System.out.println(codeLop);
                for( i1 = 0; i1 < lop.length ; i1++) {
                    if(lop[i1].getMaLop().equalsIgnoreCase(codeLop)) {
                        checkLop = false;
                        break;
                    }
                }

                if(checkLop) {
                    System.out.println("Ma lop ban nhap la khong co!!");
                }

                }while (checkLop);

                lopMoi.setMaLop(codeLop);
                lopMoi.setTenLop(lop[i].getTenLop());
                sv[i].setLop(lopMoi);
            

                // Khoa Logic Add database
                khoaCuaSinhVien khoaMoi = new khoaCuaSinhVien();
                System.out.println("Nhap khoa cho sinh vien!!!");
                
                // Logic xu ly de lay ma khoa
                int inde = 0;
                int i2;
                String codeKhoa;
                boolean checkKhoa = true;
                
                do{
                System.out.print("Nhap ma khoa cho sinh vien: ");
                codeKhoa = sc.nextLine();
                System.out.println(codeKhoa);
                for( i2 = 0; i2 < khoa.length ; i2++) {
                    // System.out.println(khoa[i1].getMaKhoa().equalsIgnoreCase(codeKhoa));
                    if(khoa[i2].getMaKhoa().equalsIgnoreCase(codeKhoa)) {
                        inde = i2;
                        checkKhoa = false;
                        break;
                    }
                }
                if(checkKhoa){
                    System.out.println("Ma khoa ban nhap khong co!!!");
                }

                }while (checkKhoa);

                // System.out.print("Nhap ten khoa cho sinh vien: ");
                khoaMoi.setMaKhoa(codeKhoa);
                khoaMoi.setTenKhoa(khoa[inde].getTenKhoa());
                sv[i].setKhoa(khoaMoi);


            check = false;
           }
        }
        if(check) {
            System.out.println("Ten ban muon cap nhat la khong co.");
        }
    }

    public void updateNV(String ID) {
        boolean check = true;
        ID = ID.toLowerCase();
        // sc.nextLine();
        for(int i = 0; i < nv.length; i++){
            if(nv[i].getId().equalsIgnoreCase(ID)){
                nv[i].nhapTT();
            check = false;
            }
        }

        if(check) {
            System.out.println("Khong co ID ban muon cap nhat!!!!");
        }
    }

    //Mon hoc 
    public void showMH() {
        System.out.printf("%-15s| %-15s\n","Ma Mon Hoc","Ten mon hoc");
    }

        // Lop!!!!!
        public void nhapLop() {
            lop = Arrays.copyOf(lop, lop.length + 1 );
            lop[lop.length - 1].nhap();
        }


    // Bang Lop
    public void showLopSV() {
        System.out.println("Day la bang lop!");
        System.out.printf("%-10s| %-10s\n","Ma Lop","Ten Lop");
        for(lopCuaSinhVien x:lop) {
            x.showLop();
        }
    }

    public void addLop(){
        lop = Arrays.copyOf(lop, lop.length + 1);
        System.out.println("Mang lop co do dai la: " + lop.length);
        System.out.println("Moi nhap vi tri can them vao mang: ");
        int index = sc.nextInt();
        sc.nextLine();
        if(index > lop.length) index = lop.length;
        if(index < 0) index = 1;
        for(int i = lop.length - 1 ; i > index - 1; i--) {
            lop[i] = lop[i - 1];
        }

        lopCuaSinhVien lopnew = new lopCuaSinhVien();
        // Xu ly Logic set maLop la lop chinh
        String keyMaLop;
        boolean check = false;

        do{

            System.out.print("Nhap ma lop: ");
            keyMaLop = sc.nextLine();
            
            for(int i = 0; i < lop.length - 2; i++) {

                    if(lop[i].getMaLop().equalsIgnoreCase(keyMaLop)){
                        System.out.println("ID da ton tai! Moi nhap lai ID moi!");
                        check = true; 
                        break;
                       } else {
                        check = false;
                       }
                    
            }

        }while (check);

        lopnew.setMaLop(keyMaLop);
        lopnew.nhap();
        lop[index - 1] = lopnew;

        
    }

    public void deleteLop() {
        int index;

        System.out.print("Nhap vi tri can xoa: ");
        index = sc.nextInt();

        if(index > lop.length) index = khoa.length;
        if(index <= 0) index = 1;

        index = index - 1;
        for(int i = index; i < lop.length - 1 ; i ++) {
            lop[i] = lop[i + 1];
        }

        lop = Arrays.copyOf(lop,lop.length - 1);
    }


    // Khoa!!!!!
    public void showKhoaSV() {
        System.out.println("Day la bang lop!");
        System.out.printf("%-10s| %-10s\n","Ma Lop","Ten Lop");
        for(khoaCuaSinhVien x:khoa) {
            x.showKhoa();
        }
    }

    public void nhapKhoa() {
        khoa = Arrays.copyOf(khoa, khoa.length + 1);
        String keyMaKhoa;
        boolean check = false;

        do{

            System.out.print("Nhap ma khoa: ");
            keyMaKhoa = sc.nextLine();
            
            for(int i = 0; i < khoa.length - 2; i++) {

                    if(khoa[i].getMaKhoa().equalsIgnoreCase(keyMaKhoa)){
                        System.out.println("ID da ton tai! Moi nhap lai ID moi!");
                        check = true; 
                        break;
                       } else {
                        check = false;
                       }
                    
            }

        }while (check);

        khoa[khoa.length - 1].setMaKhoa(keyMaKhoa);
        khoa[khoa.length - 1].nhap();
    }

    
    public void addKhoa(){
        khoa = Arrays.copyOf(khoa, khoa.length + 1);
        System.out.println("Mang khoa co do dai la: " + lop.length);
        System.out.println("Moi nhap vi tri can them vao mang: ");
        int index = sc.nextInt();
        sc.nextLine();
        if(index > khoa.length) index = khoa.length;
        if(index < 0) index = 1;
        for(int i = khoa.length - 1 ; i > index - 1; i--) {
            khoa[i] = khoa[i - 1];
        }

        khoaCuaSinhVien khoanew = new khoaCuaSinhVien();
        // Xu ly Logic set maKhoa la khoa chinh
        String keyMaKhoa;
        boolean check = false;

        do{

            System.out.print("Nhap ma khoa: ");
            keyMaKhoa = sc.nextLine();
            
            for(int i = 0; i < khoa.length - 2; i++) {

                    if(khoa[i].getMaKhoa().equalsIgnoreCase(keyMaKhoa)){
                        System.out.println("ID da ton tai! Moi nhap lai ID moi!");
                        check = true; 
                        break;
                       } else {
                        check = false;
                       }
                    
            }

        }while (check);

        khoanew.setMaKhoa(keyMaKhoa);
        khoanew.nhap();
        khoa[index - 1] = khoanew;

        
    }


    public void deleteKhoa(){

        int index;

        System.out.print("Nhap vi tri can xoa: ");
        index = sc.nextInt();

        if(index > khoa.length) index = khoa.length;
        if(index <= 0) index = 1;

        index = index - 1;
        for(int i = index; i < khoa.length - 1 ; i ++) {
            khoa[i] = khoa[i + 1];
        }

        khoa = Arrays.copyOf(khoa,khoa.length - 1);
    }

    //doc File
        public void docFile2(){
            xuLyfile f = new xuLyfile();
            f.DocFile();
            sv = f.resultsv();
            nv = f.resultnv();
            lop = f.resultlop();
            khoa = f.resultkhoa();
            countsv = sv.length;
            countnv = nv.length;
        }

        public void ghiFile(){
            xuLyfile f = new xuLyfile();
            f.returnsv(sv);
            f.returnnv(nv);
            f.ghiFile2();
            
        }

        public void clean(){
            sv = Arrays.copyOf(sv, 0);
            nv = Arrays.copyOf(nv, 0);
            khoa = Arrays.copyOf(khoa, 0);
            lop = Arrays.copyOf(lop, 0);
            countsv = 0;
            countnv = 0;
        }

        public void cleanSV() {
            sv = Arrays.copyOf(sv, 0);
            countsv = 0;
        }

        public void cleanNV() {
            nv = Arrays.copyOf(nv, 0);
            countnv = 0;
        }

}



