package in.ankesh.moneymanager.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class profileDto {
    private Long id;
    private String fullname;
    private String email;
    private String password;
    private String imageURL;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
