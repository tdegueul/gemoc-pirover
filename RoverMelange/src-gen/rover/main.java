package rover;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import rover.RCL;
import rover.rclmt.rcl.RoverProgram;
import rover.runRCL;

@SuppressWarnings("all")
public class main {
  public static void call() {
    final RCL m = RCL.load("Test.rcl");
    EList<EObject> _contents = m.toRCLMT().getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    runRCL.call(((RoverProgram) _head));
  }
  
  public static void main(final String[] args) {
    StandaloneSetup.doSetup() ;
    call() ;
  }
}
