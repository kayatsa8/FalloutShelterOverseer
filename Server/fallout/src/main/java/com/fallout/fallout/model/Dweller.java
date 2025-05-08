package com.fallout.fallout.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Dweller {
    // private
    private Integer id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Integer generation;

    // family
    private Integer fatherId;
    private Integer motherId;
    private Integer spouseId;
    private List<Integer> childrenIds;

    // work
    private Room room;
    
}
