/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_AUTHOR", schema = "TEST")
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = -1316510300;

	/**
	 * The author ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID, value);
	}

	/**
	 * The author ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID);
	}

	/**
	 * The author ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> fetchTBookListByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.AUTHOR_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * The author ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> fetchTBookListByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.CO_AUTHOR_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * The author's first name
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * The author's first name
	 */
	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.FIRST_NAME);
	}

	/**
	 * The author's last name
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.LAST_NAME, value);
	}

	/**
	 * The author's last name
	 */
	@javax.persistence.Column(name = "LAST_NAME", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.LAST_NAME);
	}

	/**
	 * The author's date of birth
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * The author's date of birth
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 7)
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * The author's year of birth
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * The author's year of birth
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH", precision = 7)
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * The author's address
	 */
	public void setAddress(org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ADDRESS, value);
	}

	/**
	 * The author's address
	 */
	@javax.persistence.Column(name = "ADDRESS", length = 1)
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord getAddress() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR);
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
		return org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> field6() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TAuthor.T_AUTHOR.ADDRESS;
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
