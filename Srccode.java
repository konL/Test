
import javax.swing.*;
import java.awt.*;

public class Srccode extends JPanel {
  protected Instance m_Instance_new;
  protected Panel m_InstPanel;
    //...
    public static void setInstance(Instance inst){
        m_BaseInstance=inst;
        m_BaseInstPanel.setInstance(m_BaseInstance);
        setBaseInstanceFromFileQ();
        //.......
    }
    public void setInstanceFromFileQ(){
      int as=0;
      int as2=1;
      Instance i=m_BaseInstance;
      setBaseInstances(new Instances(r));
        //....
    }
    public void setInstancesFromDBQ(){
      int test=0;
        //......
    }
}