/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ProductCostHistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory> {

	private static final long serialVersionUID = 1823483541;

	/**
	 * The singleton instance of <code>Production.ProductCostHistory</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCostHistory ProductCostHistory = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCostHistory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory.class;
	}

	/**
	 * The column <code>Production.ProductCostHistory.ProductID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.ProductCostHistory.StartDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory, java.sql.Timestamp> StartDate = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.ProductCostHistory.EndDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory, java.sql.Timestamp> EndDate = createField("EndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Production.ProductCostHistory.StandardCost</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory, java.math.BigDecimal> StandardCost = createField("StandardCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>Production.ProductCostHistory.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.ProductCostHistory</code> table reference
	 */
	public ProductCostHistory() {
		super("ProductCostHistory", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.ProductCostHistory</code> table reference
	 */
	public ProductCostHistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCostHistory.ProductCostHistory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductCostHistory_ProductID_StartDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductCostHistory_ProductID_StartDate);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductCostHistory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductCostHistory_Product_ProductID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCostHistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductCostHistory(alias);
	}
}
