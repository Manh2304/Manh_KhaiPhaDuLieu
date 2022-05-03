/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author USER
 */
public class Bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyễn Văn A", 1, ngaysinh);
        
        System.out.println("Họ tên: " + person.getHoten() + "; giới tính: " + person.getGioitinh()
        + "; ngày sinh: " + df.format(person.getNgaysinh()));
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyễn Văn B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-12-2002"));
        sinhvien.setTruonghoc("Đại học Huế");
        System.out.println(sinhvien.getHoten() + "; giới tính: " + sinhvien.getGioitinh()
        + "; ngày sinh: " + df.format(sinhvien.getNgaysinh()) + sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyễn Thị C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("02-09-2003"));
        congnhan.setCongty("IBM");
        System.out.println(congnhan.getHoten() + "; giới tính: " + 
                congnhan.getGioitinh() + "; ngày sinh: " + 
                df.format(congnhan.getNgaysinh()) + "; công ty: " 
                + congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
    }
}
