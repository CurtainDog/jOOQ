/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "StoreContact", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"CustomerID", "ContactID"})
})
public class StoreContact extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.StoreContact> {

	private static final long serialVersionUID = 1502393870;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_Store_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Store (CustomerID)
	 * </pre></code>
	 */
	public void setCustomerID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.CustomerID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_Store_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Store (CustomerID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "CustomerID", nullable = false)
	public java.lang.Integer getCustomerID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.CustomerID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_Contact_ContactID
	 * FOREIGN KEY (ContactID)
	 * REFERENCES Person.Contact (ContactID)
	 * </pre></code>
	 */
	public void setContactID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_Contact_ContactID
	 * FOREIGN KEY (ContactID)
	 * REFERENCES Person.Contact (ContactID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ContactID", nullable = false)
	public java.lang.Integer getContactID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_ContactType_ContactTypeID
	 * FOREIGN KEY (ContactTypeID)
	 * REFERENCES Person.ContactType (ContactTypeID)
	 * </pre></code>
	 */
	public void setContactTypeID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactTypeID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_StoreContact_ContactType_ContactTypeID
	 * FOREIGN KEY (ContactTypeID)
	 * REFERENCES Person.ContactType (ContactTypeID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ContactTypeID", nullable = false)
	public java.lang.Integer getContactTypeID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ContactTypeID);
	}

	/**
	 * An uncommented item
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.rowguid, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.rowguid);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.StoreContact.StoreContact.ModifiedDate, value);
	}

	/**
	 * An uncommented item
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
}