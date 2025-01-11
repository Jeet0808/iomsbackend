package com.ioms.iomsbackend.Repository;

import com.ioms.iomsbackend.Model.StockLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


/***
 * The StockLogRepo class handles all database interaction Command by service layer
 * This repo uses Spring-data-jpa and hibernate to create tables by mapping the model classes
 * creates and automatically updates the database
 *
 * <p>
 *     I will add more details later along the creation of backend take care good by
 * </p>
 *
 * <pre>
 *     Example usage :
 * </pre>
 *
 * <pre>
 *     StockLogRepo.save(log_alert)
 * </pre>
 *
 * @author [jeet]
 * @version 1.0
 * @since 2025-01-06
 */

public interface StockLogRepo extends JpaRepository<StockLog, UUID> {
}
