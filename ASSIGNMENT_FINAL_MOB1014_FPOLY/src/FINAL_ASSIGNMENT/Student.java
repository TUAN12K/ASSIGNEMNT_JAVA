/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_ASSIGNMENT;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    private String Msv;
    private int Nganh; //1 = UDPM | 2 = WEB | 3 = MOB

    public Student() {
    }

    public Student(String Msv, int Nganh, String Ten, String Sdt) {
        super(Ten, Sdt);
        this.Msv = Msv;
        this.Nganh = Nganh;
    }

    public String getMsv() {
        return Msv;
    }

    public void setMsv(String Msv) {
        this.Msv = Msv;
    }

    public int getNganh() {
        return Nganh;
    }

    public void setNganh(int Nganh) {
        this.Nganh = Nganh;
    }

    @Override
    public void InRaManHinh() {
        System.out.printf("%s | %s | %s | %s\n",getTen(),getSdt(),Msv,Nganh==1?"UDPM":Nganh==2?"WEB":"MOB");
    }
    
    
    
}
