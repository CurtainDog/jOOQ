/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class NicerButSlowerFilmListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.NicerButSlowerFilmListRecord> implements org.jooq.Record8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.Short, org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating, java.lang.String> {

	private static final long serialVersionUID = 489196445;

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.FID</code>
	 */
	public void setFid(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.FID, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.FID</code>
	 */
	public java.lang.Short getFid() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.FID);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.title</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.TITLE, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.title</code>
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.TITLE);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.description</code>
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.DESCRIPTION, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.description</code>
	 */
	public java.lang.String getDescription() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.DESCRIPTION);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.category</code>
	 */
	public void setCategory(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.CATEGORY, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.category</code>
	 */
	public java.lang.String getCategory() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.CATEGORY);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.price</code>
	 */
	public void setPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.PRICE, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.price</code>
	 */
	public java.math.BigDecimal getPrice() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.PRICE);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.length</code>
	 */
	public void setLength(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.LENGTH, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.length</code>
	 */
	public java.lang.Short getLength() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.LENGTH);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.rating</code>
	 */
	public void setRating(org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.RATING, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.rating</code>
	 */
	public org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating getRating() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.RATING);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.actors</code>
	 */
	public void setActors(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.ACTORS, value);
	}

	/**
	 * The table column <code>sakila.nicer_but_slower_film_list.actors</code>
	 */
	public java.lang.String getActors() {
		return getValue(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.ACTORS);
	}

	/**
	 * Create a detached NicerButSlowerFilmListRecord
	 */
	public NicerButSlowerFilmListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.Short, org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6(), field7(), field8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Short, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.Short, org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6(), value7(), value8());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.FID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.PRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field6() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.LENGTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating> field7() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.jooq.examples.mysql.sakila.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST.ACTORS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getFid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCategory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getPrice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value6() {
		return getLength();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.enums.NicerButSlowerFilmListRating value7() {
		return getRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getActors();
	}
}
