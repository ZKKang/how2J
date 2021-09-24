package javamiddle.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputSteam {
    public static void main(String[] args) {
        try{
            File file = new File("F:\\myworkspace\\how2j\\workspace\\how2J\\src\\file\\lol.txt");
            FileOutputStream fos = new FileOutputStream(file);
            byte[] all = new byte[]{'C','D','E'};
            fos.write(all);

            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
