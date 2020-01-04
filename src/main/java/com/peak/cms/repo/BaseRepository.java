package com.peak.cms.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
interface BaseRepository<T> extends CrudRepository<T, Long> {
}