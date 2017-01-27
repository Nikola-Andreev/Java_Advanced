package E_FilesAndStreams05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class test {
    public static void main(String[] args) throws Exception {

        ZipUtil zipper = new ZipUtil();
        File directoryToZip1 = new File("C:\\Users\\_NERO_\\Desktop\\output.txt");
        File directoryToZip2 = new File("C:\\Users\\_NERO_\\Desktop\\words.txt");
        File directoryToZip3 = new File("C:\\Users\\_NERO_\\Desktop\\test.txt");
        String zipFilePath = "C:\\Users\\_NERO_\\Desktop\\files.zip";
        List<File> listFiles = new ArrayList<File>(1);
        listFiles.add(directoryToZip1);
        listFiles.add(directoryToZip2);
        listFiles.add(directoryToZip3);

        zipper.compressFiles(listFiles, zipFilePath);
    }
}

class ZipUtil {

    private static final int BUFFER_SIZE = 4096;

    public void compressFiles(List<File> listFiles, String destZipFile) throws FileNotFoundException, IOException {

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(destZipFile));

        for (File file : listFiles) {
            if (file.isDirectory()) {
                addFolderToZip(file, file.getName(), zos);
            } else {
                addFileToZip(file, zos);
            }
        }

        zos.flush();
        zos.close();
    }

    private void addFolderToZip(File folder, String parentFolder,
                                ZipOutputStream zos) throws FileNotFoundException, IOException {
        for (File file : folder.listFiles()) {
            if (file.isDirectory()) {
                addFolderToZip(file, parentFolder + "/" + file.getName(), zos);
                continue;
            }

            zos.putNextEntry(new ZipEntry(parentFolder + "/" + file.getName()));

            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream(file));

            long bytesRead = 0;
            byte[] bytesIn = new byte[BUFFER_SIZE];
            int read = 0;

            while ((read = bis.read(bytesIn)) != -1) {
                zos.write(bytesIn, 0, read);
                bytesRead += read;
            }

            zos.closeEntry();
        }
    }

    private void addFileToZip(File file, ZipOutputStream zos)
            throws FileNotFoundException, IOException {
        zos.putNextEntry(new ZipEntry(file.getName()));

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                file));

        long bytesRead = 0;
        byte[] bytesIn = new byte[BUFFER_SIZE];
        int read = 0;

        while ((read = bis.read(bytesIn)) != -1) {
            zos.write(bytesIn, 0, read);
            bytesRead += read;
        }

        zos.closeEntry();
    }
}
