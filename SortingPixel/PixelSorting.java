package Thread.SortingPixel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Comparator;

public class PixelSorting {
    private final BufferedImage inputImage;
    private final BufferedImage outputImage;
    private final int start;
    private final int end;

    public PixelSorting(BufferedImage inputImage, BufferedImage outputImage, int start, int end){
        this.inputImage = inputImage;
        this.outputImage = outputImage;
        this.start = start;
        this.end = end;
    }

    public void sortPix(){
        ArrayList<Color> allColors = new ArrayList<>();
        int counter=0;
        for (int x = 0; x < inputImage.getHeight(); x++) {
            for (int y = start; y < end; y++) {
                allColors.add(new Color(inputImage.getRGB(y, x)));
            }
        }
        allColors.sort(new Comparator<Color>() {
            @Override
            public int compare(Color o1, Color o2) {
                int c1 = o1.getRed()+o1.getGreen()+ o1.getBlue();
                int c2 = o2.getRed()+o2.getGreen()+ o2.getBlue();
                return c1-c2;
            }
        });

        for(int x=0; x<inputImage.getHeight(); x++) {
            for (int y = 0; y < end; y++) {
                outputImage.setRGB(y, x, allColors.get(counter).getRGB());
                counter++;
            }
        }
    }
}
