//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.resources.delegates;


import org.junit.Test;
import javax.inject.Inject;
import com.amdocs.digital.ms.coe.dashboard.tests.setup.TestSetUp;

import com.amdocs.digital.ms.coe.dashboard.resources.implementation.AdminApiImpl.AdminGetAllEmpGetParameters;
import com.amdocs.digital.ms.coe.dashboard.resources.implementation.AdminApiImpl.IAdminGetAllEmpGetDelegate;
import com.amdocs.msbase.queryparameters.Filter;
import com.amdocs.msbase.queryparameters.PaginationInfo;
import com.amdocs.msbase.queryparameters.SelectedAttributes;
import com.amdocs.msbase.queryparameters.SortFields;


public class AdminGetAllEmpGetDelegateTest extends TestSetUp
{
    @Inject
    protected IAdminGetAllEmpGetDelegate adminGetAllEmpGetDelegate;

    @Test(expected = UnsupportedOperationException.class)
    public void testExecute()
    {
        AdminGetAllEmpGetParameters adminGetAllEmpGetParameters = createAdminGetAllEmpGetParameters();

        //TODO implement test accordingly
        adminGetAllEmpGetDelegate.execute(adminGetAllEmpGetParameters);
    }
	
    private AdminGetAllEmpGetParameters createAdminGetAllEmpGetParameters(){
        AdminGetAllEmpGetParameters adminGetAllEmpGetParameters = new AdminGetAllEmpGetParameters();
        adminGetAllEmpGetParameters.setAuthorization(getDefaultStringValue());
        return adminGetAllEmpGetParameters;
    }


}