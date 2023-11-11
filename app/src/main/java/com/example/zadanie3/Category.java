package com.example.zadanie3;

public enum Category {
    STUDIA("Studia"),
    DOM("Dom");

    private final String categoryName;

    Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
