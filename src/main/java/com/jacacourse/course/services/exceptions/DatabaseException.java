package com.jacacourse.course.services.exceptions;

import org.springframework.dao.DataAccessException;

public class DatabaseException extends  RuntimeException{
    private static final long serialVersionUID = 1L;

    public DatabaseException(String msg){
        super(msg);
    }
}
