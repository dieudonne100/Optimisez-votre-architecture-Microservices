package com.clientui.controller;


import com.clientui.beans.ProductBean;
import com.clientui.proxies.MicroserviceProduitsProxy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClientController
{
private final MicroserviceProduitsProxy microserviceProduitsProxy;

    public ClientController(MicroserviceProduitsProxy microserviceProduitsProxy) {
        this.microserviceProduitsProxy = microserviceProduitsProxy;
    }

    @RequestMapping("/")

    public String accueil(Model model)
    {
        List<ProductBean> products = microserviceProduitsProxy.listeDesProduits();
        model.addAttribute("products", products);

        return "Accueil";

    }



}