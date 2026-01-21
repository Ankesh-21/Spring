package com.ankesh.eCom.repository;
import com.ankesh.eCom.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo extends JpaRepository<product,Integer> {

}
