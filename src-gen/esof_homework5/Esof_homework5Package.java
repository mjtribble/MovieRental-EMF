/**
 */
package esof_homework5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see esof_homework5.Esof_homework5Factory
 * @model kind="package"
 * @generated
 */
public interface Esof_homework5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "esof_homework5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/esof_homework5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "esof_homework5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Esof_homework5Package eINSTANCE = esof_homework5.impl.Esof_homework5PackageImpl.init();

	/**
	 * The meta object id for the '{@link esof_homework5.impl.RentalImpl <em>Rental</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esof_homework5.impl.RentalImpl
	 * @see esof_homework5.impl.Esof_homework5PackageImpl#getRental()
	 * @generated
	 */
	int RENTAL = 0;

	/**
	 * The feature id for the '<em><b>Days Rented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__DAYS_RENTED = 0;

	/**
	 * The feature id for the '<em><b>Renter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__RENTER = 1;

	/**
	 * The feature id for the '<em><b>Movie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL__MOVIE = 2;

	/**
	 * The number of structural features of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Charge</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL___GET_CHARGE = 0;

	/**
	 * The number of operations of the '<em>Rental</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTAL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link esof_homework5.impl.MovieImpl <em>Movie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esof_homework5.impl.MovieImpl
	 * @see esof_homework5.impl.Esof_homework5PackageImpl#getMovie()
	 * @generated
	 */
	int MOVIE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Price Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__PRICE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Mov Rentals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE__MOV_RENTALS = 2;

	/**
	 * The number of structural features of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Movie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esof_homework5.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esof_homework5.impl.CustomerImpl
	 * @see esof_homework5.impl.Esof_homework5PackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mum Rentals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__MUM_RENTALS = 1;

	/**
	 * The feature id for the '<em><b>Rentals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__RENTALS = 2;

	/**
	 * The feature id for the '<em><b>Charges</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CHARGES = 3;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esof_homework5.impl.ChargeImpl <em>Charge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esof_homework5.impl.ChargeImpl
	 * @see esof_homework5.impl.Esof_homework5PackageImpl#getCharge()
	 * @generated
	 */
	int CHARGE = 3;

	/**
	 * The feature id for the '<em><b>Charge Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__CHARGE_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Charge T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__CHARGE_T = 1;

	/**
	 * The feature id for the '<em><b>Cust</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE__CUST = 2;

	/**
	 * The number of structural features of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Charge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link esof_homework5.PriceCode <em>Price Code</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see esof_homework5.PriceCode
	 * @see esof_homework5.impl.Esof_homework5PackageImpl#getPriceCode()
	 * @generated
	 */
	int PRICE_CODE = 4;

	/**
	 * Returns the meta object for class '{@link esof_homework5.Rental <em>Rental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rental</em>'.
	 * @see esof_homework5.Rental
	 * @generated
	 */
	EClass getRental();

	/**
	 * Returns the meta object for the attribute '{@link esof_homework5.Rental#getDaysRented <em>Days Rented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Days Rented</em>'.
	 * @see esof_homework5.Rental#getDaysRented()
	 * @see #getRental()
	 * @generated
	 */
	EAttribute getRental_DaysRented();

	/**
	 * Returns the meta object for the reference '{@link esof_homework5.Rental#getRenter <em>Renter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Renter</em>'.
	 * @see esof_homework5.Rental#getRenter()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Renter();

	/**
	 * Returns the meta object for the reference '{@link esof_homework5.Rental#getMovie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Movie</em>'.
	 * @see esof_homework5.Rental#getMovie()
	 * @see #getRental()
	 * @generated
	 */
	EReference getRental_Movie();

	/**
	 * Returns the meta object for the '{@link esof_homework5.Rental#getCharge() <em>Get Charge</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Charge</em>' operation.
	 * @see esof_homework5.Rental#getCharge()
	 * @generated
	 */
	EOperation getRental__GetCharge();

	/**
	 * Returns the meta object for class '{@link esof_homework5.Movie <em>Movie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie</em>'.
	 * @see esof_homework5.Movie
	 * @generated
	 */
	EClass getMovie();

	/**
	 * Returns the meta object for the attribute '{@link esof_homework5.Movie#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see esof_homework5.Movie#getTitle()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_Title();

	/**
	 * Returns the meta object for the attribute '{@link esof_homework5.Movie#getPriceCode <em>Price Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price Code</em>'.
	 * @see esof_homework5.Movie#getPriceCode()
	 * @see #getMovie()
	 * @generated
	 */
	EAttribute getMovie_PriceCode();

	/**
	 * Returns the meta object for the reference list '{@link esof_homework5.Movie#getMovRentals <em>Mov Rentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mov Rentals</em>'.
	 * @see esof_homework5.Movie#getMovRentals()
	 * @see #getMovie()
	 * @generated
	 */
	EReference getMovie_MovRentals();

	/**
	 * Returns the meta object for class '{@link esof_homework5.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see esof_homework5.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link esof_homework5.Customer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see esof_homework5.Customer#getName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Name();

	/**
	 * Returns the meta object for the attribute '{@link esof_homework5.Customer#getMumRentals <em>Mum Rentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mum Rentals</em>'.
	 * @see esof_homework5.Customer#getMumRentals()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_MumRentals();

	/**
	 * Returns the meta object for the reference list '{@link esof_homework5.Customer#getRentals <em>Rentals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rentals</em>'.
	 * @see esof_homework5.Customer#getRentals()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Rentals();

	/**
	 * Returns the meta object for the reference list '{@link esof_homework5.Customer#getCharges <em>Charges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Charges</em>'.
	 * @see esof_homework5.Customer#getCharges()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Charges();

	/**
	 * Returns the meta object for class '{@link esof_homework5.Charge <em>Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Charge</em>'.
	 * @see esof_homework5.Charge
	 * @generated
	 */
	EClass getCharge();

	/**
	 * Returns the meta object for the attribute '{@link esof_homework5.Charge#getChargeValue <em>Charge Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge Value</em>'.
	 * @see esof_homework5.Charge#getChargeValue()
	 * @see #getCharge()
	 * @generated
	 */
	EAttribute getCharge_ChargeValue();

	/**
	 * Returns the meta object for the attribute '{@link esof_homework5.Charge#getChargeT <em>Charge T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charge T</em>'.
	 * @see esof_homework5.Charge#getChargeT()
	 * @see #getCharge()
	 * @generated
	 */
	EAttribute getCharge_ChargeT();

	/**
	 * Returns the meta object for the reference '{@link esof_homework5.Charge#getCust <em>Cust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cust</em>'.
	 * @see esof_homework5.Charge#getCust()
	 * @see #getCharge()
	 * @generated
	 */
	EReference getCharge_Cust();

	/**
	 * Returns the meta object for enum '{@link esof_homework5.PriceCode <em>Price Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Price Code</em>'.
	 * @see esof_homework5.PriceCode
	 * @generated
	 */
	EEnum getPriceCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Esof_homework5Factory getEsof_homework5Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link esof_homework5.impl.RentalImpl <em>Rental</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esof_homework5.impl.RentalImpl
		 * @see esof_homework5.impl.Esof_homework5PackageImpl#getRental()
		 * @generated
		 */
		EClass RENTAL = eINSTANCE.getRental();

		/**
		 * The meta object literal for the '<em><b>Days Rented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTAL__DAYS_RENTED = eINSTANCE.getRental_DaysRented();

		/**
		 * The meta object literal for the '<em><b>Renter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__RENTER = eINSTANCE.getRental_Renter();

		/**
		 * The meta object literal for the '<em><b>Movie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENTAL__MOVIE = eINSTANCE.getRental_Movie();

		/**
		 * The meta object literal for the '<em><b>Get Charge</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RENTAL___GET_CHARGE = eINSTANCE.getRental__GetCharge();

		/**
		 * The meta object literal for the '{@link esof_homework5.impl.MovieImpl <em>Movie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esof_homework5.impl.MovieImpl
		 * @see esof_homework5.impl.Esof_homework5PackageImpl#getMovie()
		 * @generated
		 */
		EClass MOVIE = eINSTANCE.getMovie();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__TITLE = eINSTANCE.getMovie_Title();

		/**
		 * The meta object literal for the '<em><b>Price Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVIE__PRICE_CODE = eINSTANCE.getMovie_PriceCode();

		/**
		 * The meta object literal for the '<em><b>Mov Rentals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE__MOV_RENTALS = eINSTANCE.getMovie_MovRentals();

		/**
		 * The meta object literal for the '{@link esof_homework5.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esof_homework5.impl.CustomerImpl
		 * @see esof_homework5.impl.Esof_homework5PackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__NAME = eINSTANCE.getCustomer_Name();

		/**
		 * The meta object literal for the '<em><b>Mum Rentals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__MUM_RENTALS = eINSTANCE.getCustomer_MumRentals();

		/**
		 * The meta object literal for the '<em><b>Rentals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__RENTALS = eINSTANCE.getCustomer_Rentals();

		/**
		 * The meta object literal for the '<em><b>Charges</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CHARGES = eINSTANCE.getCustomer_Charges();

		/**
		 * The meta object literal for the '{@link esof_homework5.impl.ChargeImpl <em>Charge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esof_homework5.impl.ChargeImpl
		 * @see esof_homework5.impl.Esof_homework5PackageImpl#getCharge()
		 * @generated
		 */
		EClass CHARGE = eINSTANCE.getCharge();

		/**
		 * The meta object literal for the '<em><b>Charge Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE__CHARGE_VALUE = eINSTANCE.getCharge_ChargeValue();

		/**
		 * The meta object literal for the '<em><b>Charge T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARGE__CHARGE_T = eINSTANCE.getCharge_ChargeT();

		/**
		 * The meta object literal for the '<em><b>Cust</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARGE__CUST = eINSTANCE.getCharge_Cust();

		/**
		 * The meta object literal for the '{@link esof_homework5.PriceCode <em>Price Code</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see esof_homework5.PriceCode
		 * @see esof_homework5.impl.Esof_homework5PackageImpl#getPriceCode()
		 * @generated
		 */
		EEnum PRICE_CODE = eINSTANCE.getPriceCode();

	}

} //Esof_homework5Package
