package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public class quanlynew {
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
                    System.out.println("3: Hoan tat nhap mang");
                    System.out.print("Nhap lua chon: ");
                    choose1 = sc.nextInt();
                    System.out.println(choose1);
                    if (choose1 >= 1 && choose1 <= 3) {
                        break;
                    }
                }
        

            //Thoat nhap creat bang
            if(choose1 == 3) break;
            
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

    
    public void inputexamdata(){
        ngaySinh ns = new ngaySinh(2003, 03, 07);
        diaChi dc = new diaChi("Thu Duc", "Ho Chi Minh");
        lopCuaSinhVien lop = new lopCuaSinhVien("dct", "dct1212");
        khoaCuaSinhVien khoa = new khoaCuaSinhVien("cntt", "Cong nghe");
        phuHuynh ph = new phuHuynh("Tin Dang", "0376142044");
        monhoc mh = new monhoc( "Toan", 9.8);


        salary sala = new salary(4, 2000000);

        // sv = Arrays.copyOf(sv, sv.length + 1);
        sv = Arrays.copyOf(sv,sv.length + 1);
        sv[0] = new sinhVien("01", "Tin Dang", "nam" , 
            ns, dc, lop, khoa, ph, mh);
        
            sv = Arrays.copyOf(sv,sv.length + 1);
            sv[1] = new sinhVien("02", "Le Minh Thang", "nam" , 
        ns, dc, lop, khoa, ph, mh);
       
        nv = Arrays.copyOf(nv,nv.length + 3);
        nv[0] = new giangVien("01", "Le Minh Thang", "nam" , 
        ns, dc,"CSDL", sala);
        nv[1] = new baoVe("02", "Hoang Thai", "nam" , 
        ns, dc, 28.9, 200000 );
        nv[2] = new nhanVienVanPhong("03", "Le Minh Thang", "nam" , 
        ns, dc, 100, 20000);

    }

    public void showTT () {
    
        System.out.println("Day la bang sinh vien");
        for(sinhVien x: sv){
            x.xuatTT();
        }
        
        System.out.println("Day la bang nhan vien.");
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
            index = sc.nextInt();
            if (index <= 0 ) {index = 1;}
            if(index >= sv.length) {index = sv.length;}

            sv = Arrays.copyOf(sv, sv.length + 1);
            sv[sv.length - 1] = new sinhVien();
            for (int i = sv.length - 1; i > index - 1; i-- ){
                sv[i] = sv[i-1];
            }
            
            sinhVien svnew = new sinhVien();
            svnew.nhapTT();
            sv[index - 1] = svnew;
            
            break;
            case 2:
            // int index1;
            // System.out.println("Do dai cua mang: " + nv.length);
            // System.out.print("Nhap vi tri muon them vao cho nhan vien: ");
            // index1 = sc.nextInt();
            // if(index1 <= 0 ) {index1 = 1;}
            // if(index1 >= nv.length ) {index1 = nv.length;}

            nv = Arrays.copyOf(nv,nv.length + 1);
            nv[nv.length -1] = new giangVien();

            nv[nv.length - 1].nhapTT();

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
               if(!checkNullsv()) {int index;    
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

}



