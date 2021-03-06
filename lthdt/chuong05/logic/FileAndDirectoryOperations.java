/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong05.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.java2d.pipe.BufferedBufImgOps;

/**
 *
 * @author USER
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    //Thao tac 1: liet ke tat ca cac thu muc va tap tin trong thu muc hien tai
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }
    
    //Thao tac 2: xuat ket qua
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    //Thao tac 3: loc ra cac thu muc
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new  ArrayList<>();
        for(int i = 0; i < content.length; i++ ){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //Thao tac 4: loc ra tat ca cac tap tin
    public File[] getFiles(File[] content){
       ArrayList<File> result = new  ArrayList<>();
        for(int i = 0; i < content.length; i++ ){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua); 
    }
    
    //Thao tac 5: Duyet de quy xuat tat ca cac tap tin va thuc muc 
    public void getContentRecursively(String folder){
        File content = new File(folder);       
        //dieu kien dung
        if(content.isFile()){
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //cau goi de quy trong stack
        System.out.println("Th?? m???c: " + folder);
        File[] sub = content.listFiles();
        for(int i = 0; i < sub.length; i++){
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }
    
    //Thao tac 6: Doc file van ban
    public String readTextFile(String filename) throws IOException{
        StringBuilder content = new StringBuilder();
        
        try {
            //Mo file
            FileReader fr = new FileReader(filename);
            //Dung bo dem
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while ((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
                
            }
            
            //Dong file
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            return"kh??ng t??m th???y file " + filename ;
        } catch (IOException ex ){
            return"Kh??ng th??? ?????c file " + filename;
        }
        return content.toString();
    }
    
    //Thao tac 7:Luu tap tin van ban
    public boolean writeTextFile(String filename, String content){
        boolean flag = true;//luu thanh conh
        try {
            //Mo file
            FileWriter fw = new FileWriter(filename);
            //Su dung buffer
            BufferedWriter bw = new BufferedWriter(fw);
            //Ghi ra file
            bw.write(content);
            //Dong file
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }
}
