/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Toshiba
 */
public class TextFilter extends FileFilter {

    @Override
    public boolean accept(File f) {
        if(f.isDirectory()) {
            return true;
        } else if(f.getName().endsWith(".txt")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Text filter";
    }
}
