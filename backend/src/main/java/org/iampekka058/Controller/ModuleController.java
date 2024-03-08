package org.iampekka058.Controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.List;
import java.util.UUID;
import org.iampekka058.Domain.Entities.Module;
import org.iampekka058.Service.ModuleService;
import org.jboss.resteasy.reactive.RestPath;

@Path("/modules")
public class ModuleController {

  @Inject
  ModuleService moduleService;

  @GET
  @Path("/")
  public List<Module> getModules(){
    return moduleService.getAllModules();
  }


  @Path("{/id}")
  @POST
  public void saveModule(){
    /*
      Missing implementation of saveModule TODO
     */
  }

}
