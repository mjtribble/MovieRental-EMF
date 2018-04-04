/**
 */
package edu.montana.esof422.assignment5.esof_homework5.impl;

import edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package;
import edu.montana.esof422.assignment5.esof_homework5.Movie;
import edu.montana.esof422.assignment5.esof_homework5.PriceCode;
import edu.montana.esof422.assignment5.esof_homework5.Rental;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.MovieImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.MovieImpl#getPriceCode <em>Price Code</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.MovieImpl#getMovRentals <em>Mov Rentals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovieImpl extends MinimalEObjectImpl.Container implements Movie {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriceCode() <em>Price Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceCode()
	 * @generated
	 * @ordered
	 */
	protected static final PriceCode PRICE_CODE_EDEFAULT = PriceCode.REGULAR;

	/**
	 * The cached value of the '{@link #getPriceCode() <em>Price Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriceCode()
	 * @generated
	 * @ordered
	 */
	protected PriceCode priceCode = PRICE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMovRentals() <em>Mov Rentals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovRentals()
	 * @generated
	 * @ordered
	 */
	protected EList<Rental> movRentals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Esof_homework5Package.Literals.MOVIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.MOVIE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriceCode getPriceCode() {
		return priceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriceCode(PriceCode newPriceCode) {
		PriceCode oldPriceCode = priceCode;
		priceCode = newPriceCode == null ? PRICE_CODE_EDEFAULT : newPriceCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.MOVIE__PRICE_CODE, oldPriceCode,
					priceCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rental> getMovRentals() {
		if (movRentals == null) {
			movRentals = new EObjectWithInverseResolvingEList<Rental>(Rental.class, this,
					Esof_homework5Package.MOVIE__MOV_RENTALS, Esof_homework5Package.RENTAL__MOVIE);
		}
		return movRentals;
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
		case Esof_homework5Package.MOVIE__MOV_RENTALS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMovRentals()).basicAdd(otherEnd, msgs);
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
		case Esof_homework5Package.MOVIE__MOV_RENTALS:
			return ((InternalEList<?>) getMovRentals()).basicRemove(otherEnd, msgs);
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
		case Esof_homework5Package.MOVIE__TITLE:
			return getTitle();
		case Esof_homework5Package.MOVIE__PRICE_CODE:
			return getPriceCode();
		case Esof_homework5Package.MOVIE__MOV_RENTALS:
			return getMovRentals();
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
		case Esof_homework5Package.MOVIE__TITLE:
			setTitle((String) newValue);
			return;
		case Esof_homework5Package.MOVIE__PRICE_CODE:
			setPriceCode((PriceCode) newValue);
			return;
		case Esof_homework5Package.MOVIE__MOV_RENTALS:
			getMovRentals().clear();
			getMovRentals().addAll((Collection<? extends Rental>) newValue);
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
		case Esof_homework5Package.MOVIE__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case Esof_homework5Package.MOVIE__PRICE_CODE:
			setPriceCode(PRICE_CODE_EDEFAULT);
			return;
		case Esof_homework5Package.MOVIE__MOV_RENTALS:
			getMovRentals().clear();
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
		case Esof_homework5Package.MOVIE__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		case Esof_homework5Package.MOVIE__PRICE_CODE:
			return priceCode != PRICE_CODE_EDEFAULT;
		case Esof_homework5Package.MOVIE__MOV_RENTALS:
			return movRentals != null && !movRentals.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", priceCode: ");
		result.append(priceCode);
		result.append(')');
		return result.toString();
	}

} //MovieImpl
