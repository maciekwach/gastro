package com.gastro.sup.coeat.repositories;

import com.gastro.sup.coeat.model.food.Dish;
import org.springframework.data.repository.CrudRepository;

public interface DishRepository extends CrudRepository<Dish, Long> {
}
