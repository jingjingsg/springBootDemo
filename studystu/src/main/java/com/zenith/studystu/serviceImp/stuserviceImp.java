package com.zenith.studystu.serviceImp;

import com.zenith.studystu.dto.studto;
import com.zenith.studystu.dto.teacher;
import com.zenith.studystu.mapper.TDAO;
import com.zenith.studystu.mapper.stuDAO;
import com.zenith.studystu.service.stuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Repository
public class stuserviceImp implements stuservice {

    @Autowired
    public stuDAO studao;

    @Autowired
    public TDAO tdao;

    public List<studto> getstu(Map map){
        return studao.getStu(map);
    }

    @Transactional
    public int addT(teacher t){
        int num = tdao.addT(t);
        return num;
    }
}
