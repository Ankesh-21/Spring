package in.ankesh.moneymanager.service;
import in.ankesh.moneymanager.repository.profileRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.UUID;
import in.ankesh.moneymanager.dto.profileDto;
import in.ankesh.moneymanager.entity.profileEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RequiredArgsConstructor
@Service
public class profileService {
    
    private final profileRepository profileRepo;
    public profileDto register(profileDto pdto){
        profileEntity newEntity = toEntity(pdto);
        newEntity.setActivationToken(UUID.randomUUID().toString());
        newEntity = profileRepo.save(newEntity);
        return toDTO(newEntity);
    }
    public profileEntity toEntity(profileDto pdto){
        return profileEntity.builder()
        .id(pdto.getId())
        .email(pdto.getEmail())
        .fullname(pdto.getFullname())
        .imageURL(pdto.getImageURL())
        .createdAt(pdto.getCreatedAt())
        .updatedAt(pdto.getUpdatedAt())
        .password(pdto.getPassword())
        .build();
    }
    public profileDto toDTO(profileEntity pentity){
        return profileDto.builder()
        .id(pentity.getId())
        .fullname(pentity.getFullname())
        .email(pentity.getEmail())
        .createdAt(pentity.getCreatedAt())
        .updatedAt(pentity.getUpdatedAt())
        .imageURL(pentity.getImageURL())
        .build();
    }
}
