package rover.arduinoml.adapters.arduinomlmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import rover.ArduinoMLMT;
import rover.arduinomlmt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public class ArduinoMLAdapter extends ResourceAdapter implements ArduinoMLMT {
  public ArduinoMLAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
  }
  
  @Override
  public ArduinoFactory getArduinoFactory() {
    return new rover.arduinoml.adapters.arduinomlmt.arduino.ArduinoFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getArduinoFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
