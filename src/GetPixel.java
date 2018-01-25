import java.awt.image.BufferedImage;

public class GetPixel {

	/**
	 * generates a pixel array
	 * @param is your picture source
	 * @param width of the picture
	 * @param height of the picture
	 * @return the array 
	 */
	public static int[] getPixelArray(BufferedImage img, int width, int height) {
			
		int[] pixels = new int[width * height];
		int z = 0;
		
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				pixels[z] = img.getRGB(x, y);
				z++;
			}
		}
		
		return pixels;
	}
}
