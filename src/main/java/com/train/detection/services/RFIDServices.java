package com.train.detection.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.detection.entity.RFIDModel;
import com.train.detection.entity.TranWithTagCount;
import com.train.detection.entity.ViewTagIds;
import com.train.detection.repository.RFIDRepository;

@Service
@Transactional
public class RFIDServices {
	@Autowired
	RFIDRepository rfidRepository;

	public List<RFIDModel> getAllRFIDData() {
		List<RFIDModel> getAllData = null;
		try {
			getAllData = rfidRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAllData;

	}

	public List<TranWithTagCount> getTrain() {
		List<TranWithTagCount> getAllData = null;
		try {
			getAllData = rfidRepository.getTrain();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAllData;

	}

	public List<ViewTagIds> getTagId(int carriageId) {
		List<ViewTagIds> getAllData = null;
		try {
			getAllData = rfidRepository.getTAgid(carriageId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAllData;

	}
}
