/**
 */
package edu.montana.esof422.assignment5.esof_homework5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.Charge#getChargeValue <em>Charge Value</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.Charge#getChargeT <em>Charge T</em>}</li>
 *   <li>{@link edu.montana.esof422.assignment5.esof_homework5.Charge#getCust <em>Cust</em>}</li>
 * </ul>
 *
 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getCharge()
 * @model
 * @generated
 */
public interface Charge extends EObject {
	/**
	 * Returns the value of the '<em><b>Charge Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Value</em>' attribute.
	 * @see #setChargeValue(double)
	 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getCharge_ChargeValue()
	 * @model
	 * @generated
	 */
	double getChargeValue();

	/**
	 * Sets the value of the '{@link edu.montana.esof422.assignment5.esof_homework5.Charge#getChargeValue <em>Charge Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Value</em>' attribute.
	 * @see #getChargeValue()
	 * @generated
	 */
	void setChargeValue(double value);

	/**
	 * Returns the value of the '<em><b>Charge T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge T</em>' attribute.
	 * @see #setChargeT(String)
	 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getCharge_ChargeT()
	 * @model
	 * @generated
	 */
	String getChargeT();

	/**
	 * Sets the value of the '{@link edu.montana.esof422.assignment5.esof_homework5.Charge#getChargeT <em>Charge T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge T</em>' attribute.
	 * @see #getChargeT()
	 * @generated
	 */
	void setChargeT(String value);

	/**
	 * Returns the value of the '<em><b>Cust</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link edu.montana.esof422.assignment5.esof_homework5.Customer#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cust</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cust</em>' reference.
	 * @see #setCust(Customer)
	 * @see edu.montana.esof422.assignment5.esof_homework5.Esof_homework5Package#getCharge_Cust()
	 * @see edu.montana.esof422.assignment5.esof_homework5.Customer#getCharges
	 * @model opposite="charges" required="true"
	 * @generated
	 */
	Customer getCust();

	/**
	 * Sets the value of the '{@link edu.montana.esof422.assignment5.esof_homework5.Charge#getCust <em>Cust</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cust</em>' reference.
	 * @see #getCust()
	 * @generated
	 */
	void setCust(Customer value);

} // Charge
