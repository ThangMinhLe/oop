package quanLySinhVien2;

import java.lang.NullPointerException;
import java.util.*;;

public class sinhVien extends person implements chucNang {
    private lopCuaSinhVien lop;
    private khoaCuaSinhVien khoa;
    private phuHuynh ph;
    private monhoc mh;

    public sinhVien() {

    }

    public sinhVien(String id, String name, String gioiTinh, ngaySinh ns,
     diaChi dc, lopCuaSinhVien lop, khoaCuaSinhVien khoa, phuHuynh ph, monhoc mh) {
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

    public monhoc getMonhoc() {
        return mh;
    }


    public monhoc setMonhoc(monhoc mh) {
        return this.mh = mh;
    }
    
    // @Override 
    // public void nhapTT() {
    //   super.nhapTT();

    //   lopCuaSinhVien lop = new lopCuaSinhVien();
    //   System.out.println("Nhap lop cho sv!!!");
    //   System.out.print("Nhap ten lop cho sinh vien: ");
    //   lop.setTenLop(sc.nextLine());
        // 
      
    //   khoaCuaSinhVien khoa = new khoaCuaSinhVien();
    //   System.out.println("Nhap khoa cho sinh vien!!!");
    //   System.out.print("Nhap ma khoa cho sinh vien: ");
    //   khoa.setMaKhoa(sc.nextLine());
    //   System.out.print("Nhap ten khoa cho sinh vien: ");
    //   khoa.setTenKhoa(sc.nextLine());

    //   phuHuynh ph = new phuHuynh();
    //   System.out.println("Nhap thong tin phu huynh cua sinh vien: ");
    //   System.out.print("Nhap ten cho phu huynh: ");
    //   ph.setTen(sc.nextLine());
    //   System.out.print("Nhap SDT cho phu huynh: ");
    //   ph.setSoDienThoai(sc.nextLine());

    //   monhoc mh = new monhoc();
    //   System.out.println("Nhap thong tin mon hoc!!! ");
    //   System.out.print("Nhap ten mon hoc: ");
    //   mh.setTenMonHoc(sc.nextLine());
    //   System.out.print("Nhap diem cho sinh vien: ");
    //   mh.setDiem(sc.nextDouble());

    // }

    @Override
    public void nhapTT() {
        super.nhapTT();
    
        lopCuaSinhVien lopMoi = new lopCuaSinhVien();
        System.out.println("Nhap lop cho sv!!!");
        System.out.print("Nhap ten lop cho sinh vien: ");
        lopMoi.setTenLop(sc.nextLine());
        setLop(lopMoi);
    
        khoaCuaSinhVien khoaMoi = new khoaCuaSinhVien();
        System.out.println("Nhap khoa cho sinh vien!!!");
        System.out.print("Nhap ma khoa cho sinh vien: ");
        khoaMoi.setMaKhoa(sc.nextLine());
        System.out.print("Nhap ten khoa cho sinh vien: ");
        khoaMoi.setTenKhoa(sc.nextLine());
        setKhoa(khoaMoi);
    
        phuHuynh phuHuynhMoi = new phuHuynh();
        System.out.println("Nhap thong tin phu huynh cua sinh vien: ");
        System.out.print("Nhap ten cho phu huynh: ");
        phuHuynhMoi.setTen(sc.nextLine());
        System.out.print("Nhap SDT cho phu huynh: ");
        phuHuynhMoi.setSoDienThoai(sc.nextLine());
        setPh(phuHuynhMoi);
    
        monhoc monHocMoi = new monhoc();
        System.out.println("Nhap thong tin mon hoc!!! ");
        System.out.print("Nhap ten mon hoc: ");
        monHocMoi.setTenMonHoc(sc.nextLine());
        System.out.print("Nhap diem cho sinh vien: ");
        monHocMoi.setDiem(sc.nextDouble());
        setMonhoc(monHocMoi);
    }

    public String toString() {
        return super.toString() + String.format("%-10s| %-10s| %-10s| %-10.2f| %-5s " ,
         getLop().getTenLop(), getKhoa().getTenKhoa(), getMonhoc().getTenMonHoc(), getMonhoc().getDiem(), xepLoai());
    }

    public String toStringToFile(){
        return String.format("%-2s","sv;") + super.toStringToFile() + String.format("%s;%s;%s;%s;%s;%s;%.2f" ,
        getLop().getTenLop(),getKhoa().getMaKhoa() , getKhoa().getTenKhoa(), getPh().getTen(),getPh().getSoDienThoai() ,getMonhoc().getTenMonHoc(), getMonhoc().getDiem());
    }


    public char xepLoai() {
        double diem = getMonhoc().getDiem();
        if(diem >= 8 ) return 'A';
        if(diem >=6.5 && diem < 8 ) return 'B';
        if(diem >=5 && diem < 6.5 ) return 'C';
        if(diem < 5 ) return 'D';
        
        return ' ';
    }



}
