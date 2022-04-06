package FINAL_ASSIGNMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Struden_Service {

    private List<Student> _listStudents;
    private Student _Student;
    private String _input;
    Scanner _sc = new Scanner(System.in);

    public Struden_Service() {
        _listStudents = new ArrayList<>();
        _Student = new Student("PH123", 1, "A", "09378372");
        _listStudents.add(_Student);
        _Student = new Student("PH124", 2, "B", "09378373");
        _listStudents.add(_Student);
        _Student = new Student("PH125", 3, "C", "09878374");
        _listStudents.add(_Student);
        _Student = new Student("PH126", 1, "D", "09478375");
        _listStudents.add(_Student);
    }

    public void addStuden() {
        System.out.println("MỜI BẠN NHẬP SỐ LƯỢNG");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _Student = new Student();
            System.out.print("MỜI BẠN NHẬP TÊN:");
            _Student.setTen(_sc.nextLine());
            System.out.print("MỜI BẠN NHẬP SỐ ĐIỆN THOẠI:");
            _Student.setSdt(_sc.nextLine());
            System.out.print("MỜI BẠN NHẬP MÃ SINH VIÊN:");
            _Student.setMsv(_sc.nextLine());
            String tempInput;
            do {
                System.out.println("MỜI BẠN CHỌN NGÀNH");
                System.out.println("--- DANH SÁCH NGÀNH ---");
                System.out.println("1.ỨNG DỤNG PHẦN MỀM");
                System.out.println("2.WEB");
                System.out.println("3.MOBILE");
                System.out.print("MỜI BẠN CHỌN NGÀNG: ");
                tempInput = _sc.nextLine();
                switch (tempInput) {
                    case "1":
                        _Student.setNganh(1);
                        break;
                    case "2":
                        _Student.setNganh(2);
                        break;
                    case "3":
                        _Student.setNganh(3);
                        break;
                    default:
                        System.out.println("CHỨC NĂNG KHÔNG TỒN TẠI");
                }
            } while ((tempInput != "1" || tempInput != "2" || tempInput != "3"));
            _listStudents.add(_Student);
        }

    }

    public void findStuden() {
        // CÁCH 1
//        System.out.print("MỜI BẠN NHẬP MÃ CẦN TÌM: ");
//        _input = _sc.nextLine();
//        for (int i = 0; i < _listStudents.size(); i++) {
//            if (_listStudents.get(i).getMsv().equals(_Student)) {
//                _listStudents.get(i).InRaManHinh();
//            }
//
//        }
        // CÁCH 2 SỬ DỤNG PHƯƠNG THỨC GetIndex để tìm vị chí
        int temp = getIndex();
        if (temp == -1) {
            System.out.println("MÃ SINH VIÊN KHÔNG TỒN TẠI");
            return;
        }
        _listStudents.get(temp).InRaManHinh();

    }

    public void removeStuden() {
        int temp = getIndex();
        if (temp == -1) {
            System.out.println("MÃ SINH VIÊN KHÔNG TỒN TẠI");
            return;
        }
        _listStudents.remove(temp);
        System.out.println("XÓA THÀNH CÔNG");

    }

    public void editStuden() {
        int temp = getIndex();
        if (temp == -1) {
            System.out.println("MÃ SINH VIÊN KHÔNG TỒN TẠI");
            return;
        }
        System.out.println("---- MENU - SỬA ----");
        System.out.println("|1.SỬA TÊN|");
        System.out.println("|2.SỬA SỐ ĐIỆN THOẠI|");
        System.out.println("|3.SỬA NGÀNH|");
        System.out.println("MỜI BẠN CHỌN THUỘC TÍNH MUỐN SỬA");
        _input = _sc.nextLine();
        switch (_input) {
            case "1":
                System.out.println("MỜI BẠN NHẬP LẠI TÊN");
                _listStudents.get(temp).setTen(_sc.nextLine());
                break;
            case "2":
                System.out.println("MỜI BẠN NHẬP LẠI SỐ ĐIỆN THOẠI");
                _listStudents.get(temp).setSdt(_sc.nextLine());
                break;
            case "3":
//                TỰ TRIỂN KHAI
//                System.out.println("MỜI BẠN NHẬP LẠI NGÀNH");
//                _listStudents.get(temp).setNganh(_sc.nextLine());
                break;
            default:
                System.out.println("CHỨC NĂNG BẠN CHỌN KHÔNG TỒN TẠI");
                System.out.println("MỜI BẠN CHỌN LẠI CHỨC NĂNG SỬA");
                return;
        }
        System.out.println("SỬA THÀNH CÔNG");
    }

    public void getStuden() {
        for (Student x : _listStudents) {
            x.InRaManHinh();
        }

    }

    public void filterStuden() {
        System.out.println("MỞI BẠN CHỌN MẢNG CẦN LỌC: ");
        System.out.println("1.VIETTEL");
        System.out.println("2.VINAPHONE");
        _input = _sc.nextLine();
        switch (_input) {
            case "1":
                for (Student x : _listStudents) {
                    if (x.getSdt().startsWith("093")) {
                        x.InRaManHinh();
                        
                    }
                }
                break;
            case "2":
                for (Student x : _listStudents) {
                    if (x.getSdt().startsWith("098")) {
                        x.InRaManHinh();
                        
                    }
                }
                break;
            default:
                System.out.println("CHỨC NĂNG KHÔNG TỒN TẠI");
        }
    }

    public void sortStuden() {
        Collections.sort(_listStudents,Comparator.comparing(Student::getTen));
    }

    public int getIndex() {
        System.out.print("MỜI BẠN NHẬP MÃ CẦN TÌM: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _listStudents.size(); i++) {
            if (_listStudents.get(i).getMsv().equals(_input)) {
                return i;
            }

        }
        return -1;
    }
    public String getInputValue(String msg){
        System.out.printf("MỜI BẠN NHẬP %s: ",msg);
        return _sc.nextLine();
    }

}
