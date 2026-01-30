package in.ankesh.moneymanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ankesh.moneymanager.entity.profileEntity;
@Repository
public interface profileRepository extends JpaRepository<profileEntity,Long>{
    
}
