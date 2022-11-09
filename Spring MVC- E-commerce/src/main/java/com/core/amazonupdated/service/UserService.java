package com.core.amazonupdated.service;

import com.core.amazonupdated.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<UserDetails,Long> {
}
