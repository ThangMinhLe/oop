package QuanlySV;

public class giangVien extends person {
        private String monGiangDay; 
        private int tiet;
        public giangVien () {

        }

        public giangVien(String maSo, String name, String namSinh,
         String diachi, String gioiTinh, String monGiangDay, int tiet ) {
            super(maSo, name, namSinh, diachi, gioiTinh);
            this.monGiangDay = monGiangDay;
            this.tiet = tiet;
        }

        public String setMonGiangDay(String mon) {
            return this.monGiangDay = mon; 
        }

        public String getMonGiangDay () {
            return this.monGiangDay;
        }

        public int setTiet(int tiet) {
            return this.tiet = tiet;
        }

        public int getTiet() {
            return this.tiet;
        }

        @Override
        public String xepLoai() {
            if (tiet > 45) {
            return String.format("|%-5s", "A");
            }
            
            else if(tiet >= 30 && tiet <= 45) {
            return String.format("|%-5s", "B");
            }
            return String.format("|%-5s", "C");
           

        }


        public void nhapTT () {
            super.nhapTT();
            System.out.print("Nhap Thong Tin Mon Giang Day Cua Giang Vien:");
            setMonGiangDay(sc.nextLine());
            System.out.print("Nhap so tiet cua giang vien: ");
            setTiet(Integer.parseInt(sc.nextLine()));
        }

        public String toString () {
            return super.toString() + String.format("%-28s|%-10s","", monGiangDay) + this.xepLoai();
        }
}
