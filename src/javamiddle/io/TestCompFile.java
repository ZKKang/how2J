package javamiddle.io;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCompFile {
    public static void main(String[] args) throws Exception{
        String filePath = "E:\\JsonView";
        File file = new File(filePath);
        Map<String,File> fileInfoMap = new HashMap<String,File>();
        for(File tempFile:file.listFiles()){
            if(tempFile.getName().startsWith("JsonView-")) {
                fileInfoMap.put(tempFile.getName().split("-")[1],tempFile);
            }
        }

        boolean isAll = false;
        int i = 0;
        File destFile = new File(filePath, "JsonView.exe");

        FileOutputStream fos = new FileOutputStream(destFile);

        do{
            File eachFile = fileInfoMap.get(String.valueOf(i));
            if(eachFile != null) {
                try(FileInputStream fis = new FileInputStream(eachFile)) {
                    byte[] eachContent = new byte[(int) eachFile.length()];
                    fis.read(eachContent);
                    fos.write(eachContent);
                    fos.flush();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            } else {
                isAll = true;
            }
            i++;
        } while (!isAll);
        fos.close();;

    }




}
