package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "area_info")
public class Area_info {
    @Id
    @Column
    private Integer area_id;
    @Column
    private String area_name;

    @Override
    public String toString() {
        return "Area_info{" +
                "area_id=" + area_id +
                ", area_name='" + area_name + '\'' +
                '}';
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }
}
