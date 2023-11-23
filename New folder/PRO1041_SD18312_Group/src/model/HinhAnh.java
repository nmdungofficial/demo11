/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Manh Dung
 */
public class HinhAnh {

    private Integer idHinhAnh;
    private String Ten_HinhAnh;

    public HinhAnh() {
    }

    public HinhAnh(Integer idHinhAnh, String Ten_HinhAnh) {
        this.idHinhAnh = idHinhAnh;
        this.Ten_HinhAnh = Ten_HinhAnh;
    }

    public Integer getIdHinhAnh() {
        return idHinhAnh;
    }

    public void setIdHinhAnh(Integer idHinhAnh) {
        this.idHinhAnh = idHinhAnh;
    }

    public String getTen_HinhAnh() {
        return Ten_HinhAnh;
    }

    public void setTen_HinhAnh(String Ten_HinhAnh) {
        this.Ten_HinhAnh = Ten_HinhAnh;
    }

    @Override
    public String toString() {
        return  Ten_HinhAnh;
    }
    
    
}
