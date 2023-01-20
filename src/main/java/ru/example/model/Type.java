package ru.example.model;

import ru.example.dto.TypeDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "data_type")
public class Type implements Serializable {

    private static final long serialVersionUID = -8095039359436728475L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;

//    private Long range_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "range_id")
    private Range range;

    public Type() {
    }

    public Type(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    //    public Long getRange_id() {
//        return range_id;
//    }
//
//    public void setRange_id(Long range_id) {
//        this.range_id = range_id;
    }
