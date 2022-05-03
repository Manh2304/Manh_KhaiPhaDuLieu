/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.util.Arrays;
import lthdt.chuong03.coffeelogic.Product;
import lthdt.chuong03.coffeelogic.ProductComByName;
import lthdt.chuong03.coffeelogic.ProductCompByPrice;

/**
 *
 * @author USER
 */
public class testProductArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tao mang cac san pham
        Product[] sp = new Product[]{
            new Product("Sunsilk", 12),
            new Product("Lifebouy", 5),
            new Product("Espresso", 2),
            new Product("Thiên Long", 1)
        };
        System.out.println("Mảng ban đầu là ");
        System.out.println(Arrays.toString(sp));
        Product temp;
//        for(int i = 0; i < sp.length; i++)
//            for(int j = i + 1; j < sp.length; j++)
//                if(sp[i].getPrice() > sp[j].getPrice()){
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                }
        //xap sep mang theo gia ca tang dan
//        Arrays.sort(sp, new ProductCompByPrice());
//        System.out.println("Mảng sắp xếp tăng dần theo giá cả ");
//        System.out.println(Arrays.toString(sp));
        System.out.println("Sắp xếp sản phẩm theo tên sản phảm ");
        Arrays.sort(sp, new ProductComByName());
        System.out.println(Arrays.toString(sp)); 
        
        int index = Arrays.binarySearch(sp, new Product("Sunsilk", 12),
                new ProductComByName());
        if(index < 0){
            System.out.println("Không tìm thấy");
        }else{
            System.out.println("Phần tử thứ " + index + " chứa giá trị cần tim");
            System.out.println(sp[index]);
        }
    }
    
}
