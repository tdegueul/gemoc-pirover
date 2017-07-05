/**
 */
package rover.raspirover.raspirover.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rover.raspirover.raspirover.Quantity;
import rover.raspirover.raspirover.RaspiroverFactory;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * This is the item provider adapter for a {@link rover.raspirover.raspirover.Quantity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantityItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Quantity_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Quantity_value_feature", "_UI_Quantity_type"),
				 RaspiroverPackage.Literals.QUANTITY__VALUE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(RaspiroverPackage.Literals.QUANTITY__UNIT);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Quantity_type");
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

		switch (notification.getFeatureID(Quantity.class)) {
			case RaspiroverPackage.QUANTITY__UNIT:
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
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createUnit()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createCentimeter()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createMillimeter()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createMeter()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createFoot()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createInch()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createYard()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createRadian()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createDegree()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createTurn()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.QUANTITY__UNIT,
				 RaspiroverFactory.eINSTANCE.createGradian()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RasPiRoverEditPlugin.INSTANCE;
	}

}