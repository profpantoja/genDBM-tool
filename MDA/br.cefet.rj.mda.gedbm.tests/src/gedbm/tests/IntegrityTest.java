/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.tests;

import gedbm.GedbmFactory;
import gedbm.Integrity;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integrity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrityTest extends TestCase {

	/**
	 * The fixture for this Integrity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Integrity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegrityTest.class);
	}

	/**
	 * Constructs a new Integrity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Integrity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Integrity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Integrity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Integrity getFixture() {
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
		setFixture(GedbmFactory.eINSTANCE.createIntegrity());
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

} //IntegrityTest
