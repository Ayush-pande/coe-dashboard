//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.business.services.interfaces;

import com.amdocs.msbase.queryparameters.Filter;
import com.amdocs.msbase.queryparameters.PaginationInfo;
import com.amdocs.msbase.queryparameters.SelectedAttributes;
import com.amdocs.msbase.queryparameters.SortFields;
import java.util.List;

public interface IAdminGetDomainGetApplicationService
{
	public List<String> adminGetDomainGet(String authorization, Filter filterConditions, PaginationInfo paginationInfo, SelectedAttributes selectAttributes, SortFields sortFields);
}