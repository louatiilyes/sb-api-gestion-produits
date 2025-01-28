package soa.metier;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soa.entities.Categorie;
import soa.repository.CategorieRepository;
@Service
public class CategorieMetierImpl implements CategorieMetierInterface
{

    @Autowired
    private CategorieRepository categorieRepository;
    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public List<Categorie> getCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public void supprimerCategorie(Long id) {
        categorieRepository.deleteById(id);
    }
}
