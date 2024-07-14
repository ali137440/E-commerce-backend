package com.Haider.ECommerce.controller;

import com.Haider.ECommerce.model.Category;
import com.Haider.ECommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")

public class CategoryController {
    @Autowired
    public CategoryService categoryService;

    //create category
    @PostMapping("/createCategory")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Category craeteCategory(@RequestBody Category category){
        return categoryService.save(category);

    }
    //get all category

    @GetMapping("/getAllCategryList")
//    @CrossOrigin(origins = "http://localhost:4200")
    public List<Category> getAllCategoryList(){
        return categoryService.findAll();
    }
    //get category By Id

    @GetMapping("/getCategryById/{id}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Category getCategoryById(@PathVariable ("id") String id){
        return categoryService.findById(id).orElse(null);
    }
    //get category By Name

    @GetMapping("/getCategryByName/{name}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Category getCategoryByName(@PathVariable ("name") String name){
        return categoryService.findBycategoryName(name);
    }
    //delete category By Id

    @DeleteMapping("/deleteById/{id}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Category deleteById(@PathVariable ("id") String id){
        categoryService.deleteById(id);
        return null;
    }

}
