package com.hamze.springit.repository;

import com.hamze.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

}
