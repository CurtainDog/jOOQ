/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> implements org.jooq.Record6<java.lang.Integer, java.sql.Date, java.lang.Object, java.sql.Timestamp, java.lang.Integer, java.lang.Long> {

	private static final long serialVersionUID = 783548640;

	/**
	 * The table column <code>t_dates.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.ID, value);
	}

	/**
	 * The table column <code>t_dates.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.ID);
	}

	/**
	 * The table column <code>t_dates.d</code>
	 */
	public void setD(java.sql.Date value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D, value);
	}

	/**
	 * The table column <code>t_dates.d</code>
	 */
	public java.sql.Date getD() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D);
	}

	/**
	 * The table column <code>t_dates.t</code>
	 * <p>
	 * The SQL type of this item (time) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setT(java.lang.Object value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.T, value);
	}

	/**
	 * The table column <code>t_dates.t</code>
	 * <p>
	 * The SQL type of this item (time) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getT() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.T);
	}

	/**
	 * The table column <code>t_dates.ts</code>
	 */
	public void setTs(java.sql.Timestamp value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS, value);
	}

	/**
	 * The table column <code>t_dates.ts</code>
	 */
	public java.sql.Timestamp getTs() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS);
	}

	/**
	 * The table column <code>t_dates.d_int</code>
	 */
	public void setDInt(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D_INT, value);
	}

	/**
	 * The table column <code>t_dates.d_int</code>
	 */
	public java.lang.Integer getDInt() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.D_INT);
	}

	/**
	 * The table column <code>t_dates.ts_bigint</code>
	 */
	public void setTsBigint(java.lang.Long value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS_BIGINT, value);
	}

	/**
	 * The table column <code>t_dates.ts_bigint</code>
	 */
	public java.lang.Long getTsBigint() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TDates.TS_BIGINT);
	}

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TDates.T_DATES);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.lang.Object, java.sql.Timestamp, java.lang.Integer, java.lang.Long> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.lang.Object, java.sql.Timestamp, java.lang.Integer, java.lang.Long> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlite.generatedclasses.tables.TDates.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.sqlite.generatedclasses.tables.TDates.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field3() {
		return org.jooq.test.sqlite.generatedclasses.tables.TDates.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.sqlite.generatedclasses.tables.TDates.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.sqlite.generatedclasses.tables.TDates.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.sqlite.generatedclasses.tables.TDates.TS_BIGINT;
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
	public java.sql.Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getTsBigint();
	}
}
