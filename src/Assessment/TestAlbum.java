package Assessment;

import javax.swing.*;

public class TestAlbum {
    public static void main(String[] args)
        {
             Song s1 = new Song(0, 1,"Sugar Baby Love","Rubettes","Pop",136,1977);
             Song s2 = new Song(1,2,"Living on a Prayer","Bon Jovi","Rock",184,1985);
             Song s3 = new Song(2,3,"Blue Suede Shoes","Elvis Presley","Pop",157,1963);
             Song s4 = new Song(3,4,"Someone Like You","Adele","Pop",223,2013);
             Song s5 = new Song(4,5,"House of Fun","Madness","Pop",178,1984);

             JOptionPane.showInputDialog("Which track number would you like to play");
            {
                if ( int i = 0;
                i > 5;
                i++;)
                JOptionPane.showMessageDialog(null, "An invalid track number was supplied!", "Bad Track Number", JOptionPane.ERROR_MESSAGE);
             else
                JOptionPane.showMessageDialog(null, "Now playing track - details are as follows:\n\nTrack number: " + i++, "Playing Track", JOptionPane.INFORMATION_MESSAGE);
            }


        }
}
