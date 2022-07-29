package com.korea.controller;

import com.korea.domain.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
