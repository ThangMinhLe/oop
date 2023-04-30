package quanLySinhVien2;

import java.util.*;
import java.lang.NullPointerException;

public class quanLy {
    nhanVien nv[] = new nhanVien[0];
    sinhVien sv[] = new sinhVien[0];
    

    Scanner sc = new Scanner(System.in);
    
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
            for (;;) {
                System.out.println("1 : Mang SV");
                System.out.println("2: Mang NV");
                System.out.println("3: Hoan tat nhap mang");
                System.out.print("Nhap lua chon: ");
                choose1 = sc.nextInt();
                if (choose1 == 1 || choose1 == 2 || choose1 == 3) {
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
                                if (choose > 3 || choose < 1) {
                                    System.out.println("Lua chon cua ban khong hop le!");
                                }
                            } while (choose > 3 || choose < 1);
    
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

    public void add () {
        // Khoi tao mot doi tuong moi cua mang
        // ps = Arrays.copyOf(ps,ps.length +1);
        // int n =  ps.length;
        int index;

        int choose;

        do{
            System.out.print("Chon doi tuong ban muon nhap.\n");
            menu();
            choose = sc.nextInt();
            if (choose > 3 || choose <= 0) {
                System.out.println("Lua chon cua ban khong hop le!");
            }
            } while(choose <= 0 || choose > 3);
                switch (choose) {
                case 1:
                // Xu ly Logic de nhap gia tri index them vao mang.
                for(;;) {
                    System.out.print("Nhap vi tri ban muon them: ");
                    index = sc.nextInt();

                    if(index >= 0 && index <= sv.length  )break;
                    else {
                        System.out.println("Do dai cua mang la: " + sv.length);
                        System.out.println("Lua chon cua ban khong hop le.");
                    }
                    }

                for (int i = sv.length - 1; i > index - 1; i-- ){
                    sv[i] = sv[i-1];
                }

                 sv[index - 1] = new sinhVien();
                 sv[index - 1].nhapTT();
                 break;
                case 2:
                // Xu ly Logic de nhap gia tri index them vao mang.
                    for(;;) {
                        System.out.print("Nhap vi tri ban muon them: ");
                        index = sc.nextInt();
                
                        if(index >= 0 && index <= nv.length  )break;
                        else {
                            System.out.println("Do dai cua mang la: " + nv.length);
                            System.out.println("Lua chon cua ban khong hop le.");
                        }
                        }
                
                for (int i = nv.length -1; i > index - 1; i-- ){
                    ps[i] = ps[i-1];
                }

                ps[index - 1] = new giangVien();
                nv[index - 1].nhapTT();

                break;
                case 3:
                 // Xu ly Logic de nhap gia tri index them vao mang.
                 for(;;) {
                    System.out.print("Nhap vi tri ban muon them: ");
                    index = sc.nextInt();
            
                    if(index > 0 && index <= nv.length  )break;
                    else {
                        System.out.println("Do dai cua mang la: " + nv.length);
                        System.out.println("Lua chon cua ban khong hop le.");
                    }
                    }
                
                for (int i = nv.length -1; i > index - 1; i-- ){
                    ps[i] = ps[i-1];
                }

                ps[index - 1] = new nhanVienVanPhong();
                nv[index - 1].nhapTT();
                break;
                case 4:
                 // Xu ly Logic de nhap gia tri index them vao mang.
                 for(;;) {
                    System.out.print("Nhap vi tri ban muon them: ");
                    index = sc.nextInt();
            
                    if(index > 0 && index <= nv.length  )break;
                    else {
                        System.out.println("Do dai cua mang la: " + nv.length);
                        System.out.println("Lua chon cua ban khong hop le.");
                    }
                    }


                for (int i = nv.length -1; i > index - 1; i-- ){
                    ps[i] = ps[i-1];
                }

                nv[index - 1] = new baoVe();
                nv[index - 1].nhapTT();
                break;

            } 
                
                System.out.println("Add Success!");
        }



        public void delete () {
        int index, choose; 

        for(;;){
                System.out.print("1: Xoa sinh vien!");
                System.out.print("2: Xoa nhan vien!");
                System.out.print("Nhap lua chon!");
                choose = Integer.parseInt(sc.nextLine());
                if(choose == 1 || choose == 2) break;
                else {
                    System.out.println("Lua chon cua ban chua hop le!!");
                }
        }

        switch (choose){
            case 1: 
            if(!checkNullsv())
            {
    
            System.out.print("Nhap vi tri ban muon xoa: ");
            index = sc.nextInt();
            
            //Xu ly vi tri xoa
            if(index <= 0) {
                index = 1;
            }
            else if (index > sv.length){
                index = sv.length;
            }
            
            //xu ly xoa mang.
            if (sv.length >= 2){
                for (int i = index - 1; i < sv.length - 1; i++ ) {
                sv[i] = sv[i+1];
            }}
    
            //Cap nhat do dai cho mang.
            sv = Arrays.copyOf(sv, sv.length-1);
    
            System.out.println("Delete Success!");
            }
    
            else {
                System.out.println("Mang rong khong the xoa!");
            }

            break;
            case 2:
            if(!checkNullnv())
            {
    
            System.out.print("Nhap vi tri ban muon xoa: ");
            index = sc.nextInt();
            
            //Xu ly vi tri xoa
            if(index <= 0) {
                index = 1;
            }
            else if (index > nv.length){
                index = nv.length;
            }
            
            //xu ly xoa mang.
            if (nv.length >= 2){
                for (int i = index - 1; i < nv.length - 1; i++ ) {
                nv[i] = nv[i+1];
            }}
    
            //Cap nhat do dai cho mang.
            nv = Arrays.copyOf(nv, nv.length-1);
    
            System.out.println("Delete Success!");
            }
    
            else {
                System.out.println("Mang rong khong the xoa!");
            }

            break;

        }

        }

        public void update () {
            // cap nhat duoc khi mang !Null
            if(!checkNullsv()){
                int choose, index; 
            
            //Xu ly Logic de nhap vi tri can cap nhat thong tin.
            for(;;){
            System.out.print("Nhap vi tri ban muon cap nhat lai thong tin: ");
            index = sc.nextInt(); 
            if (index >= 1 && index <= ps.length) {
                break;
            }
            else {
                System.out.print("Vi tri ban muon cap nhat khong co!");
            }
            }

            // Xu ly cap nhat thong tin cho mang
           
        int choose1;
        do{
            System.out.print("Chon loai doi tuong.\n");
            menu();
            choose1 = sc.nextInt();
            if (choose1 > 3 || choose1 <= 0) {
                System.out.println("Lua chon cua ban khong hop le!");
            }
            } while(choose1 > 3 || choose1 <= 0); 
            switch (choose1) {
                case 1:
                 ps[index - 1] = new sinhVien();
                 break;
                case 2:
                ps[index - 1] = new giangVien();
                break;
                case 3:
                ps[index - 1] = new coVanHocTap();
                break;
            } 
                ps[index - 1].nhapTT();
                System.out.println("Update Success!");
            }
        else {
            System.out.print("Mang Rong, Khong The Cap Nhat!\n");
        }
     }
    
     public boolean find (String st) {
        st.replace(" ", "");
        for(person x:ps) {
            st.equalsIgnoreCase(x.getId());
            return true;
        }
        return false;
     }

     public void findByID() {
        System.out.print("Nhap ID ban muon tim kiem: ");
        String st = sc.nextLine();
        
        if (!checkNullsv()){
        if(find(st)){
            for(person x:sv) {
                if(st.equalsIgnoreCase(x.getId())) {
                    x.xuatTT();
                }
            }
        }
        } 

        if (!checkNullnv()){
            if(find(st)){
                for(person x:nv) {
                    if(st.equalsIgnoreCase(x.getId())) {
                        x.xuatTT();
                    }
                }
            }
            } 

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

    
}
    

