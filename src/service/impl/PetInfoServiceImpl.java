package service.impl;

import entity.PetInfo;
import mapper.PetInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.PetInfoService;

import java.util.List;

@Service("PetInfoServiceImpl")
public class PetInfoServiceImpl implements PetInfoService {

    @Autowired
    private PetInfoMapper pm;



    @Override
    public int addPetInfo(PetInfo info) {
        return pm.addPetInfo(info);
    }


    @Override
    public int delById(int id) {
        return pm.delById(id);
    }
    @Override
    public List<PetInfo> findAll() {
        return pm.findAll();
    }

    @Override
    public List<PetInfo> findByTidMo(int tid) {
        return pm.findByTidMo(tid);
    }
}
