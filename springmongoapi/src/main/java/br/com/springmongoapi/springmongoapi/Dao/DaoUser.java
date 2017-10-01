package br.com.springmongoapi.springmongoapi.Dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.springmongoapi.springmongoapi.models.User;

public interface DaoUser extends MongoRepository<User, String>{

}
