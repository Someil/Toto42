/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jphotos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author chaugne
 */
public class ControllerJPhoto implements ActionListener
{
    private ViewJPhoto viewPhoto;
    
    ControllerJPhoto(ViewJPhoto view)
    {
        this.viewPhoto = view;
        
        listener();
    }
    private void listener()
    {
        viewPhoto.addCloseListener(this);
        viewPhoto.addSearchTagListener(this);
        viewPhoto.addOpenListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
//        String textBoxSearch = viewPhoto.getTextField().getText();
        if (e.getActionCommand().equals(viewPhoto.getClose().getActionCommand()))
        {
            System.exit(0);
        }
        else if (e.getActionCommand().equals(viewPhoto.getSearchTag().getActionCommand()))
        {
            String textUser;
            textUser = viewPhoto.messageSearchTags();
            System.out.println("Tags :" + textUser);//attention en cours de dev
            viewPhoto.setVisible(true);
        }
        else if (e.getActionCommand().equals(viewPhoto.getOpen().getActionCommand()))
        {
            String pathfolder = viewPhoto.chooseFolder();
            System.out.println("Chemin :" + pathfolder);
            viewPhoto.setVisible(true);
        }

    }
}
