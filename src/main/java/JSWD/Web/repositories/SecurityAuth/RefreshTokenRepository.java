package JSWD.Web.repositories.SecurityAuth;

import JSWD.Web.model.security.RefreshToken;
import JSWD.Web.model.security.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String refreshToken);

    Optional<RefreshToken> findByUserCredentials(UserCredentials userCredentials);
}