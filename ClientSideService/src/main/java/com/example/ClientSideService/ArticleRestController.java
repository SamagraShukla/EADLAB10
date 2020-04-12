/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ClientSideService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Samagra
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ArticleRestController {
    
    @Autowired
    private IArticleClient client;
    
    
    @GetMapping("/articles")
    @HystrixCommand(fallbackMethod = "fallbackArticles")
    public Collection<Article> getArticles(){
        return client.readArticles().getContent().stream().collect(Collectors.toList());
        
    }
    
        public Collection<Article> fallbackArticles(){
        List<Article> articleList = new ArrayList<>();
        
        Article art = new Article();
        art.setAuthor("missing");
        art.setContent("Please reload. Please reload. Please reload. Please reload.");
        art.setTitle("Article not loaded");
        
        articleList.add(art);
        return articleList;
    }
    
    
}
