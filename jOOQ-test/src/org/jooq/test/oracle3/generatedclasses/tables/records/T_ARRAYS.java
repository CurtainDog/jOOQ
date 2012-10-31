/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_ARRAYS", schema = "TEST")
public class T_ARRAYS extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_ARRAYS> implements java.lang.Cloneable, org.jooq.Record5<java.lang.Integer, org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_ARRAYS_INTERFACE {

	private static final long serialVersionUID = 318208311;

	/**
	 * The table column <code>TEST.T_ARRAYS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.ID, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.ID);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.STRING_ARRAY</code>
	 */
	@Override
	public void setSTRING_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.STRING_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.STRING_ARRAY</code>
	 */
	@javax.persistence.Column(name = "STRING_ARRAY", length = 101)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY getSTRING_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.STRING_ARRAY);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	@Override
	public void setNUMBER_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_ARRAY</code>
	 */
	@javax.persistence.Column(name = "NUMBER_ARRAY", length = 109)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY getNUMBER_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_ARRAY);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>
	 */
	@Override
	public void setNUMBER_LONG_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_LONG_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.NUMBER_LONG_ARRAY</code>
	 */
	@javax.persistence.Column(name = "NUMBER_LONG_ARRAY", length = 109)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY getNUMBER_LONG_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_LONG_ARRAY);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.DATE_ARRAY</code>
	 */
	@Override
	public void setDATE_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.DATE_ARRAY, value);
	}

	/**
	 * The table column <code>TEST.T_ARRAYS.DATE_ARRAY</code>
	 */
	@javax.persistence.Column(name = "DATE_ARRAY", length = 49)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY getDATE_ARRAY() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.DATE_ARRAY);
	}

	/**
	 * Create a detached T_ARRAYS
	 */
	public T_ARRAYS() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY, org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.NUMBER_LONG_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_ARRAYS.T_ARRAYS.DATE_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY value2() {
		return getSTRING_ARRAY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY value3() {
		return getNUMBER_ARRAY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY value4() {
		return getNUMBER_LONG_ARRAY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_DATE_ARRAY value5() {
		return getDATE_ARRAY();
	}
}
