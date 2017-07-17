package com.panshi.webtemplate.service.impl;

/**
 * Created by panjingping on 7/17/2017.
 */
import com.panshi.webtemplate.model.tables.Author;
import static com.panshi.webtemplate.model.tables.Author.AUTHOR;

import com.panshi.webtemplate.model.tables.records.AuthorRecord;
import com.panshi.webtemplate.service.AuthorService;
import org.jooq.DSLContext;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;



/**

 * @author Lukas Eder

 */

public class DefaultAuthorService implements AuthorService {

    private static Logger logger = LoggerFactory.getLogger(DefaultAuthorService.class);

    @Autowired

    DSLContext dsl;



    @Override

    @Transactional

    public AuthorRecord create(AuthorRecord author){
        AuthorRecord authorRecord = dsl.insertInto(AUTHOR)
                .set(AUTHOR.FIRST_NAME, author.getFirstName())
                .set(AUTHOR.LAST_NAME,author.getLastName())
                .returning(AUTHOR.ID)
                .fetchOne();

        author.setId(authorRecord.getId());
        return author;
    }



}