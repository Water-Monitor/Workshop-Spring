package watermonitor.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import watermonitor.workshopspring.models.TipDao;

@Repository
public interface TipRepository extends JpaRepository<TipDao, Long> {
    TipDao findAllByTitle(String title);
}
