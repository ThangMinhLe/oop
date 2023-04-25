package quanLySinhVien2;

public class salary {
    private int heSoLuong;
    private long mucLuong;

    public salary() {
    }

    public salary(int heSoLuong, long mucLuong) {
        this.heSoLuong = heSoLuong;
        this.mucLuong = mucLuong;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public long getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(long mucLuong) {
        this.mucLuong = mucLuong;
    }

    
 

    public long tinhLuongGV() {
        return (long) heSoLuong*mucLuong;
    }
}
