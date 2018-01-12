package com.server.gorbov.controller;

import com.server.gorbov.common.state.StateMain;
import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;
import com.server.gorbov.service.result.ResultService;
import com.server.gorbov.service.user.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/result")
public class ResultController {

    private final ResultService resultService;
    private final UserService userService;

    public ResultController(ResultService resultService, UserService userService) {
        this.resultService = resultService;
        this.userService = userService;
    }

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public StateMain getAllResults() {
        return resultService.findAllResults();
    }

    @RequestMapping(path = "/getForUser", method = RequestMethod.GET)
    public StateMain getForUser(@RequestParam Integer userId) {
        return resultService.findResultsByUserId(userId);
    }

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public StateMain saveResult(@RequestParam Integer userId,
                             @RequestBody Result result) {
        System.out.println(userId);
        User user = userService.getUserById(userId);
        return resultService.saveResult(user, result);
    }
}
