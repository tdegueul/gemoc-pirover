package org.gemoc.rover.rcl.test;

import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.rover.rcl.semantics.RoverProgramAspect;
import rcl.RclPackage;
import rcl.RoverProgram;

@SuppressWarnings("all")
public class RclTest {
  public static void main(final String[] args) {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put(
      "rcl", _xMIResourceFactoryImpl);
    EPackage.Registry.INSTANCE.put(RclPackage.eNS_URI, RclPackage.eINSTANCE);
    final ResourceSetImpl rs = new ResourceSetImpl();
    final Resource res = rs.getResource(URI.createURI("Test.rcl"), true);
    EObject _head = IterableExtensions.<EObject>head(res.getContents());
    final RoverProgram pgm = ((RoverProgram) _head);
    RoverProgramAspect.run(pgm);
  }
}
