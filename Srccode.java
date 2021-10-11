
import javax.swing.*;
import java.awt.*;

public class Srccode extends JPanel {
<<<<<<< HEAD
  protected Instance m_Instance;
  protected Panel  m_BaseInstPanel;
    //...
    public static void setBaseInstance(Instance inst){
      m_Instance=inst;
        m_BaseInstPanel.setInstance(m_Instance);
        setBaseInstanceFromFileQ();
        //.......
    }
    public void setBaseInstanceFromFileQ(){
      int as=0;
      int as2=1;
      Instance i=m_Instance;
      setBaseInstances(i);
        //....
    }
    public void setBaseInstancesFromDBQ_2(){
      int test02=0;
        //......
    }
=======
  protected Instance m_Instance_new;
  protected Panel m_InstPanel;
    //...
    public static void setBaseInstance_new(Instance inst){
        m_BaseInstance=inst;
        m_BaseInstPanel.setInstance(m_BaseInstance);
        
        //.......
    }
>>>>>>> 4880d89fa5bc8522fa17d72b7f5219b0d229761f
}