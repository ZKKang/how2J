package javamiddle.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流
 * Reader字符输入流
 * Writer字符输出流
 * 专门用于字符的形式读取和写入数据
 *
 * ISO-8859-1 包含 ASCII
 * GB2312 是简体中文，BIG5是繁体中文，GBK同时包含简体和繁体以及日文。
 * UNICODE 包括了所有的文字，无论中文，英文，藏文，法文，世界所有的文字都包含其中  包含UTF-8，UTF-16和UTF-32
 * UTF-8 最常见的UTF-8编码方式，数字和字母用一个字节， 汉字用3个字节。
 * new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"));  可以指定读取编码
 */
public class TestReader {
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是AB
        File f = new File("d:/lol.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
