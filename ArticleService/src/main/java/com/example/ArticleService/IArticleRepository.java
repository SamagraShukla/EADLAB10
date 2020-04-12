/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ArticleService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Samagra
 */
@RepositoryRestResource //(path="articlesfetch")
public interface IArticleRepository extends JpaRepository<Article, Long>{
    
}
