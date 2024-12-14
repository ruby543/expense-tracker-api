package com.pairlearning.expensetracker.domain;

public class Category {

    private Integer categoryId;
    private Integer userId;
    private String title;
    private String description;
    private Double totalExpense;

    public Category(Integer categoryId, Integer userId, String title, String description, Double totalExpense) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.title = title;
        this.description = description;
        this.totalExpense = totalExpense;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }
}
