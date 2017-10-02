package rover.units.adapters.unitsmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import rover.UnitsMT;
import rover.unitsmt.units.UnitsFactory;

@SuppressWarnings("all")
public class UnitsAdapter extends ResourceAdapter implements UnitsMT {
  public UnitsAdapter() {
    super(rover.units.adapters.unitsmt.UnitsMTAdaptersFactory.getInstance());
  }
  
  @Override
  public UnitsFactory getUnitsFactory() {
    return new rover.units.adapters.unitsmt.units.UnitsFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getUnitsFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
