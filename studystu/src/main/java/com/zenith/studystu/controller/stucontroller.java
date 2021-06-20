package com.zenith.studystu.controller;

import com.zenith.studystu.dto.studto;
import com.zenith.studystu.dto.teacher;
import com.zenith.studystu.service.stuservice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RequestMapping("/stuapi")
@RestController
public class stucontroller {

    @Autowired
    private stuservice stu;


    @Autowired
    private studto studto;

    @RequestMapping("/getstuList")
    public List<studto> getstuList(@RequestBody Map map){
        //System.out.println(id);
        return stu.getstu(map);
    }

    @RequestMapping("/addstu")
    public int addT(@RequestBody teacher t){
        //System.out.println(id);
        return stu.addT(t);
    }
}
