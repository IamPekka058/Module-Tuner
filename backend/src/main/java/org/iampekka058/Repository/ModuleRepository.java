package org.iampekka058.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.iampekka058.Domain.Entities.Module;

@ApplicationScoped
public class ModuleRepository implements PanacheRepository<Module> {

/*
  Place for custom queries. Example:

  @Transactional
  public List<Module> getAllModules(){
    return this.listAll();
  }
 */
}
