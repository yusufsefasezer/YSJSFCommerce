package com.yusufsezer.entity;

import com.yusufsezer.contract.BaseEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Category extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;

    @ManyToOne
    private Category parentCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
