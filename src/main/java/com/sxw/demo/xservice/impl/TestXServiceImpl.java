package com.sxw.demo.xservice.impl;import com.sxw.demo.xservice.ITestXService;import com.sxw.xspring.annotation.XService;import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpServletResponse;import java.util.ArrayList;import java.util.List;/** * 业务实现类 */@XServicepublic class TestXServiceImpl implements ITestXService {    @Override    public String listClassName() {        return "classname";    }}