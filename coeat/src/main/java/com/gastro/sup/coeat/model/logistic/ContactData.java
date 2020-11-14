package com.gastro.sup.coeat.model.logistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ContactData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Address address;
    private String phoneNumber;
    private String email;
}
