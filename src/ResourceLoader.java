import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ResourceLoader {
	
	/**
	 * reads a picture by a given path
	 * @param path - path of the picture
	 * @return the picture as BufferedImage
	 */
	public static BufferedImage getImage(String path) {
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.err.println("ResourceLoader: File not found!");
		}
		return img;
	}
}
