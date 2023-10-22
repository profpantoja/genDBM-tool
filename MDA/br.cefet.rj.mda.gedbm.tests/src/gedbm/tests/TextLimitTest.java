/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gedbm.tests;

import gedbm.GedbmFactory;
import gedbm.TextLimit;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Limit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextLimitTest extends TestCase {

	/**
	 * The fixture for this Text Limit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextLimit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextLimitTest.class);
	}

	/**
	 * Constructs a new Text Limit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLimitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Text Limit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TextLimit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Text Limit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextLimit getFixture() {
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
		setFixture(GedbmFactory.eINSTANCE.createTextLimit());
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

} //TextLimitTest
