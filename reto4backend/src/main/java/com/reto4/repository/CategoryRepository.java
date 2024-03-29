package com.reto4.repository;

// Importaciones
import com.reto4.modelo.Category;
import com.reto4.repository.crud.CategoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sara Duque
 */
@Repository
public class CategoryRepository {

    /**
     * Atributo autowired category
     */
    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    /**
     * método para obtener todas las category
     * @return
     */
    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    /**
     * método para obtener una category por id
     * @param id
     * @return
     */
    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    /**
     * método save para category
     * @param category
     * @return
     */
    public Category save(Category category){
        return categoryCrudRepository.save(category);
    }

    /**
     * método para borrar una categoria
     * @param category
     */
    public void delete(Category category){
        categoryCrudRepository.delete(category);
    }
}
