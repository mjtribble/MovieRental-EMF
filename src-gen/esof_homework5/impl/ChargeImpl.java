/**
 */
package esof_homework5.impl;

import esof_homework5.Charge;
import esof_homework5.Customer;
import esof_homework5.Esof_homework5Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esof_homework5.impl.ChargeImpl#getChargeValue <em>Charge Value</em>}</li>
 *   <li>{@link esof_homework5.impl.ChargeImpl#getChargeT <em>Charge T</em>}</li>
 *   <li>{@link esof_homework5.impl.ChargeImpl#getCust <em>Cust</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChargeImpl extends MinimalEObjectImpl.Container implements Charge {
	/**
	 * The default value of the '{@link #getChargeValue() <em>Charge Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CHARGE_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChargeValue() <em>Charge Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeValue()
	 * @generated
	 * @ordered
	 */
	protected int chargeValue = CHARGE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChargeT() <em>Charge T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeT()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARGE_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChargeT() <em>Charge T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeT()
	 * @generated
	 * @ordered
	 */
	protected String chargeT = CHARGE_T_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCust() <em>Cust</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCust()
	 * @generated
	 * @ordered
	 */
	protected Customer cust;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChargeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Esof_homework5Package.Literals.CHARGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChargeValue() {
		return chargeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeValue(int newChargeValue) {
		int oldChargeValue = chargeValue;
		chargeValue = newChargeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.CHARGE__CHARGE_VALUE,
					oldChargeValue, chargeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChargeT() {
		return chargeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeT(String newChargeT) {
		String oldChargeT = chargeT;
		chargeT = newChargeT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.CHARGE__CHARGE_T, oldChargeT,
					chargeT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCust() {
		if (cust != null && cust.eIsProxy()) {
			InternalEObject oldCust = (InternalEObject) cust;
			cust = (Customer) eResolveProxy(oldCust);
			if (cust != oldCust) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Esof_homework5Package.CHARGE__CUST,
							oldCust, cust));
			}
		}
		return cust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCust() {
		return cust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCust(Customer newCust, NotificationChain msgs) {
		Customer oldCust = cust;
		cust = newCust;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Esof_homework5Package.CHARGE__CUST, oldCust, newCust);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCust(Customer newCust) {
		if (newCust != cust) {
			NotificationChain msgs = null;
			if (cust != null)
				msgs = ((InternalEObject) cust).eInverseRemove(this, Esof_homework5Package.CUSTOMER__CHARGES,
						Customer.class, msgs);
			if (newCust != null)
				msgs = ((InternalEObject) newCust).eInverseAdd(this, Esof_homework5Package.CUSTOMER__CHARGES,
						Customer.class, msgs);
			msgs = basicSetCust(newCust, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.CHARGE__CUST, newCust,
					newCust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Esof_homework5Package.CHARGE__CUST:
			if (cust != null)
				msgs = ((InternalEObject) cust).eInverseRemove(this, Esof_homework5Package.CUSTOMER__CHARGES,
						Customer.class, msgs);
			return basicSetCust((Customer) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Esof_homework5Package.CHARGE__CUST:
			return basicSetCust(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Esof_homework5Package.CHARGE__CHARGE_VALUE:
			return getChargeValue();
		case Esof_homework5Package.CHARGE__CHARGE_T:
			return getChargeT();
		case Esof_homework5Package.CHARGE__CUST:
			if (resolve)
				return getCust();
			return basicGetCust();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Esof_homework5Package.CHARGE__CHARGE_VALUE:
			setChargeValue((Integer) newValue);
			return;
		case Esof_homework5Package.CHARGE__CHARGE_T:
			setChargeT((String) newValue);
			return;
		case Esof_homework5Package.CHARGE__CUST:
			setCust((Customer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Esof_homework5Package.CHARGE__CHARGE_VALUE:
			setChargeValue(CHARGE_VALUE_EDEFAULT);
			return;
		case Esof_homework5Package.CHARGE__CHARGE_T:
			setChargeT(CHARGE_T_EDEFAULT);
			return;
		case Esof_homework5Package.CHARGE__CUST:
			setCust((Customer) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Esof_homework5Package.CHARGE__CHARGE_VALUE:
			return chargeValue != CHARGE_VALUE_EDEFAULT;
		case Esof_homework5Package.CHARGE__CHARGE_T:
			return CHARGE_T_EDEFAULT == null ? chargeT != null : !CHARGE_T_EDEFAULT.equals(chargeT);
		case Esof_homework5Package.CHARGE__CUST:
			return cust != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (chargeValue: ");
		result.append(chargeValue);
		result.append(", chargeT: ");
		result.append(chargeT);
		result.append(')');
		return result.toString();
	}

} //ChargeImpl
