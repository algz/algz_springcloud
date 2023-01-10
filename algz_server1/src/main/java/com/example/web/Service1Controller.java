package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s")
public class Service1Controller {


	/**
	 * http://localhost:9001/s/2 2
	 * @param id
	 * @return
	 */
    @GetMapping("/{id}")
    public String queryOrderByUserId(@PathVariable("id") Long id) {
        // 根据id查询订单并返回
        return "id1:"+id;
    }
}
