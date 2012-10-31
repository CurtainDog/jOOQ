/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "Department", schema = "HumanResources")
public class Department extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.Department> implements org.jooq.Record4<java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 2077375349;

	/**
	 * The table column <code>HumanResources.Department.DepartmentID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setDepartmentID(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.DepartmentID, value);
	}

	/**
	 * The table column <code>HumanResources.Department.DepartmentID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "DepartmentID", unique = true, nullable = false, precision = 5)
	public java.lang.Short getDepartmentID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.DepartmentID);
	}

	/**
	 * The table column <code>HumanResources.Department.Name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.Name, value);
	}

	/**
	 * The table column <code>HumanResources.Department.Name</code>
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.Name);
	}

	/**
	 * The table column <code>HumanResources.Department.GroupName</code>
	 */
	public void setGroupName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.GroupName, value);
	}

	/**
	 * The table column <code>HumanResources.Department.GroupName</code>
	 */
	@javax.persistence.Column(name = "GroupName", nullable = false, length = 50)
	public java.lang.String getGroupName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.GroupName);
	}

	/**
	 * The table column <code>HumanResources.Department.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.ModifiedDate, value);
	}

	/**
	 * The table column <code>HumanResources.Department.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.ModifiedDate);
	}

	/**
	 * Create a detached Department
	 */
	public Department() {
		super(org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.DepartmentID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.Name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.GroupName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.Department.Department.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getDepartmentID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getGroupName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getModifiedDate();
	}
}
