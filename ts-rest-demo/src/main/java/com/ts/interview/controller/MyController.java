package com.ts.interview.controller;

import com.ts.interview.dao.MyRespository;
import com.ts.interview.model.MyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ws.rs.QueryParam;

@RestController
@RequestMapping("/v1/")
public class MyController {

    @Autowired MyRespository myRespository;

    @RequestMapping(value = "/outbound",method = RequestMethod.GET)
    public List<MyEntity> index(@QueryParam("name") String name){
        return myRespository.finMyEntities(name);
    }

   /* @GetMapping("/blog/{id}")
    public MyEntity show(String id){
        int blogId = Integer.parseInt(id);
        return myRespository.findOne(blogId);
    }*/

    @PostMapping("/inbound")
    public MyEntity search(@RequestBody Map<String, String> body) throws ParseException {
        String name = body.get("name");
        String dateText = body.get("date");
        String msg = body.get("msg");
        Date date=new SimpleDateFormat("dd/MM/yyyy").parse(dateText);

        MyEntity myEntity = new MyEntity(name, date,msg);
        return myRespository.save(myEntity);
    }

}