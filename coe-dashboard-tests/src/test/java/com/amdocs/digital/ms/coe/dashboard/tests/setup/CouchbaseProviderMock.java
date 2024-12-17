//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.tests.setup;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyCollection;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.mockito.Mockito;

import com.amdocs.digital.ms.coe.dashboard.business.errorhandling.exceptions.EntityNotFoundException;
import com.amdocs.digital.ms.coe.dashboard.business.internationalization.interfaces.IMessages;
import com.amdocs.msbase.persistence.couchbase.ICouchbaseDTOProvider;
import com.amdocs.msbase.persistence.couchbase.repository.dto.IBaseCouchbaseDTO;
import com.amdocs.msbase.repository.dto.IBaseDTO;
import com.amdocs.msbase.repository.utils.IObjectIDGenerator;
import com.couchbase.client.core.error.DocumentExistsException;

public class CouchbaseProviderMock 
{
	
	public static void setup(ICouchbaseDTOProvider couchbaseMock,HashMap<String, IBaseCouchbaseDTO> mockMap,IMessages messages)
	{
		mockMap.clear();
		Mockito.reset(couchbaseMock);      
		when(couchbaseMock.getIdGenerator()).thenReturn(new IObjectIDGenerator() 
		{
			int i=1;
						
			@Override
			public String generateID(Class<? extends IBaseDTO<?>> arg0) 
			{		
				return String.valueOf(i++);
			}
			
			@Override
			public synchronized String generateID(String arg0) 
			{
				return String.valueOf(i++);
			}
		});
		
		when(couchbaseMock.insert(anyCollection())).thenAnswer(invocation -> 
		{
			Collection<IBaseCouchbaseDTO> dtos = invocation.getArgument(0);
			for (IBaseCouchbaseDTO dto : dtos) 
			{
				if (mockMap.containsKey(dto.getDocumentId()))
					throw new DocumentExistsException(null);
				mockMap.put(dto.getDocumentId(), dto);
			}
			return dtos;
		});
		
		when(couchbaseMock.insert(Mockito.<IBaseCouchbaseDTO>any())).thenAnswer(invocation -> 
		{
			IBaseCouchbaseDTO dto = invocation.getArgument(0);
			if (mockMap.containsKey(dto.getDocumentId()))
				throw new DocumentExistsException(null);
			mockMap.put(dto.getDocumentId(), dto);
			return dto;
		});
		
		when(couchbaseMock.update(anyCollection())).thenAnswer(invocation -> 
		{
			Collection<IBaseCouchbaseDTO> dtos = invocation.getArgument(0);
			for (IBaseCouchbaseDTO dto : dtos) 
			{
				if (mockMap.containsKey(dto.getDocumentId()))
					mockMap.put(dto.getDocumentId(), dto);
				else
					throw new EntityNotFoundException("", dto.getDocumentId(), messages);
			}
				return dtos;
		});

		when(couchbaseMock.update(Mockito.<IBaseCouchbaseDTO>any())).thenAnswer(invocation -> 
		{
			IBaseCouchbaseDTO dto = invocation.getArgument(0);
			if (mockMap.containsKey(dto.getDocumentId()))
				mockMap.put(dto.getDocumentId(), dto);
			else
				throw new EntityNotFoundException("", dto.getDocumentId(), messages);
			return dto;
		});

		when(couchbaseMock.delete(Mockito.<IBaseCouchbaseDTO>any())).thenAnswer(invocation -> 
		{
			IBaseCouchbaseDTO dto = invocation.getArgument(0);
			if (mockMap.containsKey(dto.getDocumentId()))
			{
				mockMap.remove(dto.getDocumentId());
			}
			return dto;
		});

		when(couchbaseMock.get(anyCollection(), any())).thenAnswer(invocation -> 
		{
			List<String> ids = invocation.getArgument(0);
			List<IBaseCouchbaseDTO> result = new ArrayList<>();
			for (String id : ids) 
			{
				if (mockMap.containsKey(id))
					result.add(mockMap.get(id));
			}
			return result;
		});
		
		when(couchbaseMock.get(Mockito.<String>any(), any())).thenAnswer(invocation -> 
		{
			String id = invocation.getArgument(0);
			if (mockMap.containsKey(id))
				return mockMap.get(id);
			else
				return null;
		});
	}
}
