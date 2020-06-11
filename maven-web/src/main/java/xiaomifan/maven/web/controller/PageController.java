package xiaomifan.maven.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 小米饭
 * @date 2020/6/8
 * @descrition：xiaomifan.maven.web.controller
 **/
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
    return page;
}
}
