package service;

import entity.PetInfo;

import java.util.List;

public interface PetInfoService {


    List<PetInfo> findAll();


    List<PetInfo> findByTidMo(int tid);

    int delById(int id);

    int addPetInfo(PetInfo info);


}
