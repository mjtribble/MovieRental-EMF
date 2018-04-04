/**
 */
package edu.montana.esof422.assignment5.esof_homework5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rental</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.Rental#getDaysRented <em>Days Rented</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.Rental#getRenter <em>Renter</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.Rental#getMovie <em>Movie</em>}</li>
 * </ul>
 *
 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getRental()
 * @model
 * @generated
 */
public interface Rental extends EObject {
	/**
	 * Returns the value of the '<em><b>Days Rented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days Rented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days Rented</em>' attribute.
	 * @see #setDaysRented(int)
	 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getRental_DaysRented()
	 * @model
	 * @generated
	 */
	int getDaysRented();

	/**
	 * Sets the value of the '{@link edu.montana.esof422.assignment5.esof_homework5.Rental#getDaysRented <em>Days Rented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Days Rented</em>' attribute.
	 * @see #getDaysRented()
	 * @generated
	 */
	void setDaysRented(int value);

	/**
	 * Returns the value of the '<em><b>Renter</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.montana.esof422.assignment5.esof_homework5.Customer#getRentals <em>Rentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renter</em>' reference.
	 * @see #setRenter(Customer)
	 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getRental_Renter()
	 * @see edu.montana.esof422.assignment5.esof_homework5.Customer#getRentals
	 * @model opposite="rentals" required="true"
	 * @generated
	 */
	Customer getRenter();

	/**
	 * Sets the value of the '{@link edu.montana.esof422.assignment5.esof_homework5.Rental#getRenter <em>Renter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renter</em>' reference.
	 * @see #getRenter()
	 * @generated
	 */
	void setRenter(Customer value);

	/**
	 * Returns the value of the '<em><b>Movie</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.montana.esof422.assignment5.esof_homework5.Movie#getMovRentals <em>Mov Rentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movie</em>' reference.
	 * @see #setMovie(Movie)
	 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getRental_Movie()
	 * @see edu.montana.esof422.assignment5.esof_homework5.Movie#getMovRentals
	 * @model opposite="movRentals" required="true"
	 * @generated
	 */
	Movie getMovie();

	/**
	 * Sets the value of the '{@link edu.montana.esof422.assignment5.esof_homework5.Rental#getMovie <em>Movie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movie</em>' reference.
	 * @see #getMovie()
	 * @generated
	 */
	void setMovie(Movie value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	double getCharge();

} // Rental
