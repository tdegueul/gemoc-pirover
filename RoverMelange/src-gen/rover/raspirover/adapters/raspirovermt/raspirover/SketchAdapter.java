package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Sketch;
import rover.raspirovermt.raspirover.Block;
import rover.raspirovermt.raspirover.Board;
import rover.raspirovermt.raspirover.Project;

@SuppressWarnings("all")
public class SketchAdapter extends EObjectAdapter<Sketch> implements rover.raspirovermt.raspirover.Sketch {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public SketchAdapter() {
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
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBlock(), eResource);
  }
  
  @Override
  public void setBlock(final Block o) {
    if (o != null)
    	adaptee.setBlock(((rover.raspirover.adapters.raspirovermt.raspirover.BlockAdapter) o).getAdaptee());
    else adaptee.setBlock(null);
  }
  
  @Override
  public Board getBoard() {
    return (Board) adaptersFactory.createAdapter(adaptee.getBoard(), eResource);
  }
  
  @Override
  public void setBoard(final Board o) {
    if (o != null)
    	adaptee.setBoard(((rover.raspirover.adapters.raspirovermt.raspirover.BoardAdapter) o).getAdaptee());
    else adaptee.setBoard(null);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getSketch();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__NAME:
    		return getName();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__PROJECT:
    		return getProject();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__BLOCK:
    		return getBlock();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__BOARD:
    		return getBoard();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__NAME:
    		return getName() != NAME_EDEFAULT;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__PROJECT:
    		return getProject() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__BLOCK:
    		return getBlock() != null;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__BOARD:
    		return getBoard() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__PROJECT:
    		setProject(
    		(rover.raspirovermt.raspirover.Project)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__BLOCK:
    		setBlock(
    		(rover.raspirovermt.raspirover.Block)
    		 newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.SKETCH__BOARD:
    		setBoard(
    		(rover.raspirovermt.raspirover.Board)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
