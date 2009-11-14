/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq.impl;

import static org.jooq.impl.TrueCondition.TRUE_CONDITION;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jooq.CombinedCondition;
import org.jooq.Condition;
import org.jooq.Operator;

/**
 * @author Lukas Eder
 */
class CombinedConditionImpl extends AbstractQueryPart implements CombinedCondition {

	private static final long serialVersionUID = -7373293246207052549L;

	private final Operator operator;
	private final List<Condition> conditions;

	public CombinedConditionImpl(Operator operator, Collection<Condition> conditions) {
		if (operator == null)
			throw new IllegalArgumentException("The argument 'operator' must not be null");
		if (conditions == null)
			throw new IllegalArgumentException("The argument 'conditions' must not be null");
		for (Condition condition : conditions) {
			if (condition == null) {
				throw new IllegalArgumentException("The argument 'conditions' must contain null");
			}
		}
		
		
		this.operator = operator;
		this.conditions = new ArrayList<Condition>(conditions);
	}

	@Override
	public int bind(PreparedStatement stmt, int initialIndex) throws SQLException {
		int result = initialIndex;
		
		for (Condition condition : getConditions()) {
			result = condition.bind(stmt, result);
		}
		
		return result;
	}

	@Override
	public List<Condition> getConditions() {
		return conditions;
	}

	@Override
	public Operator getOperator() {
		return operator;
	}

	@Override
	public String toSQLReference(boolean inlineParameters) {
		if (getConditions().isEmpty()) {
			return TRUE_CONDITION.toSQLReference(inlineParameters);
		}

		if (getConditions().size() == 1) {
			return conditions.get(0).toSQLReference(inlineParameters);
		}

		StringBuilder sb = new StringBuilder();
		String operator = " " + getOperator().name().toLowerCase() + " ";
		String separator = "";

		sb.append("(");
		for (Condition condition : getConditions()) {
			sb.append(separator);
			sb.append(condition.toSQLReference(inlineParameters));
			separator = operator;
		}
		sb.append(")");

		return sb.toString();
	}
}
