/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jphotos;

/**
 *
 * @author chaugne
 */
public class JPhotos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        ViewJPhoto view = new ViewJPhoto();
        ControllerJPhoto controller = new ControllerJPhoto(view);
    }
}
