package system.dscope;

import java.io.IOException;

public class Main
{
    public static void main( String[] args ) throws IOException {
        String path = "src/main/resources/Firstname, Lastname 01-08-2016 21-10-00 123451.jpg";
        MediaFile fileForCopy = new MediaFile(path);
        fileForCopy.makeCopy(fileForCopy, 20);
    }

}
