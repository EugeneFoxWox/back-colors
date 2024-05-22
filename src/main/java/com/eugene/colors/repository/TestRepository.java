package com.eugene.colors.repository;

import com.eugene.colors.models.Palette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Palette, Long> {


}
