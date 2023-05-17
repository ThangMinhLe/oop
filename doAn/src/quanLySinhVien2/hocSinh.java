package quanLySinhVien2;

import java.lang.NullPointerException;
import java.util.*;

import javax.sound.midi.Soundbank;;

public class hocSinh extends person implements chucNang {
    private lopCuaSinhVien lop;
    private khoaCuaSinhVien khoa;
    private phuHuynh ph;
    private monhoc[] mh;

    public hocSinh() {

    }

    public hocSinh(String id, String name, String gioiTinh, ngaySinh ns,
     diaChi dc, lopCuaSinhVien lop, khoaCuaSinhVien khoa, phuHuynh ph, monhoc[] mh) {
        super( id, name, gioiTinh, ns, dc);

        this.lop = lop;
        this.khoa = khoa;
        this.ph = ph;
        this.mh = mh;
    }

    public lopCuaSinhVien getLop() {
        return lop;
    }

    public lopCuaSinhVien setLop(lopCuaSinhVien lop) {
        return this.lop = lop;
    }

    public khoaCuaSinhVien getKhoa() {
        return khoa;
    }

    public khoaCuaSinhVien setKhoa(khoaCuaSinhVien khoa) {
        return this.khoa = khoa;
    }

    public phuHuynh getPh() {
        return ph;
    }

    public phuHuynh setPh(phuHuynh ph) {
        return this.ph = ph;
    }

    public monhoc[] getMonhoc() {
        return mh;
    }


    public monhoc[] setMonhoc(monhoc mh[]) {
        return this.mh = mh;
    }

    public double getAVGDiem(){
        double diem = 0.0;
        for(monhoc m:mh){
            diem += m.getDiem();
        }

        return diem/mh.length;
    }
    

    @Override
    public void nhapTT() {
        super.nhapTT();
    
        // lopCuaSinhVien lopMoi = new lopCuaSinhVien();
        // System.out.println("Nhap lop cho sv!!!");
        // System.out.print("Nhap ma lop cho sinh vien: ");
        // lopMoi.setMaLop(sc.nextLine());
        // System.out.print("Nhap ten lop cho sinh vien: ");
        // lopMoi.setTenLop(sc.nextLine());
        // setLop(lopMoi);
    
        // khoaCuaSinhVien khoaMoi = new khoaCuaSinhVien();
        // System.out.println("Nhap khoa cho sinh vien!!!");
        // System.out.print("Nhap ma khoa cho sinh vien: ");
        // khoaMoi.setMaKhoa(sc.nextLine());
        // System.out.print("Nhap ten khoa cho sinh vien: ");
        // khoaMoi.setTenKhoa(sc.nextLine());
        // setKhoa(khoaMoi);
    
        phuHuynh phuHuynhMoi = new phuHuynh();
        System.out.println("Nhap thong tin phu huynh cua sinh vien!!!");
        System.out.print("Nhap ten cho phu huynh: ");
        phuHuynhMoi.setTen(sc.nextLine());
        System.out.print("Nhap SDT cho phu huynh: ");
        phuHuynhMoi.setSoDienThoai(sc.nextLine());
        setPh(phuHuynhMoi);
    
        // Nhap mang mon hoc cho sinh vien.
        monhoc mh[] = new monhoc[0];
        while(true){
                int choose;
                for(;;)
                    {    
                    System.out.println("Ban da nhap xong mon hoc chua?");
                    System.out.println("1: Done.");
                    System.out.println("2: TT Nhap.");
                    choose = sc.nextInt();
                    sc.nextLine();
                    if(choose == 1 || choose == 2){
                        break;
                    }
                    else {
                        System.out.println("Lua chon cua ban khong dung!!!");
                    }
                }
                if(choose == 2) {
                    mh = Arrays.copyOf(mh, mh.length + 1);
                    mh[mh.length-1] = new monhoc();
                    System.out.print("Nhap ten mon hoc: ");
                    mh[mh.length-1].setTenMonHoc(sc.nextLine());
                    System.out.print("Nhap diem cho mon hoc: ");
                    mh[mh.length-1].setDiem(sc.nextDouble());
                }
                if(choose == 1) { break; }
               
        }
        setMonhoc(mh);
    }

    

    public String toString() {
        return super.toString() + String.format("%-10s| %-10s| %-10s| %-10.2f| %-5s",
            getLop().getTenLop().substring(0, Math.min(10, getLop().getTenLop().length())),
            getKhoa().getTenKhoa().substring(0, Math.min(10, getKhoa().getTenKhoa().length())),
            getPh().getTen().substring(0, Math.min(10, getPh().getTen().length())),
            getAVGDiem(),
            xepLoai());
    }
    

    public String toStringToFile(){
        return String.format("%-2s","sv;") + super.toStringToFile() + String.format("%s;%s;%s;%s;%s;%s;%.2f" ,
        getLop().getTenLop(),getKhoa().getMaKhoa() , getKhoa().getTenKhoa(), getPh().getTen(),getPh().getSoDienThoai() ," ", getAVGDiem());
    }

    public void toStringToDetail(){
        super.toStringToDetail();
        System.out.println("Lop cua sinh vien: " + getLop().getTenLop());
        System.out.println("Khoa cua sinh vien: (Ma khoa) " + getKhoa().getMaKhoa() +
         ", (Ten khoa) " + getKhoa().getTenKhoa());
        System.out.println("Thong tin phu huynh!");
        System.out.println("Ten phu huynh: " + getPh().getTen());
        System.out.println("SDT phu huynh: " + getPh().getSoDienThoai());
        System.out.println("Cac mon hoc cua sinh vien!");
        for(monhoc  mh:mh) {
            System.out.println("Mon hoc cua sinh vien: " + mh.getTenMonHoc());
            System.out.println("Diem: " + mh.getDiem());
        }
    }

    public char xepLoai() {
        double diem = getAVGDiem();
        if(diem >= 8 ) return 'A';
        if(diem >=6.5 && diem < 8 ) return 'B';
        if(diem >=5 && diem < 6.5 ) return 'C';
        if(diem < 5 ) return 'D';
        
        return ' ';
    }



}
