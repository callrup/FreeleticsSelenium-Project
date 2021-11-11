package base;

import org.testng.annotations.Test;

import pageEvents.CareerSection;
import pageEvents.JobDescriptionPage;
import pageEvents.RoleToSelectAndApply;

public class FinalQATest extends BaseTest {
    
	@Test
	public void verifyCareerSectionAndApplyForQAPosition()
	{
		CareerSection careersection = new CareerSection();
		careersection.clickCareerSection();
		careersection.openpositionclickandValidate();
		
		JobDescriptionPage jobdesc = new JobDescriptionPage();
		jobdesc.currentJobVacancyforQA();
		
		RoleToSelectAndApply qarole = new RoleToSelectAndApply();
		qarole.validateTopSection();
		qarole.validateJobDescription();
		qarole.validateResponsibility();
		qarole.validateProfile();
		qarole.applyForTheJob();
	}
}
