package com.zenith.studystu.dto;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Setter
@Component
public class studto implements Serializable {
    private static final long serialVersionUID = -6556793741331167103L;

    private teacher t;
    @Value("${id}")
    private int stuid;
    private String stuname;
    private int age;
    private char sex;
    private String bz;
    private Date birthday;

    private List<teacher> teacher;

}
