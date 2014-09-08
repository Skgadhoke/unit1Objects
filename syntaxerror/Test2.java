

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test2
{
    public static void main(String[] args) throws Exception{
        URL imageLocation = new URL(
        "http://www.wallpapersdesign.net/wallpapers/2013/08/White-Tiger-Cubs-960x1080.jpg");
        JOptionPane.showMessageDialog(null, "ROARRRRR!!!", "Cubs",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }

}
