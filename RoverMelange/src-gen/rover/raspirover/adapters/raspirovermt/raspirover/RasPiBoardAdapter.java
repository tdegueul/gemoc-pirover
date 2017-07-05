package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.RasPiBoard;
import rover.raspirovermt.raspirover.AnalogPin;
import rover.raspirovermt.raspirover.DigitalPin;
import rover.raspirovermt.raspirover.Project;

@SuppressWarnings("all")
public class RasPiBoardAdapter extends EObjectAdapter<RasPiBoard> implements rover.raspirovermt.raspirover.RasPiBoard {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public RasPiBoardAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
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
    	adaptee.setProject(((rover.raspirover.adapters.raspirovermt.raspirover.ProjectAdapter) o).getAdaptee());
    else adaptee.setProject(null);
  }
  
  private EList<DigitalPin> digitalPins_;
  
  @Override
  public EList<DigitalPin> getDigitalPins() {
    if (digitalPins_ == null)
    	digitalPins_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getDigitalPins(), adaptersFactory, eResource);
    return digitalPins_;
  }
  
  private EList<AnalogPin> analogPins_;
  
  @Override
  public EList<AnalogPin> getAnalogPins() {
    if (analogPins_ == null)
    	analogPins_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getAnalogPins(), adaptersFactory, eResource);
    return analogPins_;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getRasPiBoard();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__NAME:
    		return getName();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__PROJECT:
    		return getProject();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
    		return getDigitalPins();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
    		return getAnalogPins();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__PROJECT:
    		return getProject() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
    		return getDigitalPins() != null && !getDigitalPins().isEmpty();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
    		return getAnalogPins() != null && !getAnalogPins().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__PROJECT:
    		setProject(
    		(rover.raspirovermt.raspirover.Project)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__DIGITAL_PINS:
    		getDigitalPins().clear();
    		getDigitalPins().addAll((Collection) newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.RAS_PI_BOARD__ANALOG_PINS:
    		getAnalogPins().clear();
    		getAnalogPins().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
