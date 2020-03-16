package com.example.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.entity.Worker;
import com.example.entity.Workuser;
import com.example.service.IApplyService;
import com.example.service.IWorkerService;
import com.example.service.IWorkuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanghao
 * @since 2020-03-04
 */
@Controller
@RequestMapping("/worker")
public class WorkerController {

    @Resource
    private IWorkerService IWorkerService;

    @Resource
    private IWorkuserService iWorkuserService;

    @Resource
    private IApplyService iApplyService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String insert(Worker worker, HttpSession model, String title,Integer userid) {
        System.out.println("userid:"+userid);
        worker.setUserid(userid);
        worker.setState(1);
        worker.setIsPrivate(1);
        Integer re=IWorkerService.insertW(worker);
        if(re>0){
            System.out.println("添加成功");
            model.setAttribute("title",title);
            return "redirect:/worker/demo";
        }
        System.out.println(title);
        return "userInsert";

    }

    @RequestMapping("/index")
    public String index(Model model,Worker worker){
        model.addAttribute("userInfo",worker);
        return "userInsert";
    }

    @RequestMapping("/demo")
    public String ks(Model model){
        List<Worker> workerList=IWorkerService.findTitle();
        model.addAttribute("workerList",workerList);
        return "indexUser";
    }

    @RequestMapping("/details")
    public String ds(Model model,Integer workerId){
        System.out.println(workerId);

        Worker worker=IWorkerService.findWorker(workerId);
        model.addAttribute("worker",worker);
        return "updateInfo";
    }

    @RequestMapping("/update")
    public String update(Worker worker,Model model){

        System.out.println("....................");

        Integer iRet=IWorkerService.updateInfo(worker);

        if(iRet>0) {
            System.out.println("更新成功!");
            model.addAttribute("true","true");

            return "redirect:/worker/demo";
        }
        return "updateInfo";
    }


    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id")Integer id){
        Map<String ,Object> map=new HashMap<String,Object>();
        System.out.println(id);
        Integer re1=0;
        Integer re=iApplyService.delDa(id);
        System.out.println("re:"+re);
        if(re>0){
          re1 =IWorkerService.delDw(id);
        }
        if(re1>0){
            map.put("result","yes");
        }
            map.put("result","no");
            return "redirect:/worker/demo";
    }

    @RequestMapping(value = "/count",method = RequestMethod.POST)
    @ResponseBody
    public Object count(){
        HashMap<String,String> resultMap=new HashMap<String,String>();
        Integer re=IWorkerService.count();
        System.out.println(re);
        if(re<3){
            resultMap.put("num","ok");
        }else{
            resultMap.put("num","no");
        }
        return JSONArray.toJSONString(resultMap);
    }


    @RequestMapping("/home")
    public String home(Model model,HttpSession session,Workuser workuser){
        List<Worker> workerList=IWorkerService.findListWorker();

        workuser=iWorkuserService.findac();

        session.setAttribute("workuser",workuser);

        System.out.println("id"+workuser.getUserid());

        Integer re=IWorkerService.count();
        session.setAttribute("c",re);
        model.addAttribute("user",workerList);
        return "index";
    }


    @RequestMapping(value = "/upqx",method = RequestMethod.POST)
    @ResponseBody
    public Object sss( @RequestParam("id") Integer id, @RequestParam("qx") Integer qx,Worker worker){
        System.out.println("123213213131313");
        System.out.println(qx);
        System.out.println(id);
//        System.out.println(id);
        HashMap<String,String> resultMap=new HashMap<String,String>();
        worker.setIsPrivate(qx);
        long a=(Integer)id;
        worker.setWid(a);

        Integer iRet=IWorkerService.modiyByQx(worker);
        System.out.println(iRet);
        if(iRet>0){
            resultMap.put("id","ok");
        }else{
            resultMap.put("id","no");
        }
        return JSONArray.toJSONString(resultMap);
    }





}