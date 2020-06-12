package com.aladin.webproxyserver.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Nguyen Manh Ha on 5/28/2020.
 */
@Entity
@Table(name = "urls")
public class URLS {
    @Id
    @Column
    private String name;

    @Column
    private boolean connection;

    @Column
    private short statusCode;

    @Column
    private String Content_Type;

    public URLS() {}

    public URLS(String name, boolean connection, short statusCode, String Content_Type) {
        this.name = name;
        this.connection = connection;
        this.statusCode = statusCode;
        this.Content_Type = Content_Type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean getConnection() {
        return connection;
    }
    public void setConnection(boolean connection) {
        this.connection = connection;
    }
    public short getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(short statusCode) {
        this.statusCode = statusCode;
    }
    public String getContent_Type() {
        return Content_Type;
    }
    public void setContent_Type(String Content_Type) {
        this.Content_Type = Content_Type;
    }

}
