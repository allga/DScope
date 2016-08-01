package system.dscope;

import java.io.File;

/**
 * Created by Olga on 01.08.2016.
 */
public class MediaFile {
    private File img;
    private String fileName;

    public MediaFile(String img, String fileName) {
        this.img = new File(img);
        this.fileName = fileName;
    }

    public File getImg() {
        return img;
    }

    public void setImg(File img) {
        this.img = img;
    }

    public void makeCopy(MediaFile img, int count) {
        for (int i = 00; i < count; i++) {
       //     MediaFile copy = new MediaFile();

        }
    }
}
