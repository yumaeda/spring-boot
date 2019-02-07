package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.demo.User;
import com.demo.UserRepository;
import com.demo.common.LogUtils;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (
        @RequestParam String name,
        @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);

        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        LogUtils.info("Sample Info Log");
        LogUtils.warn("Sample Warn Log");
        LogUtils.error("Sample Error Log");
        LogUtils.debug("Sample Debug Log");
        LogUtils.trace("Sample Trace Log");

        return userRepository.findAll();
    }
}
