package javamiddle.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestSplitFile {
    public static void main(String[] args) {
        String filePath = "E:\\JsonView\\JsonView.exe";
        int size = 10240;
        File file = new File(filePath);
        byte[] all = null;
        try(FileInputStream fis =new FileInputStream(file)){
            all = new byte[(int)file.length()];
            fis.read(all);

        }catch (IOException ex){
            ex.printStackTrace();
        }

        int n = all.length%size==0?0:1;
        for(int i=0;i<all.length/size+n;i++){
            byte[] tempData = Arrays.copyOfRange(all,i*size,i*size+size>all.length?all.length:i*size+size);
            File tempFile = new File(file.getParentFile(),"JsonView-"+i+".exe");
            try {
                writeToFile(tempFile,tempData);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeToFile(File tempFile, byte[] tempData) throws Exception{
        if(!tempFile.exists()){
            tempFile.createNewFile();
        }
        try(FileOutputStream fos = new FileOutputStream(tempFile)){
            fos.write(tempData);
            fos.close();
        }
    }
}
