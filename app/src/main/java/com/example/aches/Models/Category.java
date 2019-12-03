package com.example.aches.Models;

public class Category {
    public static String[] categoriesList;
    public static Category categorySingleton;

    private Category() {
        categoriesList = new String[]{"Tech-Aches","Code-Aches","Health-Aches","Beauty-Aches","Food-Aches","Study-Aches","Fashion-Aches","Relationship-Aches","Game-Aches","Vehicle-Aches","Pet-Aches","Plant-Aches","Job-Aches","Parent-Aches","Creative-Aches","Language-Aches","Music-Aches"};
    }
    public static Category getInstance() {
        if (categorySingleton == null) {
            categorySingleton = new Category();
        }
        return categorySingleton;
    }
}
