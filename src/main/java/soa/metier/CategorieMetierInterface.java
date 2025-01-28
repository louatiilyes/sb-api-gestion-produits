package soa.metier;

import java.util.List;

import soa.entities.Categorie;

public interface CategorieMetierInterface
{
  
    Categorie ajouterCategorie(Categorie categorie);
    List<Categorie> getCategories();
    void supprimerCategorie(Long id);
}

