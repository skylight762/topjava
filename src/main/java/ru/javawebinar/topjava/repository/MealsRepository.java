package ru.javawebinar.topjava.repository;

import ru.javawebinar.topjava.model.Meal;

import java.util.Collection;

public interface MealsRepository {
    Meal save (Meal meal);
    void delete (int id);
    Meal get (int id);
    Collection<Meal> getAll();
}
