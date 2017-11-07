package com.aiko.common.util;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


/**
 * @author RenBowen
 * @date 2017年10月13日-下午6:43:40
 * @since 1.0.0
 * @aiko-crm
 */
public class IoUtils {


    /**
     * Nio 文件复制
     * @param in
     * @param out
     * @throws IOException
     */
    public static void copyFile(String in, String out) throws IOException {
        FileInputStream inputStream = new FileInputStream(in);
        FileOutputStream outputStream = new FileOutputStream(out);
        FileChannel readChannel = inputStream.getChannel();
        FileChannel writeChannel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true) {
            buffer.clear();
            int len=readChannel.read(buffer);
            if(len == -1){
                break;
            }
            buffer.flip();
            writeChannel.write(buffer);
        }
        readChannel.close();
        writeChannel.close();
    }

}
