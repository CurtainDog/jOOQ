/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_937Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_937Record> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IT_937 {

	private static final long serialVersionUID = -228516974;

	/**
	 * The table column <code>PUBLIC.T_937.T_937</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setT_937(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.T_937.T_937.T_937_, value);
	}

	/**
	 * The table column <code>PUBLIC.T_937.T_937</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getT_937() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.T_937.T_937.T_937_);
	}

	/**
	 * Create a detached T_937Record
	 */
	public T_937Record() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.T_937.T_937);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.T_937.T_937.T_937_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getT_937();
	}
}
