//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.resources.mappers.implementation;

import com.amdocs.digital.ms.coe.dashboard.business.repository.dto.interfaces.IInlineResponse400DTO;
import com.amdocs.digital.ms.coe.dashboard.resources.mappers.interfaces.IMapInlineResponse400DTOToInlineResponse400;
import com.amdocs.digital.ms.coe.dashboard.resources.models.InlineResponse400;

public class MapInlineResponse400DTOToInlineResponse400 implements IMapInlineResponse400DTOToInlineResponse400
{
	@Override
	public InlineResponse400 map(IInlineResponse400DTO iInlineResponse400DTO)
	{
		if(null == iInlineResponse400DTO) {
			return null;
		}

		InlineResponse400 inlineResponse400 = new InlineResponse400();
		inlineResponse400.setEmployee(iInlineResponse400DTO.getEmployee());

		return inlineResponse400;
	}
}