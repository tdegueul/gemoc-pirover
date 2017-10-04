package rover;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import rover.UnitsMT;

@SuppressWarnings("all")
public class Units implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static Units load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    Units mm = new Units();
    mm.setResource(res);
    return mm ;
  }
  
  public UnitsMT toUnitsMT() {
    rover.units.adapters.unitsmt.UnitsAdapter adaptee = new rover.units.adapters.unitsmt.UnitsAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
