package com.jonatanmuller.rabbit_publisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Models {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Shape {
        private String name;
        private Integer numberOfSides;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Color {
        private String name;
        private String hex;
    }
}
