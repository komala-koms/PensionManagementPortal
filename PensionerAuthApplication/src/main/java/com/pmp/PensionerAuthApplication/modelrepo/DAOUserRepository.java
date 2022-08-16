package com.pmp.PensionerAuthApplication.modelrepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pmp.PensionerAuthApplication.model.DAOUser;

@Repository
public interface DAOUserRepository extends JpaRepository<DAOUser, Integer>{

	DAOUser findByUserId(Long userId);

	DAOUser findByUserIdAndPassword(Long userId, String password);

	DAOUser findByPassword(String password);
}	