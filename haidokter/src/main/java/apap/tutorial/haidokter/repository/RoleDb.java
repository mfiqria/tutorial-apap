package apap.tutorial.haidokter.repository;

import apap.tutorial.haidokter.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDb extends JpaRepository<RoleModel, Long> {
    List<RoleModel> findAllById(Long id);
}
