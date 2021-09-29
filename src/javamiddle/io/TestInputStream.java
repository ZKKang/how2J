package javamiddle.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("F:\\myworkspace\\how2j\\workspace\\how2J\\src\\file\\lol.txt");
            /**
             * Stream 流
             * InputStream 字节输入流  OutputStream 字节输出流  抽象类
             * FileInputStream 为 子类
             *
             *
             */
            fis = new FileInputStream(file);
            byte[] all = new byte[(int)file.length()];
            fis.read(all);// 以字节流的形式读取文件所有内容
            for(byte one : all){
                System.out.println(one);
            }

        }catch (IOException ioException){
            ioException.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
