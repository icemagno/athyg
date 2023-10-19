package br.com.cmabreu.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cmabreu.model.Star;

@Repository
@Transactional
public interface StarRepository extends JpaRepository<Star, Long>  {
	

}
