public class diaChi {
    private String district;
    private String City;

    public diaChi(){

    }

    public diaChi (String district, String City) {
        this.district = district;
        this.City = City;
    }

    public String setdistrict(String district) {
        return this.district = district;
    }

    public String getdistrict() {
        return district;
    }

    public String setCity(String City){
        return this.City = City;
    }

    public String getCity() {
        return City;
    }

}
