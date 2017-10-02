package rover;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import rover.ArduinoMLMT;

@SuppressWarnings("all")
public class ArduinoML implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static ArduinoML load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    ArduinoML mm = new ArduinoML();
    mm.setResource(res);
    return mm ;
  }
  
  public ArduinoMLMT toArduinoMLMT() {
    rover.arduinoml.adapters.arduinomlmt.ArduinoMLAdapter adaptee = new rover.arduinoml.adapters.arduinomlmt.ArduinoMLAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
