package ua.edu.sms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ua.edu.sms.entity.Groups;
import ua.edu.sms.service.GroupsService;

/**
 * Created by vs on 16.11.2016.
 */
@Controller
public class GroupsController {

    @Autowired
    private GroupsService groupsService;

    @RequestMapping(value = "/newGroups", method = RequestMethod.GET)
    public String newGroups(){
        return "newGroups";
    }

    @RequestMapping(value = "createGroups", method = RequestMethod.POST)
    public String createGroups(@RequestParam int number, @RequestParam char subgroups){

        Groups groups = new Groups(number, subgroups);
        groupsService.create(groups);

        return "redirect:/newGroups";
    }
}
