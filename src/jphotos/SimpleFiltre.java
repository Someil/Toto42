/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jphotos;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author chaugne
 */
public class SimpleFiltre extends FileFilter
{

    private String description;
    private ArrayList<String> extensions;

    public SimpleFiltre(String description)
    {
        if (description == null)
        {
            throw new NullPointerException("La description ne peut être null.");
        }
        this.description = description;
        this.extensions = new ArrayList<String>();
    }

    @Override
    public boolean accept(File file)
    {
        if (file.isDirectory() || extensions.isEmpty())
        {
            return true;
        }
        String nameFile = file.getName().toLowerCase();
        for (String extension : extensions)
        {
            if (nameFile.endsWith(extension))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription()
    {
        StringBuilder buffer = new StringBuilder(description);
        buffer.append(" (");
        for (String extension : extensions)
        {
            buffer.append(extension).append(" ");
        }
        return buffer.append(")").toString();
    }

    public void setDescription(String description)
    {
        if (description == null)
        {
            throw new NullPointerException("La description ne peut être null.");
        }
        this.description = description;
    }

    public void addExtension(String extension)
    {
        if (extension == null)
        {
            throw new NullPointerException("Une extension ne peut être null.");
        }
        extensions.add(extension);
    }

    public void removeExtension(String extension)
    {
        extensions.remove(extension);
    }

    public void clearExtensions()
    {
        extensions.clear();
    }

    public ArrayList<String> getExtensions()
    {
        return extensions;
    }
}
