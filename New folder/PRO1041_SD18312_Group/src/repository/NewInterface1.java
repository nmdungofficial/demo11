/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.KhachHang;

/**
 *
 * @author Fpt06
 */
public interface NewInterface1 {
    public ArrayList<KhachHang> getAllKhachHang();
//    public Integer insert(KhachHang kh);
    public Integer update(KhachHang kh);
    public int find(String id);
}
