package com.qa.fabiaTuning.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.fabiaTuning.model.TuningItems;
import com.qa.fabiaTuning.service.ItemService;

@RestController
@CrossOrigin
public class ItemController {

	private ItemService service;
	private Object database;

	public ItemController(ItemService service) {
		super();
		this.service = service;
	}

	@PostMapping("/add")
	public String helloTest() {
		return ("Hello Richard");
	}

	@PostMapping("/add")
	public ResponseEntity<String> createItem(@RequestBody TuningItems item) {
		this.service.createTuningItems(item);
		return new ResponseEntity<String>("item name: " + item.getNameOfPart() + "added to list", HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<TuningItems>> getAllItems() {
		List<TuningItems> itemList = this.service.findAll();
		return ResponseEntity.ok(itemList);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteItem(@PathVariable Long id) {
		this.service.deleteItem(id);

		return new ResponseEntity<String>("Objest id: " + id + " has been deleted", HttpStatus.OK);
	}

//	public Object getDatabase() {
//		return database;
//	}
//
//	public void setDatabase(Object database) {
//		this.database = database;
//	}
@PutMapping("/update/{id}")
	public ResponseEntity<String> updateItem(@RequestBody TuningItems item, @PathVariable Long id){
this.service.updateTuningItems(item, id);
return new ResponseEntity<String>("item Id: " + id + "has been updated", HttpStatus.ACCEPTED);
}
}