package com.example.ArticleService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ArticleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticleServiceApplication.class, args);
	}

}


@Component
class ItemInitializer implements CommandLineRunner{

    private final IArticleRepository repo;
    
    ItemInitializer(IArticleRepository _repo)
    {
        this.repo = _repo;
    }
    @Override
    public void run(String... args) throws Exception {
        for(int i = 0; i<=5;i++){
            Article art = new Article();
            art.setAuthor("Author"+i);
            art.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. ");
            art.setTitle("Title#"+i);
            repo.save(art);
        }
        repo.findAll().forEach(System.out::println);
    }
    
}