package com.Haider.ECommerce.controller;

import com.Haider.ECommerce.model.Item;
import com.Haider.ECommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/item")
@CrossOrigin("*")

public class ItemController {

    @Autowired
    public ItemService itemService;

    @PostMapping("/createItem")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Item CreateItem(@RequestBody Item item) {
    return  itemService.save(item);
    }

    @GetMapping("/getAllTheItems")
//    @CrossOrigin(origins = "http://localhost:4200")
    public List<Item> getAllTheItems(){
        return itemService.findAll();
    }
    @GetMapping("/getItemById/{id}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Item getItemById(@PathVariable ("id") String id){
        return itemService.findById(id).orElse(null);
    }

    @GetMapping("/getItemsByCategoryName/{categoryName}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public List<Item> getItemsByCategoryName(@PathVariable ("categoryName") String categoryName){
        return itemService.findByCategoryName(categoryName);
    }

    @GetMapping("/getItemsByBrandName/{brandName}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public List<Item> getItemsByBrandName(@PathVariable ("brandName") String brandName){
        return itemService.findByBrandName(brandName);
    }

    @DeleteMapping("/deleteItemById/{id}")
//    @CrossOrigin(origins = "http://localhost:4200")
    public Item deleteItemById(@PathVariable ("id") String id){
        itemService.deleteById(id);
        return null;
    }


}
