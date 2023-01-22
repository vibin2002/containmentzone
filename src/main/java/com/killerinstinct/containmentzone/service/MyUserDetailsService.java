package com.killerinstinct.containmentzone.service;

import com.killerinstinct.containmentzone.model.MyUserDetails;
import com.killerinstinct.containmentzone.model.User;
import com.killerinstinct.containmentzone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(username);
        user.orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user.map(MyUserDetails::new).get();
    }
}
