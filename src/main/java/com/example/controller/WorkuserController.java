package com.example.controller;


import com.example.entity.Worker;
import com.example.entity.Workuser;
import com.example.service.IWorkerService;
import com.example.service.IWorkuserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Controller
@RequestMapping("/workuser")
public class WorkuserController {

    @Resource
    private IWorkuserService iWorkuserService;

    @RequestMapping("/index")
    public String home(Model model,Integer id,HttpSession session,Workuser workuser){

        workuser=iWorkuserService.findac();

        session.setAttribute("workuser",workuser);
        model.addAttribute("abc",workuser);

        return "bianJi";

    }


    @RequestMapping("/update")
    public String update(Workuser workuser, Model model, Integer userid, HttpSession session){
        System.out.println(userid);
        System.out.println("dsadasddddddddddddddddddddddddddddddddddddddddd");
        Integer iRet=iWorkuserService.modify(workuser);
        System.out.println(iRet);
        if(iRet>0){
            model.addAttribute("messg","yes");
            return "redirect:/worker/home";
        }else{
            model.addAttribute("messg","no");
            return "bianJi";
        }
    }

}
