package ru.skillfactorybot.tgbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactorybot.tgbot.entity.Income;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}