package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Project;
import rover.arduinomlmt.arduino.Board;
import rover.arduinomlmt.arduino.Sketch;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements rover.arduinomlmt.arduino.Project {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
    super(rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance());
    adaptersFactory = rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory.getInstance();
  }
  
  private EList<Board> boards_;
  
  @Override
  public EList<Board> getBoards() {
    if (boards_ == null)
    	boards_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getBoards(), adaptersFactory, eResource);
    return boards_;
  }
  
  private EList<Sketch> sketches_;
  
  @Override
  public EList<Sketch> getSketches() {
    if (sketches_ == null)
    	sketches_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getSketches(), adaptersFactory, eResource);
    return sketches_;
  }
  
  @Override
  public void execute() {
    rover.arduinoml.aspects.Project_ExecutableAspect.execute(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getProject();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		return getBoards();
    	case rover.arduinomlmt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		return getSketches();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		return getBoards() != null && !getBoards().isEmpty();
    	case rover.arduinomlmt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		return getSketches() != null && !getSketches().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.PROJECT__BOARDS:
    		getBoards().clear();
    		getBoards().addAll((Collection) newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.PROJECT__SKETCHES:
    		getSketches().clear();
    		getSketches().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
