package org.java.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Dept implements Serializable {
    private Long dept_no;
    private String d_name;
    private String db_source;
    public Dept(String db_source){
        this.db_source = db_source;
    }
}
