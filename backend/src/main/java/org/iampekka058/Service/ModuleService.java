package org.iampekka058.Service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import org.iampekka058.Domain.Entities.Module;
import org.iampekka058.Repository.ModuleRepository;

@ApplicationScoped
public class ModuleService {
  @Inject
  ModuleRepository moduleRepository;

  public void insert(Module module){
    moduleRepository.persist(module);
  }

  public List<Module> getAllModules(){
    return moduleRepository.listAll();
  }

}
