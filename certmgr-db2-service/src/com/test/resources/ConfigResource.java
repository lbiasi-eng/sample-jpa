package com.test.resources;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.test.model.Config;


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Path("/configs")
public class ConfigResource {

	@PersistenceContext(type=PersistenceContextType.TRANSACTION, name = "jpa-unit")
    private EntityManager em;
	
	@GET
	public Response get() {
		Config config = new Config();
		config.setId(1);
		em.persist(config);
		return Response.ok("hello world!").build();
		
		
	}
}
