/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy;

/**
 *
 * @author Admin
 */
public class HoaDon {
    public int idHoaDon;
    public Hang hang;
    public KhachHang khachHang;

    public HoaDon() {
    }

    public HoaDon(int idHoaDon, Hang hang, KhachHang khachHang) {
        this.idHoaDon = idHoaDon;
        this.hang = hang;
        this.khachHang = khachHang;
    }
    
    
    public int tongTien(){      
        return hang.soLuong * hang.gia;
    }
    public void InHoaDon(){
        System.out.println("id: " + idHoaDon + " ten kh: " + khachHang.tenKH 
                + " ten hang: " + hang.tenHang + " tong tien: " + tongTien());
    }
}
