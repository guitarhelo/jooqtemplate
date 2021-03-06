/*
 * This file is generated by jOOQ.
*/
package com.panshi.webtemplate.model;


import com.panshi.webtemplate.model.tables.Author;
import com.panshi.webtemplate.model.tables.Book;
import com.panshi.webtemplate.model.tables.Comments;
import com.panshi.webtemplate.model.tables.Posts;
import com.panshi.webtemplate.model.tables.records.AuthorRecord;
import com.panshi.webtemplate.model.tables.records.BookRecord;
import com.panshi.webtemplate.model.tables.records.CommentsRecord;
import com.panshi.webtemplate.model.tables.records.PostsRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>jooqtemplate</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = Identities0.IDENTITY_AUTHOR;
    public static final Identity<BookRecord, Integer> IDENTITY_BOOK = Identities0.IDENTITY_BOOK;
    public static final Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = Identities0.IDENTITY_COMMENTS;
    public static final Identity<PostsRecord, Integer> IDENTITY_POSTS = Identities0.IDENTITY_POSTS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
    public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
    public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = UniqueKeys0.KEY_COMMENTS_PRIMARY;
    public static final UniqueKey<PostsRecord> KEY_POSTS_PRIMARY = UniqueKeys0.KEY_POSTS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CommentsRecord, PostsRecord> COMMENTS_IBFK_1 = ForeignKeys0.COMMENTS_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = createIdentity(Author.AUTHOR, Author.AUTHOR.ID);
        public static Identity<BookRecord, Integer> IDENTITY_BOOK = createIdentity(Book.BOOK, Book.BOOK.ID);
        public static Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = createIdentity(Comments.COMMENTS, Comments.COMMENTS.ID);
        public static Identity<PostsRecord, Integer> IDENTITY_POSTS = createIdentity(Posts.POSTS, Posts.POSTS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = createUniqueKey(Author.AUTHOR, "KEY_author_PRIMARY", Author.AUTHOR.ID);
        public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = createUniqueKey(Book.BOOK, "KEY_book_PRIMARY", Book.BOOK.ID);
        public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = createUniqueKey(Comments.COMMENTS, "KEY_comments_PRIMARY", Comments.COMMENTS.ID);
        public static final UniqueKey<PostsRecord> KEY_POSTS_PRIMARY = createUniqueKey(Posts.POSTS, "KEY_posts_PRIMARY", Posts.POSTS.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<CommentsRecord, PostsRecord> COMMENTS_IBFK_1 = createForeignKey(com.panshi.webtemplate.model.Keys.KEY_POSTS_PRIMARY, Comments.COMMENTS, "comments_ibfk_1", Comments.COMMENTS.POST_ID);
    }
}
