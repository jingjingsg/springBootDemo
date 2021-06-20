package com.zenith.studystu.service;

import com.zenith.studystu.dto.studto;
import com.zenith.studystu.dto.teacher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface stuservice {
    public List<studto> getstu(Map map);

    public int addT(teacher t);
}
