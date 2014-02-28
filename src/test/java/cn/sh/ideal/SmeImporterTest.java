package cn.sh.ideal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/batch.xml", "/applicationContext-test.xml"})
public class SmeImporterTest {

    private static Log log = LogFactory.getLog(SmeImporterTest.class);

    @Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;

    @Test
    public void testJob() throws Exception {
        JobExecution jobExecution = jobLauncherTestUtils.launchJob();

        log.debug("This Job Name is: " + jobExecution.getJobInstance().getJobName());

        //Ensure job completed successfully.
        Assert.isTrue(jobExecution.getExitStatus().equals(ExitStatus.COMPLETED), "Step Execution did not complete normally: " + jobExecution.getExitStatus());

    }
}
