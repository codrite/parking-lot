package com.arnab.homegrown.parkinglot.service.audit;

import com.arnab.homegrown.parkinglot.service.audit.exception.AuditServiceException;
import org.springframework.stereotype.Service;

/**
 * No Copyright(s)
 * arnab@codrite.com
 */
@Service
public interface AuditService {

    public VehicleLogReport createVehicleLogFor(final SearchParameter searchParameter) throws AuditServiceException;

    public IncidentLogReport createIncidentLogFor(final SearchParameter searchParameter) throws AuditServiceException;

}
