//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.business.services.interfaces;

import com.amdocs.digital.ms.coe.dashboard.business.repository.dto.interfaces.IEmployeeDTO;
import com.amdocs.msbase.queryparameters.Filter;
import com.amdocs.msbase.queryparameters.PaginationInfo;
import com.amdocs.msbase.queryparameters.SelectedAttributes;
import com.amdocs.msbase.queryparameters.SortFields;

public interface IEmployeeUpdatePutApplicationService
{
	public IEmployeeDTO employeeUpdatePut(String authorization, IEmployeeDTO requestEmployeeDTO, Filter filterConditions, PaginationInfo paginationInfo, SelectedAttributes selectAttributes, SortFields sortFields);
}