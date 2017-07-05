package rover.raspirover.adapters.raspirovermt.raspirover;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory;
import rover.raspirover.raspirover.Project;
import rover.raspirovermt.raspirover.Board;
import rover.raspirovermt.raspirover.RoverProgram;
import rover.raspirovermt.raspirover.Sketch;

@SuppressWarnings("all")
public class ProjectAdapter extends EObjectAdapter<Project> implements rover.raspirovermt.raspirover.Project {
  private RasPiRoverMTAdaptersFactory adaptersFactory;
  
  public ProjectAdapter() {
    super(rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance());
    adaptersFactory = rover.raspirover.adapters.raspirovermt.RasPiRoverMTAdaptersFactory.getInstance();
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
    rover.raspirover.aspects.ProjectProgramGlue.execute(adaptee);
  }
  
  @Override
  public RoverProgram getProgram() {
    return (RoverProgram) adaptersFactory.createAdapter(rover.raspirover.aspects.ProjectProgramGlue.program(adaptee), eResource);
  }
  
  @Override
  public void setProgram(final RoverProgram program) {
    rover.raspirover.aspects.ProjectProgramGlue.program(adaptee, (rover.raspirover.raspirover.RoverProgram)((EObjectAdapter)program).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return rover.raspirovermt.raspirover.RaspiroverPackage.eINSTANCE.getProject();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__BOARDS:
    		return getBoards();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__SKETCHES:
    		return getSketches();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__PROGRAM:
    		return getProgram();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__BOARDS:
    		return getBoards() != null && !getBoards().isEmpty();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__SKETCHES:
    		return getSketches() != null && !getSketches().isEmpty();
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__PROGRAM:
    		return getProgram() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__BOARDS:
    		getBoards().clear();
    		getBoards().addAll((Collection) newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__SKETCHES:
    		getSketches().clear();
    		getSketches().addAll((Collection) newValue);
    		return;
    	case rover.raspirovermt.raspirover.RaspiroverPackage.PROJECT__PROGRAM:
    		setProgram(
    		(rover.raspirovermt.raspirover.RoverProgram)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
