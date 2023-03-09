package org.training.advanced.java.files;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

public class FileRead {
    public static void main(String[] args) throws Exception {
        File file = new File("tempfile.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        ByteBuffer byteBuffer2 = ByteBuffer.allocateDirect(1024);

        FileChannel channel = fileInputStream.getChannel();
        int read = channel.read(byteBuffer);
        System.out.println(byteBuffer);
        byteBuffer.flip();
//        byteBuffer.position(0);
//        byteBuffer.limit(26);
        int positionStart = byteBuffer.position();
        byte b = byteBuffer.get();
        if (b == (byte)',' || b== (byte)'\n'){
            int position = byteBuffer.position();
            byteBuffer.position(positionStart);
            int length = position - positionStart;
            byte[] byt = new byte[length];
            byteBuffer.get(byt,0,length);
            String s = new String(byt);
        }



        FileReader fileRead = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileRead);
        String line = null;
        while ((line =  bufferedReader.readLine()) != null){
            System.out.println(line);
        }


    }

}
