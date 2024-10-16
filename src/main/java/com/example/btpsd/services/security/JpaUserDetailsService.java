//package com.example.btpsd.services.security;
//
//import com.example.btpsd.model.security.Authority;
//import com.example.btpsd.model.security.User;
//import com.example.btpsd.repositories.security.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@RequiredArgsConstructor
//@Service
//public class JpaUserDetailsService implements UserDetailsService {
//
//    private final UserRepository userRepository;
//
//    @Transactional
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        User user = userRepository.findByUsername(username).orElseThrow(() -> {
//            return new UsernameNotFoundException("User name: " + username + " not found");
//        });
//
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
//                user.getEnabled(), user.getAccountNonExpired(), user.getCredentialsNonExpired(),
//                user.getAccountNonLocked(), convertToSpringAuthorities(user.getAuthorities()));
//    }
//
//    private Collection<? extends GrantedAuthority> convertToSpringAuthorities(Set<Authority> authorities) {
//        if (authorities != null && authorities.size() > 0){
//            return authorities.stream()
//                    .map(Authority::getPermission)
//                    .map(SimpleGrantedAuthority::new)
//                    .collect(Collectors.toSet());
//        } else {
//            return new HashSet<>();
//        }
//    }
//}