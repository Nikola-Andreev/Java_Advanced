package E_FilesAndStreams05.Exercises;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class L_CreateZipArchive12 {
    public static void main(String[] args) throws IOException {

        String file1 = "C:\\Users\\_NERO_\\Desktop\\output.txt";
        String file2 = "C:\\Users\\_NERO_\\Desktop\\test.txt";
        String file3 = "C:\\Users\\_NERO_\\Desktop\\words.txt";

        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\_NERO_\\Desktop\\files.zip");
            ZipOutputStream zos = new ZipOutputStream(fos);){

            addToZipFile(file1, zos);
            addToZipFile(file2, zos);
            addToZipFile(file3, zos);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void addToZipFile(String fileName, ZipOutputStream zos) throws FileNotFoundException, IOException {

        System.out.println("Writing '" + fileName + "' to zip file");

        File file = new File(fileName);

        FileInputStream fis = new FileInputStream(file);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zos.putNextEntry(zipEntry);

        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zos.write(bytes, 0, length);
        }

        zos.closeEntry();
        fis.close();
    }
}
