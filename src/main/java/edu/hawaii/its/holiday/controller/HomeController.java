package edu.hawaii.its.holiday.controller;

import java.util.Locale;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private static final Log logger = LogFactory.getLog(HomeController.class);

    @RequestMapping(value = { "", "/", "/home" }, method = { RequestMethod.GET })
    public String home(Map<String, Object> model, Locale locale) {
        logger.info("User at home. The client locale is " + locale);
        return "home";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Locale locale, Model model) {
        logger.info("User at contact.");
        return "contact";
    }

    @RequestMapping(value = "/faq", method = RequestMethod.GET)
    public String faq(Locale locale, Model model) {
        logger.info("User at faq.");
        return "faq";
    }

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String invalid() {
        return "redirect:/";
    }

    @RequestMapping(value = "/dates", method = RequestMethod.GET)
    public String dates(Locale locale, Model model) {
        logger.info("User at dates.");
        return "dates";
    }

}