package system.dscope;

import java.io.*;

/**
 * Created by Olga on 01.08.2016.
 */
public class MediaFile {
    private File img;
    private String fileName;

    public MediaFile(String path, String fileName) {
        this.img = new File(path);
        this.fileName = fileName;
    }

    public MediaFile() {

    }

    public File getPath() {
        return img;
    }

    public void setPath(File img) {
        this.img = img;
    }

    public void makeCopy(MediaFile img, int count) throws FileNotFoundException {
//        InputStream inputStream = new FileInputStream(img.getPass());
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(img.getPath())));
        }
        catch (FileNotFoundException e1) {
            System.out.println("File not found");
            System.exit(0);
        }

        for (int i = 00; i < count; i++) {
            MediaFile copy = new MediaFile();
            copy.setPath(img.getPath());

            FileOutputStream outputStream = new FileOutputStream("");
        }
    }
}
