
import javax.swing.*;
import java.awt.*;

public class Srccode extends JPanel {

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
      setBaseInstance(i);
        //....
    }
    public void testFunc(){
      int test02=0;
        //......
    }
  public void setProxyFactory(ProxyFactory proxyFactory) {
    this.proxyFactory = proxyFactory;
  }
  public void setRmiProxyFactory(RmiProxyFactory rmiProxyFactory) {

    this.rmiProxyFactory = rmiProxyFactory;
  }
  public int getIndexInterval()
  {
    return indexInterval;
  }

}