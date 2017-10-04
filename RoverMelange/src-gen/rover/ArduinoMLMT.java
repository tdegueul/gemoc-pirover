package rover;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import rover.arduinomlmt.arduino.ArduinoFactory;

@SuppressWarnings("all")
public interface ArduinoMLMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract ArduinoFactory getArduinoFactory();
  
  public abstract void save(final String uri) throws IOException;
}
