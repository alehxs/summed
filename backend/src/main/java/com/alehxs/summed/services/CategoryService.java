package com.alehxs.summed.services;

import java.util.List;

import com.alehxs.summed.model.Category;
import com.alehxs.summed.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService (CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> getAllCategories() {
        return repository.findAll();
    }
}
