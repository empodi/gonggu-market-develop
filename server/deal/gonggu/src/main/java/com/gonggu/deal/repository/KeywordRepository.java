package com.gonggu.deal.repository;

import com.gonggu.deal.domain.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface KeywordRepository extends JpaRepository<Keyword,Long> {
    Keyword findByWord(String word);
}
