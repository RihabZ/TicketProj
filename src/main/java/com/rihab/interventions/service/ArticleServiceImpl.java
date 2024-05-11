package com.rihab.interventions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rihab.interventions.entities.Article;
import com.rihab.interventions.repos.ArticleRepository;
@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleRepository articleRepository;



@Override
public Article saveArticle(Article cause)
{
return articleRepository.save(cause);

}

@Override
public Article updateArticle(Article cause) {
return articleRepository.save(cause);
}


@Override
public void deleteArticle(Article cause) {
	articleRepository.delete(cause);
}


@Override
public void deleteArticleByCodeArticle(long id) {
	articleRepository.deleteById(id);
}


@Override
public Article getArticle(long id) {
return articleRepository.findById(id).get();
}


@Override
public List<Article> getAllArticles() {
return articleRepository.findAll();
}





}
