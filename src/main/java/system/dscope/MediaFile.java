package system.dscope;

import java.io.*;
import java.nio.file.Files;
import java.io.IOException;
/**
 * Created by Olga on 01.08.2016.
 */
public class MediaFile {
    private File fileContent;

    public MediaFile(String path) {
        this.fileContent = new File(path);
    }

    public File getFileContent() {
        return fileContent;
    }

    public void makeCopy(MediaFile file, int count) throws IOException {
        for (int i = 0; i < count; i++) {

            System.out.println(file.getFileContent().getParent());
            System.out.println(file.getFileContent().getName());
            System.out.println("---------------------");
            String destPath = String.format("%s\\%d%s", file.getFileContent().getParent(), i, file.getFileContent().getName());
            System.out.println(destPath);

            File dest = new File(destPath);
            Files.copy(file.getFileContent().toPath(), dest.toPath());
        }


    }
}
