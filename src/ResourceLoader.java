import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ResourceLoader {
	
	/**
	 * Speichert ein Bild im "images"-Ordner als BufferedImage
	 * @param fileName ist der Name der Datei
	 * @return ist das Bild als BufferedImage
	 */
	public static BufferedImage getImage(String path) {
		BufferedImage img = null;
		try {
			System.out.println(path);
			img = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.err.println("ResourceLoader: File not found!");
		}
		return img;
	}
}
