/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class testArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] a;
        //khoi tao
//        a = new int[4];
//        a[0] = 12;
//        a[1] = 9;
//        a[2] = 1;
//        a[1] = 15;
        //xuat du lieu
//        System.out.println(a.toString());
//        System.out.println(Arrays.toString(a));
          
//          int[] b = new int[]{1, 3, -7, 8, 9, 20};
//          System.out.println(Arrays.toString(b));
//          System.out.println("Số lượng phần tử của mảng là " + b.length);
          
          Scanner sc = new Scanner(System.in);
          System.out.println("Số lượng phần tử của mảng là n = ");
          String input = sc.nextLine();
          int n = Integer.parseInt(input);
          int[] c = new int[n];
          Random rnd = new Random();
          for(int i = 0; i < n; i ++){
              c[i] = rnd.nextInt(1000);
          }
          System.out.println(Arrays.toString(c));
          
          //sap xep mang theo chieu tang dan
          Arrays.sort(c);
          System.out.println("Mảng sau khi sắp xếp tăng dần là ");
          System.out.println(Arrays.toString(c));
          
          //tim kiem vet can
          System.out.println("Nhập giá trị cần tìm kiếm x = ");
          input = sc.nextLine();
          int x = Integer.parseInt(input);
//          
//          boolean flag = false;
//          
//          for(int i = 0; i < c.length; i++){
//              if(c[i] == x){
//                  System.out.println("Giá trị cần tìm kiếm có trong mảng tại vị trí " + i);
//                  flag = true;
//                  break;
//              }
//          }
//          
//          if(!flag){
//              System.out.println("Giá trị cần tìm không có trong mảng ");
//          }           
            //tim kiem nhi phan
            int index = Arrays.binarySearch(c, x);
            if(index < 0){
                System.out.println("Không tìm thấy");
            }else {
                System.out.println("Tìm thấy tại vị trí  thư " + index);
            }
            
          
//          int temp;
//          for(int i = 0; i < n-1; i++)
//              for(int j = i + 1; j < n; j++){
//                  if(c[i] > c[j]){
//                      temp =c[i];
//                      c[i] = c[j];
//                      c[j] = temp;
//                  }
//              }
//          System.out.println(Arrays.toString(c));
//          Arrays.sort(c);
//          System.out.println(Arrays.toString(c));
            
//          for(int i = 0; i < n; i++){
//          System.out.print("c[" + i + "] = ");
//          input = sc.nextLine();
//          c[i] = Integer.parseInt(input);
//          }
//          System.out.println("Giá trị của mảng vừa nhập là ");
//          System.out.println(Arrays.toString(c));
//          for(int i = 0; i < c.length; i ++){
//              System.out.print(c[i] + " ");
//          }
    }
    
}
