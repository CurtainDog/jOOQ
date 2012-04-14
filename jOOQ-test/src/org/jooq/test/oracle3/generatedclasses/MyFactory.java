/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
public class MyFactory extends org.jooq.util.oracle.OracleFactory implements java.lang.Cloneable {

	private static final long serialVersionUID = 684536071;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public MyFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #MyFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public MyFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public MyFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}