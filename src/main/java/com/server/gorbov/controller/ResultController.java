package com.server.gorbov.controller;

import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import com.server.gorbov.service.result.ResultService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    final ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public String getAllResults() {
        return resultService.findAllResults().toString();
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public String saveResult(@RequestParam User user,
                             @RequestParam Result result) {
        return resultService.saveResult(user, result).toString();
    }
}
