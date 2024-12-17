//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.resources.mappers;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javax.inject.Inject;
import com.amdocs.digital.ms.coe.dashboard.tests.setup.TestSetUp;

import com.amdocs.digital.ms.coe.dashboard.resources.mappers.interfaces.IMapInlineResponse400ToInlineResponse400DTO;
import com.amdocs.digital.ms.coe.dashboard.resources.mappers.interfaces.IMapInlineResponse400DTOToInlineResponse400;

import com.amdocs.digital.ms.coe.dashboard.business.repository.dto.interfaces.IInlineResponse400DTO;
import com.amdocs.digital.ms.coe.dashboard.resources.models.InlineResponse400;

public class InlineResponse400InlineResponse400DTOBidirectionalMapperTest extends TestSetUp
{
    @Inject
    protected IMapInlineResponse400ToInlineResponse400DTO iMapInlineResponse400ToInlineResponse400DTO;

    @Inject
    protected IMapInlineResponse400DTOToInlineResponse400 iMapInlineResponse400DTOToInlineResponse400;

    @Test
    public void testInlineResponse400InlineResponse400DTOMapper()
    {
        InlineResponse400 inlineResponse400 = createInlineResponse400();
      
        IInlineResponse400DTO inlineResponse400DTO = iMapInlineResponse400ToInlineResponse400DTO.map(inlineResponse400);
        InlineResponse400 inlineResponse400Mapped = iMapInlineResponse400DTOToInlineResponse400.map(inlineResponse400DTO);  
        assertEquals(inlineResponse400,inlineResponse400Mapped);
    }
    
    private Object createEmployee(){
        Object employee = new Object();
        return employee;
    }

    private InlineResponse400 createInlineResponse400(){
        InlineResponse400 inlineResponse400 = new InlineResponse400();
        inlineResponse400.setEmployee(createEmployee());
        return inlineResponse400;
    }

    
}