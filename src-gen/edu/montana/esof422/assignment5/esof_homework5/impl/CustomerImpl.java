/**
 */
package edu.montana.esof422.assignment5.esof_homework5.impl;

import edu.montana.esof422.assignment5.esof_homework5.Charge;
import edu.montana.esof422.assignment5.esof_homework5.Customer;
import edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package;
import edu.montana.esof422.assignment5.esof_homework5.Rental;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.CustomerImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.CustomerImpl#getMumRentals <em>Mum Rentals</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.CustomerImpl#getRentals <em>Rentals</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.CustomerImpl#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMumRentals() <em>Mum Rentals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMumRentals()
	 * @generated
	 * @ordered
	 */
	protected static final int MUM_RENTALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMumRentals() <em>Mum Rentals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMumRentals()
	 * @generated
	 * @ordered
	 */
	protected int mumRentals = MUM_RENTALS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRentals() <em>Rentals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRentals()
	 * @generated
	 * @ordered
	 */
	protected EList<Rental> rentals;

	/**
	 * The cached value of the '{@link #getCharges() <em>Charges</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharges()
	 * @generated
	 * @ordered
	 */
	protected EList<Charge> charges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
		this.charges = new BasicEList<Charge>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Esof_homework5Package.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.CUSTOMER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMumRentals() {
		return mumRentals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMumRentals(int newMumRentals) {
		int oldMumRentals = mumRentals;
		mumRentals = newMumRentals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.CUSTOMER__MUM_RENTALS,
					oldMumRentals, mumRentals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rental> getRentals() {
		if (rentals == null) {
			rentals = new EObjectWithInverseResolvingEList<Rental>(Rental.class, this,
					Esof_homework5Package.CUSTOMER__RENTALS, Esof_homework5Package.RENTAL__RENTER);
		}
		return rentals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Charge> getCharges() {
		if (charges == null) {
			charges = new EObjectWithInverseResolvingEList<Charge>(Charge.class, this,
					Esof_homework5Package.CUSTOMER__CHARGES, Esof_homework5Package.CHARGE__CUST);
		}
		return charges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void statement() {
		Esof_homework5FactoryImpl factory = new Esof_homework5FactoryImpl();
		int counter = 1;
		System.out.print("Rental Statement for " + this.name + "\n\n" + 
						"Number or Rentals: " + this.rentals.size()+ "\n\n" );
		
		for(Rental ren : this.rentals)
		{
			Charge chg = factory.createCharge();
			String title = ren.getMovie().getTitle();
			double charge = ren.getCharge();
			
			chg.setChargeValue(charge);
			chg.setChargeT(title);
			this.charges.add(chg);
			
			
			System.out.print(counter + ") " +
							"Title: " + ren.getMovie().getTitle() + "\n" +
							"Days Rented: " + ren.getDaysRented() + "\n" +
							"Charge: " + ren.getCharge() + "\n\n"
							);
			counter++;
		}
		
		System.out.print("Total charges: " + this.getTotalCharge());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getTotalCharge() {
		double total = 0;
		for (Charge charge : this.charges) {
			total += charge.getChargeValue();
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Esof_homework5Package.CUSTOMER__RENTALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRentals()).basicAdd(otherEnd, msgs);
		case Esof_homework5Package.CUSTOMER__CHARGES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCharges()).basicAdd(otherEnd, msgs);
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
		case Esof_homework5Package.CUSTOMER__RENTALS:
			return ((InternalEList<?>) getRentals()).basicRemove(otherEnd, msgs);
		case Esof_homework5Package.CUSTOMER__CHARGES:
			return ((InternalEList<?>) getCharges()).basicRemove(otherEnd, msgs);
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
		case Esof_homework5Package.CUSTOMER__NAME:
			return getName();
		case Esof_homework5Package.CUSTOMER__MUM_RENTALS:
			return getMumRentals();
		case Esof_homework5Package.CUSTOMER__RENTALS:
			return getRentals();
		case Esof_homework5Package.CUSTOMER__CHARGES:
			return getCharges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Esof_homework5Package.CUSTOMER__NAME:
			setName((String) newValue);
			return;
		case Esof_homework5Package.CUSTOMER__MUM_RENTALS:
			setMumRentals((Integer) newValue);
			return;
		case Esof_homework5Package.CUSTOMER__RENTALS:
			getRentals().clear();
			getRentals().addAll((Collection<? extends Rental>) newValue);
			return;
		case Esof_homework5Package.CUSTOMER__CHARGES:
			getCharges().clear();
			getCharges().addAll((Collection<? extends Charge>) newValue);
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
		case Esof_homework5Package.CUSTOMER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Esof_homework5Package.CUSTOMER__MUM_RENTALS:
			setMumRentals(MUM_RENTALS_EDEFAULT);
			return;
		case Esof_homework5Package.CUSTOMER__RENTALS:
			getRentals().clear();
			return;
		case Esof_homework5Package.CUSTOMER__CHARGES:
			getCharges().clear();
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
		case Esof_homework5Package.CUSTOMER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Esof_homework5Package.CUSTOMER__MUM_RENTALS:
			return mumRentals != MUM_RENTALS_EDEFAULT;
		case Esof_homework5Package.CUSTOMER__RENTALS:
			return rentals != null && !rentals.isEmpty();
		case Esof_homework5Package.CUSTOMER__CHARGES:
			return charges != null && !charges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Esof_homework5Package.CUSTOMER___STATEMENT:
			statement();
			return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", mumRentals: ");
		result.append(mumRentals);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
