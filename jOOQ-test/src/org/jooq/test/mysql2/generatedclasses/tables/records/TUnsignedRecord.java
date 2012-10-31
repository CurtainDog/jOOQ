/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_unsigned", schema = "test2")
public class TUnsignedRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TUnsignedRecord> implements org.jooq.Record4<org.jooq.types.UByte, org.jooq.types.UShort, org.jooq.types.UInteger, org.jooq.types.ULong> {

	private static final long serialVersionUID = 2143287215;

	/**
	 * The table column <code>test2.t_unsigned.u_byte</code>
	 */
	public void setUByte(org.jooq.types.UByte value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_BYTE, value);
	}

	/**
	 * The table column <code>test2.t_unsigned.u_byte</code>
	 */
	@javax.persistence.Column(name = "u_byte", precision = 3)
	public org.jooq.types.UByte getUByte() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_BYTE);
	}

	/**
	 * The table column <code>test2.t_unsigned.u_short</code>
	 */
	public void setUShort(org.jooq.types.UShort value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_SHORT, value);
	}

	/**
	 * The table column <code>test2.t_unsigned.u_short</code>
	 */
	@javax.persistence.Column(name = "u_short", precision = 5)
	public org.jooq.types.UShort getUShort() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_SHORT);
	}

	/**
	 * The table column <code>test2.t_unsigned.u_int</code>
	 */
	public void setUInt(org.jooq.types.UInteger value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_INT, value);
	}

	/**
	 * The table column <code>test2.t_unsigned.u_int</code>
	 */
	@javax.persistence.Column(name = "u_int", precision = 10)
	public org.jooq.types.UInteger getUInt() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_INT);
	}

	/**
	 * The table column <code>test2.t_unsigned.u_long</code>
	 */
	public void setULong(org.jooq.types.ULong value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_LONG, value);
	}

	/**
	 * The table column <code>test2.t_unsigned.u_long</code>
	 */
	@javax.persistence.Column(name = "u_long", precision = 20)
	public org.jooq.types.ULong getULong() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_LONG);
	}

	/**
	 * Create a detached TUnsignedRecord
	 */
	public TUnsignedRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<org.jooq.types.UByte, org.jooq.types.UShort, org.jooq.types.UInteger, org.jooq.types.ULong> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<org.jooq.types.UByte, org.jooq.types.UShort, org.jooq.types.UInteger, org.jooq.types.ULong> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UByte> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_BYTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UShort> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_SHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.ULong> field4() {
		return org.jooq.test.mysql2.generatedclasses.tables.TUnsigned.T_UNSIGNED.U_LONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UByte value1() {
		return getUByte();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UShort value2() {
		return getUShort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value3() {
		return getUInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.ULong value4() {
		return getULong();
	}
}
