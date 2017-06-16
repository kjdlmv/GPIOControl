package com.gpiocontrol;

import java.io.*;

class FileUtil {
    static void append(String file, String appendText) throws IOException {
        BufferedWriter writer = getBufferedWriter(file);
        writer.append(appendText);
        writer.close();
    }

    static void replace(String file, String replaceText) throws IOException {
        BufferedWriter writer = getBufferedWriter(file);
        writer.write(replaceText);
        writer.close();
    }

    static String readLine(String file) throws IOException {
        BufferedReader reader = getBufferedReader(file);
        String str = reader.readLine();
        reader.close();
        return str;
    }

    static byte[] readBytes(String file) throws IOException {
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        inputStream.close();
        return bytes;
    }

    static BufferedReader getBufferedReader(String file) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        return new BufferedReader(inputStreamReader);
    }

    static BufferedWriter getBufferedWriter(String file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        return new BufferedWriter(fileWriter);
    }
}