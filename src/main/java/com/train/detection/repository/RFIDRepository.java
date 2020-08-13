package com.train.detection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.train.detection.entity.RFIDModel;
import com.train.detection.entity.TranWithTagCount;
import com.train.detection.entity.ViewTagIds;

public interface RFIDRepository extends JpaRepository<RFIDModel, Integer> {
	
	@Query("SELECT new com.train.detection.entity.TranWithTagCount(COUNT(c.carriage),c.carriage,c.dateTime) FROM RFIDModel c where carriage is not null group by c.carriage,c.dateTime")
	List<TranWithTagCount> getTrain();

	@Query("SELECT new com.train.detection.entity.ViewTagIds(r.tag,r.carriage,r.antenna,r.rssi,r.readCount,count(r.tag)) FROM RFIDModel r where r.carriage= :carriageId  group by r.tag,r.carriage,r.antenna,r.rssi,r.readCount")
	List<ViewTagIds> getTAgid(int carriageId);
}
