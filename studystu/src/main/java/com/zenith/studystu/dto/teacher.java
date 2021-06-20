package com.zenith.studystu.dto;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Data
@Setter
@Component
public class teacher implements Serializable {
    private static final long serialVersionUID = -6556793741331167103L;

    private int tid;
    private String tname;
    private int tage;
    private String tsub;

}
