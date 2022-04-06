package FINAL_ASSIGNMENT_MOB1014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.w3c.dom.ls.LSInput;

public class GiaoVien_Service {

    private Scanner _sc = new Scanner(System.in);
    private List<GiaoVien> _lstGiaoVien;
    private GiaoVien _GiaoVien;
    private String _input;

    public GiaoVien_Service() {
        _lstGiaoVien = new ArrayList<>();
    }

    public void themGiaovien() {
        System.out.print("SỐ LƯỢNG GIÁO VIÊN BẠN MUỐN THÊM: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _GiaoVien = new GiaoVien();
            System.out.print("XIN MỜI NHẬP HỌ: ");
            _GiaoVien.setHo(_sc.nextLine());
            System.out.print("XIN MỜI NHẬP TÊN ĐỆM: ");
            _GiaoVien.setTenDem(_sc.nextLine());
            System.out.print("XIN MỜI NHẬP TÊN: ");
            _GiaoVien.setTen(_sc.nextLine());
            System.out.print("XIN MỜI NHẬP NĂM SINH: ");
            _GiaoVien.setNamSinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("XIN MỜI NHẬP GIỚI TÍNH(1:NAM : NỮ): ");
            _GiaoVien.setGioiTinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("XIN MỜI NHẬP QUÊ QUÁN: ");
            _GiaoVien.setQueQuan(_sc.nextLine());
            System.out.print("XIN MỜI NHẬP MÃ GIÁO VIÊN: ");
            _GiaoVien.setMaGv(_sc.nextLine());
            System.out.print("XIN MỜI NHẬP EMAIL: ");
            _GiaoVien.setEmail(_sc.nextLine());
            System.out.print("XIN MỜI NHẬP SỐ GIỜ DẠY: ");
            _GiaoVien.setSoGioDay(Integer.parseInt(_sc.nextLine()));
            _lstGiaoVien.add(_GiaoVien);
        }
    }

    public void suaGiaovien() {
        System.out.print("XIN MỜI BẠN NHẬP MÃ GIÁO VIÊN: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getMaGv().equals(_input)) {
                System.out.println(_lstGiaoVien.get(i).toString());
                System.out.println("1.SỬA TÊN");
                System.out.println("2.SỐ GIỜ DẠY");
                System.out.print("XIN MỜI BẠN CHỌN: ");
                _input = _sc.nextLine();
                switch (_input) {
                    case "1":
                        System.out.println("XIN MỜI NHẬP TÊN GIÁO VIÊN: ");
                        _lstGiaoVien.get(i).setTen(_sc.nextLine());
                        break;
                    case "2":
                        System.out.println("XIN MỜI NHẬP SỐ GIỜ DẠY: ");
                        _lstGiaoVien.get(i).setSoGioDay(Integer.parseInt(_sc.nextLine()));
                        break;
                    default:
                        System.out.println("KHÔNG CÓ");
                }
                System.out.print("ĐÃ SỦA THÀNH CÔNG");
                return;
            }
            System.out.println("KHÔNG TÌM THẤY");
        }

    }

    public void xoaGiaovien() {
        System.out.print("XIN MỜI BẠN NHẬP MÃ GIÁO VIÊN: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getMaGv().equals(_input)) {
                System.out.println(_lstGiaoVien.get(i).toString());
                _lstGiaoVien.remove(i);
            }
            System.out.print("ĐÃ XÓA THÀNH CÔNG");
            return;
        }
        System.out.println("KHÔNG TÌM THẤY");
    }

    public void timKiem() {
        System.out.print("NHẬP MÃ GIÁO VIÊN: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getMaGv().equals(_input)) {
                System.out.println(_lstGiaoVien.get(i).toString());
                return;
            }
        }
        System.out.println("KHÔNG TÌM THẤY");
    }

    public void themSuaxoa() {
        System.out.println("1.THÊM");
        System.out.println("2.SỬA");
        System.out.println("3.XÓA");
        System.out.println("XIN MỜI BẠN CHỌN CHỨC NĂNG");
        _input = _sc.nextLine();
        switch (_input) {
            case "1":
                System.out.println("BẠN CHỌN: 1.THÊM");
                themGiaovien();
                break;
            case "2":
                System.out.println("BẠN CHỌN: 2.SỦA");
                suaGiaovien();
                break;
            case "3":
                System.out.println("BẠN CHỌN: 1.XÓA");
                xoaGiaovien();
                break;
            default:
                System.out.println("CHỨC NĂNG KHÔNG CÓ");
        }
    }

    public void them15Giaovien() {
        _lstGiaoVien.add(new GiaoVien("PH20022", "TUANNQPH20022@FPT.EDU.VN", 700, "NGUYỄN", "QUỐC", "TUẤN", 1995, 1, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20023", "HOANGHQPH20022@FPT.EDU.VN", 600, "NGUYỄN", "VĂN", "HOÀNG", 1993, 1, "NAM ĐỊNH"));
        _lstGiaoVien.add(new GiaoVien("PH20024", "TUANNQPH20022@FPT.EDU.VN", 700, "NGÔ", "HƯƠNG", "LAN", 1993, 0, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20025", "TUANNQPH20022@FPT.EDU.VN", 600, "HUỲNH", "QUỐC", "VIỆT", 1993, 1, "HỒ CHÍ MINH"));
        _lstGiaoVien.add(new GiaoVien("PH20026", "TUANNQPH20022@FPT.EDU.VN", 500, "NGUYỄN", "TÍNH", "BẰNG", 1995, 1, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20027", "TUANNQPH20022@FPT.EDU.VN", 400, "HUYỀN", "THỊ", "NGỌC", 2003, 0, "HỒ CHÍ MINH"));
        _lstGiaoVien.add(new GiaoVien("PH20028", "TUANNQPH20022@FPT.EDU.VN", 200, "NGUYỄN", "TRUNG", "TÍN", 1993, 1, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20029", "TUANNQPH20022@FPT.EDU.VN", 300, "NGUYỄN", "VIỆT", "NINH", 2000, 1, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20030", "TUANNQPH20022@FPT.EDU.VN", 700, "HÀ", "QUỐC", "BẰNG", 1993, 1, "HỒ CHÍ MINH"));
        _lstGiaoVien.add(new GiaoVien("PH20031", "TUANNQPH20022@FPT.EDU.VN", 800, "NGUYỄN", "LINH", "CHI", 1995, 1, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20032", "TUANNQPH20022@FPT.EDU.VN", 600, "NGUYỄN", "HOÀNG", "TUẤN", 1999, 1, "HỒ CHÍ MINH"));
        _lstGiaoVien.add(new GiaoVien("PH20033", "TUANNQPH20022@FPT.EDU.VN", 900, "NGUYỄN", "THANH", "THỦY", 1995, 0, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20034", "TUANNQPH20022@FPT.EDU.VN", 200, "LÊ", "BÌNH", "NGỌC", 1993, 1, "HÀ NỘI"));
        _lstGiaoVien.add(new GiaoVien("PH20035", "TUANNQPH20022@FPT.EDU.VN", 500, "MAI", "QUÝ", "LAN", 1995, 0, "ĐÀ NẴNG"));
        _lstGiaoVien.add(new GiaoVien("PH20036", "TUANNQPH20022@FPT.EDU.VN", 200, "HOÀNG", "LINH", "ĐẠT", 1992, 1, "THANH HÓA"));
        System.out.println("THÊM THÀNH CÔNG 15 GIÁO VIÊN");
    }

    public void XuatDsGiaovien() {
        for (GiaoVien x : _lstGiaoVien) {
            System.out.println(x.toString());
        }
    }

    public void XuatlonHon500() {
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getSoGioDay() > 500) {
                System.out.println(_lstGiaoVien.get(i).toString());
            }
        }
    }

    public void sapxep() {
        System.out.println("\n\nTHÀNH PHỐ HÀ NỘI\n\n");
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getQueQuan().equalsIgnoreCase("HÀ NỘI")) {
                System.out.println(_lstGiaoVien.get(i).toString());
            }
        }
        System.out.println("\n\nTHÀNH PHỐ HỒ CHÍ MINH\n\n");
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getQueQuan().equalsIgnoreCase("HỒ CHÍ MINH")) {
                System.out.println(_lstGiaoVien.get(i).toString());
            }
        }
        System.out.println("\n\nTHÀNH PHỐ ĐÀ NẴNG\n\n");
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getQueQuan().equalsIgnoreCase("ĐÀ NẴNG")) {
                System.out.println(_lstGiaoVien.get(i).toString());
            }
        }
        System.out.println("\n\nTHÀNH PHỐ THANH HÓA\n\n");
        for (int i = 0; i < _lstGiaoVien.size(); i++) {
            if (_lstGiaoVien.get(i).getQueQuan().equalsIgnoreCase("THANH HÓA")) {
                System.out.println(_lstGiaoVien.get(i).toString());
            }
        }
    }

}
