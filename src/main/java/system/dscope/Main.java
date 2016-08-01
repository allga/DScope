package system.dscope;

import java.io.File;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        MediaFile image = new MediaFile("src/main/resources/Firstname, Lastname 01-08-2016 21-10-00 123451.jpg", "Firstname, Lastname 01-08-2016 21-10-00 123451.jpg");
        System.out.println(image.getImg().getAbsolutePath());
        System.out.println(image.getImg().exists());
        image.makeCopy(image, 20);
    }

}
