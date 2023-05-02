package quanLySinhVien2;

import java.lang.NullPointerException;

public class nhanVienVanPhong extends nhanVien {
    private double soGioLamViec;
    private long luong;

    public nhanVienVanPhong() {
    }

    public nhanVienVanPhong(String id, String name, String gioiTinh, ngaySinh ns, diaChi dc, double soGioLamViec, long luong) {
        super(id, name, gioiTinh, ns, dc);
        this.soGioLamViec = soGioLamViec;
        this.luong = luong;
    }

    public double getSoGioLamViec() {
        return soGioLamViec;
    }

    // So gio lam viec 8h/ngay | 26ngay/thang | Tang ca khong qua 40h/thang
    public void setSoGioLamViec(double soGioLamViec) {
        if(soGioLamViec <= 0 || soGioLamViec >= 250){
            System.out.println("So gio lam viec cua ban qua so voi quy dinh!!! ");
            System.out.print("Moi ban nhap lai so gio lam viec: ");
            soGioLamViec = sc.nextDouble();
        }
        this.soGioLamViec = soGioLamViec;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    public void nhapTT() {
        super.nhapTT();

        System.out.print("Nhap so gio lam viec: ");
        setSoGioLamViec(sc.nextDouble());
        System.out.print("Nhap muc luong cua nhan vien: ");
        setLuong(sc.nextLong());
    }


    public String toString() {
        return super.toString() + String.format("%-10.2f| %-10s| %-10d| %-10s| %-5s ", getSoGioLamViec(), " ",tinhLuong()," ", xepLoai());
    }

    public String toStringToFile() {
        return String.format("%s;","vp") + super.toStringToFile() + String.format("%.1f;%d",getSoGioLamViec(), getLuong());
    }

    public char xepLoai(){
        if(soGioLamViec > 200 && soGioLamViec <= 250) return 'A';
        if(soGioLamViec >= 150 && soGioLamViec <= 200) return 'B';
        if(soGioLamViec < 150) return 'C';
        return ' ';
    }

    // Voi nhan vien loai 'A' thuong them 2.000.000VND
    // Voi nhan vien loai 'B' thuong them 1.000.000VND
    // Voi nhan vien loai 'C' khong co thuong
    @Override 
    public long tinhLuong() {
        if(xepLoai() == 'A') return (long) soGioLamViec* luong + 2000000;
        if(xepLoai() == 'B') return (long) soGioLamViec* luong + 1000000;
        return (long) soGioLamViec* luong;
    }
}
