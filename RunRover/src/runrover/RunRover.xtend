package runrover

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import rover.raspirover.aspects.Project_ExecutableAspect
import rover.raspirover.raspirover.Project
import rover.raspirover.raspirover.RaspiroverPackage

class RunRover {
	def static void main(String[] args) {
		val project = loadModel
		Project_ExecutableAspect.execute(project)
	}
	
	def static Project loadModel() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("raspirover", new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(RaspiroverPackage.eNS_URI, RaspiroverPackage.eINSTANCE)
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI("My.raspirover"), true)
		return res.contents.head as Project
	}
}
