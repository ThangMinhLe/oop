package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;
import java.io.*;
import java.util.Arrays;

public class quanly {
    Scanner sc = new Scanner(System.in);

    sinhVien sv[] = new sinhVien[0];
    nhanVien nv[] = new nhanVien[0];
    // sinhVien sv[] = new sinhVien[1];

      //Menu
      public void menu() {
        System.out.println("1: Sinh Vien.");
        System.out.println("2: Giang Vien.");
        System.out.println("3: Nhan vien van phong");
        System.out.println("4: Bao ve");
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
                            sv[sv.length - 1] = new sinhVien();
                            sv[sv.length - 1].nhapTT();
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

    public void showTT () {
    
        System.out.println("Day la bang sinh vien");
        System.out.printf("%-5s| %-16s| %-5s| %-5s| %-10s| %-10s| %-10s| %-10s| %-10s| %-5s \n",
        "ID", "Ten", "Phai", "NSinh", "DChi", "Lop", "Khoa", "Mon Hoc", " Diem", "Loai"  );

        for(sinhVien x: sv){
            x.xuatTT();
        }
        
        System.out.println("Day la bang nhan vien.");
        System.out.printf("%-5s| %-5s| %-16s| %-5s| %-5s| %-10s| %-10s| %-10s| %-10s| %-10s| %-5s \n",
        "...","ID", "Ten", "Phai", "NSinh", "DChi","So gio", "NLuong", "Luong", "Mon Day",  "Loai" );
        for(nhanVien x: nv) {
        x.xuatTT();
        }
        }


    public void addElement(){
        int choose;

        while (true){
            System.out.println("Lua chon bang du lieu ban muon thao tac!!");
            System.out.println("1: Bang sinh vien.");
            System.out.println("2: Bang nhan vien.");
            System.out.println("0: Exit.");
            choose = sc.nextInt();
            if(choose >= 0 && choose < 3) break;
        }

        switch(choose){
            case 1:
            int index;
            System.out.println("Do dai cua mang SV: " + sv.length);
            System.out.print("Nhap vi tri ban muon them: ");
            sv = Arrays.copyOf(sv, sv.length + 1);
            sv[sv.length - 1] = new sinhVien();
            index = sc.nextInt();
            if (index <= 0 ) {index = 1;}
            if(index >= sv.length) {index = sv.length;}

            
            for (int i = sv.length - 1; i > index - 1; i-- ){
                sv[i] = sv[i-1];
            }
            
            sinhVien svnew = new sinhVien();
            svnew.nhapTT();
            sv[index - 1] = svnew;
            
            break;
            case 2:
                    int index1, choose2;
                    nv = Arrays.copyOf(nv,nv.length + 1);
                    
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

            break;
        }

        
    }

    public void deleteElenment(){
        int choose;

        while (true){
            System.out.println("Lua chon bang du lieu ban muon thao tac!!");
            System.out.println("1: Bang sinh vien.");
            System.out.println("2: Bang nhan vien.");
            System.out.println("0: Exit.");
            choose = sc.nextInt();
            if(choose >= 0 && choose < 3) break;
        }

        switch(choose){
            case 1: 
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
            } else {
                System.out.println("No data");
            }
            break;

            case 2: 
            if(!checkNullnv()){
            nv = Arrays.copyOf(nv,nv.length - 1 );
            System.out.println("Delete Success!!!");
            }
            else {
                System.out.println("No data!!!");
            }
            break;
        }
        
    }

    public void findByName(String st) {
        st = st.toLowerCase();
        System.out.println(st);
        boolean check = true;
        for (sinhVien x : sv) {
            if (x.getName().toLowerCase().endsWith(st)) {
                x.xuatTT();
                check = false;
                break;
            }
        }
        if (check) {
            for (nhanVien x : nv) {
                if (x.getName().toLowerCase().endsWith(st)) {
                    x.xuatTT();
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println("No matching record found.");
        }
    }
    
    public void update(String ID){
        ID = ID.toLowerCase();
        boolean check = true;
        
        for (sinhVien x : sv) {
           if(x.getId().equalsIgnoreCase(ID) ){
            x.nhapTT();
            check = false;
           }
        }
        if (check) {
            for(nhanVien x:nv){
                if(x.getId().equalsIgnoreCase(ID)){
                x.nhapTT();
                check = false;
                }
            }
        }

        if(check) {
            System.out.println("ID ban muon cap nhat la khong co.");
        }
    }


        public void docFile2(){
            xuLyfile f = new xuLyfile();
            f.DocFile();
            sv = f.resultsv();
            nv = f.resultnv();
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
        }


}



