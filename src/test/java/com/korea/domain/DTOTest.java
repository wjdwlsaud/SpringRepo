package com.korea.domain;

import org.testng.annotations.Test;

public class DTOTest
{

    @Test
    public void Test_1()
    {
        TestDTO dto = new TestDTO("홍길동", "44", "대구");

        System.out.println(dto);
    }

}
