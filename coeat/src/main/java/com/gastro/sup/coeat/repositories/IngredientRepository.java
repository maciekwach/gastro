package com.gastro.sup.coeat.repositories;

import com.gastro.sup.coeat.model.food.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
