package com.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.library.domain.impl.Privilege;
import com.library.repository.PrivilegeRepository;
import com.library.service.AbstractService;
import com.library.service.PrivilegeService;

@Service
@Transactional
public class PrivilegeServiceImpl extends AbstractService<Privilege> implements PrivilegeService{
 
  @Autowired
  private PrivilegeRepository privilegeRepository; 
  
  @Override
  @Transactional(readOnly = true)
  public Privilege findByName(final String name) {
    return getDao().findByName(name);
  }

  @Override
  protected PrivilegeRepository getDao() {
    return privilegeRepository;
  }

}
