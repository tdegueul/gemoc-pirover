package rover.arduinoml.adapters.arduinomlmt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.arduinoml.adapters.arduinomlmt.ArduinoMLMTAdaptersFactory;
import rover.arduinoml.arduino.Sketch;
import rover.arduinomlmt.arduino.Block;
import rover.arduinomlmt.arduino.Board;
import rover.arduinomlmt.arduino.Project;

@SuppressWarnings("all")
public class SketchAdapter extends EObjectAdapter<Sketch> implements rover.arduinomlmt.arduino.Sketch {
  private ArduinoMLMTAdaptersFactory adaptersFactory;
  
  public SketchAdapter() {
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
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((rover.arduinoml.adapters.arduinomlmt.arduino.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public Board getBoard() {
    return (Board) adaptersFactory.createAdapter(adaptee.getBoard(), eResource);
  }
  
  @Override
  public void setBoard(final Board o) {
    if (o != null)
    	adaptee.setBoard(((rover.arduinoml.adapters.arduinomlmt.arduino.BoardAdapter) o).getAdaptee());
    else adaptee.setBoard(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.arduinomlmt.arduino.ArduinoPackage.eINSTANCE.getSketch();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName();
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		return getProject();
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		return getBlock();
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__BOARD:
    		return getBoard();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		return getProject() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		return getBlock() != null;
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__BOARD:
    		return getBoard() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__PROJECT:
    		setProject(
    		(rover.arduinomlmt.arduino.Project)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__BLOCK:
    		setBlock(
    		(rover.arduinomlmt.arduino.Block)
    		 newValue);
    		return;
    	case rover.arduinomlmt.arduino.ArduinoPackage.SKETCH__BOARD:
    		setBoard(
    		(rover.arduinomlmt.arduino.Board)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
