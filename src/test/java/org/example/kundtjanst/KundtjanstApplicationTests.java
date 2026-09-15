package org.example.kundtjanst;

import org.example.kundtjanst.dto.CustomerDto;
import org.example.kundtjanst.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KundtjanstApplicationTests {

    @Autowired
    private CustomerService customerService;
    

}
