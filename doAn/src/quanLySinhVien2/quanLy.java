package quanLySinhVien2;

import java.util.*;
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
        "ID", "Ten", "Phai", "NSinh", "DChi", "Lop", "Khoa", "Mon Hoc", " Diem", "Loai"  );

        for(hocSinh x: sv){
            x.xuatTT();
        }
        System.out.println("Bang hoc sinh co: " + countsv + " hoc sinh");
        
        }

        public void showTTSVByKhoa (String khoa) {
            boolean check = true;
            System.out.println("Day la bang sinh vien");
            System.out.printf("%-5s| %-16s| %-5s| %-5s| %-10s| %-10s| %-10s| %-10s| %-10s| %-5s \n",
            "ID", "Ten", "Phai", "NSinh", "DChi", "Lop", "Khoa", "Mon Hoc", " Diem", "Loai"  );
    
            for(hocSinh x: sv){
                if(x.getKhoa().getMaKhoa().equalsIgnoreCase(khoa))
                x.xuatTT();
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
                "ID", "Ten", "Phai", "NSinh", "DChi", "Lop", "Khoa", "Mon Hoc", " Diem", "Loai"  );
        
                for(hocSinh x: sv){
                    if(x.getLop().getMaLop().equalsIgnoreCase(lop))
                    x.xuatTT();
                    check = false;
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

            
            for (int i = sv.length - 1; i > index - 1; i-- ){
                sv[i] = sv[i-1];
            }
            
            hocSinh svnew = new hocSinh();
            svnew.nhapTT();
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
                    nv[nv.length - 1]. nhapTT();

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
        
        for (hocSinh x : sv) {
           if(x.getId().equalsIgnoreCase(ID) ){
            x.nhapTT();
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

        for(nhanVien x:nv){
            if(x.getId().equalsIgnoreCase(ID)){
            x.nhapTT();
            check = false;
            }
        }

        if(check) {
            System.out.println("Khong co ID ban muon cap nhat!!!!");
        }
    }

    //Mon hoc 
    public void showMH() {
        System.out.printf("%-15s| %-15s","Ma Mon Hoc","Ten mon hoc");
    }

    // Bang Lop
    public void showLopSV() {
        System.out.println("Day la bang lop!");
        System.out.printf("%-10s| %-10s","Ma Lop","Ten Lop");
        for(lopCuaSinhVien x:lop) {
            x.showLop();
        }
    }

    public void showKhoaSV() {
        System.out.println("Day la bang lop!");
        System.out.printf("%-10s| %-10s","Ma Lop","Ten Lop");
        for(khoaCuaSinhVien x:khoa) {
            x.showKhoa();
        }
    }


    //doc File
        public void docFile2(){
            xuLyfile f = new xuLyfile();
            f.DocFile();
            sv = f.resultsv();
            nv = f.resultnv();
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
            countsv = 0;
            countnv = 0;
        }


}



