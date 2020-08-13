package com.train.detection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.detection.entity.RFIDTrainLog;

public interface TrainLogRepository extends JpaRepository<RFIDTrainLog, Long> {

	List<RFIDTrainLog> findByCarriage(int carriage);
	
	
}
