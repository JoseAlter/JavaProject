package com.api.VacControl.repositories;

import com.api.VacControl.models.DosesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDosesRepository extends JpaRepository<DosesModel, Long> {

}
