package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponce;
import com.app.entities.Catagory;
import com.app.entities.Railways;
import com.app.service.RaiService;

@RestController
@RequestMapping("/railways")
public class RailController {
@Autowired
private RaiService railP;

@GetMapping 
public List<Railways> getAllRailWays(){
	return railP.getAllRails();
}
@PostMapping
public ResponseEntity<Railways> saveRailwayDetails(@RequestBody @Valid Railways transientRail){
	
	return new ResponseEntity<>(railP.addRail(transientRail),HttpStatus.CREATED);
}
@DeleteMapping("/{railId}")
public ApiResponce deleteRailways(@PathVariable Long railId) {
	String mesg="Successfully Deleted";
	railP.deletRail(railId);
	return new ApiResponce(mesg);
	
}   
@GetMapping("/{c}")
public List<Railways> getRailWaysById(@PathVariable Catagory c) {
	return railP.getRailbyCat(c);
}
@PutMapping
public Railways updateRailways(@RequestBody @Valid Railways detachedRail) {
	return railP.updateRail(detachedRail);
}




}
