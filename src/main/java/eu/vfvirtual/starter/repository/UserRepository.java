package eu.vfvirtual.starter.repository;

import eu.vfvirtual.starter.model.User;

public interface UserRepository {
	User findByUsername(String username );
}
