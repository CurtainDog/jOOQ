/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TArraysRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbc.generatedclasses.tables.records.TArraysRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object>, org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITArrays {

	private static final long serialVersionUID = -672327775;

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.ID);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	@Override
	public void setStringArray(java.lang.Object value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.STRING_ARRAY, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	@Override
	public java.lang.Object getStringArray() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.STRING_ARRAY);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	@Override
	public void setNumberArray(java.lang.Object value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.NUMBER_ARRAY, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	@Override
	public java.lang.Object getNumberArray() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.NUMBER_ARRAY);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	@Override
	public void setDateArray(java.lang.Object value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.DATE_ARRAY, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	@Override
	public java.lang.Object getDateArray() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.TArrays.DATE_ARRAY);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Object, java.lang.Object, java.lang.Object> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbc.generatedclasses.tables.TArrays.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field2() {
		return org.jooq.test.jdbc.generatedclasses.tables.TArrays.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field3() {
		return org.jooq.test.jdbc.generatedclasses.tables.TArrays.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field4() {
		return org.jooq.test.jdbc.generatedclasses.tables.TArrays.DATE_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value2() {
		return getStringArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value3() {
		return getNumberArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value4() {
		return getDateArray();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.jdbc.generatedclasses.tables.TArrays.T_ARRAYS);
	}
}
