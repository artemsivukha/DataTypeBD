package ru.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.model.Range;

public interface RangeRepository extends JpaRepository<Range, Long> {
}
