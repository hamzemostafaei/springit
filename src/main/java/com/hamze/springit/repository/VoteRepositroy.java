package com.hamze.springit.repository;

import com.hamze.springit.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepositroy extends JpaRepository<Vote,Long> {
}
