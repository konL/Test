
import javax.swing.*;
import java.awt.*;

public class Srccode extends JPanel {
  protected Instance m_Instance_new;
  protected Panel m_InstPanel;
    //...
    public static void setBaseInstance(Instance inst){
        m_BaseInstance=inst;
        m_BaseInstPanel.setInstance(m_BaseInstance);
        
        //.......
    }
}