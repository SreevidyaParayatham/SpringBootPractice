package com.example.MyWebApp.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.MyWebApp.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>{

	
}
