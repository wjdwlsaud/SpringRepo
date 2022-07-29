package com.korea.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.jvm.hotspot.oops.Mark;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestDTO
{
    private String name;
    private String age;
    private String addr;

}
