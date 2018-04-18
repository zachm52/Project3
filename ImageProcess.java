import java.awt.Color;
import java.awt.image.Kernel;


public class ImageProcess {

	public static void main(String[] args) {
	//Creates new image utility		
	ImageUtils utils = new ImageUtils();
	
	//Load in an image	
	Color[][] orig = utils.loadImage("src/LennaCV.png");
	
	//Add original image to tab
	utils.addImage(orig, "Original Image" );
	
	//Process 2
	Color[][] redTint = process2(orig);
	
	//Add proccessed image to window
	utils.addImage(redTint, "Red Tint" );
	
	//Process 3
	Color[][] greenTint = process3(orig);
		
	//Add proccessed image to window
	utils.addImage(greenTint, "Green Tint" );
		
	//Process 4
	Color[][] blueTint = process4(orig);
		
	//Add proccessed image to window
	utils.addImage(blueTint, "Blue Tint" );
	
	//Process 5
	Color[][] BandW = process5(orig);
			
	//Add proccessed image to window
	utils.addImage(BandW, "Black and White" );
	
	//Process 6
	Color[][] inverse = process6(orig);
				
	//Add proccessed image to window
	utils.addImage(inverse, "Inverse" );
	
	//Process 7
	Color[][] night = process7(orig);
					
	//Add proccessed image to window
	utils.addImage(night, "Night" );
	
	//Process 8
	Color[][] greenFeather = process8(orig);
						
	//Add proccessed image to window
	utils.addImage(greenFeather, "Green Feather" );
	
	//Process 8
	Color[][] checker = process9(orig);
							
	//Add proccessed image to window
	utils.addImage(checker, "Windows Logo" );
	
	//Display
	utils.display();
		
	}
	
	
	
	public static Color[][] process2(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					
					tmp[i][j] = new Color(r,0,0);
				
			}
		}
		
		return tmp;
	}
	
	public static Color[][] process3(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					
					tmp[i][j] = new Color(0,g,0);
				
			}
		}
		
		return tmp;
	}
	
	public static Color[][] process4(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					
					tmp[i][j] = new Color(0,0,b);
				
			}
		}
		
		return tmp;
	}
	
	public static Color[][] process5(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					
					int bl = (r+g+b)/3;
					
					tmp[i][j] = new Color(bl,bl,bl);
				
			}
		}
		
		return tmp;
	}
	
	public static Color[][] process6(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
										
					tmp[i][j] = new Color(255-r,255-g,255-b);
				
			}
		}
		
		return tmp;
	}
	
	public static Color[][] process7(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					
					
										
					tmp[i][j] = new Color(r/4,g/3,b/2);
				
			}
		}
		
		return tmp;
	}
	
	public static Color[][] process8(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					
					if (b>100) {
						
						
						
						g=b;
						if (g<150) {
							g=g+5;
						}
									
					}
					
					tmp[i][j] = new Color(r,g,b);
					
			}
		}
		
		return tmp;
	}
	
	public static Color[][] process9(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);
		
		for (int i= 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {
				
					
					
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen();
					int b = pixel.getBlue();
					
					if (i<=tmp.length/2) {
						if (j<=tmp[i].length/2) {
												
							tmp[i][j] = new Color(r,0,0);
						}
						else {
							tmp[i][j] = new Color(0,0,b);
						}
					}
					else {
						if (j<=tmp[i].length/2) {
							
							tmp[i][j] = new Color(0,g,0);
						}
						else {
							tmp[i][j] = new Color(r,g,0);
						}	
					}
								
						
						
						}
									
					}
				
		
		return tmp;
	}
	
}
