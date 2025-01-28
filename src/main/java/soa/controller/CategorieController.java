package soa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import soa.entities.Categorie;
import soa.metier.CategorieMetierImpl;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categories")
public class CategorieController {

    @Autowired
    private CategorieMetierImpl categorieService;

    @PostMapping
    public Categorie ajouterCategorie(@RequestBody Categorie categorie) {
        return categorieService.ajouterCategorie(categorie);
    }

    @GetMapping
    public List<Categorie> getCategories() {
        return categorieService.getCategories();
    }

    @DeleteMapping("/{id}")
    public void supprimerCategorie(@PathVariable Long id) {
        categorieService.supprimerCategorie(id);
    }
}