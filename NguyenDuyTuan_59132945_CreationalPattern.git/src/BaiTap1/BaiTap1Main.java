/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Tuan Pc
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hd = new HoaDon.HoaDonBuilder().addMaHD("N1233")
                .addNgayBan("15/2/2019")
                .addTenKH("Nguyen Duy Tuan")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Tai Nghe Không day")
                .addSoLuong(1)
                .addDonGia(213440)
                .addChietKhau("15%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Bàn Phím LD")
                .addSoLuong(2)
                .addDonGia(13564)
                .addChietKhau("15%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();
    }
    
}
