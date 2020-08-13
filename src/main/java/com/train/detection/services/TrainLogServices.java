package com.train.detection.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.detection.entity.RFIDTrainLog;
import com.train.detection.repository.TrainLogRepository;

@Service
@Transactional
public class TrainLogServices {
	@Autowired
	TrainLogRepository trainLogRepository;

	public List<RFIDTrainLog> getTagIdByTrainNo(int carriage) {
		List<RFIDTrainLog> getAllData = null;
		try {
			getAllData = trainLogRepository.findByCarriage(carriage);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return getAllData;

	}

}
