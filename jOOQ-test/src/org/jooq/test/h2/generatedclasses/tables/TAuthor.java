/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
@java.lang.SuppressWarnings("all")
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 297670319;

	/**
	 * The singleton instance of <code>PUBLIC.T_AUTHOR</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.h2.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_AUTHOR.ID</code>. The author ID
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>. The author's first name
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>PUBLIC.T_AUTHOR.LAST_NAME</code>. The author's last name
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>. The author's date of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * The column <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>. The author's year of birth
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>PUBLIC.T_AUTHOR.ADDRESS</code>. The author's address
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("T_AUTHOR", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord> getMainKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_AUTHOR);
	}
}
