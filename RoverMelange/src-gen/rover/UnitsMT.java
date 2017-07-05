package rover;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import rover.unitsmt.units.UnitsFactory;

@SuppressWarnings("all")
public interface UnitsMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract UnitsFactory getUnitsFactory();
  
  public abstract void save(final String uri) throws IOException;
}
