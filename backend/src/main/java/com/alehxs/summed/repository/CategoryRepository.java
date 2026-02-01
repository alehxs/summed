package com.alehxs.summed.repository;

import com.alehxs.summed.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepository {
    public List<Category> findAll() {
        return List.of(
                new Category("1", "Food & Drinks"),
                new Category("2", "Gas"),
                new Category("3", "Entertainment")
        );
    }
}
