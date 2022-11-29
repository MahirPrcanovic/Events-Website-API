package com.example.dogadjaji213.controller;

import com.example.dogadjaji213.dto.RegisterDto;
import com.example.dogadjaji213.model.AppUser;
import com.example.dogadjaji213.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController @RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService _userService;
    @GetMapping("/hi")
    public String get(){
        return "hello";
    }
    @PostMapping("/user/save")
    public ResponseEntity<?> register(@RequestBody RegisterDto registerDto){
        this._userService.saveUser(registerDto);
        return ResponseEntity.ok().body(registerDto);
    }
    @PutMapping("/changepass")
    public String changePass(@RequestBody String password){
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/changepass").toUriString());
        this._userService.changePassword(password);
        return "success";
    }
}
