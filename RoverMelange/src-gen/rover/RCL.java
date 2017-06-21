package rover;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import rover.RCLMT;

@SuppressWarnings("all")
public class RCL implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static RCL load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    RCL mm = new RCL();
    mm.setResource(res);
    return mm ;
  }
  
  public RCLMT toRCLMT() {
    rover.rcl.adapters.rclmt.RCLAdapter adaptee = new rover.rcl.adapters.rclmt.RCLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
