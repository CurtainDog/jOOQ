/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_639_numbers_table", schema = "test2")
public class T_639NumbersTable implements java.io.Serializable {

	private static final long serialVersionUID = -595805992;

	private java.lang.Integer    id;
	private java.lang.Byte       byte_;
	private java.lang.Short      short_;
	private java.lang.Integer    integer;
	private java.lang.Long       long_;
	private java.lang.Byte       byteDecimal;
	private java.lang.Short      shortDecimal;
	private java.lang.Integer    integerDecimal;
	private java.lang.Long       longDecimal;
	private java.math.BigInteger bigInteger;
	private java.math.BigDecimal bigDecimal;
	private java.lang.Double     float_;
	private java.lang.Double     double_;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "BYTE", precision = 3)
	public java.lang.Byte getByte() {
		return this.byte_;
	}

	public void setByte(java.lang.Byte byte_) {
		this.byte_ = byte_;
	}

	@javax.persistence.Column(name = "SHORT", precision = 5)
	public java.lang.Short getShort() {
		return this.short_;
	}

	public void setShort(java.lang.Short short_) {
		this.short_ = short_;
	}

	@javax.persistence.Column(name = "INTEGER", precision = 10)
	public java.lang.Integer getInteger() {
		return this.integer;
	}

	public void setInteger(java.lang.Integer integer) {
		this.integer = integer;
	}

	@javax.persistence.Column(name = "LONG", precision = 19)
	public java.lang.Long getLong() {
		return this.long_;
	}

	public void setLong(java.lang.Long long_) {
		this.long_ = long_;
	}

	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	public java.lang.Byte getByteDecimal() {
		return this.byteDecimal;
	}

	public void setByteDecimal(java.lang.Byte byteDecimal) {
		this.byteDecimal = byteDecimal;
	}

	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	public java.lang.Short getShortDecimal() {
		return this.shortDecimal;
	}

	public void setShortDecimal(java.lang.Short shortDecimal) {
		this.shortDecimal = shortDecimal;
	}

	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	public java.lang.Integer getIntegerDecimal() {
		return this.integerDecimal;
	}

	public void setIntegerDecimal(java.lang.Integer integerDecimal) {
		this.integerDecimal = integerDecimal;
	}

	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	public java.lang.Long getLongDecimal() {
		return this.longDecimal;
	}

	public void setLongDecimal(java.lang.Long longDecimal) {
		this.longDecimal = longDecimal;
	}

	@javax.persistence.Column(name = "BIG_INTEGER", precision = 22)
	public java.math.BigInteger getBigInteger() {
		return this.bigInteger;
	}

	public void setBigInteger(java.math.BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}

	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	public java.math.BigDecimal getBigDecimal() {
		return this.bigDecimal;
	}

	public void setBigDecimal(java.math.BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	@javax.persistence.Column(name = "FLOAT", precision = 12)
	public java.lang.Double getFloat() {
		return this.float_;
	}

	public void setFloat(java.lang.Double float_) {
		this.float_ = float_;
	}

	@javax.persistence.Column(name = "DOUBLE", precision = 22)
	public java.lang.Double getDouble() {
		return this.double_;
	}

	public void setDouble(java.lang.Double double_) {
		this.double_ = double_;
	}
}
