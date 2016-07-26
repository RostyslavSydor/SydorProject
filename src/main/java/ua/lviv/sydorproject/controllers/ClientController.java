package ua.lviv.sydorproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.sydorproject.entity.Client;
import ua.lviv.sydorproject.services.ClientService;

import java.util.List;

/**
 * Created by Rostyslav on 26.07.2016.
 */
@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/allAuthors", method = RequestMethod.GET)    private String clientAll (Model model){
        List<Client> clientList = clientService.findAll();
        model.addAttribute("clients", clientList);
        return "client-all";
    }
    @RequestMapping(value = "clientNew", method = RequestMethod.GET)
    private String clientNew() {
        return "client-new";
    }

    @RequestMapping(value = "createClient", method = RequestMethod.POST)
    private String createNewClient(@RequestParam("name")String name, @RequestParam("country")String country ){
        clientService.add(name,country);
        return "redirect:/allClients";
    }

    @RequestMapping(value = "/client={id}", method = RequestMethod.GET)
    private String clientInfo(Model model,@PathVariable String id){
        Client client = clientService.findById(Integer.parseInt(id));
        model.addAttribute("client", client);
        return "client-page";
    }

}
