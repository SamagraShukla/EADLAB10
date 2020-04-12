package com.example.ClientSideService;


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
public class Article {
    
    @Getter
    @Setter  
    private String title;
    private String Author;
    private String content;

    private long id;
    
}
