/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

/**
 *
 * @author USER
 */
public class Bai04 {
    public static void main(String[] args){
       Shape htron = new Circle(5, 1, 2);
//       System.out.println("Chu vi của hình tròn là: " + htron.calcPerimeter());
//       System.out.println("Diện tích của hình tròn là: " + htron.calcArea());
         System.out.println(htron.toString());
       
       Shape hcn = new Rectangle(3, 15, 8, 5);
//       System.out.println("Chu vi hcn là: " + hcn.calcPerimeter());
//       System.out.println("Diện tích hcn là: " + hcn.calcArea());
       System.out.println(hcn);
    }
}
