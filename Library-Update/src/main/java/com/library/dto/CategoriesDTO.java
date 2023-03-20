package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriesDTO {

    private Long id;

    private String name;

    private Boolean builtIn;

    private Integer sequence;
}