package com.fallout.fallout.model;

import java.util.List;

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
