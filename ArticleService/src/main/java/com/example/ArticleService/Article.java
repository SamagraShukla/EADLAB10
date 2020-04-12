package com.example.ArticleService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samagra
 */
@Data
@Entity
public class Article {
    
    @Getter
    @Setter  
    private String title;
    private String Author;
    private String content;
    
    @GeneratedValue
    @Id
    private long id;
    
}
