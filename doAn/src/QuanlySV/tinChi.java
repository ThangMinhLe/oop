package QuanlySV;

public class tinChi {

    private int soTinChiDaTichLuy;
    private int soTinchiCanTichLuy;


    public tinChi() {

    }

    public tinChi (int soTinChiDaTichLuy, int soTinChiCanTichLuy) {
        this.soTinChiDaTichLuy = soTinChiCanTichLuy;
        this.soTinchiCanTichLuy = soTinChiCanTichLuy;
    }

    public int setSoTinChiDaTichLuy (int soTinChiDaTichLuy) {
        return this.soTinChiDaTichLuy = soTinChiDaTichLuy;
    }

    public int getSoTinhChiDaTichLuy () {
        return soTinChiDaTichLuy;
    }
    
    public int setSoTinChiCanTichLuy (int soTinChiCanTichLuy) {
        return this.soTinchiCanTichLuy = soTinChiCanTichLuy;
    }

    public int getSoTinChiCanTichLuy () {
        return soTinchiCanTichLuy;
    }
}
