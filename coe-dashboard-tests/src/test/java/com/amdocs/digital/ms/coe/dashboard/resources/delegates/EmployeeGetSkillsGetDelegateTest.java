//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.resources.delegates;


import org.junit.Test;
import javax.inject.Inject;
import com.amdocs.digital.ms.coe.dashboard.tests.setup.TestSetUp;

import com.amdocs.digital.ms.coe.dashboard.resources.implementation.EmployeeApiImpl.EmployeeGetSkillsGetParameters;
import com.amdocs.digital.ms.coe.dashboard.resources.implementation.EmployeeApiImpl.IEmployeeGetSkillsGetDelegate;
import com.amdocs.msbase.queryparameters.Filter;
import com.amdocs.msbase.queryparameters.PaginationInfo;
import com.amdocs.msbase.queryparameters.SelectedAttributes;
import com.amdocs.msbase.queryparameters.SortFields;


public class EmployeeGetSkillsGetDelegateTest extends TestSetUp
{
    @Inject
    protected IEmployeeGetSkillsGetDelegate employeeGetSkillsGetDelegate;

    @Test(expected = UnsupportedOperationException.class)
    public void testExecute()
    {
        EmployeeGetSkillsGetParameters employeeGetSkillsGetParameters = createEmployeeGetSkillsGetParameters();

        //TODO implement test accordingly
        employeeGetSkillsGetDelegate.execute(employeeGetSkillsGetParameters);
    }
	
    private EmployeeGetSkillsGetParameters createEmployeeGetSkillsGetParameters(){
        EmployeeGetSkillsGetParameters employeeGetSkillsGetParameters = new EmployeeGetSkillsGetParameters();
        return employeeGetSkillsGetParameters;
    }


}