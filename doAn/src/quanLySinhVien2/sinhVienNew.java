package quanLySinhVien2;

import java.util.Scanner;

public class sinhVienNew extends person {
    Scanner sc = new Scanner(System.in);
    private lopCuaSinhVien lop;
    private khoaCuaSinhVien khoa;
    private phuHuynh ph;
    private monhoc mh;

    public sinhVienNew(){

    }

    public sinhVienNew(lopCuaSinhVien lop, khoaCuaSinhVien khoa, phuHuynh ph, monhoc mh) {
        this.lop = lop;
        this.khoa = khoa;
        this.ph = ph;
        this.mh = mh;
    }

    public sinhVienNew(lopCuaSinhVien lop, khoaCuaSinhVien khoa, phuHuynh ph, monhoc mh, String id, String name, String gioiTinh, ngaySinh ns, diaChi dc) {
        super(id, name, gioiTinh, ns, dc);
        this.lop = lop;
        this.khoa = khoa;
        this.ph = ph;
        this.mh = mh;
    }

    public lopCuaSinhVien getLop() {
        return lop;
    }

    public void setLop(lopCuaSinhVien lop) {
        this.lop = lop;
    }

    public khoaCuaSinhVien getKhoa() {
        return khoa;
    }

    public void setKhoa(khoaCuaSinhVien khoa) {
        this.khoa = khoa;
    }

    public phuHuynh getPh() {
        return ph;
    }

    public void setPh(phuHuynh ph) {
        this.ph = ph;
    }

    public monhoc getMh() {
        return mh;
    }

    public void setMh(monhoc mh) {
        this.mh = mh;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

   @Override 
   public void nhapTT(){
    super.nhapTT();
lopCuaSinhVien lop = new lopCuaSinhVien();       
System.out.print("Nhap ten lop: ");
lop.setTenLop(sc.nextLine());

khoaCuaSinhVien khoa = new khoaCuaSinhVien();
       System.out.print("Nhap Ma Khoa:");
khoa.setMaKhoa(sc.nextLine());
       System.out.print("Nhap ten khoa:");
khoa.setTenKhoa(sc.nextLine());

phuHuynh ph = new phuHuynh();
       System.out.print("Nhap ten cua phu huynh: ");
ph.setTen(sc.nextLine());
       System.out.print("Nhap so dien thoai: ");
ph.setSoDienThoai(sc.nextLine());

monhoc mh = new monhoc();
       System.out.print("Nhap ten mon hoc: ");
mh.setTenMonHoc(sc.nextLine());
       System.out.print("Nhap diem: ");
mh.setDiem(sc.nextDouble());

}

public String toString(){
return super.toString() + String.format("%-10s %-10s %-10s %-10.2f",
getLop().getTenLop() ,getKhoa().getTenKhoa(), getMh().getTenMonHoc(), getMh().getDiem());
}


public char xepLoai(){
    return ' ';
}
}
