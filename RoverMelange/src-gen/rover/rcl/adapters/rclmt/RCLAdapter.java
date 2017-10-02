package rover.rcl.adapters.rclmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import rover.RCLMT;
import rover.rclmt.rcl.RclFactory;

@SuppressWarnings("all")
public class RCLAdapter extends ResourceAdapter implements RCLMT {
  public RCLAdapter() {
    super(rover.rcl.adapters.rclmt.RCLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public RclFactory getRclFactory() {
    return new rover.rcl.adapters.rclmt.rcl.RclFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getRclFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
