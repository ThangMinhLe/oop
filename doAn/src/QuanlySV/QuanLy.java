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
        if(checkNull()){ 
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
        } while(choose > 3 || choose < 0); 
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
    } else {
        System.out.println("Ban da tao mang! Ban chi co them phan tu.");
    }
    }

    public boolean checkNull () {
        if(ps.length == 0) {
            return true;
        }

        return false;
    }

    public void add () {
        // Khoi tao mot doi tuong moi cua mang
        ps = Arrays.copyOf(ps,ps.length +1);
        int n =  ps.length;
        int index;

        // Xu ly Logic de nhap gia tri index them vao mang.
        for(;;) {
        System.out.print("Nhap vi tri ban muon them: ");
        index = sc.nextInt();

        if(index > 0 && index <= ps.length  )break;
        else System.out.println("Lua chon cua ban khong hop le.");
        }

        for (int i = n -1; i > index - 1; i-- ){
            ps[i] = ps[i-1];
        }

        int choose;
        do{
            System.out.print("Chon doi tuong ban muon nhap.\n");
            menu();
            choose = sc.nextInt();
            if (choose > 3 || choose <= 0) {
                System.out.println("Lua chon cua ban khong hop le!");
            }
            } while(choose > 3 || choose <= 0); 
            switch (choose) {
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
                System.out.println("Add Success!");
        }



        public void delete () {
        int index; 
        if(!checkNull())
        {

        System.out.print("Nhap vi tri ban muon xoa: ");
        index = sc.nextInt();
        
        //Xu ly vi tri xoa
        if(index <= 0) {
            index = 1;
        }
        else if (index > ps.length){
            index = ps.length;
        }
        
        //xu ly xoa mang.
        if (ps.length >= 2){
            for (int i = index - 1; i < ps.length - 1; i++ ) {
            ps[i] = ps[i+1];
        }}

        //Cap nhat do dai cho mang.
        ps = Arrays.copyOf(ps, ps.length-1);

        System.out.println("Delete Success!");
        }

        else {
            System.out.println("Mang rong khong the xoa!");
        }

        }

        public void update () {
            // cap nhat duoc khi mang !Null
            if(!checkNull()){
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
            st.equalsIgnoreCase(x.getMaSo());
            return true;
        }
        return false;
     }

     public void findByID() {
        if (!checkNull()){
            System.out.print("Nhap ID ban muon tim kiem: ");
        String st = sc.nextLine();
        if(find(st)){
            System.out.printf("%-7s|%-20s|%-11s|%-10s|%-20s|%-5s|%-5s|%-5s|%-10s|%-10s|%-5s\n",
            "Ma So","Ten" , "Gioi Tinh" ,"Nam Sinh","Dia Chi",
           "Lop", "Khoa", "Diem","Lop Co Van","Mon Day", "Loai" );
            for(person x:ps) {
                if(st.equalsIgnoreCase(x.getMaSo())) {
                    x.xuatTT();
                }
                
            }
        }
        else {
            System.out.print("Khong co ID ban muon tim kiem!\n");
        }
        } else {
            System.out.println("Mang rong!!! Khong the tim kiem.");
        }
     }

    public void showTT () {
       int n = ps.length; 
        if(!checkNull()){ 
        System.out.printf("%-7s|%-20s|%-11s|%-10s|%-20s|%-5s|%-5s|%-5s|%-10s|%-10s|%-5s\n",
        "Ma So","Ten" , "Gioi Tinh" ,"Nam Sinh","Dia Chi",
       "Lop", "Khoa", "Diem","Lop Co Van","Mon Day", "Loai" );
       for(person x: ps) {
       x.xuatTT();
    }
    }
    else {
        if(checkNull()){
            System.out.println("");
            System.out.println("Mang Dang Rong!\nMoi ban chon 1 De Khoi Tao Thong Tin Cho CSDL!");           
            System.out.println("");
            }
    }
    }

    
}
