package com.tenco.blog_v2.common;

import com.tenco.blog_v2.common.errors.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 400 Bad Request 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exeption400.class)
    public ModelAndView handleException400(Exeption400 ex, Model model){
        ModelAndView mav = new ModelAndView("err/400");
        mav.addObject("msg",ex.getMessage());
        return mav;
    }

    /**
     * 401 Unauthorized 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exeption401.class)
    public ModelAndView handleException401(Exeption401 ex, Model model){
        ModelAndView mav = new ModelAndView("err/401");
        mav.addObject("msg",ex.getMessage());
        return mav;
    }


    /**
     * 403 Forbidden 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exeption403.class)
    public ModelAndView handleException403(Exeption403 ex, Model model){
        ModelAndView mav = new ModelAndView("err/403");
        mav.addObject("msg",ex.getMessage());
        return mav;
    }

    /**
     * 404 Not Found 예외 처리
     * @param ex
     * @param model
     * @return`
     */
    @ExceptionHandler(Exeption404.class)
    public ModelAndView handleException404(Exeption404 ex, Model model){
        ModelAndView mav = new ModelAndView("err/404");
        mav.addObject("msg",ex.getMessage());
        return mav;
    }

    /**
     * 500 INTERNAL SERVER ERROR 예외 처리
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(Exeption500.class)
    public ModelAndView handleException500(Exeption500 ex, Model model){
        ModelAndView mav = new ModelAndView("err/500");
        mav.addObject("msg",ex.getMessage());
        return mav;
    }

}
