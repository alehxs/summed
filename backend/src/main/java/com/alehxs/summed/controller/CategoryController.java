package com.alehxs.summed.controller;

import java.util.List;

import com.alehxs.summed.model.Category;
import com.alehxs.summed.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    private final CategoryService service;

    public CategoryController (CategoryService service){
        this.service = service;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return service.getAllCategories();
    }

}
