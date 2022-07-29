package com.korea.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import sun.jvm.hotspot.oops.Mark;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class TestDTO
{
    private String name;
    private String age;
    private String addr;


}
