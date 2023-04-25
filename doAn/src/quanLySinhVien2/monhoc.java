package quanLySinhVien2;

public class monhoc {
    private String maMonHoc;
    private String tenMonHoc;
    private double diem;

    public monhoc() {
    }

    public monhoc(String maMonHoc, String tenMonHoc, double diem) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.diem = diem;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    


}
