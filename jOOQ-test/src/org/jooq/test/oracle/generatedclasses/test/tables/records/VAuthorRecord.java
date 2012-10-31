/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR", schema = "TEST")
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.VAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = -406108751;

	/**
	 * The table column <code>TEST.V_AUTHOR.ID</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ID, value);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.ID</code>
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ID);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.FIRST_NAME</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.FIRST_NAME</code>
	 */
	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.FIRST_NAME);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.LAST_NAME</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.LAST_NAME, value);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.LAST_NAME</code>
	 */
	@javax.persistence.Column(name = "LAST_NAME", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.LAST_NAME);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 7)
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH", precision = 7)
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.ADDRESS</code>
	 */
	public void setAddress(org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ADDRESS, value);
	}

	/**
	 * The table column <code>TEST.V_AUTHOR.ADDRESS</code>
	 */
	@javax.persistence.Column(name = "ADDRESS", length = 40)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord getAddress() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> field6() {
		return org.jooq.test.oracle.generatedclasses.test.tables.VAuthor.V_AUTHOR.ADDRESS;
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
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord value6() {
		return getAddress();
	}
}
