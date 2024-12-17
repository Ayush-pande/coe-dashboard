//This code was generated by MS-Builder
package com.amdocs.digital.ms.coe.dashboard.resources.delegates;


import org.junit.Test;
import javax.inject.Inject;
import com.amdocs.digital.ms.coe.dashboard.tests.setup.TestSetUp;

import com.amdocs.digital.ms.coe.dashboard.business.repository.dto.interfaces.IEmployeeDTO;
import com.amdocs.digital.ms.coe.dashboard.resources.implementation.AdminApiImpl.AdminRejectDeleteParameters;
import com.amdocs.digital.ms.coe.dashboard.resources.implementation.AdminApiImpl.IAdminRejectDeleteDelegate;
import com.amdocs.digital.ms.coe.dashboard.resources.mappers.interfaces.IMapEmployeeToEmployeeDTO;
import com.amdocs.digital.ms.coe.dashboard.resources.models.Employee;
import com.amdocs.msbase.queryparameters.Filter;
import com.amdocs.msbase.queryparameters.PaginationInfo;
import com.amdocs.msbase.queryparameters.SelectedAttributes;
import com.amdocs.msbase.queryparameters.SortFields;
import java.util.ArrayList;
import java.util.List;


public class AdminRejectDeleteDelegateTest extends TestSetUp
{
    @Inject
    protected IAdminRejectDeleteDelegate adminRejectDeleteDelegate;

    @Test(expected = UnsupportedOperationException.class)
    public void testExecute()
    {
        AdminRejectDeleteParameters adminRejectDeleteParameters = createAdminRejectDeleteParameters();

        //TODO implement test accordingly
        adminRejectDeleteDelegate.execute(adminRejectDeleteParameters);
    }
	
    private List<String> createFunctionalKnowledge(){
        List<String> functionalKnowledge = new ArrayList<>();
        functionalKnowledge.add(getDefaultStringValue());
        functionalKnowledge.add(getDefaultStringValue());
        functionalKnowledge.add(getDefaultStringValue());
        return functionalKnowledge;
    }

    private List<String> createPrimaryProductSubdomain(){
        List<String> primaryProductSubdomain = new ArrayList<>();
        primaryProductSubdomain.add(getDefaultStringValue());
        primaryProductSubdomain.add(getDefaultStringValue());
        primaryProductSubdomain.add(getDefaultStringValue());
        return primaryProductSubdomain;
    }

    private List<String> createPrimaryTechSkill(){
        List<String> primaryTechSkill = new ArrayList<>();
        primaryTechSkill.add(getDefaultStringValue());
        primaryTechSkill.add(getDefaultStringValue());
        primaryTechSkill.add(getDefaultStringValue());
        return primaryTechSkill;
    }

    private List<String> createSecondaryProduct(){
        List<String> secondaryProduct = new ArrayList<>();
        secondaryProduct.add(getDefaultStringValue());
        secondaryProduct.add(getDefaultStringValue());
        secondaryProduct.add(getDefaultStringValue());
        return secondaryProduct;
    }

    private List<String> createSecondaryTechSkill(){
        List<String> secondaryTechSkill = new ArrayList<>();
        secondaryTechSkill.add(getDefaultStringValue());
        secondaryTechSkill.add(getDefaultStringValue());
        secondaryTechSkill.add(getDefaultStringValue());
        return secondaryTechSkill;
    }

    private Employee createEmployee(){
        Employee employee = new Employee();
        employee.setAdditionalInfo(getDefaultStringValue());
        employee.setAmdocsExperience(getDefaultStringValue());
        employee.setAmdocsJourney(getDefaultStringValue());
        employee.setApproved(getDefaultBooleanValue());
        employee.setAreaOfCriticalIssue(getDefaultStringValue());
        employee.setContributedToDesign(getDefaultBooleanValue());
        employee.setCurrentAccount(getDefaultStringValue());
        employee.setDevOpsKnowledge(getDefaultStringValue());
        employee.setEmpDesc(getDefaultStringValue());
        employee.setEmpEmail(getDefaultStringValue());
        employee.setEmpId(getDefaultStringValue());
        employee.setEmpImage(getDefaultStringValue());
        employee.setEmpName(getDefaultStringValue());
        employee.setEmpPassword(getDefaultStringValue());
        employee.setEmpRole(getDefaultStringValue());
        employee.setEngagementActivityContribution(getDefaultBooleanValue());
        employee.setExplorationInterest(getDefaultBooleanValue());
        employee.setFunctionalKnowledge(createFunctionalKnowledge());
        employee.setHobbiesSports(getDefaultStringValue());
        employee.setMentoringAbility(getDefaultBooleanValue());
        employee.setPresentationSkills(getDefaultIntegerValue());
        employee.setPrimaryProductSubdomain(createPrimaryProductSubdomain());
        employee.setPrimaryTechSkill(createPrimaryTechSkill());
        employee.setProductionSupport(getDefaultStringValue());
        employee.setSecondaryProduct(createSecondaryProduct());
        employee.setSecondaryTechSkill(createSecondaryTechSkill());
        employee.setSupervisorName(getDefaultStringValue());
        employee.setTotalExperience(getDefaultStringValue());
        return employee;
    }

    private AdminRejectDeleteParameters createAdminRejectDeleteParameters(){
        AdminRejectDeleteParameters adminRejectDeleteParameters = new AdminRejectDeleteParameters();
        adminRejectDeleteParameters.setAuthorization(getDefaultStringValue());
        adminRejectDeleteParameters.setEmployee(createEmployee());
        return adminRejectDeleteParameters;
    }


}