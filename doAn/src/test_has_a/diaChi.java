package test_has_a;

public class diaChi {
    private String tenQuan;
    private String tenThanhPho;

    public diaChi() {

    }

    public String setQuan( String tenQuan) {
        return this.tenQuan = tenQuan;
    }

    public String setThanhPho(String tenThanhPho) {
        return this.tenThanhPho = tenThanhPho;
    }

    public String getQuan(){
        return tenQuan;
    }

    public String getThanhPho() {
        return tenThanhPho;
    }
}
