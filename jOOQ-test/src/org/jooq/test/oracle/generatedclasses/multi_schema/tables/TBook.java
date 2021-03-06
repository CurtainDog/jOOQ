/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> {

	private static final long serialVersionUID = 637304822;

	/**
	 * The singleton instance of <code>MULTI_SCHEMA.T_BOOK</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook T_BOOK = new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.AUTHOR_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.DETAILS_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.TITLE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.PUBLISHED_IN</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.LANGUAGE_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.CONTENT_TEXT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_BOOK.CONTENT_PDF</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>MULTI_SCHEMA.T_BOOK</code> table reference
	 */
	public TBook() {
		super("T_BOOK", org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA);
	}

	/**
	 * Create an aliased <code>MULTI_SCHEMA.T_BOOK</code> table reference
	 */
	public TBook(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord>>asList(org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookRecord, ?>>asList(org.jooq.test.oracle.generatedclasses.multi_schema.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.oracle.generatedclasses.multi_schema.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.oracle.generatedclasses.multi_schema.Keys.FK_T_BOOK_LANGUAGE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook(alias);
	}
}
