package FINAL_ASSIGNMENT_MOB1014;

import java.util.Scanner;

public class Main {

    public static void MENU() {
        System.out.println("\n--------------------------------------- MENU ---------------------------------------");
        System.out.println("|1.THÊM - SỦA - XÓA GIÁO VIÊN                                                       |");
        System.out.println("|2.THÊM 15 GIÁO VIÊN CÓ TRONG DANH SÁCH                                             |");
        System.out.println("|3.TÌM KIẾM GIÁO VIÊN THEO MÃ GIÁO VIÊN                                             |");
        System.out.println("|4.LOAD TÁT CẢ THÔNG TIN GIÁO VIÊN                                                  |");
        System.out.println("|5.TÌM KIẾM THEO TÊN GIÁO VIÊN GẦN ĐÚNG                                             |");
        System.out.println("|6.LOAD TẤT CẢ CÁC GIÁO VIÊN CÓ SỐ GIỜ DẠY LỚN HƠN 500 GIỜ                          |");
        System.out.println("|7.LOAD TẤT CẢ CÁC GIÁO VIÊN VÀ PHÂN CHIA DANH SÁCH THEO VÙNG MIỀN                  |");
        System.out.println("|0.THOÁT                                                                            |");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("XIN MỜI BẠN CHỌN CHỨC NĂNG: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien_Service Gvs = new GiaoVien_Service();
        int input;
        do {
            MENU();
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 1.THÊM - SỦA - XÓA GIÁO VIÊN");
                    Gvs.themSuaxoa();
                    break;
                case 2:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 2.THÊM 15 GIÁO VIÊN CÓ TRONG DANH SÁCH");
                    Gvs.them15Giaovien();
                    break;
                case 3:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 3.TÌM KIẾM GIÁO VIÊN THEO MÃ GIÁO VIÊN");
                    Gvs.timKiem();
                    break;
                case 4:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 4.LOAD TÁT CẢ THÔNG TIN GIÁO VIÊN");
                    Gvs.XuatDsGiaovien();
                    break;
                case 5:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 5.TÌM KIẾM THEO TÊN GIÁO VIÊN GẦN ĐÚNG");
                    break;
                case 6:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 6.LOAD TẤT CẢ CÁC GIÁO VIÊN CÓ SỐ GIỜ DẠY LỚN HƠN 500 GIỜ");
                    Gvs.XuatlonHon500();
                    break;
                case 7:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 7.LOAD TẤT CẢ CÁC GIÁO VIÊN VÀ PHÂN CHIA DANH SÁCH THEO VÙNG MIỀN");
                    Gvs.sapxep();
                    break;
                case 0:
                    System.out.println("BẠN ĐÃ CHỌN CHỨC NĂNG: 0.THOÁT");
                    break;
                default:
                    System.out.println("CHỨC NĂNG KHÔNG! CÓ XIN MỜI CHỌN LẠI(1 - 7)");
            }
        } while (input != 0);
    }
}
