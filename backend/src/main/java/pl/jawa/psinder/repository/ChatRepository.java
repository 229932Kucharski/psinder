package pl.jawa.psinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.jawa.psinder.entity.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
}