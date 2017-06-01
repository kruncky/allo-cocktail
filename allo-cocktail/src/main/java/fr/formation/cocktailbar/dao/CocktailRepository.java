package fr.formation.cocktailbar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.cocktailbar.entity.Cocktail;

public interface CocktailRepository extends JpaRepository<Cocktail, Integer> {

}
