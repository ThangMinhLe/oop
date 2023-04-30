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

    public void setSoGioLamViec(double soGioLamViec) {
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
        return super.toString() + String.format("%-10.2f| %-10d ", getSoGioLamViec(), tinhLuong());
    }

    @Override 
    public long tinhLuong() {
        return (long) soGioLamViec* luong;
    }
}
