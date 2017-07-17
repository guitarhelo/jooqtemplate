/*
 * This file is generated by jOOQ.
*/
package com.panshi.webtemplate.model.tables.records;


import com.panshi.webtemplate.model.tables.AuthorMappingBook;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorMappingBookRecord extends TableRecordImpl<AuthorMappingBookRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -410476326;

    /**
     * Setter for <code>jooqtemplate.author_mapping_book.authorid</code>.
     */
    public void setAuthorid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooqtemplate.author_mapping_book.authorid</code>.
     */
    public String getAuthorid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>jooqtemplate.author_mapping_book.bookid</code>.
     */
    public void setBookid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooqtemplate.author_mapping_book.bookid</code>.
     */
    public String getBookid() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AuthorMappingBook.AUTHOR_MAPPING_BOOK.AUTHORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AuthorMappingBook.AUTHOR_MAPPING_BOOK.BOOKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAuthorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBookid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorMappingBookRecord value1(String value) {
        setAuthorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorMappingBookRecord value2(String value) {
        setBookid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorMappingBookRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorMappingBookRecord
     */
    public AuthorMappingBookRecord() {
        super(AuthorMappingBook.AUTHOR_MAPPING_BOOK);
    }

    /**
     * Create a detached, initialised AuthorMappingBookRecord
     */
    public AuthorMappingBookRecord(String authorid, String bookid) {
        super(AuthorMappingBook.AUTHOR_MAPPING_BOOK);

        set(0, authorid);
        set(1, bookid);
    }
}