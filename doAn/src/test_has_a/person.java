package test_has_a;

public class person {
    private String name;
    private diaChi dc;

    public person (){

    }

    public String setName(String name){
        return this.name = name;
    }

    public diaChi setDiaChi(diaChi dc){
            return this.dc = dc;
    }

    
    public static void main(String[] args) {
        person per = new person();
        diaChi dc1  = new diaChi(); 

        per.setName("le minh thang.");
        dc1.setQuan("Thu Duc!");
        dc1.setThanhPho("Ho Chi Minh!!");
        per.setDiaChi(dc1);

        System.out.println(per.name);
        System.out.println(per.dc.getQuan());
        System.out.println(per.dc.getThanhPho());
    }
}
