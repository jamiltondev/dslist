package com.estudo.dslist.repositories;

import com.estudo.dslist.entities.Belonging;
import com.estudo.dslist.entities.BelongingPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK> {
}
