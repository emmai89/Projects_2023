package projects_2023;

import javax.swing.ImageIcon;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public abstract class Reference {
    public static final boolean WHITE = true;
    public static final boolean BLACK = false;


    public static ImageIcon generatImage(int x,int y,int w,int h)
    {
        ImageIcon image;
        try {
            BufferedImage temp = ImageIO.read(Reference.class.getClassLoader().getResource("SingleFile.png"));
            temp = temp.getSubimage(x,y,w,h);
            image = new ImageIcon (temp.getScaledInstance(w*4, h*4, java.awt.Image.SCALE_SMOOTH));
            return image;
        } catch (Exception e) {
            System.out.println("File Not found");
            return null;
        }

    }

}
