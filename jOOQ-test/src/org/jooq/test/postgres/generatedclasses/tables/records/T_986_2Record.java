/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class T_986_2Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = -352581647;

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_986_2.ref, public.t_986_2.ref]
	 * REFERENCES x_unused [public.x_unused.id]
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2.REF, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_986_2.ref, public.t_986_2.ref]
	 * REFERENCES x_unused [public.x_unused.id]
	 * </pre></code>
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2.REF);
	}

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_986_2.T_986_2);
	}
}