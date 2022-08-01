package com.korea.controller;

import com.korea.domain.TestDTO;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j
public class HomeController
{

    @Autowired
    public TestDTO dto;

    @RequestMapping("/")
    public String home()
    {
        dto.setName("홍길동");
        dto.setAge("55");
        dto.setAddr("주소주소");
        System.out.println(dto);
        return "index";
    }
}
