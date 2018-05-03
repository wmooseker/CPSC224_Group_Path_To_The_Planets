
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class PlanetImage extends JPanel {

	private Image newImage;
	private ImageObject imgObj;
	
	public PlanetImage(int index) throws IOException {
		imgObj = new ImageObject(index);
		
	}
	
	public class ImageObject extends FileLoader{
			
			private ImageObject(int imageIndex) throws IOException {
				newImage = null;
				newImage = loadImage(imageIndex);
				//planetImageFormatting();
			}
			
	}
	
	public Image getImage() {
		
			Image returnImg;
			returnImg = newImage;
	
			return returnImg;
		}
	
	private void planetImageFormatting() {
		
		Dimension size = new Dimension(newImage.getWidth(null), newImage.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}
	
	/*public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Draw the background image.
		g.drawImage(newImage, 0, 0, this);
	}*/
	
	
}