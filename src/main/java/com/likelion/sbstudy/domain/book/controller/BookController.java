package com.likelion.sbstudy.domain.book.controller;

import com.likelion.sbstudy.domain.book.dto.request.CreateBookRequest;
import com.likelion.sbstudy.domain.book.dto.request.UpdateBookRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/books")
@Tag(name = "Book", description = "Book 관련 API")
public class BookController {

  /**
   * 책 생성 API
   */
  @Operation(summary = "책 생성", description = "API")
  @PostMapping
  public ResponseEntity<String> createBook(
      @Parameter(description = "생성할 책 정보")
      @RequestBody CreateBookRequest createPostRequest) {
    return ResponseEntity.ok("<UNK> <UNK> <UNK>");
  }

  /**
   * 책 리스트 조회 API
   */
  @Operation(summary = "책 리스트 조회", description = "API")
  @GetMapping
  public ResponseEntity<String> getAllBooks() {
    return ResponseEntity.ok("<UNK> <UNK> <UNK>");
  }

  /**
   * 특정 책 조회 API
   */
  @Operation(summary = "특정 책 조회", description = "API")
  @GetMapping("/{id}")
  public ResponseEntity<String> getBook(
      @Parameter(description = "특정 책 ID")
      @PathVariable Long id) {
    return ResponseEntity.ok("<UNK> <UNK> <UNK>");
  }

  /**
   * 책 정보 수정 API
   */
  @Operation(summary = "책 정보 수정", description = "API")
  @PutMapping("/{id}")
  public ResponseEntity<String> updateBook(
      @Parameter(description = "수정할 책 정보")
      @RequestBody UpdateBookRequest updatePostRequest,

      @Parameter(description = "특정 책 ID")
      @PathVariable Long id) {
    return ResponseEntity.ok("<UNK> <UNK> <UNK>");
  }

  /**
   * 책 삭제 API
   */
  @Operation(summary = "책 삭제", description = "API")
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteBook(
      @Parameter(description = "특정 책 ID")
      @PathVariable Long id) {
    return ResponseEntity.ok("<UNK> <UNK> <UNK>");
  }
}
