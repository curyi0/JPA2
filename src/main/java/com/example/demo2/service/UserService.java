package com.example.demo2.service;

import com.example.demo2.entity.Product;
import com.example.demo2.entity.Users;
import com.example.demo2.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Users createUser(Users users) {
        // A. 이름 중복 방지 및 의도 명확화
        if (users.getName() != null && userRepository.existsById(users.getName())) {
            throw new IllegalArgumentException("이미 등록된 사용자입니다: " + users.getName());
        }

        // B. 데이터 저장 및 ID 자동 생성 발생
        return userRepository.save(users);
    }

    // 전체 사용자 조회
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
