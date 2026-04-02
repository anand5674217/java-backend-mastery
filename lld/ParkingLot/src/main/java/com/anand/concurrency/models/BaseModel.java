package com.anand.concurrency.models;

import java.util.Date;

public class BaseModel {

    private long id;
    private Date createdAt;
    private Date updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return copy(createdAt);
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = copy(createdAt);
    }

    public Date getUpdatedAt() {
        return copy(updatedAt);
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = copy(updatedAt);
    }

    private Date copy(Date value) {
        return value == null ? null : new Date(value.getTime());
    }
}
