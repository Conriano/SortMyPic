import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class Start{

	private String[] args;
	
	/**
	 * Constructor
	 * @param args = command line parameters, means your file and your aim
	 */
	public Start(String[] args){
		this.args = args;
	} 

	/**
	 * Heart of this tool. Loads the image, generates the sorted pixel array and writes the new picture.
	 * Also the count of different colours will be calculated
	 */
	public void work() {
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

	/**
	 * Counts the different colours in a sorted pixel array
	 * @param arr is the sorted pixel array
	 * @return the count
	 */
	private int countDifferentColours(int[] arr){
		int count = 1;
		
		for(int i = 0; i < arr.length -1; i++){
			if(arr[i] < arr[i+1]){
				count++;
			}	
		}
		
		return count;
	}
}
