package runrover;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import rover.raspirover.aspects.Project_ExecutableAspect;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.RaspiroverPackage;

@SuppressWarnings("all")
public class RunRover {
  public static void main(final String[] args) {
    final Project project = RunRover.loadModel();
    Project_ExecutableAspect.execute(project);
  }
  
  public static Project loadModel() {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("raspirover", _xMIResourceFactoryImpl);
    EPackage.Registry.INSTANCE.put(RaspiroverPackage.eNS_URI, RaspiroverPackage.eINSTANCE);
    final ResourceSetImpl rs = new ResourceSetImpl();
    URI _createURI = URI.createURI("My.raspirover");
    final Resource res = rs.getResource(_createURI, true);
    EList<EObject> _contents = res.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    return ((Project) _head);
  }
}
