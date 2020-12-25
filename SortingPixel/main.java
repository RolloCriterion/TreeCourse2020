package Thread.SortingPixel;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class main {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        BufferedImage inputImage = null;
        try{
            inputImage = ImageIO.read(new File("123456.png"));
        }catch (IOException e){
            System.out.println("File not found");
        }

        assert inputImage != null;
        BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);

        PixelSorting PS = new PixelSorting(inputImage, outputImage, 0, inputImage.getWidth());

        PS.sortPix();

        try{
            ImageIO.write(outputImage, "png", new File("sortedOutput.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - startTime);
    }
}
