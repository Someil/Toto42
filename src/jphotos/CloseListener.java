/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jphotos;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author chaugne
 */
public class CloseListener extends AbstractAction
{
    private ViewJPhoto viewPhoto;

    public CloseListener(ViewJPhoto view)
    {
        this.viewPhoto = view;
        viewPhoto.addCloseListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);
    }
}
