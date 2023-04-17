package QuanlySV;

public class monHoc {
    private String maMonHoc;
    private String tenMonHoc;

    public monHoc() {

    }

    public monHoc(String maMonHoc, String tenMonHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
    }

    public String setMaMonHoc (String maMonHoc) {
        return this.maMonHoc = maMonHoc;
    }

    public String getMaMonHoc () {
        return maMonHoc;
    }

    public String setTenMonHoc(String tenMonHoc) {
         return this.tenMonHoc = tenMonHoc;
    }

    public String getTenMonHoc () {
        return tenMonHoc;
    }

    
}
