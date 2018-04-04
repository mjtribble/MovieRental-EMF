/**
 */
package esof_homework5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esof_homework5.Customer#getName <em>Name</em>}</li>
 *   <li>{@link esof_homework5.Customer#getMumRentals <em>Mum Rentals</em>}</li>
 *   <li>{@link esof_homework5.Customer#getRentals <em>Rentals</em>}</li>
 *   <li>{@link esof_homework5.Customer#getCharges <em>Charges</em>}</li>
 * </ul>
 *
 * @see esof_homework5.Esof_homework5Package#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see esof_homework5.Esof_homework5Package#getCustomer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link esof_homework5.Customer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mum Rentals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mum Rentals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mum Rentals</em>' attribute.
	 * @see #setMumRentals(int)
	 * @see esof_homework5.Esof_homework5Package#getCustomer_MumRentals()
	 * @model
	 * @generated
	 */
	int getMumRentals();

	/**
	 * Sets the value of the '{@link esof_homework5.Customer#getMumRentals <em>Mum Rentals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mum Rentals</em>' attribute.
	 * @see #getMumRentals()
	 * @generated
	 */
	void setMumRentals(int value);

	/**
	 * Returns the value of the '<em><b>Rentals</b></em>' reference list.
	 * The list contents are of type {@link esof_homework5.Rental}.
	 * It is bidirectional and its opposite is '{@link esof_homework5.Rental#getRenter <em>Renter</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rentals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rentals</em>' reference list.
	 * @see esof_homework5.Esof_homework5Package#getCustomer_Rentals()
	 * @see esof_homework5.Rental#getRenter
	 * @model opposite="renter"
	 * @generated
	 */
	EList<Rental> getRentals();

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' reference list.
	 * The list contents are of type {@link esof_homework5.Charge}.
	 * It is bidirectional and its opposite is '{@link esof_homework5.Charge#getCust <em>Cust</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' reference list.
	 * @see esof_homework5.Esof_homework5Package#getCustomer_Charges()
	 * @see esof_homework5.Charge#getCust
	 * @model opposite="cust"
	 * @generated
	 */
	EList<Charge> getCharges();

} // Customer
