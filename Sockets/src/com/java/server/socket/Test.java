package com.java.server.socket;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
       String fielPath = "/Users/Xiangshifu/Downloads/kuaishoudancode.docx";
       String outPath = "/Users/Xiangshifu/Documents/jiazhicarnew/ksd_android/financer/src/main/java/com";
       witeFile(fielPath,outPath);

    }

    public static void witeFile(String fielPath,String outPath ) throws IOException {
        //定义输出目录
        String FileOut=fielPath;
        BufferedWriter bw=new BufferedWriter(new FileWriter(FileOut,true));

        //读取目录下的每个文件或者文件夹，并读取文件的内容写到目标文字中去
        File parentFile = new File(outPath);
        if (parentFile.isDirectory()){
            File[] list = parentFile.listFiles();
            for (File file : list){
                if (file.isDirectory()){
                    witeFile(fielPath,file.getPath());
                }else{
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while((line=br.readLine())!=null) {
                        bw.write(line);
                        bw.newLine();
                    }
                    br.close();
                }
            }
        }else{
            BufferedReader br = new BufferedReader(new FileReader(parentFile));
            String line;
            while((line=br.readLine())!=null) {
                bw.write(line);
                bw.newLine();
            }
            br.close();
        }
        bw.close();
    }


}
