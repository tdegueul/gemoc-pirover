package rover.raspirover.main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import rover.raspirover.aspects.ProjectProgramGlue;
import rover.raspirover.raspirover.Project;
import rover.raspirover.raspirover.RaspiroverPackage;

public class Main {
	public static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
			"*", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(RaspiroverPackage.eNS_URI, RaspiroverPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI("My.raspirover"), true);
		Project project = (Project) res.getContents().get(0);

		ProjectProgramGlue.execute(project);
	}
}
