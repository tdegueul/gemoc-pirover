package runrover

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EAnnotation
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import rover.raspirover.raspirover.Project
import rover.raspirover.raspirover.RaspiroverPackage
import rover.raspirover.aspects.Project_ExecutableAspect

class RunRover {
	def static void main(String[] args) {
		val project = loadModel
		Project_ExecutableAspect.execute(project)
//		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new EcoreResourceFactoryImpl)
//		val rs = new ResourceSetImpl
//		val res = rs.getResource(URI::createURI("/home/dig/workspace/gemoc-pirover/org.modelexecution.units/model/units.ecore"), true)
//		println("size="+res.allContents.size)
//		
//		val i = res.allContents
//		var n = 0
//		while (i.hasNext) {
//			val o = i.next
//			if (!(o instanceof EOperation) && !(o instanceof EAnnotation))
//				n++
//		}
//		println("n="+n)
	}
	
	def static Project loadModel() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("raspirover", new XMIResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(RaspiroverPackage.eNS_URI, RaspiroverPackage.eINSTANCE)
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI("My.raspirover"), true)
		return res.contents.head as Project
	}
}
