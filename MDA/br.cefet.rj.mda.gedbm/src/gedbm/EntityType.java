/**
 */
package gedbm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see gedbm.GedbmPackage#getEntityType()
 * @model
 * @generated
 */
public enum EntityType implements Enumerator {
	/**
	 * The '<em><b>Conventional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVENTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONVENTIONAL(0, "Conventional", "Conventional"),

	/**
	 * The '<em><b>Network Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NETWORK_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK_CLASS(3, "NetworkClass", "NetworkClass"),

	/**
	 * The '<em><b>Adjacent Polygons</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJACENT_POLYGONS_VALUE
	 * @generated
	 * @ordered
	 */
	ADJACENT_POLYGONS(1, "AdjacentPolygons", "AdjacentPolygons"),

	/**
	 * The '<em><b>Tesselation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESSELATION_VALUE
	 * @generated
	 * @ordered
	 */
	TESSELATION(4, "Tesselation", "Tesselation"),

	/**
	 * The '<em><b>Sampling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLING_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLING(5, "Sampling", "Sampling"),

	/**
	 * The '<em><b>Isoline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISOLINE_VALUE
	 * @generated
	 * @ordered
	 */
	ISOLINE(6, "Isoline", "Isoline"),

	/**
	 * The '<em><b>Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGON(7, "Polygon", "Polygon"),

	/**
	 * The '<em><b>Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POINT_VALUE
	 * @generated
	 * @ordered
	 */
	POINT(8, "Point", "Point"),

	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(9, "Line", "Line"),

	/**
	 * The '<em><b>Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NODE_VALUE
	 * @generated
	 * @ordered
	 */
	NODE(10, "Node", "Node"),

	/**
	 * The '<em><b>Unidirectional Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIDIRECTIONAL_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIDIRECTIONAL_LINE(11, "UnidirectionalLine", "UnidirectionalLine"),

	/**
	 * The '<em><b>Bidirectional Line</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIDIRECTIONAL_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	BIDIRECTIONAL_LINE(2, "BidirectionalLine", "BidirectionalLine");

	/**
	 * The '<em><b>Conventional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conventional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONVENTIONAL
	 * @model name="Conventional"
	 * @generated
	 * @ordered
	 */
	public static final int CONVENTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Network Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Network Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NETWORK_CLASS
	 * @model name="NetworkClass"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_CLASS_VALUE = 3;

	/**
	 * The '<em><b>Adjacent Polygons</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjacent Polygons</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJACENT_POLYGONS
	 * @model name="AdjacentPolygons"
	 * @generated
	 * @ordered
	 */
	public static final int ADJACENT_POLYGONS_VALUE = 1;

	/**
	 * The '<em><b>Tesselation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tesselation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TESSELATION
	 * @model name="Tesselation"
	 * @generated
	 * @ordered
	 */
	public static final int TESSELATION_VALUE = 4;

	/**
	 * The '<em><b>Sampling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sampling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLING
	 * @model name="Sampling"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLING_VALUE = 5;

	/**
	 * The '<em><b>Isoline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Isoline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISOLINE
	 * @model name="Isoline"
	 * @generated
	 * @ordered
	 */
	public static final int ISOLINE_VALUE = 6;

	/**
	 * The '<em><b>Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polygon</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYGON
	 * @model name="Polygon"
	 * @generated
	 * @ordered
	 */
	public static final int POLYGON_VALUE = 7;

	/**
	 * The '<em><b>Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Point</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINT
	 * @model name="Point"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_VALUE = 8;

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model name="Line"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 9;

	/**
	 * The '<em><b>Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Node</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NODE
	 * @model name="Node"
	 * @generated
	 * @ordered
	 */
	public static final int NODE_VALUE = 10;

	/**
	 * The '<em><b>Unidirectional Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unidirectional Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIDIRECTIONAL_LINE
	 * @model name="UnidirectionalLine"
	 * @generated
	 * @ordered
	 */
	public static final int UNIDIRECTIONAL_LINE_VALUE = 11;

	/**
	 * The '<em><b>Bidirectional Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bidirectional Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIDIRECTIONAL_LINE
	 * @model name="BidirectionalLine"
	 * @generated
	 * @ordered
	 */
	public static final int BIDIRECTIONAL_LINE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EntityType[] VALUES_ARRAY =
		new EntityType[] {
			CONVENTIONAL,
			NETWORK_CLASS,
			ADJACENT_POLYGONS,
			TESSELATION,
			SAMPLING,
			ISOLINE,
			POLYGON,
			POINT,
			LINE,
			NODE,
			UNIDIRECTIONAL_LINE,
			BIDIRECTIONAL_LINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Entity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EntityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EntityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Entity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EntityType get(int value) {
		switch (value) {
			case CONVENTIONAL_VALUE: return CONVENTIONAL;
			case NETWORK_CLASS_VALUE: return NETWORK_CLASS;
			case ADJACENT_POLYGONS_VALUE: return ADJACENT_POLYGONS;
			case TESSELATION_VALUE: return TESSELATION;
			case SAMPLING_VALUE: return SAMPLING;
			case ISOLINE_VALUE: return ISOLINE;
			case POLYGON_VALUE: return POLYGON;
			case POINT_VALUE: return POINT;
			case LINE_VALUE: return LINE;
			case NODE_VALUE: return NODE;
			case UNIDIRECTIONAL_LINE_VALUE: return UNIDIRECTIONAL_LINE;
			case BIDIRECTIONAL_LINE_VALUE: return BIDIRECTIONAL_LINE;
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
	private EntityType(int value, String name, String literal) {
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
	
} //EntityType
