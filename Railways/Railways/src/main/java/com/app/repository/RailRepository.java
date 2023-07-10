package com.app.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Catagory;
import com.app.entities.Railways;

public interface RailRepository extends JpaRepository<Railways, Long>{
List<Railways> findByCtgr(Catagory c);
}
