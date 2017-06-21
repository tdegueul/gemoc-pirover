package rover;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	rover.rcl.rcl.RclPackage.eNS_URI,
    	rover.rcl.rcl.RclPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor rCL = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"rover.RCL", "", "http://rover.rcl/rcl/", "rover.RCLMT"
    );
    rCL.addAdapter("rover.RCLMT", rover.rcl.adapters.rclmt.RCLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"rover.RCL",
    	rCL
    );
    MelangeRegistry.ModelTypeDescriptor rCLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"rover.RCLMT", "", "http://rover.rclmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"rover.RCLMT",
    	rCLMT
    );
  }
}
