package com.github.lab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @author zhaojiejun
 */

@ToString
@Getter
@AllArgsConstructor
public enum CourseStatus {
    ON_SHELF("on_shelf", "上架"),
    OFF_SHELF("off_shelf", "上架");
    private String value;
    private String text;
}
