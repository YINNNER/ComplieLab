package util;

import java.io.File;

/**
 * Created by Alex on 2018.11.20
 */
public class FileUtil {

    @SuppressWarnings("all")
    public static boolean isDuplicate(File newFile, File dir){
        if (dir != null){
            for (File file : dir.listFiles()) {
                if (file.getName().equals(newFile.getName())){
                    System.out.println(file.getName() + " " + newFile.getName());
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException();
    }
}
