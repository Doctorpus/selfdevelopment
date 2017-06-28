package com.leishaw.forjob.controller;

import com.leishaw.forjob.DO.FuckDO;
import com.leishaw.forjob.service.FuckService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by leishaw on 27/06/2017.
 */
@Controller
@RequestMapping("/fucker")
public class FuckerController {
    Logger logger = Logger.getLogger(FuckerController.class);

    @Resource
    private FuckService fuckService;

    @RequestMapping("/showFucker.htm")
    public ModelAndView toIndex(HttpServletRequest request,ModelAndView model){
        int userId = Integer.parseInt(request.getParameter("id"));
        FuckDO fuckDO = fuckService.getFuckById(userId);
        model.setViewName("fucker");
        model.addObject("user",fuckDO);
        logger.info(fuckDO);
        return model;
    }
}
