package com.zenith.studystu.mapper;

import com.zenith.studystu.dto.studto;
import com.zenith.studystu.dto.teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TDAO {
    public int addT(teacher t);
}


