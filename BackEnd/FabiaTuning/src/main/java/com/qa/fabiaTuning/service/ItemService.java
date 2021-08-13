package com.qa.fabiaTuning.service;

import java.util.List;
import java.util.Optional;

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

	public void updateTuningItems(TuningItems item, Long id) {
	    Optional<TuningItems> optionalTuningItems = this.database.findById(id);
	TuningItems oldItem = optionalTuningItems.get();
		
	oldItem.setNameOfPart=(item.getNameOfPart());
	oldItem.setQuantity=(item.getQuantity());
	oldItem.setCost=(item.getCost());
	oldItem.setPerformanceIncrease=(item.getPerformanceIncrease());
	oldItem.setHighPriority=(item.isHighPriority());
	oldItem.setHandlingImprovement=(item.isHandlingImprovement());

	this.database.save(oldItem);
		
	}


