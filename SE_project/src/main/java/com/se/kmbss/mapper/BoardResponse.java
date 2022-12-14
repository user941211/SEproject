package com.se.kmbss.mapper;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardResponse {
    private Integer boardidn;
    private Integer suidn;
    private LocalDateTime boarduploaddate;
    private LocalDateTime boardmodifydate;
    private LocalDateTime boarddeletedate;
    private String boardcontent;
    private String boardlocationcity;
    private String boardlocationsigungu;
    private String boardname;
    private Integer boardcategory;
    private Integer viewcnt;
}
