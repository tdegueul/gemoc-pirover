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

import rover.raspirover.raspirover.NumericExpression;
import rover.raspirover.raspirover.NumericOperator;
import rover.raspirover.raspirover.RaspiroverFactory;
import rover.raspirover.raspirover.RaspiroverPackage;

/**
 * This is the item provider adapter for a {@link rover.raspirover.raspirover.NumericExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericExpressionItemProvider extends RoverExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addOpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NumericExpression_op_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NumericExpression_op_feature", "_UI_NumericExpression_type"),
				 RaspiroverPackage.Literals.NUMERIC_EXPRESSION__OP,
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
			childrenFeatures.add(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS);
			childrenFeatures.add(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS);
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
	 * This returns NumericExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NumericExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		NumericOperator labelValue = ((NumericExpression)object).getOp();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_NumericExpression_type") :
			getString("_UI_NumericExpression_type") + " " + label;
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

		switch (notification.getFeatureID(NumericExpression.class)) {
			case RaspiroverPackage.NUMERIC_EXPRESSION__OP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RaspiroverPackage.NUMERIC_EXPRESSION__LHS:
			case RaspiroverPackage.NUMERIC_EXPRESSION__RHS:
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
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS,
				 RaspiroverFactory.eINSTANCE.createTemperatureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS,
				 RaspiroverFactory.eINSTANCE.createHumidityQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS,
				 RaspiroverFactory.eINSTANCE.createNumberValue()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS,
				 RaspiroverFactory.eINSTANCE.createVarRef()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS,
				 RaspiroverFactory.eINSTANCE.createTemperatureQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS,
				 RaspiroverFactory.eINSTANCE.createHumidityQuery()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS,
				 RaspiroverFactory.eINSTANCE.createNumberValue()));

		newChildDescriptors.add
			(createChildParameter
				(RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS,
				 RaspiroverFactory.eINSTANCE.createVarRef()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == RaspiroverPackage.Literals.NUMERIC_EXPRESSION__LHS ||
			childFeature == RaspiroverPackage.Literals.NUMERIC_EXPRESSION__RHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}