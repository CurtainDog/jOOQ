/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "history", schema = "PUBLIC", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"event_code", "athlete"})
})
public class HistoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.cubrid.demodb.tables.records.HistoryRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 1294589429;

	/**
	 * The table column <code>PUBLIC.history.event_code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setEventCode(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.EVENT_CODE, value);
	}

	/**
	 * The table column <code>PUBLIC.history.event_code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Column(name = "event_code", nullable = false)
	public java.lang.Integer getEventCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.EVENT_CODE);
	}

	/**
	 * The table column <code>PUBLIC.history.athlete</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setAthlete(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.ATHLETE, value);
	}

	/**
	 * The table column <code>PUBLIC.history.athlete</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Column(name = "athlete", nullable = false, precision = 40)
	public java.lang.String getAthlete() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.ATHLETE);
	}

	/**
	 * The table column <code>PUBLIC.history.host_year</code>
	 */
	public void setHostYear(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.HOST_YEAR, value);
	}

	/**
	 * The table column <code>PUBLIC.history.host_year</code>
	 */
	@javax.persistence.Column(name = "host_year")
	public java.lang.Integer getHostYear() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.HOST_YEAR);
	}

	/**
	 * The table column <code>PUBLIC.history.score</code>
	 */
	public void setScore(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.SCORE, value);
	}

	/**
	 * The table column <code>PUBLIC.history.score</code>
	 */
	@javax.persistence.Column(name = "score", precision = 10)
	public java.lang.String getScore() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.SCORE);
	}

	/**
	 * The table column <code>PUBLIC.history.unit</code>
	 */
	public void setUnit(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.UNIT, value);
	}

	/**
	 * The table column <code>PUBLIC.history.unit</code>
	 */
	@javax.persistence.Column(name = "unit", precision = 5)
	public java.lang.String getUnit() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.History.HISTORY.UNIT);
	}

	/**
	 * Create a detached HistoryRecord
	 */
	public HistoryRecord() {
		super(org.jooq.examples.cubrid.demodb.tables.History.HISTORY);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.cubrid.demodb.tables.History.HISTORY.EVENT_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.cubrid.demodb.tables.History.HISTORY.ATHLETE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.examples.cubrid.demodb.tables.History.HISTORY.HOST_YEAR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.cubrid.demodb.tables.History.HISTORY.SCORE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.cubrid.demodb.tables.History.HISTORY.UNIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getEventCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getAthlete();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getHostYear();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getScore();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUnit();
	}
}
