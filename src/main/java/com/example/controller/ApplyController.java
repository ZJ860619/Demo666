package com.example.controller;


import com.example.service.IApplyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Controller
@RequestMapping("/apply")
public class ApplyController {

    @Resource
    private IApplyService iApplyService;


    @RequestMapping("/selectId/{id}")
    public String selectId(@PathVariable("id")Integer id, Model model){
        System.out.println(id);
        model.addAttribute("applyList",iApplyService.findApplyByDuoBiaoServices(id));
        return "shenQing";
    }




}
