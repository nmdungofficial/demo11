/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.ArrayList;
import model.Giay;

/**
 *
 * @author Nguyen Manh Dung
 */
public interface Interface_Giayy {

    public ArrayList<Giay> getAll();

    public ArrayList<Giay> getAllCT();

    public Integer addGiay(Giay giay);

    public Integer updateGiay(Giay giay);
    
    public Integer addGiayChiTiet(Giay giay);

    public Integer updateGiayChiTiet(Giay giay);

    public Integer delete(Integer id_giay, String trangThai);

}
