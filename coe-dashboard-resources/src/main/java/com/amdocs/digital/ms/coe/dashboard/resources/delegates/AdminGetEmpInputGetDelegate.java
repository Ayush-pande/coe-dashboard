//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.resources.delegates;

import javax.inject.Inject;

import com.amdocs.digital.ms.coe.dashboard.business.repository.dto.interfaces.IEmployeeDTO;
import com.amdocs.digital.ms.coe.dashboard.business.services.interfaces.IAdminGetEmpInputGetApplicationService;
import com.amdocs.digital.ms.coe.dashboard.resources.implementation.AdminApiImpl.AdminGetEmpInputGetParameters;
import com.amdocs.digital.ms.coe.dashboard.resources.implementation.AdminApiImpl.IAdminGetEmpInputGetDelegate;
import com.amdocs.digital.ms.coe.dashboard.resources.mappers.interfaces.IMapEmployeeDTOToEmployee;
import com.amdocs.digital.ms.coe.dashboard.resources.models.Employee;
import com.amdocs.msbase.queryparameters.Filter;
import com.amdocs.msbase.queryparameters.PaginationInfo;
import com.amdocs.msbase.queryparameters.SelectedAttributes;
import com.amdocs.msbase.queryparameters.SortFields;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;

public class AdminGetEmpInputGetDelegate implements IAdminGetEmpInputGetDelegate
{
	@Inject
	protected IMapEmployeeDTOToEmployee mapEmployeeDTOToEmployee;

	@Inject
	protected IAdminGetEmpInputGetApplicationService adminGetEmpInputGetApplicationService;

	@Override
	public ResponseEntity<List<Employee>> execute(AdminGetEmpInputGetParameters parameters)
	{
		String authorization = parameters.getAuthorization();
		Filter filterConditions = parameters.getFilterConditions();
		String input = parameters.getInput();
		PaginationInfo paginationInfo = parameters.getPaginationInfo();
		SelectedAttributes selectAttributes = parameters.getSelectAttributes();
		SortFields sortFields = parameters.getSortFields();

		List<IEmployeeDTO> resultList = adminGetEmpInputGetApplicationService.adminGetEmpInputGet(authorization, filterConditions, input, paginationInfo, selectAttributes, sortFields);
		List<Employee> response = new ArrayList<>();

		if(resultList != null)
		{
			for (IEmployeeDTO curr : resultList)
			{
				response.add(mapEmployeeDTOToEmployee.map(curr));
			}
		}

		return ResponseEntity.ok(response);
	}
}