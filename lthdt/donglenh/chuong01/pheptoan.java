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
public class pheptoan {
    public static void main(String[] args) {
        //Cac phep toan so nguyen
        int a = 17, b = 4, c;
        c = a + b;
        System.out.println("Phép cộng " + a + " + " + b + " = " + c);
        c = b - a;
        System.out.println("Phép trừ " + b + " - " + a + " = " + c);
        c = a*b;
        System.out.println("Phép nhân " + a + " * " + b + " = " + c);
        c = a/b;
        System.out.println("Phép chia lấy phần nguyên " + a + " / " + b + " = " + c);
        c = a%b;
        System.out.println("Phép chia lấy phần dư " + a + " % " + b + " = " + c);
        
        //Cac phep toan so thuc
        double x = 14.3, y = 3.56, z;
        z = x + y;
        System.out.println("Phép cộng " + x + " + " + y + " = " + z);
        z = y - x;
        System.out.println("Phép trừ " + y + " - " + x + " = " + z);
        z = y*x;
        System.out.println("Phép nhân " + y + " * " + x + " = " + z);
        z = y/x;
        System.out.println("Phép chia " + y + " / " + x + " = " + z);
        
        //Cac phep toan tren kieu logic
        boolean flag1 = true, flag2 = false, flag3 = true;
        System.out.println("Phép AND " + (flag1 && flag2));
        System.out.println("Phép OR " + (flag1 || flag2));
        System.out.println("Phép NOT " + (!flag1));
        System.out.println("Phép XOR " + (flag1^flag3));
        
        //Mot so phep toan co ban tren chuoi
        String s1 = "Hue University";
        String s2 = "university";
        
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase().contains(s2));
        s1 += " " + s2;
        System.out.println(s1);        
    }
    
    
}
