package service.impl;

import entity.PetType;
import mapper.PetTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PetTyepService;

import java.util.List;

@Service("PetTyepServiceImpl")
public class PetTyepServiceImpl implements PetTyepService {

    @Autowired
    private PetTypeMapper pt;


    @Override
    public List<PetType> findAll() {
        return pt.findAll();
    }
}
