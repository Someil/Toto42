/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jphotos;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author chaugne
 */
public class ViewJPhoto extends JFrame
{

    private JMenuBar menuBar = new JMenuBar();
    private JMenu mFile = new JMenu("File");
    private JMenu mImage = new JMenu("Image");
    private JMenu mTags = new JMenu("Tags");
    private JMenuItem open = new JMenuItem("Open");
    private JMenuItem close = new JMenuItem("Close");
    private JMenuItem diapo = new JMenuItem("Diaporama");
    private JMenuItem nImg = new JMenuItem("Next Image");
    private JMenuItem pImg = new JMenuItem("Prev Image");
    private JMenuItem searchTag = new JMenuItem("Search Tags");

    public ViewJPhoto()
    {
        this.setTitle("JPhotos");
        this.setSize(1280, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mFile.add(open);
        this.mFile.addSeparator();
        this.mFile.add(close);
        this.mImage.add(diapo);
        this.mImage.add(nImg);
        this.mImage.add(pImg);
        this.mTags.add(searchTag);
        this.menuBar.add(mFile);
        this.menuBar.add(mImage);
        this.menuBar.add(mTags);
        this.setJMenuBar(menuBar);
        this.setContentPane(new TestJpImage());
        this.setVisible(true);
    }

    public String messageSearchTags()
    {
        String tag;
        tag = JOptionPane.showInputDialog(null, "Enter the desired tag",
                "", JOptionPane.QUESTION_MESSAGE);
        return tag;
    }

    public String chooseFolder()
    {
        String pathFolder = null;
        JFileChooser chooser = new JFileChooser(".");
        chooser.setCurrentDirectory(new File("/"));
        chooser.changeToParentDirectory();
        FileFilter imagesFilter1 = new FileNameExtensionFilter("Accept Image", "jpg", "jpeg", "png");
        FileFilter imagesFilter2 = new FileNameExtensionFilter("Jpeg", "jpg", "jpeg");
        FileFilter imagesFilter3 = new FileNameExtensionFilter("Png", "png");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.addChoosableFileFilter(imagesFilter2);
        chooser.addChoosableFileFilter(imagesFilter3);
        chooser.addChoosableFileFilter(imagesFilter1);
        int returnVal;
        returnVal = chooser.showOpenDialog(chooser.getParent());
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            pathFolder = chooser.getSelectedFile().getAbsolutePath();
        }
        return pathFolder;
    }

    public void addCloseListener(ActionListener l)
    {
        this.close.addActionListener(l);
    }

    public void addSearchTagListener(ActionListener l)
    {
        this.searchTag.addActionListener(l);
    }

    public void addOpenListener(ActionListener l)
    {
        this.open.addActionListener(l);
    }

    public JMenuItem getClose()
    {
        return close;
    }

    public void setClose(JMenuItem close)
    {
        this.close = close;
    }

    public JMenu getmFile()
    {
        return mFile;
    }

    public void setmFile(JMenu mFile)
    {
        this.mFile = mFile;
    }

    public JMenu getmImage()
    {
        return mImage;
    }

    public void setmImage(JMenu mImage)
    {
        this.mImage = mImage;
    }

    public JMenu getmTags()
    {
        return mTags;
    }

    public void setmTags(JMenu mTags)
    {
        this.mTags = mTags;
    }

    public JMenuItem getOpen()
    {
        return open;
    }

    public void setOpen(JMenuItem open)
    {
        this.open = open;
    }

    public JMenuItem getDiapo()
    {
        return diapo;
    }

    public void setDiapo(JMenuItem diapo)
    {
        this.diapo = diapo;
    }

    public JMenuItem getnImg()
    {
        return nImg;
    }

    public void setnImg(JMenuItem nImg)
    {
        this.nImg = nImg;
    }

    public JMenuItem getpImg()
    {
        return pImg;
    }

    public void setpImg(JMenuItem pImg)
    {
        this.pImg = pImg;
    }

    public JMenuItem getSearchTag()
    {
        return searchTag;
    }

    public void setSearchTag(JMenuItem searchTag)
    {
        this.searchTag = searchTag;
    }
}
