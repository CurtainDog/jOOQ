/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class CustomerRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> implements org.jooq.Record9<java.lang.Short, java.lang.Byte, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Byte, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = 1850886201;

	/**
	 * Setter for <code>sakila.customer.customer_id</code>. 
	 */
	public void setCustomerId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID, value);
	}

	/**
	 * Getter for <code>sakila.customer.customer_id</code>. 
	 */
	public java.lang.Short getCustomerId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID);
	}

	/**
	 * Setter for <code>sakila.customer.store_id</code>. 
	 */
	public void setStoreId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.examples.mysql.sakila.tables.records.StoreRecord}
	 */
	public void setStoreId(org.jooq.examples.mysql.sakila.tables.records.StoreRecord value) {
		if (value == null) {
			setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID, null);
		}
		else {
			setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID, value.getValue(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID));
		}
	}

	/**
	 * Getter for <code>sakila.customer.store_id</code>. 
	 */
	public java.lang.Byte getStoreId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID);
	}

	/**
	 * Setter for <code>sakila.customer.first_name</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.FIRST_NAME, value);
	}

	/**
	 * Getter for <code>sakila.customer.first_name</code>. 
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.FIRST_NAME);
	}

	/**
	 * Setter for <code>sakila.customer.last_name</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_NAME, value);
	}

	/**
	 * Getter for <code>sakila.customer.last_name</code>. 
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_NAME);
	}

	/**
	 * Setter for <code>sakila.customer.email</code>. 
	 */
	public void setEmail(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.EMAIL, value);
	}

	/**
	 * Getter for <code>sakila.customer.email</code>. 
	 */
	public java.lang.String getEmail() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.EMAIL);
	}

	/**
	 * Setter for <code>sakila.customer.address_id</code>. 
	 */
	public void setAddressId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.examples.mysql.sakila.tables.records.AddressRecord}
	 */
	public void setAddressId(org.jooq.examples.mysql.sakila.tables.records.AddressRecord value) {
		if (value == null) {
			setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID, null);
		}
		else {
			setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID, value.getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID));
		}
	}

	/**
	 * Getter for <code>sakila.customer.address_id</code>. 
	 */
	public java.lang.Short getAddressId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID);
	}

	/**
	 * Setter for <code>sakila.customer.active</code>. 
	 */
	public void setActive(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ACTIVE, value);
	}

	/**
	 * Getter for <code>sakila.customer.active</code>. 
	 */
	public java.lang.Byte getActive() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ACTIVE);
	}

	/**
	 * Setter for <code>sakila.customer.create_date</code>. 
	 */
	public void setCreateDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CREATE_DATE, value);
	}

	/**
	 * Getter for <code>sakila.customer.create_date</code>. 
	 */
	public java.sql.Timestamp getCreateDate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CREATE_DATE);
	}

	/**
	 * Setter for <code>sakila.customer.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_UPDATE, value);
	}

	/**
	 * Getter for <code>sakila.customer.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_UPDATE);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>sakila.payment</code> referencing this <code>sakila.customer</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.PaymentRecord> fetchPaymentList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT)
			.where(org.jooq.examples.mysql.sakila.tables.Payment.PAYMENT.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * Fetch a list of <code>sakila.rental</code> referencing this <code>sakila.customer</code>
	 */
	public org.jooq.Result<org.jooq.examples.mysql.sakila.tables.records.RentalRecord> fetchRentalList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL)
			.where(org.jooq.examples.mysql.sakila.tables.Rental.RENTAL.CUSTOMER_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>sakila.store</code> referenced by this <code>sakila.customer</code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.StoreRecord fetchStore() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE.STORE_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>sakila.address</code> referenced by this <code>sakila.customer</code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.AddressRecord fetchAddress() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS)
			.where(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Short> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Short, java.lang.Byte, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Byte, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8(), field9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Short, java.lang.Byte, java.lang.String, java.lang.String, java.lang.String, java.lang.Short, java.lang.Byte, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8(), value9());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CUSTOMER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field2() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.STORE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field6() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field7() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ACTIVE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.CREATE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getCustomerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value2() {
		return getStoreId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value6() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value7() {
		return getActive();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getCreateDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getLastUpdate();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CustomerRecord
	 */
	public CustomerRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER);
	}
}
