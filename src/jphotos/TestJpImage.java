/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jphotos;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author chaugne
 */
public class TestJpImage extends JPanel
{

    @Override
    public void paintComponent(Graphics g)
    {
        try
        {
            Image img = ImageIO.read(new File("testHD.jpg"));
//            g.drawImage(img, this.getWidth()/4, 0, this);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
