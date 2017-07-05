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

import rover.raspirover.raspirover.RaspiroverFactory;
import rover.raspirover.raspirover.RaspiroverPackage;
import rover.raspirover.raspirover.VarAssignment;

/**
 * This is the item provider adapter for a {@link rover.raspirover.raspirover.VarAssignment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VarAssignmentItemProvider extends StatementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarAssignmentItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VarAssignment_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VarAssignment_name_feature", "_UI_VarAssignment_type"),
				 RaspiroverPackage.Literals.VAR_ASSIGNMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE);
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
	 * This returns VarAssignment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VarAssignment"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VarAssignment)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VarAssignment_type") :
			getString("_UI_VarAssignment_type") + " " + label;
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

		switch (notification.getFeatureID(VarAssignment.class)) {
			case RaspiroverPackage.VAR_ASSIGNMENT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RaspiroverPackage.VAR_ASSIGNMENT__VALUE:
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
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createTemperatureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createHumidityQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createMessageQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createObstacleQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createRoverValue()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createNumberValue()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.VAR_ASSIGNMENT__VALUE,
				 RaspiroverFactory.eINSTANCE.createVarRef()));
	}

}
