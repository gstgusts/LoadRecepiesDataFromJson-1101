package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recepe {
   private String title;
   private String course;
   private int totalTime;
   private int numberOfServings;
   private String instructions;
   private String pictureLink;
   private List<Ingredient> ingredients;
}
