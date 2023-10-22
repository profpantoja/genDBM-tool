/**
 */
package gedbm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gedbm.GedbmPackage#getRelationshipType()
 * @model
 * @generated
 */
public enum RelationshipType implements Enumerator {
	/**
	 * The '<em><b>Simple</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(0, "Simple", "Simple"),

	/**
	 * The '<em><b>Spatial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SPATIAL(1, "Spatial", "Spatial"),

	/**
	 * The '<em><b>Agregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGREGATION(2, "Agregation", "Agregation"),

	/**
	 * The '<em><b>Spatial Agregation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_AGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	SPATIAL_AGREGATION(3, "SpatialAgregation", "SpatialAgregation"),

	/**
	 * The '<em><b>Network Association</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_ASSOCIATION(4, "NetworkAssociation", "NetworkAssociation"),

	/**
	 * The '<em><b>Disjoint Partial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_PARTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	DISJOINT_PARTIAL(5, "DisjointPartial", "DisjointPartial"),

	/**
	 * The '<em><b>Disjoint Total</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_TOTAL_VALUE
	 * @generated
	 * @ordered
	 */
	DISJOINT_TOTAL(6, "DisjointTotal", "DisjointTotal"),

	/**
	 * The '<em><b>Overlapping Partial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPING_PARTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAPPING_PARTIAL(7, "OverlappingPartial", "OverlappingPartial"),

	/**
	 * The '<em><b>Overlapping Total</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPING_TOTAL_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAPPING_TOTAL(8, "OverlappingTotal", "OverlappingTotal"),

	/**
	 * The '<em><b>Shape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHAPE_VALUE
	 * @generated
	 * @ordered
	 */
	SHAPE(9, "Shape", "Shape"),

	/**
	 * The '<em><b>Scale</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCALE_VALUE
	 * @generated
	 * @ordered
	 */
	SCALE(10, "Scale", "Scale");

	/**
	 * The '<em><b>Simple</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model name="Simple"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 0;

	/**
	 * The '<em><b>Spatial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spatial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPATIAL
	 * @model name="Spatial"
	 * @generated
	 * @ordered
	 */
	public static final int SPATIAL_VALUE = 1;

	/**
	 * The '<em><b>Agregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Agregation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGREGATION
	 * @model name="Agregation"
	 * @generated
	 * @ordered
	 */
	public static final int AGREGATION_VALUE = 2;

	/**
	 * The '<em><b>Spatial Agregation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spatial Agregation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_AGREGATION
	 * @model name="SpatialAgregation"
	 * @generated
	 * @ordered
	 */
	public static final int SPATIAL_AGREGATION_VALUE = 3;

	/**
	 * The '<em><b>Network Association</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Network Association</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK_ASSOCIATION
	 * @model name="NetworkAssociation"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_ASSOCIATION_VALUE = 4;

	/**
	 * The '<em><b>Disjoint Partial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disjoint Partial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_PARTIAL
	 * @model name="DisjointPartial"
	 * @generated
	 * @ordered
	 */
	public static final int DISJOINT_PARTIAL_VALUE = 5;

	/**
	 * The '<em><b>Disjoint Total</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disjoint Total</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISJOINT_TOTAL
	 * @model name="DisjointTotal"
	 * @generated
	 * @ordered
	 */
	public static final int DISJOINT_TOTAL_VALUE = 6;

	/**
	 * The '<em><b>Overlapping Partial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlapping Partial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPING_PARTIAL
	 * @model name="OverlappingPartial"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAPPING_PARTIAL_VALUE = 7;

	/**
	 * The '<em><b>Overlapping Total</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overlapping Total</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAPPING_TOTAL
	 * @model name="OverlappingTotal"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAPPING_TOTAL_VALUE = 8;

	/**
	 * The '<em><b>Shape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shape</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHAPE
	 * @model name="Shape"
	 * @generated
	 * @ordered
	 */
	public static final int SHAPE_VALUE = 9;

	/**
	 * The '<em><b>Scale</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scale</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCALE
	 * @model name="Scale"
	 * @generated
	 * @ordered
	 */
	public static final int SCALE_VALUE = 10;

	/**
	 * An array of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipType[] VALUES_ARRAY =
		new RelationshipType[] {
			SIMPLE,
			SPATIAL,
			AGREGATION,
			SPATIAL_AGREGATION,
			NETWORK_ASSOCIATION,
			DISJOINT_PARTIAL,
			DISJOINT_TOTAL,
			OVERLAPPING_PARTIAL,
			OVERLAPPING_TOTAL,
			SHAPE,
			SCALE,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType get(int value) {
		switch (value) {
			case SIMPLE_VALUE: return SIMPLE;
			case SPATIAL_VALUE: return SPATIAL;
			case AGREGATION_VALUE: return AGREGATION;
			case SPATIAL_AGREGATION_VALUE: return SPATIAL_AGREGATION;
			case NETWORK_ASSOCIATION_VALUE: return NETWORK_ASSOCIATION;
			case DISJOINT_PARTIAL_VALUE: return DISJOINT_PARTIAL;
			case DISJOINT_TOTAL_VALUE: return DISJOINT_TOTAL;
			case OVERLAPPING_PARTIAL_VALUE: return OVERLAPPING_PARTIAL;
			case OVERLAPPING_TOTAL_VALUE: return OVERLAPPING_TOTAL;
			case SHAPE_VALUE: return SHAPE;
			case SCALE_VALUE: return SCALE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationshipType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelationshipType
