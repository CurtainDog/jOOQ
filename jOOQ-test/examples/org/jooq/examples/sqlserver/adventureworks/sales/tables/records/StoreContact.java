/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "StoreContact", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CustomerID", "ContactID"})
})
public class StoreContact extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 324947528;

	/**
	 * The table column <code>Sales.StoreContact.CustomerID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_StoreContact_Store_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Store (CustomerID)
	 * </pre></code>
	 */
	public void setCustomerID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.CustomerID, value);
	}

	/**
	 * The table column <code>Sales.StoreContact.CustomerID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_StoreContact_Store_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Store (CustomerID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CustomerID", nullable = false, precision = 10)
	public java.lang.Integer getCustomerID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.CustomerID);
	}

	/**
	 * The table column <code>Sales.StoreContact.ContactID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_StoreContact_Contact_ContactID
	 * FOREIGN KEY (ContactID)
	 * REFERENCES Person.Contact (ContactID)
	 * </pre></code>
	 */
	public void setContactID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactID, value);
	}

	/**
	 * The table column <code>Sales.StoreContact.ContactID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_StoreContact_Contact_ContactID
	 * FOREIGN KEY (ContactID)
	 * REFERENCES Person.Contact (ContactID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ContactID", nullable = false, precision = 10)
	public java.lang.Integer getContactID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactID);
	}

	/**
	 * The table column <code>Sales.StoreContact.ContactTypeID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_StoreContact_ContactType_ContactTypeID
	 * FOREIGN KEY (ContactTypeID)
	 * REFERENCES Person.ContactType (ContactTypeID)
	 * </pre></code>
	 */
	public void setContactTypeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactTypeID, value);
	}

	/**
	 * The table column <code>Sales.StoreContact.ContactTypeID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_StoreContact_ContactType_ContactTypeID
	 * FOREIGN KEY (ContactTypeID)
	 * REFERENCES Person.ContactType (ContactTypeID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ContactTypeID", nullable = false, precision = 10)
	public java.lang.Integer getContactTypeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactTypeID);
	}

	/**
	 * The table column <code>Sales.StoreContact.rowguid</code>
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.rowguid, value);
	}

	/**
	 * The table column <code>Sales.StoreContact.rowguid</code>
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.rowguid);
	}

	/**
	 * The table column <code>Sales.StoreContact.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.StoreContact.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ModifiedDate);
	}

	/**
	 * Create a detached StoreContact
	 */
	public StoreContact() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.CustomerID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactTypeID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getCustomerID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getContactID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getContactTypeID();
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
