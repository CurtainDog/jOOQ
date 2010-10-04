/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.oracle.generatedclasses.OdsTest;
import org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBook extends TableImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TBookRecord> RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * The book ID
	 *
	 * PRIMARY KEY 'SYS_C0012923'
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>("ID", Integer.class, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 *
	 * FOREIGN KEY 'SYS_C0012919' [AUTHOR_ID] REFERENCES T_AUTHOR [ID]
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>("AUTHOR_ID", Integer.class, T_BOOK);

	/**
	 * The book's title
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>("TITLE", String.class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("T_BOOK", OdsTest.ODS_TEST);
	}
}
