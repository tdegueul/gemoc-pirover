/**
 */
package rover.raspirover.raspirover.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rover.raspirover.raspirover.NumberValue;
import rover.raspirover.raspirover.RaspiroverFactory;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * This is the item provider adapter for a {@link rover.raspirover.raspirover.NumberValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberValueItemProvider extends RoverValueItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberValueItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the NValue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumberValue_nValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumberValue_nValue_feature", "_UI_NumberValue_type"),
				 RaspiroverPackage.Literals.NUMBER_VALUE__NVALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns NumberValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NumberValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		NumberValue numberValue = (NumberValue)object;
		return getString("_UI_NumberValue_type") + " " + numberValue.getNValue();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NumberValue.class)) {
			case RaspiroverPackage.NUMBER_VALUE__NVALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RaspiroverPackage.NUMBER_VALUE__UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createUnit()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createCentimeter()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createMillimeter()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createMeter()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createFoot()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createInch()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createYard()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createRadian()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createDegree()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createTurn()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMBER_VALUE__UNIT,
				 RaspiroverFactory.eINSTANCE.createGradian()));
	}

}
