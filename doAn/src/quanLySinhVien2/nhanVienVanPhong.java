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



    @Override 
    public long tinhLuong() {
        return (long) soGioLamViec* 50000;
    }
}
