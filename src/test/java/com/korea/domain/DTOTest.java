package com.korea.domain;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
public class DTOTest
{
    @Autowired
    private TestDTO testdto;
    @Test
    public void Test_1()
    {
        //        TestDTO dto = new TestDTO("홍길동", "44", "대구");
        //
        //        System.out.println(dto);

        TestDTO dto = TestDTO.builder().age("55").name("홍길동").addr("주소주소").build();
        System.out.println(dto);

    }

    @Test
    public void Test_2()
    {
        log.info("testDTO : " + testdto);
    }

}
