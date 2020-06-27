package com.george.demo.controller;

import com.george.api.exception.MinusException;
import com.george.api.service.AddService;
import com.george.api.service.MinusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaozhi
 * @description 调用加法和减法服务
 * @since 2020/6/20
 */
@RestController
public class CalculateController {

    @Autowired
    private AddService addService;

    @Autowired
    private MinusService minusService;

    @RequestMapping(value = "/add/{added}/{add}", method = RequestMethod.GET)
    public String add(@PathVariable("added") int added, @PathVariable("add") int add) {
        return added + " 加 " + add + " 等于 : " + addService.add(added, add);
    }

    @RequestMapping(value = "/minus/{minuend}/{subtraction}", method = RequestMethod.GET)
    public String minus(@PathVariable("minuend") int minuend, @PathVariable("subtraction") int subtraction) throws MinusException {
        return minuend + " 减 " + subtraction + " 等于 : " + minusService.minus(minuend, subtraction);
    }
}
