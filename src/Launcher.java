import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class Launcher {

	
public static void main(String[] args) {
		
		if(args.length != 2) {
			System.err.println("Usage: java sortmypic imagePath imgDestinyPath");
			System.exit(1);
		}

		BufferedImage img = ResourceLoader.getImage(args[0]);
		
		int[] pixel = GetPixel.getPixelArray(img, img.getWidth(), img.getHeight());
		
		Arrays.sort(pixel);
		
		img.setRGB(0, 0, img.getWidth(), img.getHeight(), pixel, 0, img.getWidth());
		
		try {
			ImageIO.write(img, "png", new File(args[1]));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("Sorted picture created\n");
		System.out.print("Your picture has " + countDifferentColours(pixel) + " different colour(s)\n");
	}
	
public static int countDifferentColours(int[] arr){
	int count = 1;
	
	for(int i = 0; i < arr.length -1; i++){
		if(arr[i] < arr[i+1]){
			count++;
		}	
	}
	
	return count;
}

}
