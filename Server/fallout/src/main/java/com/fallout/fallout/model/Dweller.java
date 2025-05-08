package com.fallout.fallout.model;

import java.util.ArrayList;
import java.util.List;

import com.fallout.fallout.exception.AlreadyMarriedException;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Dweller {
    // private
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "first name cannot be blank")
    private String firstName;

    @NotBlank(message = "last name cannot be blank")
    private String lastName;
    
    @NotNull(message = "gender cannot be null")
    private Gender gender;

    // will be given automatically by the system
    private Integer generation;

    // family
    @Min(value = -1, message = "the father's id is invalid")
    @Nullable
    private Integer fatherId;

    @Min(value = -1, message = "the mother's id is invalid")
    @Nullable
    private Integer motherId;

    @Min(value = 0, message = "the spouse's id is invalid")
    @Nullable
    private Integer spouseId;

    // will be created by the system
    private List<Integer> childrenIds;

    // work
    private Room room;
    

    public boolean isMarried(){
        return spouseId != null;
    }

    public void marry(Dweller spouse) throws AlreadyMarriedException{
        if(!isMarried()){
            spouseId = spouse.id;
            childrenIds = new ArrayList<>(1);

            if(gender == Gender.FEMALE){
                lastName = spouse.lastName;
            }
        }

        throw new AlreadyMarriedException(this);
    }
}
