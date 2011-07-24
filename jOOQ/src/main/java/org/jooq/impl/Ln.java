/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
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
 * . Neither the name "jOOQ" nor the names of its contributors may be
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

import java.math.BigDecimal;

import org.jooq.Configuration;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
class Ln extends AbstractFunction<BigDecimal> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -7273879239726265322L;

    private final Field<?>    argument;
    private final Integer     base;

    Ln(Field<?> argument) {
        this(argument, null);
    }

    Ln(Field<?> argument, Integer base) {
        super("ln", SQLDataType.NUMERIC, argument);

        this.argument = argument;
        this.base = base;
    }

    @Override
    final Field<BigDecimal> getFunction0(Configuration configuration) {
        if (base == null) {
            switch (configuration.getDialect()) {
                case H2:
                case SQLSERVER:
                    return new Function<BigDecimal>("log", SQLDataType.NUMERIC, argument);

                default:
                    return new Function<BigDecimal>("ln", SQLDataType.NUMERIC, argument);
            }
        }
        else {
            Field<Integer> baseField = create(configuration).literal(base);

            switch (configuration.getDialect()) {
                case DB2:       // No break
                case DERBY:     // No break
                case H2:        // No break
                case HSQLDB:    // No break
                case INGRES:    // No break
                case SQLSERVER: // No break
                case SYBASE:
                    return argument.ln().div(baseField.ln());

                default:
                    return new Function<BigDecimal>("log", SQLDataType.NUMERIC, baseField, argument);
            }
        }
    }
}
