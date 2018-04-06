/**
 */
package edu.montana.esof422.assignment5.esof_homework5.impl;

import edu.montana.esof422.assignment5.esof_homework5.Customer;
import edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package;
import edu.montana.esof422.assignment5.esof_homework5.Movie;
import edu.montana.esof422.assignment5.esof_homework5.Rental;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.RentalImpl#getDaysRented <em>Days Rented</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.RentalImpl#getRenter <em>Renter</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.impl.RentalImpl#getMovie <em>Movie</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentalImpl extends MinimalEObjectImpl.Container implements Rental {
	/**
	 * The default value of the '{@link #getDaysRented() <em>Days Rented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysRented()
	 * @generated
	 * @ordered
	 */
	protected static final int DAYS_RENTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDaysRented() <em>Days Rented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysRented()
	 * @generated
	 * @ordered
	 */
	protected int daysRented = DAYS_RENTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRenter() <em>Renter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenter()
	 * @generated
	 * @ordered
	 */
	protected Customer renter;

	/**
	 * The cached value of the '{@link #getMovie() <em>Movie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovie()
	 * @generated
	 * @ordered
	 */
	protected Movie movie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentalImpl() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Esof_homework5Package.Literals.RENTAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDaysRented() {
		return daysRented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaysRented(int newDaysRented) {
		int oldDaysRented = daysRented;
		daysRented = newDaysRented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.RENTAL__DAYS_RENTED,
					oldDaysRented, daysRented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getRenter() {
		if (renter != null && renter.eIsProxy()) {
			InternalEObject oldRenter = (InternalEObject) renter;
			renter = (Customer) eResolveProxy(oldRenter);
			if (renter != oldRenter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Esof_homework5Package.RENTAL__RENTER,
							oldRenter, renter));
			}
		}
		return renter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetRenter() {
		return renter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRenter(Customer newRenter, NotificationChain msgs) {
		Customer oldRenter = renter;
		renter = newRenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Esof_homework5Package.RENTAL__RENTER, oldRenter, newRenter);
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
	public void setRenter(Customer newRenter) {
		if (newRenter != renter) {
			NotificationChain msgs = null;
			if (renter != null)
				msgs = ((InternalEObject) renter).eInverseRemove(this, Esof_homework5Package.CUSTOMER__RENTALS,
						Customer.class, msgs);
			if (newRenter != null)
				msgs = ((InternalEObject) newRenter).eInverseAdd(this, Esof_homework5Package.CUSTOMER__RENTALS,
						Customer.class, msgs);
			msgs = basicSetRenter(newRenter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.RENTAL__RENTER, newRenter,
					newRenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie getMovie() {
		if (movie != null && movie.eIsProxy()) {
			InternalEObject oldMovie = (InternalEObject) movie;
			movie = (Movie) eResolveProxy(oldMovie);
			if (movie != oldMovie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Esof_homework5Package.RENTAL__MOVIE,
							oldMovie, movie));
			}
		}
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Movie basicGetMovie() {
		return movie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMovie(Movie newMovie, NotificationChain msgs) {
		Movie oldMovie = movie;
		movie = newMovie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Esof_homework5Package.RENTAL__MOVIE, oldMovie, newMovie);
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
	public void setMovie(Movie newMovie) {
		if (newMovie != movie) {
			NotificationChain msgs = null;
			if (movie != null)
				msgs = ((InternalEObject) movie).eInverseRemove(this, Esof_homework5Package.MOVIE__MOV_RENTALS,
						Movie.class, msgs);
			if (newMovie != null)
				msgs = ((InternalEObject) newMovie).eInverseAdd(this, Esof_homework5Package.MOVIE__MOV_RENTALS,
						Movie.class, msgs);
			msgs = basicSetMovie(newMovie, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Esof_homework5Package.RENTAL__MOVIE, newMovie,
					newMovie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getCharge() {
		double charge;
		switch (this.movie.getPriceCode()) {
		case REGULAR: {
			charge = 2.0 * this.daysRented;
			break;
		}
		case FAMILY: {
			charge = 1.5 * this.daysRented;
			break;
		}
		case NEW_RELEASE: {
			charge = 3.0 * this.daysRented;
			break;
		}
		default:
			charge = 0;
		}
		return charge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Esof_homework5Package.RENTAL__RENTER:
			if (renter != null)
				msgs = ((InternalEObject) renter).eInverseRemove(this, Esof_homework5Package.CUSTOMER__RENTALS,
						Customer.class, msgs);
			return basicSetRenter((Customer) otherEnd, msgs);
		case Esof_homework5Package.RENTAL__MOVIE:
			if (movie != null)
				msgs = ((InternalEObject) movie).eInverseRemove(this, Esof_homework5Package.MOVIE__MOV_RENTALS,
						Movie.class, msgs);
			return basicSetMovie((Movie) otherEnd, msgs);
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
		case Esof_homework5Package.RENTAL__RENTER:
			return basicSetRenter(null, msgs);
		case Esof_homework5Package.RENTAL__MOVIE:
			return basicSetMovie(null, msgs);
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
		case Esof_homework5Package.RENTAL__DAYS_RENTED:
			return getDaysRented();
		case Esof_homework5Package.RENTAL__RENTER:
			if (resolve)
				return getRenter();
			return basicGetRenter();
		case Esof_homework5Package.RENTAL__MOVIE:
			if (resolve)
				return getMovie();
			return basicGetMovie();
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
		case Esof_homework5Package.RENTAL__DAYS_RENTED:
			setDaysRented((Integer) newValue);
			return;
		case Esof_homework5Package.RENTAL__RENTER:
			setRenter((Customer) newValue);
			return;
		case Esof_homework5Package.RENTAL__MOVIE:
			setMovie((Movie) newValue);
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
		case Esof_homework5Package.RENTAL__DAYS_RENTED:
			setDaysRented(DAYS_RENTED_EDEFAULT);
			return;
		case Esof_homework5Package.RENTAL__RENTER:
			setRenter((Customer) null);
			return;
		case Esof_homework5Package.RENTAL__MOVIE:
			setMovie((Movie) null);
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
		case Esof_homework5Package.RENTAL__DAYS_RENTED:
			return daysRented != DAYS_RENTED_EDEFAULT;
		case Esof_homework5Package.RENTAL__RENTER:
			return renter != null;
		case Esof_homework5Package.RENTAL__MOVIE:
			return movie != null;
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
		case Esof_homework5Package.RENTAL___GET_CHARGE:
			return getCharge();
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
		result.append(" (daysRented: ");
		result.append(daysRented);
		result.append(')');
		return result.toString();
	}

} //RentalImpl
