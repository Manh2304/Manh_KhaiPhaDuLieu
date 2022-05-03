/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong02.logiclayer;

/**
 *
 * @author USER
 */
public class PhuongTrinhBac1 implements PhuongTrinhInterface{
    private double a;
    private double b;
    private double nghiem_x;
    private String ketqua;

    public PhuongTrinhBac1() {
    }

    public PhuongTrinhBac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void giaiPhuongTrinh() {
        if(a != 0){
            nghiem_x = -b/a;
            ketqua = "Phương trình bậc 1 có nghiệm là " + nghiem_x;
        }else {
            if(b != 0) {
                ketqua = "Phương trình bậc 1 vô nghiệm";   
            }else {
                ketqua = "Phương trình bậc 1 có vô số nghiệm";
            }
        }
    }

    @Override
    public String toString() {
      if(ketqua == null || ketqua.isEmpty()){
          giaiPhuongTrinh();
      }
      return ketqua;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getNghiem_x() {
        return nghiem_x;
    }

    public void setNghiem_x(double nghiem_x) {
        this.nghiem_x = nghiem_x;
    }

    public String getKetqua() {
        return ketqua;
    }

    public void setKetqua(String ketqua) {
        this.ketqua = ketqua;
    }
    
    
        
}
