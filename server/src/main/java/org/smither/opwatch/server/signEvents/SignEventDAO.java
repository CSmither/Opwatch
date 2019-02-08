package org.smither.opwatch.server.signEvents;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
interface SignEventDAO extends CrudRepository<SignEvent, Long> {

  List<SignEvent> findAll();

  List<SignEvent> findByActioner(String actioner);

  SignEvent findById(UUID id);

  List<SignEvent> findBySign(UUID signId);
}
