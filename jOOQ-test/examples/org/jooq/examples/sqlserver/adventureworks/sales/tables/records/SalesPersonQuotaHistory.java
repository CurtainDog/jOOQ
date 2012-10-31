/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesPersonQuotaHistory", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"SalesPersonID", "QuotaDate"})
})
public class SalesPersonQuotaHistory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesPersonQuotaHistory> implements org.jooq.Record5<java.lang.Integer, java.sql.Timestamp, java.math.BigDecimal, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -979253808;

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.SalesPersonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesPersonQuotaHistory_SalesPerson_SalesPersonID
	 * FOREIGN KEY (SalesPersonID)
	 * REFERENCES Sales.SalesPerson (SalesPersonID)
	 * </pre></code>
	 */
	public void setSalesPersonID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesPersonID, value);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.SalesPersonID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_SalesPersonQuotaHistory_SalesPerson_SalesPersonID
	 * FOREIGN KEY (SalesPersonID)
	 * REFERENCES Sales.SalesPerson (SalesPersonID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "SalesPersonID", nullable = false, precision = 10)
	public java.lang.Integer getSalesPersonID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesPersonID);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.QuotaDate</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setQuotaDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.QuotaDate, value);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.QuotaDate</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Column(name = "QuotaDate", nullable = false)
	public java.sql.Timestamp getQuotaDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.QuotaDate);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.SalesQuota</code>
	 */
	public void setSalesQuota(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesQuota, value);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.SalesQuota</code>
	 */
	@javax.persistence.Column(name = "SalesQuota", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getSalesQuota() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesQuota);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.rowguid</code>
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.rowguid, value);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.rowguid</code>
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.rowguid);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.SalesPersonQuotaHistory.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.ModifiedDate);
	}

	/**
	 * Create a detached SalesPersonQuotaHistory
	 */
	public SalesPersonQuotaHistory() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.sql.Timestamp, java.math.BigDecimal, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.sql.Timestamp, java.math.BigDecimal, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesPersonID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.QuotaDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.SalesQuota;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesPersonQuotaHistory.SalesPersonQuotaHistory.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getSalesPersonID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getQuotaDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value3() {
		return getSalesQuota();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getrowguid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getModifiedDate();
	}
}
