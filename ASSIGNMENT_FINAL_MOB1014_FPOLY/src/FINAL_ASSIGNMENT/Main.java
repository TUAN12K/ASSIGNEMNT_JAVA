/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_ASSIGNMENT;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void Menu() {
        System.out.println("-------------------------------------- MENU --------------------------------------");
        System.out.println("|1.THÊM - SỬA - XÓA GIÁO VIÊN                                                    |");
        System.out.println("|2.THÊM 15 GIÁO VIÊN TẠO SẴN TRONG DANH SÁCH                                     |");
        System.out.println("|3.TÌM KIẾM GIÁO VIÊN THEO MÃ GIÁO VIÊN                                           |");
        System.out.println("|4.LOAD TẤT CẢ THÔNG TIN GIÁO VIÊN                                               |");
        System.out.println("|5.TÌM KIẾM THEO TÊN GIÁO VIÊN GẦN ĐÚNG                                          |");
        System.out.println("|6.LOAD TẤT CẢ GIÁO VIÊN CÓ SỐ GIỜ DẠY LỚN HƠN 500 GIỜ                           |");
        System.out.println("|7.LOAD TẤT CẢ GIÁO VIÊN VÀ PHÂN CHIA DANH SÁCH THEO VÙNG MIỀN                   |");
        System.out.println("|0.THOÁT CHƯƠNG TRÌNH                                                            |");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("XIN MỜI BẠN CHỌN CHỨC NĂNG: ");
    }

    public static void main(String[] args) {
        Struden_Service ss = new Struden_Service();
        int n;
        do {
            Scanner sc = new Scanner(System.in);
            Menu();
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    System.out.println("1.THÊM - SỬA - XÓA GIÁO VIÊN");
                    ss.addStuden();
                    break;
                case 2:
                    System.out.println("2.THÊM 15 GIÁO VIÊN TẠO SẴN TRONG DANH SÁCH");
                    ss.editStuden();
                    break;
                case 3:
                    System.out.println("3.TÌM KIẾM GIÁO VIÊN THEO MÃ GIÁO VIÊN ");
                    ss.removeStuden();
                    break;
                case 4:
                    System.out.println("4.LOAD TẤT CẢ THÔNG TIN GIÁO VIÊN");
                    ss.getStuden();
                    break;
                case 5:
                    System.out.println("5.TÌM KIẾM THEO TÊN GIÁO VIÊN GẦN ĐÚNG");
                    ss.findStuden();
                    break;
                case 6:
                    System.out.println("6.LOAD TẤT CẢ GIÁO VIÊN CÓ SỐ GIỜ DẠY LỚN HƠN 500 GIỜ");
                    ss.filterStuden();
                    break;
                case 7:
                    System.out.println("7.LOAD TẤT CẢ GIÁO VIÊN VÀ PHÂN CHIA DANH SÁCH THEO VÙNG MIỀN");
                    ss.sortStuden();
                    break;
                case 0:
                    System.out.println("0.THOÁT CHƯƠNG TRÌNH");
                    break;
                default:
                    System.out.println("CHƯƠNG TRÌNH BẠN CHỌN KHÔNG CÓ! XIN VUI LÒNG CHỌN LẠI(1 - 7)");
            }
        } while (n != 0);

    }

}
