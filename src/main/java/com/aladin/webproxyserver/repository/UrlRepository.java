package com.aladin.webproxyserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends CrudRepository<URLS, String> {
    List<URLS> findByNameContaining(String name);

    List<URLS> deleleteURLbystatusCode(short code);
}
