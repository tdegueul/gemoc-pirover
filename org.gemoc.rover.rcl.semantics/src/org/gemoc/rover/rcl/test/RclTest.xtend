package org.gemoc.rover.rcl.test

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import rcl.RclPackage
import rcl.RoverProgram

import static extension org.gemoc.rover.rcl.semantics.RoverProgramAspect.*

class RclTest {
	def static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
			"rcl", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(RclPackage.eNS_URI, RclPackage.eINSTANCE);
		val rs = new ResourceSetImpl();
		val res = rs.getResource(URI.createURI("Test.rcl"), true);
		val pgm = res.contents.head as RoverProgram

		pgm.run
	}
}
