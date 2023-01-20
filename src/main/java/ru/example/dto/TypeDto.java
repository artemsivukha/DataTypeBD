package ru.example.dto;

import java.io.Serializable;

public class TypeDto implements Serializable {

    private String name;
    private String type;
    private RangeDto rangeDto;

    public TypeDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RangeDto getRangeDto() {
        return rangeDto;
    }

    public void setRangeDto(RangeDto rangeDto) {
        this.rangeDto = rangeDto;
    }
}
