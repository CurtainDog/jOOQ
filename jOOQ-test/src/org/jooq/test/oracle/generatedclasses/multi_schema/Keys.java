/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the MULTI_SCHEMA schema
 */
@SuppressWarnings({"unchecked"})
public class Keys extends org.jooq.impl.AbstractKeys {

	// IDENTITY definitions

	// UNIQUE and PRIMARY KEY definitions
	public static final org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> PK_T_BOOK_SALE = createUniqueKey(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID);

	// FOREIGN KEY definitions
	public static final org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> FK_T_BOOK_TO_BOOK_STORE = createForeignKey(org.jooq.test.oracle.generatedclasses.test.Keys.PK_B2BS, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID);

	/**
	 * No instances
	 */
	private Keys() {}
}