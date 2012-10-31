/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "DatabaseLog", schema = "dbo")
public class DatabaseLog extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.DatabaseLog> implements org.jooq.Record8<java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object> {

	private static final long serialVersionUID = 1882495303;

	/**
	 * The table column <code>dbo.DatabaseLog.DatabaseLogID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setDatabaseLogID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseLogID, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.DatabaseLogID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "DatabaseLogID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getDatabaseLogID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseLogID);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.PostTime</code>
	 */
	public void setPostTime(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.PostTime, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.PostTime</code>
	 */
	@javax.persistence.Column(name = "PostTime", nullable = false)
	public java.sql.Timestamp getPostTime() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.PostTime);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.DatabaseUser</code>
	 */
	public void setDatabaseUser(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseUser, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.DatabaseUser</code>
	 */
	@javax.persistence.Column(name = "DatabaseUser", nullable = false, length = 128)
	public java.lang.String getDatabaseUser() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseUser);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.Event</code>
	 */
	public void setEvent(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Event, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.Event</code>
	 */
	@javax.persistence.Column(name = "Event", nullable = false, length = 128)
	public java.lang.String getEvent() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Event);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.Schema</code>
	 */
	public void setSchema(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Schema, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.Schema</code>
	 */
	@javax.persistence.Column(name = "Schema", length = 128)
	public java.lang.String getSchema() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Schema);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.Object</code>
	 */
	public void setObject(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Object, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.Object</code>
	 */
	@javax.persistence.Column(name = "Object", length = 128)
	public java.lang.String getObject() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Object);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.TSQL</code>
	 */
	public void setTSQL(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.TSQL, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.TSQL</code>
	 */
	@javax.persistence.Column(name = "TSQL", nullable = false)
	public java.lang.String getTSQL() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.TSQL);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.XmlEvent</code>
	 * <p>
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setXmlEvent(java.lang.Object value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.XmlEvent, value);
	}

	/**
	 * The table column <code>dbo.DatabaseLog.XmlEvent</code>
	 * <p>
	 * The SQL type of this item (xml, ) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	@javax.persistence.Column(name = "XmlEvent", nullable = false)
	public java.lang.Object getXmlEvent() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.XmlEvent);
	}

	/**
	 * Create a detached DatabaseLog
	 */
	public DatabaseLog() {
		super(org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseLogID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.PostTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.DatabaseUser;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Event;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Schema;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.Object;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.TSQL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field8() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.tables.DatabaseLog.DatabaseLog.XmlEvent;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getDatabaseLogID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getPostTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDatabaseUser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getEvent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getSchema();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getObject();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getTSQL();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value8() {
		return getXmlEvent();
	}
}
