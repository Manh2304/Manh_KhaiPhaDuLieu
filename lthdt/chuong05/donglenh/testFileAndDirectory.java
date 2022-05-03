/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong05.donglenh;

import java.io.File;
import lthdt.chuong05.logic.FileAndDirectoryOperations;

/**
 *
 * @author USER
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("D:\\LapTrinhHuongDTK52\\KhaiPhaDuLieu\\lthdt");
//        System.out.println(fo.displayContent(content));
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sách các thư mục con là ");
//        System.out.println(fo.displayContent(thumuc));
//        File[] taptin = fo.getFiles(content);
//        System.out.println("Danh sách các tập tin là ");
//        System.out.println(fo.displayContent(taptin));
          
          fo.getContentRecursively("D:\\LapTrinhHuongDTK52");
    }
    
}
