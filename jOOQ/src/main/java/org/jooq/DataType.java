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
package org.jooq;

import java.io.Serializable;
import java.sql.Types;

/**
 * A common interface to all dialect-specific data types
 *
 * @param <T> The Java type associated with this SQL data type
 * @author Lukas Eder
 */
public interface DataType<T> extends Serializable {

    /**
     * Get JDBC {@link Types} value
     */
    int getSQLType();

    /**
     * Retrieve the Java type associated with this data type
     */
    Class<? extends T> getType();

    /**
     * Retrieve a Java type associated with this data type and precision/scale
     */
    Class<?> getType(int precision, int scale);

    /**
     * Retrieve the Java type associated with ARRAYs of this data type
     */
    Class<? extends T[]> getArrayType();

    /**
     * Retrieve the data type for an ARRAY of this data type
     */
    DataType<T[]> getArrayDataType();

    /**
     * Retrieve the data type for an Oracle-style ARRAY of this data type
     */
    <A extends ArrayRecord<T>> DataType<A> asArrayDataType(Class<A> arrayDataType);

    /**
     * Retrieve the data type for a given master data type
     */
    <M extends MasterDataType<T>> DataType<M> asMasterDataType(Class<M> masterDataType);

    /**
     * Retrieve the data type for a given enum data type
     */
    <E extends EnumType> DataType<E> asEnumDataType(Class<E> enumDataType);

    /**
     * Retrieve the precise numeric data type for a given NUMBER type
     */
    <N extends Number> DataType<N> asNumberDataType(Class<N> numberDataType);

    /**
     * Retrieve the dialect-specific type name associated with this data type
     */
    String getTypeName();

    /**
     * Retrieve the dialect-specific type name associated with this data type
     * used for casting
     * <p>
     * This is useful for some dialects that have specialised type names for
     * cast expressions. Other dialects require type-length binding when
     * casting, (e.g. VARCHAR(32767))
     */
    String getCastTypeName();

    /**
     * Retrieve the dialect-specific type name associated with ARRAYs of this
     * data type
     */
    String getArrayTypeName();

    /**
     * Retrieve the underlying {@link SQLDialect}
     */
    SQLDialect getDialect();

    /**
     * Convert an arbitrary object into <code>&lt;T&gt;</code>
     *
     * @param object The object to be converted
     * @return The converted object
     * @throws RuntimeException An undisclosed unchecked exception, if
     *             conversion fails.
     */
    T convert(Object object);
}
