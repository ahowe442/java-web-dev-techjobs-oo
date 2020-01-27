package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class JobTest {
//    private Job job1;
//    private Job job2;
//    private Job job3;

    @Before
    public void createJobTestObjects(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

        //Not sure why this @Before is not working in the @Test methods below?  Ask TF about this.
    }
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }

    @Test
    public void testSettingJobId() {
        Job job4 = new Job();
        Job job5 = new Job();

        assertTrue(job5.getId() - job4.getId() == 1);
    }
    @Test
    public void testSettingJobId2(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertTrue(job2.getId() - job1.getId() == 1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job1.getName());
        //I'm not sure what I'm supposed to do here.  I'm not sure what the instructions are asking me to do.
    }
    @Test
    public void testJobConstructorSetsAllFields1(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("ACME", job1.getEmployer().toString());
    }
    @Test
    public void testJobConstructorSetsAllFields2() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Desert", job1.getLocation().toString());

    }
    @Test
    public void testJobConstructorSetsAllFields3() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertEquals("Quality control", job1.getPositionType().getValue());

    }
    @Test
    public void testJobConstructorSetsAllFields4() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Persistence", job1.getCoreCompetency().toString());
    }

    @Test
    public void testInstanceOf() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertThat(job1, instanceOf(Job.class));
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(false, job1.getId() == job2.getId());
    }
    @Test
    public void testToStringMethod(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String printedResult = "ID:  "+job1.getId()+ "\nName: "+job1.getName()+" \nEmployer: "+job1.getEmployer()+" " +
                "\nLocation: "+job1.getLocation()+" \nPosition Type: "+job1.getPositionType()+"\nCore Competency: "
                + job1.getCoreCompetency();
        //This is not a completed unitTest.
        // I may need help with this one.
        String expectedResult = "ID:  1  \nName: Product tester \nEmployer: ACME \nLocation: Desert \nPosition Type: Quality control \nCore Competency: Persistence";
        assertTrue(printedResult == expectedResult);
        //expectedResult has not been initialized.  Can I just print the Sting outcome for the expected?


    }
//    @Test
//    public void testInstanceOf2() {
//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertThat(job1, instanceOf(Employer.class));
//        assertThat(job1, instanceOf(Location.class));
//        assertThat(job1, instanceOf(PositionType.class));
//        assertThat(job1, instanceOf(CoreCompetency.class));
//    }
}