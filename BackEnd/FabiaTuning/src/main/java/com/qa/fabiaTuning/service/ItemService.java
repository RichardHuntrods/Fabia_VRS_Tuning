package com.qa.fabiaTuning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.fabiaTuning.model.TuningItems;
import com.qa.fabiaTuning.repo.ItemDatabase;

@Service
public class ItemService {

	private ItemDatabase database;
	
	
	    public ItemService(ItemDatabase repo) {
		super();
		this.database = repo;
	}

	//public List<Item> getAllItems() {
	//return this.database.findAll();
	//}

	public void deleteItem(Long id) {
	this.database.deleteById(id);
		
	}

	public TuningItems createTuningItems(TuningItems item) {
	return this.database.save(item);
		
	}

	public List<TuningItems> findAll() {
		return this.database.findAll();
		
	}

	
		
	}


