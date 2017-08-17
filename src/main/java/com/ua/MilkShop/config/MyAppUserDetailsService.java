package com.ua.MilkShop.config;

import com.ua.MilkShop.model.UserDto;
import com.ua.MilkShop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyAppUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserDto activeUserDto = userRepository.findByUserName(userName);
        GrantedAuthority authority = new SimpleGrantedAuthority(activeUserDto.getRole());
        UserDetails userDetails = (UserDetails) new User(activeUserDto.getUserName(),
                activeUserDto.getPassword(), Arrays.asList(authority));
        return userDetails;
    }
}
