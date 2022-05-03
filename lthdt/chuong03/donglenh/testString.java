/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

/**
 *
 * @author USER
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long lanh day nuoc in troi \n Thanh xay khoi biec non phoi nang vang";
        System.out.println(content);
        //Thao tac 1: tim vi tri cua 1 ki tu
        System.out.println("Vị trí của kí tự a trong chuổi là: " 
                           + content.indexOf('a'));
        System.out.println("Vị trí của từ nuoc trong chuổi là: " 
                + content.indexOf("nuoc"));
        //Thao tac 2: kiem tra khoi dau va ket thuc
        System.out.println("Chuổi mở đầu bằng cụm từ Long: " 
                + content.startsWith("Long"));
        System.out.println("Chuổi kết thúc bằng cụm từ troi: " 
                + content.endsWith("troi"));
        //Thao tac 3: cat chuoi theo vi tri
        String temp = content.substring(20, 26);
        System.out.println("Chuổi con là: "  + temp );
        //Thao tac 4: phan tach chuoi
        String[] result = content.split("\n");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        //Thao tac 5: Loai bo khoang trang dau - cuoi chuoi
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].trim());
        }
        //Thao tac 6: thay the ki tu
        temp = content.replace('a', 'z');
        System.out.println(temp);
        
        //thao tac 7: chuyen kieu
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);
        
        //Thao tac 8: so sanh chuoi
        temp = "Nguyen";
        if(temp.compareToIgnoreCase("nguyen") == 0){
            System.out.println("2 chuổi bằng nhau");
        }else {
            System.out.println("2 chuổi không bằng nhau");
        }
        
        //Thao tac 9: Noi chuoi
        temp = temp.concat(" Van A");
        System.out.println(temp);
        
        //Thao tac 10: truy xuat bang chi so
        for(int i = 0; i < temp.length(); i++){
            System.out.print(temp.charAt(i));
        }
        System.out.println();
        
        //Thao tac 11: chuyen kieu
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println("n = " + n);
        
        //Thao tac 12:Su dung StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Long lanh day nuoc in troi\n");
        sb.append("Thanh xay khoi biec non phoi bong vang");
        temp = sb.toString();
        System.out.println(sb);
    }
}
