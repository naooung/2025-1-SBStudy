package com.likelion.sbstudy.domain.user.entity;

import com. likelion.sbstudy.global.common.BaseTimeEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "users")
public class User extends BaseTimeEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username", nullable = false, unique = true)
  private String username;

  @Column(name = "nickname", unique = true)
  private String nickname;

  @JsonIgnore
  @Column(name = "password")
  private String password;

  @JsonIgnore
  @Column(name = "provider", nullable = false)
  private String provider;

  @JsonIgnore
  @Column(name = "refresh_token") // 초기에 NULL
  private String refreshToken;

  @Column(name = "role", nullable = false)
  @Enumerated(EnumType.STRING)
  @Builder.Default
  private Role role = Role.USER;

  public void createRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public static User fromOAuth(String email, String provider) {
    return User.builder()
        .username(email)
        .provider(provider)
        .role(Role.USER)
        .build();
  }
}