package com.javamaster.crudmongo.model;



import java.util.Set;

public class ComputerModel {

    private String id;
    private String Title;
    private Integer price;
    private Set<ComputerPropertiesModel> properties;
}
