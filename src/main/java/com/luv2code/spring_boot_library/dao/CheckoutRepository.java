package com.luv2code.spring_boot_library.dao;

import com.luv2code.spring_boot_library.entity.Checkout;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

    Checkout findByUserEmailAndBookId(String userEmail, Long bookId);
}
