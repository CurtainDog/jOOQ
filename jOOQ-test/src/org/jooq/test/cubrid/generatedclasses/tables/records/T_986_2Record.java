/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_986_2Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_2Record> implements org.jooq.Record1<java.lang.Integer> {

	private static final long serialVersionUID = 1441909142;

	/**
	 * The table column <code>DBA.t_986_2.ref</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.T_986_2.REF, value);
	}

	/**
	 * The table column <code>DBA.t_986_2.ref</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.T_986_2.REF);
	}

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(org.jooq.test.cubrid.generatedclasses.tables.T_986_2.T_986_2);
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
		return org.jooq.test.cubrid.generatedclasses.tables.T_986_2.REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRef();
	}
}
