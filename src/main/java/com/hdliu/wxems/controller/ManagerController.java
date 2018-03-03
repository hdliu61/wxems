package com.hdliu.wxems.controller;

import com.hdliu.wxems.entity.TCollege;
import com.hdliu.wxems.entity.TCollegeExample;
import com.hdliu.wxems.service.CollegeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/manager")
public class ManagerController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CollegeService CollegeService;

    @RequestMapping("/collagePage")
    public String collagePage(Model model){
        logger.info("collagePage ");
        List<TCollege> colleges = CollegeService.selectByExample(new TCollegeExample());
        model.addAttribute("colleges",colleges);
        return "/manager/collage";
    }

    @RequestMapping("/collageAddUpdate")
    public @ResponseBody int collageAdd(TCollege college){
        logger.info("collageAddUpdate "+college.toString());
        if(college.getId()==null){
            return CollegeService.insert(college);
        }else {
            return CollegeService.updateByPrimaryKey(college);
        }
    }

    @RequestMapping("/selectCollage")
    public @ResponseBody TCollege selectCollage(int id){
        logger.info("selectCollage "+id);
        return CollegeService.selectByPrimaryKey(id);
    }

    @RequestMapping("/deleteCollage")
    public @ResponseBody int deleteCollage(int id){
        logger.info("deleteCollage "+id);
        return CollegeService.deleteByPrimaryKey(id);
    }

    @RequestMapping("/termPage")
    public String termPage(Model model){
        logger.info("termPage ");
        List<TCollege> colleges = CollegeService.selectByExample(new TCollegeExample());
        model.addAttribute("colleges",colleges);
        return "/manager/collage";
    }
}
