/**
 * Copyright (c) 2009-2013, Lukas Eder, lukas.eder@gmail.com
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

import java.sql.Connection;

import org.jooq.exception.DataAccessException;

/**
 * A connection lifecycle handler API
 * <p>
 * The <code>ConnectionProvider</code> allows for abstracting the handling of
 * custom <code>Connection</code> lifecycles outside of jOOQ, injecting
 * behaviour into jOOQ's internals. jOOQ will try to get a new JDBC
 * {@link Connection} from the connection provider as early as needed, and will
 * return it as early as possible.
 *
 * @author Aaron Digulla
 * @author Lukas Eder
 */
public interface ConnectionProvider {

    /**
     * Acquire a connection from the connection lifecycle handler
     * <p>
     * The general contract is that a <code>ConnectionProvider</code> is
     * expected to always return the same connection, until this connection is
     * returned by jOOQ through {@link #release(Connection)}.
     *
     * @throws DataAccessException If anything went wrong while acquiring a
     *             connection
     */
    Connection acquire() throws DataAccessException;

    /**
     * Release a connection to the connection lifecycle handler
     * <p>
     * The general contract is that a <code>ConnectionProvider</code> must not
     * generate a new connection in {@link #acquire()}, before a previous
     * connection is returned.
     *
     * @throws DataAccessException If anything went wrong while releasing a
     *             connection
     */
    void release(Connection connection) throws DataAccessException;
}
