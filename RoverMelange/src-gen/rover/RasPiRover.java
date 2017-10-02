package rover;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import rover.RasPiRoverMT;

@SuppressWarnings("all")
public class RasPiRover implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static RasPiRover load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    RasPiRover mm = new RasPiRover();
    mm.setResource(res);
    return mm ;
  }
  
  public RasPiRoverMT toRasPiRoverMT() {
    rover.raspirover.adapters.raspirovermt.RasPiRoverAdapter adaptee = new rover.raspirover.adapters.raspirovermt.RasPiRoverAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
