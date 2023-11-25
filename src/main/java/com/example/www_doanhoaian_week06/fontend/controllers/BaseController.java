package com.example.www_doanhoaian_week06.fontend.controllers;

import com.example.www_doanhoaian_week06.backend.models.Post;
import com.example.www_doanhoaian_week06.backend.models.User;
import com.example.www_doanhoaian_week06.backend.services.PostService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




import java.util.List;

@Controller
public class BaseController {
    @Autowired
    private PostService postService;
    @GetMapping("/")
    public String index(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user == null){
            user = new User();
            session.setAttribute("user", user);
        }
        List<Post>posts = postService.getAllPublish();
        model.addAttribute("user", user);
        model.addAttribute("posts", posts);
        return "index";
    }
}
