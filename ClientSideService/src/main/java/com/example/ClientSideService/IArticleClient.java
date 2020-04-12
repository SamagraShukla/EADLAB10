/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ClientSideService;

import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.cloud.openfeign.FeignClient;

/**
 *
 * @author Samagra
 */
@FeignClient("article-service")
public interface IArticleClient {
    
    @RequestMapping("/articles")
    CollectionModel<Article> readArticles();
    
}
