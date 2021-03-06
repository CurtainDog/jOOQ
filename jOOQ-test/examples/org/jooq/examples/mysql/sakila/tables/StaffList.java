/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class StaffList extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord> {

	private static final long serialVersionUID = 2144497557;

	/**
	 * The singleton instance of <code>sakila.staff_list</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.StaffList STAFF_LIST = new org.jooq.examples.mysql.sakila.tables.StaffList();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.StaffListRecord.class;
	}

	/**
	 * The column <code>sakila.staff_list.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.Byte> ID = createField("ID", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.staff_list.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.staff_list.address</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.staff_list.zip code</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> ZIP_CODE = createField("zip code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.staff_list.phone</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.staff_list.city</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.staff_list.country</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.String> COUNTRY = createField("country", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>sakila.staff_list.SID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord, java.lang.Byte> SID = createField("SID", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * Create a <code>sakila.staff_list</code> table reference
	 */
	public StaffList() {
		super("staff_list", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.staff_list</code> table reference
	 */
	public StaffList(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.StaffList as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.StaffList(alias);
	}
}
