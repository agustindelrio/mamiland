package com.mamiland.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.mamiland.backend.models.entity.Embarazada;


public interface IEmbarazadaDao extends CrudRepository<Embarazada, Long> {

}
