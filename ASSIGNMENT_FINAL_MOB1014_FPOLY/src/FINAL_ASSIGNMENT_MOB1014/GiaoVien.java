package FINAL_ASSIGNMENT_MOB1014;

public class GiaoVien extends Person {

    private String MaGv;
    private String Email;
    private int SoGioDay;

    public GiaoVien() {
    }

    public GiaoVien(String MaGv, String Email, int SoGioDay, String Ho, String TenDem, String Ten, int NamSinh, int GioiTinh, String QueQuan) {
        super(Ho, TenDem, Ten, NamSinh, GioiTinh, QueQuan);
        this.MaGv = MaGv;
        this.Email = Email;
        this.SoGioDay = SoGioDay;
    }

    public String getMaGv() {
        return MaGv;
    }

    public void setMaGv(String MaGv) {
        this.MaGv = MaGv;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getSoGioDay() {
        return SoGioDay;
    }

    public void setSoGioDay(int SoGioDay) {
        this.SoGioDay = SoGioDay;
    }

    public String CheckGioiTinh(int GioiTinh) {
        return GioiTinh == 1 ? "THẦY" : "CÔ";
    }

    @Override
    public String toString() {
        return super.toString() + "\nMÃ GIÁO VIÊN: " + MaGv + "\nEMAIL: " + Email + "\nSỐ GIỜ DẠY: " + SoGioDay + "\nGIỚI TÍNH: "+ CheckGioiTinh(getGioiTinh());
    }

}
