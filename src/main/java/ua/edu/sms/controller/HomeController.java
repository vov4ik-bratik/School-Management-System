package ua.edu.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Request;


/**
 * Created by vs on 14.11.2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home(){
            return "home";
        }
    }
