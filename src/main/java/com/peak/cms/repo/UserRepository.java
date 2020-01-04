package com.peak.cms.repo;

import com.peak.cms.entity.UserEntity;

import java.util.List;

interface UserRepository extends BaseRepository<UserEntity> {
    List<UserEntity> findAllBy();
    List<UserEntity> findAllByNameLikeAndSexEqualsOrderByIdDesc(String name, int sex);
    List<UserEntity> findAllBySexEquals(int sex);
}