/*
 * This file is generated by jOOQ.
*/
package com.panshi.webtemplate.model.tables;


import com.panshi.webtemplate.model.Jooqtemplate;
import com.panshi.webtemplate.model.tables.records.AuthorMappingBookRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class AuthorMappingBook extends TableImpl<AuthorMappingBookRecord> {

    private static final long serialVersionUID = -1674701246;

    /**
     * The reference instance of <code>jooqtemplate.author_mapping_book</code>
     */
    public static final AuthorMappingBook AUTHOR_MAPPING_BOOK = new AuthorMappingBook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuthorMappingBookRecord> getRecordType() {
        return AuthorMappingBookRecord.class;
    }

    /**
     * The column <code>jooqtemplate.author_mapping_book.authorid</code>.
     */
    public final TableField<AuthorMappingBookRecord, String> AUTHORID = createField("authorid", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>jooqtemplate.author_mapping_book.bookid</code>.
     */
    public final TableField<AuthorMappingBookRecord, String> BOOKID = createField("bookid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>jooqtemplate.author_mapping_book</code> table reference
     */
    public AuthorMappingBook() {
        this("author_mapping_book", null);
    }

    /**
     * Create an aliased <code>jooqtemplate.author_mapping_book</code> table reference
     */
    public AuthorMappingBook(String alias) {
        this(alias, AUTHOR_MAPPING_BOOK);
    }

    private AuthorMappingBook(String alias, Table<AuthorMappingBookRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuthorMappingBook(String alias, Table<AuthorMappingBookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jooqtemplate.JOOQTEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorMappingBook as(String alias) {
        return new AuthorMappingBook(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuthorMappingBook rename(String name) {
        return new AuthorMappingBook(name, null);
    }
}