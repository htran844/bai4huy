/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Huy {

   static List<KhachHang> lstKH = new ArrayList<>();
   static List<HoaDon> lstHD = new ArrayList<>();
    public static void main(String[] args) {
        KhachHang kh1 = new KhachHang("huy1", "32525");
        KhachHang kh2 = new KhachHang("huy2", "34234");
        KhachHang kh3 = new KhachHang("huy3", "3251625");
        KhachHang kh4 = new KhachHang("huy4", "90544");
       lstKH.add(kh1);
       lstKH.add(kh2);
       lstKH.add(kh3);
       lstKH.add(kh4);
       
       Hang h1= new Hang("tv1", "tivi1", 2, 100);
       Hang h2= new Hang("tv2", "tivi2", 3, 300);
       Hang h3= new Hang("tv3", "tivi3", 6, 200);
       Hang h4= new Hang("tv4", "tivi4", 4, 100);
       
       lstHD.add(new HoaDon(1, h1, kh1));
       lstHD.add(new HoaDon(2, h2, kh2));
       lstHD.add(new HoaDon(3, h3, kh3));
       lstHD.add(new HoaDon(4, h4, kh4));
       String tenKhachHang = "huy1";
        for (int i = 0; i < lstHD.size(); i++) {
            if (lstHD.get(i).khachHang.tenKH.equalsIgnoreCase(tenKhachHang)) {
                lstHD.get(i).InHoaDon();
            }
        }
    }
    
}
