package com.korea.domain;

import org.junit.Test;

public class DTOTest
{

    @Test
    public void Test_1()
    {
        //        TestDTO dto = new TestDTO("홍길동", "44", "대구");
        //
        //        System.out.println(dto);

        TestDTO dto = TestDTO.builder().age("55").name("홍길동").addr("주소주소").build();
        System.out.println(dto);

    }

}
