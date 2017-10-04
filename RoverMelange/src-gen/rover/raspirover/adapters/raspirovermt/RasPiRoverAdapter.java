package rover.raspirover.adapters.raspirovermt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import rover.RasPiRoverMT;
import rover.raspirovermt.raspirover.RaspiroverFactory;

@SuppressWarnings("all")
public class RasPiRoverAdapter extends ResourceAdapter implements RasPiRoverMT {
  public RasPiRoverAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
  }
  
  @Override
  public RaspiroverFactory getRaspiroverFactory() {
    return new rover.raspirover.adapters.raspirovermt.raspirover.RaspiroverFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getRaspiroverFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
