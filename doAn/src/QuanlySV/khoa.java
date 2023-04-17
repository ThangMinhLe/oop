package QuanlySV;

public class khoa {
    private String maKhoa;
    private String tenKhoa;

    public khoa() {

    }

    public khoa (String maKhoa, String tenKhoa) {
        this.maKhoa = maKhoa;
        this.tenKhoa = tenKhoa;
    }

    public String setMaKhoa (String maKhoa) {
        return this.maKhoa;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public String setTenKhoa(String tenKhoa) {
        return this.tenKhoa = tenKhoa;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }
}
