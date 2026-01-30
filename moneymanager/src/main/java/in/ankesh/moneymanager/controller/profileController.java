package in.ankesh.moneymanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ankesh.moneymanager.dto.profileDto;
import in.ankesh.moneymanager.service.profileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequiredArgsConstructor
public class profileController {
    private final profileService profileServ;
    @PostMapping("/register")
    public ResponseEntity<profileDto>registerUser(@RequestBody profileDto pdto){
        profileDto newUser = profileServ.register(pdto);
        return ResponseEntity.ok(newUser);
    }
}
