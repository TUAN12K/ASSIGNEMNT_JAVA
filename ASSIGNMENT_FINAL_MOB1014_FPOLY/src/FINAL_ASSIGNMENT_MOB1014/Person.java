package FINAL_ASSIGNMENT_MOB1014;

public class Person {

    private String Ho;
    private String TenDem;
    private String Ten;
    private int NamSinh;
    private int GioiTinh;
    private String QueQuan;

    public Person() {
    }

    public Person(String Ho, String TenDem, String Ten, int NamSinh, int GioiTinh, String QueQuan) {
        this.Ho = Ho;
        this.TenDem = TenDem;
        this.Ten = Ten;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
        this.QueQuan = QueQuan;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    @Override
    public String toString() {
        return "\nHỌ: " + Ho + "\nTÊN ĐỆM: " + TenDem + "\nTÊN: " + Ten + "\nNĂM SINH: " + NamSinh + "\nQUÊ QUÁN: " + QueQuan;
    }


    public String GioiTinh (int GioiTinh){
        return null;
    }
}
