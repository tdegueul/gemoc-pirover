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
    EPackage.Registry.INSTANCE.put(
    	rover.units.units.UnitsPackage.eNS_URI,
    	rover.units.units.UnitsPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	rover.arduinoml.arduino.ArduinoPackage.eNS_URI,
    	rover.arduinoml.arduino.ArduinoPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	rover.raspirover.raspirover.RaspiroverPackage.eNS_URI,
    	rover.raspirover.raspirover.RaspiroverPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor units = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"rover.Units", "", "http://rover.units/units/", "rover.UnitsMT"
    );
    units.addAdapter("rover.UnitsMT", rover.units.adapters.unitsmt.UnitsAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"rover.Units",
    	units
    );
    MelangeRegistry.LanguageDescriptor arduinoML = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"rover.ArduinoML", "", "http://rover.arduinoml/arduino/", "rover.ArduinoMLMT"
    );
    arduinoML.addAdapter("rover.ArduinoMLMT", rover.arduinoml.adapters.arduinomlmt.ArduinoMLAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"rover.ArduinoML",
    	arduinoML
    );
    MelangeRegistry.LanguageDescriptor rasPiRover = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"rover.RasPiRover", "", "http://rover.raspirover/raspirover/", "rover.RasPiRoverMT"
    );
    rasPiRover.addAdapter("rover.RasPiRoverMT", rover.raspirover.adapters.raspirovermt.RasPiRoverAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"rover.RasPiRover",
    	rasPiRover
    );
    MelangeRegistry.ModelTypeDescriptor rCLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"rover.RCLMT", "", "http://rover.rclmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"rover.RCLMT",
    	rCLMT
    );
    MelangeRegistry.ModelTypeDescriptor unitsMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"rover.UnitsMT", "", "http://rover.unitsmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"rover.UnitsMT",
    	unitsMT
    );
    MelangeRegistry.ModelTypeDescriptor arduinoMLMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"rover.ArduinoMLMT", "", "http://rover.arduinomlmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"rover.ArduinoMLMT",
    	arduinoMLMT
    );
    MelangeRegistry.ModelTypeDescriptor rasPiRoverMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"rover.RasPiRoverMT", "", "http://rover.raspirovermt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"rover.RasPiRoverMT",
    	rasPiRoverMT
    );
  }
}
