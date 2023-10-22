/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.tests;

import gedbm.GedbmFactory;
import gedbm.NumericLimit;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numeric Limit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericLimitTest extends TestCase {

	/**
	 * The fixture for this Numeric Limit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericLimit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumericLimitTest.class);
	}

	/**
	 * Constructs a new Numeric Limit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericLimitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Numeric Limit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NumericLimit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Numeric Limit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericLimit getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GedbmFactory.eINSTANCE.createNumericLimit());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //NumericLimitTest
