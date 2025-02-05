package com.rihab.interventions.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rihab.interventions.entities.Article;
import com.rihab.interventions.service.ArticleService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ArticleRestController {
		
	@Autowired
	ArticleService articleService;

@RequestMapping(path="allArticle",method = RequestMethod.GET)
public List<Article> getAllArticles() {
	return articleService.getAllArticles();
}


@RequestMapping(path="/getbycodeArticle/{codeArticle}",method = RequestMethod.GET)
public Article getArticleById(@PathVariable("codeArticle") long codeArticle) {
	return articleService.getArticle(codeArticle);
 }

//autorisation au admin seulement cette methode
@RequestMapping(path="/addArticle",method = RequestMethod.POST)
public Article createArticle(@RequestBody Article article) {
	return articleService.saveArticle(article);
}


@RequestMapping(path="/updateArticle",method = RequestMethod.PUT)
public Article updateArticle(@RequestBody Article article) {
		return articleService.updateArticle(article);
}


@RequestMapping(value="/delArticle/{codeArticle}",method = RequestMethod.DELETE)

public void deleteArticle(@PathVariable("codeArticle") long codeArticle)
{
	articleService.deleteArticleByCodeArticle(codeArticle);
}




}

