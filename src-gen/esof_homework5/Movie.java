/**
 */
package esof_homework5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Movie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esof_homework5.Movie#getTitle <em>Title</em>}</li>
 *   <li>{@link esof_homework5.Movie#getPriceCode <em>Price Code</em>}</li>
 *   <li>{@link esof_homework5.Movie#getMovRentals <em>Mov Rentals</em>}</li>
 * </ul>
 *
 * @see esof_homework5.Esof_homework5Package#getMovie()
 * @model
 * @generated
 */
public interface Movie extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see esof_homework5.Esof_homework5Package#getMovie_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link esof_homework5.Movie#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Price Code</b></em>' attribute.
	 * The literals are from the enumeration {@link esof_homework5.PriceCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price Code</em>' attribute.
	 * @see esof_homework5.PriceCode
	 * @see #setPriceCode(PriceCode)
	 * @see esof_homework5.Esof_homework5Package#getMovie_PriceCode()
	 * @model
	 * @generated
	 */
	PriceCode getPriceCode();

	/**
	 * Sets the value of the '{@link esof_homework5.Movie#getPriceCode <em>Price Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price Code</em>' attribute.
	 * @see esof_homework5.PriceCode
	 * @see #getPriceCode()
	 * @generated
	 */
	void setPriceCode(PriceCode value);

	/**
	 * Returns the value of the '<em><b>Mov Rentals</b></em>' reference list.
	 * The list contents are of type {@link esof_homework5.Rental}.
	 * It is bidirectional and its opposite is '{@link esof_homework5.Rental#getMovie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mov Rentals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mov Rentals</em>' reference list.
	 * @see esof_homework5.Esof_homework5Package#getMovie_MovRentals()
	 * @see esof_homework5.Rental#getMovie
	 * @model opposite="movie"
	 * @generated
	 */
	EList<Rental> getMovRentals();

} // Movie
