package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class FileUtility {

    public static void copyFile(File sourceFile, File destinationFile){
        try{
            FileChannel sourceChannel = new FileInputStream(sourceFile).getChannel();
            FileChannel destinationChannel = new FileOutputStream(destinationFile).getChannel();
            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            sourceChannel.close();
            destinationChannel.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
