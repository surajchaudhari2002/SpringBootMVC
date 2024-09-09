package com.mvcapplication.firstmvc.controller;
import com.mvcapplication.firstmvc.model.Iplteams;
import com.mvcapplication.firstmvc.model.Products;
import com.mvcapplication.firstmvc.service.IplteamsService;
import com.mvcapplication.firstmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController //use to return json.
//@Controller  //use to return view it can be html jsp .

public class MvcController {
    @Autowired
    ProductService service;
    @Autowired
    IplteamsService iplteamsService;
    @GetMapping ()
    public String hello(){

        return "iplteams";
        }

        @GetMapping("/products")
        public List<Products> getproducts(){
        return service.getProducts();
        }

        @GetMapping("/getproducts")
    public String getProductList(Model model){
        model.addAttribute("products",service.getProducts());// here product is key where we are storing the values coming ffrom getproducts method .
        return "index";//View Nmae or UI Name .
        }

        @GetMapping("/getiplteams")
    public List<Iplteams> getteams() throws SQLException, ClassNotFoundException {
        return iplteamsService.getIplteams();
        }

        @PostMapping("/addiplteams")
        public String addIplteams(@RequestBody Iplteams iplteam) throws SQLException, ClassNotFoundException {
        String msg= iplteamsService.saveIplteam(iplteam);
        return msg;
        }

        @PutMapping("/updateCaptainName/{teamName}/{captainName}")
        public String updateCaptainName(@PathVariable String teamName, @PathVariable String captainName) throws SQLException, ClassNotFoundException {
        String msg=iplteamsService.updateCaptainName(teamName,captainName);
        return msg;
        }

        @PutMapping("/updateteam")
    public String update(@RequestBody Iplteams iplteam) throws SQLException, ClassNotFoundException {
        String msg=iplteamsService.updateIplteam(iplteam);
        return msg;
        }

        @DeleteMapping("/deleteteam/{teamName}")
        public String deleteteam(@PathVariable String teamName) throws SQLException, ClassNotFoundException {
        String msg=iplteamsService.deleteteam(teamName);
        return msg;
        }

        @GetMapping("/getteams/{teamName}")
        public Iplteams getteam(@PathVariable String teamName) throws SQLException, ClassNotFoundException {
        return iplteamsService.getteam(teamName);
        }


}
