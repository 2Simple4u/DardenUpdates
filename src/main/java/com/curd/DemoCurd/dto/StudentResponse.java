package com.curd.DemoCurd.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
//@Builder
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private long id;
    private String name;
    private String fatherName;
    private String contactNo;

}
