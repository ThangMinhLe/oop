package quanLySinhVien2;

public class nhanVienVanPhong extends nhanVien {
    private double soGioLamViec;
    private long luong;

    public nhanVienVanPhong() {
    }

    public nhanVienVanPhong(double soGioLamViec, long luong) {
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
        luong = tinhLuong();
    }


    public String toString() {
        return this.toString() + String.format("%-10.2f %10d ", getSoGioLamViec(), luong);
    }

    @Override 
    public long tinhLuong() {
        return (long) soGioLamViec* 50000;
    }
}
