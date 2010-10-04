/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;


import java.sql.Timestamp;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.information_schema.InformationSchema;
import org.jooq.util.mysql.information_schema.tables.records.TablesRecord;


/**
 * This class is generated by jOOQ.
 */
public class Tables extends TableImpl<TablesRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of TABLES
	 */
	public static final Tables TABLES = new Tables();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TablesRecord> RECORD_TYPE = TablesRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TablesRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_CATALOG = new TableFieldImpl<TablesRecord, String>("TABLE_CATALOG", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_SCHEMA = new TableFieldImpl<TablesRecord, String>("TABLE_SCHEMA", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_NAME = new TableFieldImpl<TablesRecord, String>("TABLE_NAME", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_TYPE = new TableFieldImpl<TablesRecord, String>("TABLE_TYPE", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> ENGINE = new TableFieldImpl<TablesRecord, String>("ENGINE", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> VERSION = new TableFieldImpl<TablesRecord, Integer>("VERSION", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> ROW_FORMAT = new TableFieldImpl<TablesRecord, String>("ROW_FORMAT", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> TABLE_ROWS = new TableFieldImpl<TablesRecord, Integer>("TABLE_ROWS", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> AVG_ROW_LENGTH = new TableFieldImpl<TablesRecord, Integer>("AVG_ROW_LENGTH", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> DATA_LENGTH = new TableFieldImpl<TablesRecord, Integer>("DATA_LENGTH", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> MAX_DATA_LENGTH = new TableFieldImpl<TablesRecord, Integer>("MAX_DATA_LENGTH", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> INDEX_LENGTH = new TableFieldImpl<TablesRecord, Integer>("INDEX_LENGTH", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> DATA_FREE = new TableFieldImpl<TablesRecord, Integer>("DATA_FREE", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> AUTO_INCREMENT = new TableFieldImpl<TablesRecord, Integer>("AUTO_INCREMENT", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Timestamp> CREATE_TIME = new TableFieldImpl<TablesRecord, Timestamp>("CREATE_TIME", Timestamp.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Timestamp> UPDATE_TIME = new TableFieldImpl<TablesRecord, Timestamp>("UPDATE_TIME", Timestamp.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Timestamp> CHECK_TIME = new TableFieldImpl<TablesRecord, Timestamp>("CHECK_TIME", Timestamp.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_COLLATION = new TableFieldImpl<TablesRecord, String>("TABLE_COLLATION", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, Integer> CHECKSUM = new TableFieldImpl<TablesRecord, Integer>("CHECKSUM", Integer.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> CREATE_OPTIONS = new TableFieldImpl<TablesRecord, String>("CREATE_OPTIONS", String.class, TABLES);

	/**
	 * An uncommented item
	 */
	public static final TableField<TablesRecord, String> TABLE_COMMENT = new TableFieldImpl<TablesRecord, String>("TABLE_COMMENT", String.class, TABLES);

	/**
	 * No further instances allowed
	 */
	private Tables() {
		super("TABLES", InformationSchema.INFORMATION_SCHEMA);
	}

}
