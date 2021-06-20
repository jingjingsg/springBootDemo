package com.zenith.studystu.mapper;

import com.zenith.studystu.dto.studto;
import com.zenith.studystu.dto.teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface stuDAO {
    public List<studto> getStu(Map map);
}


