package com.gastro.sup.coeat.model.business;

import com.gastro.sup.coeat.model.food.Menu;
import com.gastro.sup.coeat.model.logistic.ContactData;
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
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private ContactData contactData;
    private Menu menu;
}
