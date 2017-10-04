package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Board;
import rover.arduinomlmt.arduino.Project;

@SuppressWarnings("all")
public class BoardAdapter extends EObjectAdapter<Board> implements rover.arduinomlmt.arduino.Board {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public BoardAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public Project getProject() {
    return (Project) adaptersFactory.createAdapter(adaptee.getProject(), eResource);
  }
  
  @Override
  public void setProject(final Project o) {
    if (o != null)
    	adaptee.setProject(((rover.arduinoml.adapters.arduinomlmt.arduino.ProjectAdapter) o).getAdaptee());
    else adaptee.setProject(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getBoard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOARD__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOARD__PROJECT:
    		return getProject();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOARD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOARD__PROJECT:
    		return getProject() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOARD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.BOARD__PROJECT:
    		setProject(
    		(rover.arduinomlmt.arduino.Project)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
