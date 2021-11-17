
import javax.swing.*;
import java.awt.*;

public class SrcCode extends JPanel {

  protected Instance m_Instance;
  protected Panel  m_BaseInstPanel;
    //...
    public static void setInstance(Instance inst){
      m_Instance=inst;
        m_BaseInstPanel.setInstance(m_Instance);
        setBaseInstanceFromFileQ();
        //.......
    }
    public void setBaseInstanceFromFileQ(){
      int as=0;
      int as2=1;
      Instance i=m_Instance;
      setInstance(i);
        //....
    }
    public void testFunc(){
      HelloDao hello=new HelloDao();
      hello.say();
      int test02=0;
        //......
    }
  public void setProxyFactory(RmiProxyFactory rmiProxyFactory) {
    this.rmiProxyFactory = rmiProxyFactory;
  }
  public void setRmiProxyFactory(ProxyFactory ProxyFactory) {

    this.ProxyFactory = ProxyFactory;
  }
  public int getIndexInterval()
  {
    int indexInterval=this.indexInterval;
    return indexInterval;
  }

}
class HelloDao{
  public void say(){
    System.out.println("Hello");
  }

}