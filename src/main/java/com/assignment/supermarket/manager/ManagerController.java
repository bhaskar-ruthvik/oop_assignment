package com.assignment.supermarket.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/manager")
@CrossOrigin
public class ManagerController {
    private final ManagerService managerService;

    @Autowired
    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping
    public List<Manager> getManagers(){
        return managerService.getManagers();
    }
    @PostMapping(path="/signin")
    public boolean findManager(@RequestBody ManagerSignIn managerSignIn){
        return managerService.findManager(managerSignIn);
    }
    @PostMapping
    public Long registerNewManager(@RequestBody Manager manager){

        return managerService.addNewManager(manager);
    }
    @PutMapping(path="{managerId}")
    public Integer updateManager(@PathVariable("managerId")Long id,@RequestParam String password){
        return managerService.updateManager(id,password);
    }
//    @GetMapping(path="{userId}")

    @DeleteMapping(path = "{userId}")
    public Integer deleteManager(@PathVariable("userId") Long id){
       return managerService.deleteManager(id);
    }
}
